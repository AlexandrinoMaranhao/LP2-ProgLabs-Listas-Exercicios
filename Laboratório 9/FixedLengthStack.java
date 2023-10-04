package poo.pilhas;

public class FixedLengthStack implements ASimpleStack {
	private char[] dadosDaPilha;
	private int topo;

	public FixedLengthStack(int tamanho) {
		this.dadosDaPilha = new char[tamanho];
		this.topo = 0;
	}

	public FixedLengthStack() {

	}

	public void push(char dado) {
		if (isFull()) {
			System.out.println("PILHA CHEIA");
			return;
		}
		this.dadosDaPilha[topo++] = dado;

	}

	public char pop() {
		if (isEmpty()) {
			System.out.println("PILHA VAZIA");
			return (char) 0;
		}
		return this.dadosDaPilha[--topo];

	}

	public boolean isEmpty() {
		return this.topo == 0;
	}

	public boolean isFull() {
		return this.topo == this.dadosDaPilha.length;
	}

	public void reset() {
		this.dadosDaPilha[topo] = 0;
	}

	public char peek() {
		if (isEmpty()) {
			System.out.println("PILHA VAZIA");
			return (char) 0;
		}
		return this.dadosDaPilha[topo++];
	}

	public int size() {
		if (isEmpty()) {
			return (char) 0;
		}
		return this.dadosDaPilha.length;
	}
}
