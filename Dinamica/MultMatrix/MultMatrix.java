package MultMatrix;

public class MultMatrix {

	public MultMatrix() {
	}

	/** metodo recebe vetor de poisções **/
	public  void InicializarMM(int r[]) {

		int i, j, k, t;
		int N = r.length - 1;
		int cost[][] = new int[N][N];
		int best[][] = new int[N][N];
		int infinito = Integer.MAX_VALUE;

		System.out.print("\n Resultados otimos finais:\n");

		/** Preenche a matriz com 0 **/
		for (i = 0; i < N; i++)
			cost[i][i] = 0;
		/** for principal englobando todos os processos **/
		for (int l = 1; l < N; l++) {
			for (i = 0; i < N - l; i++) {
				/**
				 * j recebe posição a partir da linha da matriz + for total de
				 * testes
				 **/
				j = i + l;
				cost[i][j] = infinito;
				/** for de k para testar os processos de multi **/
				for (k = i; k < j; k++) {
					/**
					 * t recebe matriz principal + matriz teste k + operaços de
					 * posicao do vetor de posicoes
					 **/
					t = cost[i][k] + cost[k + 1][j] + r[i] * r[k + 1] * r[j + 1];
					/**
					 * if t < matriz principal ele encontrou uma otima
					 * multiplicacao e atribui nas matrizes
					 **/
					if (t < cost[i][j]) {
						cost[i][j] = t;
						best[i][j] = k + 1;
						/** A = 0 , B = 1 , C = 2 , D = 3**/
						/** imprime os resultados otimos **/
						System.out.println(" Matriz[ " + i + " ][ " + j + " ] = " + cost[i][j]);
						
					}
				}

			}

			System.out.println();

		}
		/** imprime as matrizes para vizualzação **/
		System.out.print("\n Matriz com resultados otimos:\n");
		for (i = 0; i < N; i++) {
			for (j = 0; j < N; j++) {
				System.out.print("\t" + cost[i][j] + " ");
			}
			System.out.print("\n");
		}
		System.out.print("\n Matriz com posições de resultados otimos:\n");
		for (i = 0; i < N; i++) {
			for (j = 0; j < N; j++) {
				System.out.print("\t" + best[i][j] + " ");
			}
			System.out.print("\n");
		}	

	}

	
}
