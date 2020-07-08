package pesquisa.binaria;

public class PesquisaBinaria {

	
	int buscaBinaria(int vet[], int chave, int Tam) {
		int inf = 0; // limite inferior
		int sup = Tam - 1; // limite superior
		int meio;
		while (inf <= sup) {
			meio = (inf + sup) / 2;
			if (chave == vet[meio])
				return meio;
			if (chave < vet[meio])
				sup = meio - 1;
			else
				inf = meio + 1;
		}
		return -1; // não encontrado
	}
}
