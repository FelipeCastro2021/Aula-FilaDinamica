package View;

import Controller.FilaDinamica;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = {36, 28, 146, 14, -65, 117, -40, 24, 138, 116};
		FilaDinamica fila = new FilaDinamica();
		
		for (int valor : vetor) {
			if (fila.isEmpty()) {
				fila.insert(valor * 10);
			} else if (valor >= 0) {
				fila.insert(valor + 10);
			} else if (valor < 0) {
				int auxiliar;
				try {
					auxiliar = fila.remove();
					System.out.println(auxiliar);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				fila.insert(valor);
			}
			
			try {
				fila.list();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			int tamanho = fila.size();
			System.out.println("Tamanho: " + tamanho);
		}
	}

}
