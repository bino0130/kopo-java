package ccl;

public class Calc {

	public static void main(String[] args) {
		CalcAdd calc1 = new CalcAdd();
		CalcAdd calc2 = new CalcAdd();
		
		calc1.setName("calc #1");
		calc2.setName("calc #2");
		
		int r1 = CalcAdd.add(1, 2);
		System.out.println(r1);
		
		calc1.setMemory(5);
		int r2 = calc1.addWithMemory(3);
		
		double r3 = CalcAdd.getCircleLength(10);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
	}

}
