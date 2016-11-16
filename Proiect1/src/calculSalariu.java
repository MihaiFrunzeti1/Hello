
public class calculSalariu {

	int varsta;
	double salariu;
	
	public calculSalariu(int varsta, double salariu){
		this.salariu=salariu;
		this.varsta=varsta;
		
	}
	
	public double prima(){
		
		double prima = varsta*salariu; 
		
		return prima;
	}
	
}
