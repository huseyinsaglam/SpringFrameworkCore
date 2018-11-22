package _03.collection.injection;

import java.util.List;
import java.util.Map;

public class CollectioninjectionModel {
	
	private List<String> namelist;
	private List<Student> studentlist;
	private Map<String, Integer> maplist;

	public List<String> getNamelist() {
		return namelist;
	}

	public void setNamelist(List<String> namelist) {
		this.namelist = namelist;
	}
	
	
	

	public List<Student> getStudentlist() {
		return studentlist;
	}

	public void setStudentlist(List<Student> studentlist) {
		this.studentlist = studentlist;
	}

	
	
	
	public Map<String, Integer> getMaplist() {
		return maplist;
	}

	public void setMaplist(Map<String, Integer> maplist) {
		this.maplist = maplist;
	}
	
	

	@Override
	public String toString() {
		return "CollectioninjectionModel [namelist=" + namelist + ", studentlist=" + studentlist + ", maplist="
				+ maplist + "]";
	}
	
	

	
	
	

	
	
	
	

}
