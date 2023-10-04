package poo.pilhas;

public class DynamicLengthStack implements ASimpleStack {
	private char[] dadosDaPilha;
	private int topo;

	public DynamicLengthStack(int tamanho) {
		this.dadosDaPilha = new char[tamanho];
		this.topo = 0;
	}

	public DynamicLengthStack() {

	}

	public void push(char dado) {
		if (this.topo == this.dadosDaPilha.length) {
			char[] t = new char[this.dadosDaPilha.length * 2];

			for (int i = 0; i < this.topo; i++) {
			   t[i] = this.dadosDaPilha[i];
			}
			this.dadosDaPilha = t;
		}
		this.dadosDaPilha[topo++] = dado;

	}

	public char pop() {
		if (isEmpty()) {
			System.out.println("PILHA VAZIA");
			return (char) 0;
		}
		return this.dadosDaPilha[topo--];
	}

	public boolean isEmpty() {
		return this.topo == 0;
	}

	public boolean isFull() {
		return false;
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
