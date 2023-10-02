package poo.pilhas;

public class ASimpleStackDemo {
	public static void main(String[] args) {
		ASimpleStack s;
		FixedLengthStack fls = new FixedLengthStack(9);
		FixedLengthStack fls1 = new FixedLengthStack();

		fls.push('p');
		fls.push('r');
		fls.push('o');
		fls.push('g');
		fls.push('r');
		fls.push('a');
		fls.push('m');
		fls.push('a');
		fls.push('r');
		fls.push('j');
		fls.pop();
		fls1.pop();

		System.out.println(fls.pop());

	}
}
