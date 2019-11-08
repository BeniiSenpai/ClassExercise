package DNI;

public class MainDni {

	public static void main(String[] args) {
		Dni d1 = new Dni(12121212);
		System.out.println(d1);
		
		System.out.println("---------Si lo podenmos de otra forma----------");
		Dni d2 = new Dni("18.957.690-D");
		System.out.println(d2);
		System.out.println(d2.isCorrectDni());
		
		System.out.println("----------Si al letra no es correcta-----------");
		Dni d3 = new Dni("18.957.690-F");
		System.out.println(d3);
		System.out.println(d2.isCorrectDni());
		
		Dni d4 = new Dni(123456789);
		System.out.println(d4.toFormattedString());
		
		System.out.println(Dni.letterForDni(12344434));
		System.out.println(Dni.nifForDni(12344434));
	}

}
