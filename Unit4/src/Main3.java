
public class Main3 {

	public static void main(String[] args) {
		TandemBike t = new TandemBike();
		t.speedUp(20);
		
		t.applyBrakes(5);		
		t.applyBrakes(5,5);
		t.printStates();	
		
		
		// b.applyBrakes (5,5) ---> No lo puede assignar, ya que no se lo assgnamos anteriormente
		//No podemos poner TandemBike b= new TandemBike()
		// No todas las bicicletas son Tandem
		Bicycle b = new TandemBike(); 
		
		
		
		
		//Algunas cosas interesantes que podriamos hacer//
		//Bicycle b2 = new Biclycle ;
		//TandemBike t2 = (TandemBike) b2;
	}

}
