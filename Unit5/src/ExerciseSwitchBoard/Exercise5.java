package ExerciseSwitchBoard;

public class Exercise5 {

	public static void main(String[] args) {
		SwitchBoard sb = new SwitchBoard(20);
		sb.registerCall(new Call(111, 150, 15, 1, false));
		sb.registerCall(new Call(222, 140, 10, 1, false));
		sb.registerCall(new Call(333, 130, 10, 1, false));
		sb.registerCall(new Call(444, 120, 10, 1, false));
		sb.registerCall(new Call(555, 100, 10, 1, true));
		sb.registerCall(new Call(666, 999, 10, 1, true));
		sb.registerCall(new Call(777, 888, 10, 1, true));
		sb.registerCall(new Call(888, 777, 10, 1, false));
		sb.registerCall(new Call(999, 666, 10, 1, false));
		sb.registerCall(new Call(100, 555, 10, 1, true));
		sb.registerCall(new Call(120, 444, 10, 1, false));
		sb.registerCall(new Call(130, 333, 10, 1, false));
		sb.registerCall(new Call(140, 222, 10, 1, false));
		sb.registerCall(new Call(150, 111, 10, 1, true));
		
		sb.print();
		System.out.println("---------------------------------------------------");
		sb.print(1);
		
		System.out.println("-----------------TOTAL CALLS-----------------------");
		System.out.println(sb.getNumRegisterCalls());
		System.out.println("-----------------TOTAL COSTS-----------------------");
		System.out.println(sb.getTurnOver());
	}

}
