public class Test {

	public static void main(String[] args) {

		// vdfgd
	
	lucru l1 = (x,y)-> x+y;
                    //suprascrierea metodei
	lucru l2 = new lucru(){
		public double calcullucru(int x, int y){
			return x+y;
		}
	};
	m((d,e)->d+e,10,20);
	m(l2,10,20);
	
	}
	public static void m(lucru l, int a, int b){
		System.out.println(l.calcullucru(a, b));
	
	lucru l3 = new LucruImpl();
	
	
	
	
	}
	
}
