package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import model.Person;

public class PersonJDBCDAOImpl implements PersonJDBCDAO{

	private final static String INSERT_PERSON = "insert into person (id, name, surname,birthYear) values (?, ?, ?,?)";

	private DataSource dataSource;

	public PersonJDBCDAOImpl(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	@Override
	public void insertPerson(Person person) throws SQLException {

		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PERSON);
			preparedStatement.setInt(1, person.getId());
			preparedStatement.setString(2, person.getName());
			preparedStatement.setString(3, person.getSurname());
			preparedStatement.setInt(4, person.getBirthyear());
			preparedStatement.executeUpdate();
			preparedStatement.close();

			// logging
			System.out.println("Person is inserted..." + person);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
