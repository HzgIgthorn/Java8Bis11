package udemy.Java8;

public interface DefaultMethodAfter8 {
	default public int addTwoNumbers(int n1, int n2) {
		int sum = n1 + n2;
		return sum;
	}
}

class ClassA implements DefaultMethodAfter8{

	@Override
	public int addTwoNumbers(int n1, int n2) {
		return addTwoNumbers(n1, n2);
	}
}

class ClassB implements DefaultMethodAfter8{

}
