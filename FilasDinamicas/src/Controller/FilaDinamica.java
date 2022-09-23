package Controller;

public class FilaDinamica {
	No inicio;
	No fim;
	
	public FilaDinamica() {
		inicio = null;
		fim = null;
	}
	
	public boolean isEmpty() {
		if (inicio == null && fim == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void insert(int valor) {
		No elemento = new No();
		elemento.dado = valor;
		
		if (inicio == null) { //Não tiver nenhum dado presente na fila
			inicio = elemento;
			fim = elemento;
			elemento.proximo = null;
		} else if (inicio == fim && inicio != null) { // Tendo apenas um elemento dentro da fila
			fim = elemento;
			inicio.proximo = fim;
			fim.proximo = null;
		} else {
			fim.proximo = elemento;
			elemento.proximo = null;
			fim = elemento;
		}
	}
	
	public int remove() throws Exception {
		if(isEmpty()) { // Se fila estiver vazia
			throw new Exception("Não há elementos na fila");
		}
		
		No auxiliar = inicio;
		
		if (inicio == fim && inicio != null) { // Fila com só 1 elemento
			inicio = null;
			fim = null;
		} else {
			inicio = inicio.proximo;
		}
		
		return auxiliar.dado;
	}
	
	public void list() throws Exception {
		if(isEmpty()) {
			throw new Exception("Não há elementos na fila");
		}
		
		No auxiliar = inicio;
		
		while(auxiliar != null) {
			System.out.println(auxiliar.dado);
			auxiliar = auxiliar.proximo;
		}
	}
	
	public int size() {
		int cont = 0;
		
		if(isEmpty() == false) { //Se não for nulo
			No auxiliar = inicio;
			
			while(auxiliar != null) {
				cont++;
				auxiliar = auxiliar.proximo;
			}
		}
		
		return cont;
	}
}
