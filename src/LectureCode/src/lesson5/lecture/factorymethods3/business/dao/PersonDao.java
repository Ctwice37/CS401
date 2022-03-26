package LectureCode.src.lesson5.lecture.factorymethods3.business.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import LectureCode.src.lesson5.lecture.factorymethods3.business.Address;
import LectureCode.src.lesson5.lecture.factorymethods3.business.Person;
import LectureCode.src.lesson5.lecture.factorymethods3.dataaccess.Dao;
import LectureCode.src.lesson5.lecture.factorymethods3.dataaccess.DataAccess;
import LectureCode.src.lesson5.lecture.factorymethods3.dataaccess.DataAccessFactory;

public class PersonDao implements Dao {
	DataAccess da = getDataAccessSystem();
	private List<Person> allPersons;
	public List<Person> getAllPersons() {
		try {
			da.read(this);
			allPersons = (List<Person>)getResults();
		} catch(SQLException e) {
			//handle
		}
		return allPersons;
	}
	public PersonDao(){}

	
	@Override
	public DataAccess getDataAccessSystem() {
		return DataAccessFactory.getDataAccess();
	}
	@Override
	public String getSql() {
		return "SELECT * from PERSON";
	}
	@Override
	public void unpackResultSet(ResultSet rs) throws SQLException {
		allPersons = new ArrayList<>();
		while(rs.next()) {
			allPersons.add(new Person(rs.getString("name"), rs.getString("ssn")));
		}		
	}
	@Override
	public List<?> getResults() {
		return allPersons;
	}
}
