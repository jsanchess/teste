package listaLigada;

public class ListaLigada {
	private LinkedNode first = null;
	
	private class LinkedNode{
		int data;
		LinkedNode next;
	}
	public void adicionaItemNoFinal(int item) {
		LinkedNode novoNode = new LinkedNode();
		novoNode.data = item;
		novoNode.next = null; 

		if(first == null) {
			first = novoNode;
		}
		else {
			LinkedNode atual = first;
	
			while(atual.next != null) {
				atual = atual.next;
			}
		
			atual.next = novoNode;
		}
	}
	public void imprimeListaLigada() {
		//if(first == null) {
		//System.out.println("Lista vazia");
		//}
		//else {
		LinkedNode atual = first;

		while(atual != null) {
			System.out.printf(" %4d", atual.data);
			atual = atual.next;
		}
		//}
	}
	public void removeItem(int item) {
		if( first != null) {
			if(first.data == item) {
				first = first.next;
			}
			else {
			LinkedNode atual = first;
		
				while(atual.next != null && atual.next.data != item) {
					atual = atual.next;
				}
				if(atual.next != null) {
					atual.next = atual.next.next;
				}
			}
		}
	}
	public boolean buscarItem(int item) {
		LinkedNode atual = first;
		
		while(atual.next != null && atual.data != item) {
			atual = atual.next;
		}
		if(atual.data == item) {
			return true;
		}
		else {
			return false;
		}
	}
	public void inserirOrdenado(int item) {
		LinkedNode novoNo = new LinkedNode();
		novoNo.next = null;
		novoNo.data = item;
		
		if(first == null) {
			first = novoNo;
		}
		else {
			if(first.data > item) {
				novoNo.next = first;
				first = novoNo;
			}
			else {
				LinkedNode atual = first;
		
				while(atual.next != null && atual.next.data < item) {
					atual = atual.next;
				}
				if(atual.next == null) {
					atual.next = novoNo;
				}
				else {
					novoNo.next = atual.next;
					atual.next = novoNo;
				}
			}
		}
	}
	public void inverteLista() {
		LinkedNode atual = first;
		//LinkedNode aux = new LinkedNode();
		
		//while(atual.next.data > atual.data) {
			//while(atual.next != null && atual.next.data > atual.data) {
				//aux.data = atual.data;
				//atual.data = atual.next.data;
				//atual.next.data = aux.data;
			
				//atual = atual.next;
			//}
			//atual = first;
		//}	
		
		LinkedNode anterior = first;
		atual = first.next;
		first.next = null;
		
		while(atual != null) {
			LinkedNode prox = atual.next;
			atual.next = anterior;
			anterior = atual;
			atual = prox;
		}
		first = anterior;
	}
}
