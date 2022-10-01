package exemploAlgoritmos_aula01082022;

// algoritmo de ordenação do tipo int para elementos de array.

public class SelectionSortAlgoritmo {

	public static void main(String[] args) {
		int numeral[] = { 2, 1, 9, 3, 6, 8, 4, 7 };
		
// o loop for "posicao" é responsável por percorrer o índice do array da primeira até a
// penúltima posição, sendo representado ao final pela váriavel "menor" que registra seu valor.
		for (int posicao = 0; posicao < numeral.length - 1; posicao++) {
			int menor = posicao;
			
// o loop for "contador" percorre todos os elementos do array "numeral" e verifica seus
// valores, comparando ao final se (if) o valor do elemento é inferior ao da variável "menor",
// registrando um novo valor para a variável "menor" se for o caso.
			for (int contador = posicao + 1; contador < numeral.length; contador++) {
				if (numeral[contador] < numeral[menor])
					menor = contador;
			}
// encerrando o loop "posicao", é comparado se (if) o valor da variável "menor" diverge do valor
// inicial do loop, se verdadeiro, utiliza-se a variável "aux" para substituir a representação
// dos valores em posição no array, ordenando os dados em ordem crescente até a penúltima 
// posição restando o último índice sem ser comparado uma vez que representa o maior valor.
			if (menor != posicao) {
				int aux = numeral[menor];
				numeral[menor] = numeral[posicao];
				numeral[posicao] = aux;
			}
		}
		for (int i = 0; i < numeral.length; i++)
			System.out.println(numeral[i]);
	}
}