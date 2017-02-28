package MochilaD;

public class TesteD {
	
	public static void main(String[] args) {

		System.out.print("\n Solução Ótima");
		System.out.print("\n Algoritmo da Mochila\n");
		
		MochilaD mochila = new MochilaD();

		int elementos = 4;
		int CapMax = 50;
		int[] Item = new int[elementos + 1]; // vetor de indices de elementos
		int[] valor = new int[elementos + 1];// vetor de peso de elementos

		Item[1] = 10;
		Item[2] = 20;
		Item[3] = 30;

		valor[1] = 60;
		valor[2] = 100;
		valor[3] = 120;
	

		mochila.InicializaMochilaD(Item, valor, CapMax, elementos);
	}
}
