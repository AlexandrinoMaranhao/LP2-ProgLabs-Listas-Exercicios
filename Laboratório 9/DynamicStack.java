package poo.pilhas;

public class DynamicStack implements ASimpleStack {
	private char[] dadosDaPilha;
	private int topo;

	public DynamicStack(int tamanho) {
		this.dadosDaPilha = new char[tamanho];
		this.topo = 0;
	}

	public DynamicStack() {

	}

	public void push(char dado) {
		if (this.topo == this.dadosDaPilha.length) {
			char[] t = new char[this.dadosDaPilha.length * 2];

			for (int i = 0; i < this.topo; i++) {

			}
		}

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
		this.dadosPilha[topo] = 0;
	}

	public char peek() {
		if (isEmpty()) {
			System.out.println("PILHA VAZIA");
			return (char) 0;
		}
		return this.dadosDaPilha[topo++];
	}

	public int size() {
	
	}
}
