package dao;

import model.Person;

public interface PersonJDBCTemplateDAO {

	public void insertPerson(Person person) throws Exception;
}
