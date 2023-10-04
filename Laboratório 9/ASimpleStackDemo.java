package poo.pilhas;

public class ASimpleStackDemo {
	public static void main(String[] args) {
		ASimpleStack s;
		FixedLengthStack fls = new FixedLengthStack(9);
		FixedLengthStack fls1 = new FixedLengthStack();
		DynamicStack ds = new DynamicStack(9);
		DynamicStack ds1 = new DynamicStack();
		
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
		/*fls1.pop();
		ds.pop();
		ds1.pop();*/
		
		
		
		System.out.println(ds.size());
		System.out.println(ds1.size());
		System.out.println(fls1.size());
		System.out.println(fls.size());
		
		System.out.println(ds.peek());
		System.out.println(ds1.peek());
		System.out.println(fls1.peek());
		System.out.println(fls.peek());

	}
}
