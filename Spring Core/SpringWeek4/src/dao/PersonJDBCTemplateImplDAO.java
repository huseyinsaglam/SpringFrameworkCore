package dao;

import org.springframework.jdbc.core.JdbcTemplate;

import model.Person;

public class PersonJDBCTemplateImplDAO implements PersonJDBCTemplateDAO {

	private final static String INSERT_PERSON = "insert into person (id, name, surname,birthYear) values (?, ?, ?,?)";

	private JdbcTemplate jdbcTemplate;
	
//	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//		System.out.println("setter injection... JdbcTemplate");
//		this.jdbcTemplate = jdbcTemplate;
//	}

	public PersonJDBCTemplateImplDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	

	@Override
	public void insertPerson(Person person) throws Exception {

		Object[] insertParams = new Object[] { person.getId(), person.getName(), person.getSurname(),
				person.getBirthyear() };
		//parametre sayisi sirasi onemli!
		
		jdbcTemplate.update(INSERT_PERSON, insertParams);
		// logging
		System.out.println("Person is inserted... " + person);

	}

}
