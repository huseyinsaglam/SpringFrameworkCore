package dao;

import java.sql.SQLException;

import model.Person;

public interface PersonJDBCDAO {

	public void insertPerson(Person person) throws SQLException;
}
