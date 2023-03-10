package exemploAlgoritmos_aula01082022;

import java.util.ArrayList;

import modeloJavaAlgoritmos.Pessoa;

// algoritmo de ordenação do tipo String para coleção (ArrayList) de objetos.

public class SelectionSortCollection_Alg {

	public static void main(String[] args) {
		ArrayList<Pessoa> letra = new ArrayList<>();
		letra.add(new Pessoa(2, "Donna"));
		letra.add(new Pessoa(31, "Robyn"));
		letra.add(new Pessoa(7, "Alexa"));
		letra.add(new Pessoa(55, "José"));
		letra.add(new Pessoa(23, "Karli"));

// o loop for "posicao" é responsável por percorrer as coleções da primeira até a 
// penúltima, sendo representado ao final pela váriavel "menor" que registra seu valor.
		for (int posicao = 0; posicao < letra.size() - 1; posicao++) {
			int menor = posicao;

// o loop for "contador" verifica todos os atributos das coleções comparando 
// ao final se (if) o valor contido em String é inferior ao da variável "menor",
// registrando um novo valor para a variável "menor" se for o caso.
			for (int contador = posicao + 1; contador < letra.size(); contador++) {
				if (letra.get(contador).nome.compareTo(letra.get(menor).nome) < 0)
					menor = contador;
			}
// encerrando o loop "posicao", é comparado se (if) o valor da variável "menor" diverge do valor
// inicial do loop, se verdadeiro, utiliza-se a variável "aux" para substituir a representação
// dos objetos na lista de coleções, ordenando as em ordem alfabética até a penúltima 
// posição restando a última coleção sem ser comparada uma vez que representa o maior valor.
			if (menor != posicao) {
				Pessoa aux = letra.get(menor);
				letra.set(menor, letra.get(posicao));
				letra.set(posicao, aux);
			}
		}
// os métodos acessores "get" & "set" são utilizados para encontrar as variáveis
// apresentadas e introduzir nos loops de comparação, além de substituir a ordem
// das coleções quando indicado que um valor é menor ou maior.
		for (int i = 0; i < letra.size(); i++)
			System.out.println(letra.get(i).nome + " : " + letra.get(i).idade);
	}
} 