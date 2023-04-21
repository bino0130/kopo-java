package ccl;

public class CalcAdd {
	private static double PI = 3.14;
	
	private int memory;
	private String name;

	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public int addWithMemory (int a) {
		return this.memory + a;
	}
	
	public static double getCircleLength (double r) {
		return 2 * PI * r;
	}
	
	
	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
