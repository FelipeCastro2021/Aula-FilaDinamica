package View;

import Controller.FilaDinamica;

public class Principal {

	public static void main(String[] args) {
		FilaDinamica filaDin = new FilaDinamica();
		
		boolean vazia = filaDin.isEmpty();
		System.out.println(vazia);
		
		int tamanho = filaDin.size();
		System.out.println(tamanho);
		
		int dado;
		try {
			dado = filaDin.remove();
			System.out.println(dado);
			
			filaDin.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		filaDin.insert(5);
		filaDin.insert(4);
		filaDin.insert(3);
		filaDin.insert(2);
		filaDin.insert(1);
		
		tamanho = filaDin.size();
		System.out.println("Tamanho: " + tamanho);
		
		try {
			filaDin.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int removido;
		try {
			removido = filaDin.remove();
			System.out.println(removido);
			
			filaDin.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		tamanho = filaDin.size();
		System.out.println("Tamanho: " + tamanho);
		
		vazia = filaDin.isEmpty();
		System.out.println(vazia);
		
		try {
			filaDin.remove();
			filaDin.remove();
			filaDin.remove();
			filaDin.remove();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
