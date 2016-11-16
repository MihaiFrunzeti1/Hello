import java.util.Date;

public class Persoana {

	private int varsta;
	
	public Persoana(){
		varsta=18;
	}
	
	public Persoana(Date date){
		varsta=date.getYear()-1980;
	}
	
}
