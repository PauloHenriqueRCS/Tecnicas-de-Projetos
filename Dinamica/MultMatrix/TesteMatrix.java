package MultMatrix;

public class TesteMatrix {
	
	public static void main(String args[]) {
		
		System.out.print("\n\t Programação Dinâmica");
		System.out.print("\n Algoritmo de Multiplicação de Matrizes\n");
		/** vetor de posições **/
		/** (d[0][1] é A = 4x3) , (d[1][2] é B = 3x4) , (d[2][3] é C = 4x3) **/
		System.out.println("\nMatrizes e Dimensões");
		System.out.print("A(4x3) ,B(3x4), C4x3), D(3x4)\n");
		int d[] = { 4, 3, 4, 3,4 };
		/** chama metodo **/
		MultMatrix mm = new MultMatrix();
		mm.InicializarMM(d);
	}
}
