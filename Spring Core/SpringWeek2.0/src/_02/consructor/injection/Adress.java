package _02.consructor.injection;

public class Adress {
	
	private String ikamet;
	private int no;
	
	
	
	public Adress(String ikamet, int no) {
		super();
		this.ikamet = ikamet;
		this.no = no;
	}



	public String getIkamet() {
		return ikamet;
	}



	public void setIkamet(String ikamet) {
		this.ikamet = ikamet;
	}



	public int getNo() {
		return no;
	}



	public void setNo(int no) {
		this.no = no;
	}



	@Override
	public String toString() {
		return "Adress [ikamet=" + ikamet + ", no=" + no + "]";
	}
	
	
	
	
	
	
	

}
