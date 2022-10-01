package exemploAlgoritmos_aula01082022;

import modeloJavaAlgoritmos.Pessoa;

// algoritmo de ordenação para array de objetos.

public class SelectionSortAlgoritmo_2 {

	public static void main(String[] args) {
		Pessoa ordem[] = { new Pessoa(2, "Donna"), new Pessoa(13, "Luiz"), new Pessoa(22, "Sam"),
				new Pessoa(51, "Ana"), new Pessoa(9, "Rosa") };

// o loop for "posicao" é responsável por percorrer o índice do array da primeira até a
// penúltima posição, sendo representado ao final pela váriavel "menor" que registra seu valor.
		for (int posicao = 0; posicao < ordem.length - 1; posicao++) {
			int menor = posicao;

// o loop for "contador" percorre todos os objetos do array "ordem" e verifica seus
// valores, comparando ao final se (if) o valor do elemento é inferior ao da variável "menor",
// registrando um novo valor para a variável "menor" se for o caso.
			for (int contador = posicao + 1; contador < ordem.length; contador++) {
				if (ordem[contador].idade < ordem[menor].idade)
					menor = contador;
			}
// encerrando o loop "posicao", é comparado se (if) o valor da variável "menor" diverge do valor
// inicial do loop, se verdadeiro, utiliza-se a variável "aux" para substituir a representação
// dos objetos em posição no array, ordenando os dados em ordem crescente até a penúltima 
// posição restando o último índice sem ser comparado uma vez que representa o maior valor.
			if (menor != posicao) {
				Pessoa aux = ordem[menor];
				ordem[menor] = ordem[posicao];
				ordem[posicao] = aux;
			}
		}
		for (int i = 0; i < ordem.length; i++)
			System.out.println(ordem[i].nome + " : " + ordem[i].idade);
	}
}