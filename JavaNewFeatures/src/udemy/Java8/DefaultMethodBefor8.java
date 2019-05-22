package udemy.Java8;

public interface DefaultMethodBefor8 {
	public int addTwoNumbers(int n1, int n2);
}

class Class1 implements DefaultMethodBefor8{

	@Override
	public int addTwoNumbers(int n1, int n2) {
		int sum = n1 + n2;
		return sum;
	}
}

class Class2 implements DefaultMethodBefor8{

	@Override
	public int addTwoNumbers(int n1, int n2) {
		int sum = n1 + n2;
		return sum;
	}
}
