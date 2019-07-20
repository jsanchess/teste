import listaLigada.*;

public class Principal {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
	
		lista.adicionaItemNoFinal(2);
		lista.adicionaItemNoFinal(3);
		lista.adicionaItemNoFinal(4);
		lista.adicionaItemNoFinal(10);
	
		lista.inserirOrdenado(-1);
		lista.inserirOrdenado(5);
		lista.inserirOrdenado(100);
		lista.imprimeListaLigada();

		System.out.println(" ");
		lista.inverteLista();
		lista.imprimeListaLigada();
	}

}
