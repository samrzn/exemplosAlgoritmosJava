package exemploAlgoritmos_aula01082022;

import java.util.ArrayList;
import java.util.Comparator;

import modeloJavaAlgoritmos.Pessoa;

// algoritmo de ordenação em coleção (ArrayList) de objetos com método próprio Java.

public class SelectionSortCollection_Alg_v2 {

	public static void main(String[] args) {
		ArrayList<Pessoa> letra = new ArrayList<>();
		letra.add(new Pessoa(49, "Rosana"));
		letra.add(new Pessoa(37, "Jessica"));
		letra.add(new Pessoa(19, "Olivia"));
		letra.add(new Pessoa(31, "Alessandro"));
		letra.add(new Pessoa(40, "Letícia"));
		letra.add(new Pessoa(28, "Pabllo"));

// a função "Comparator" implementada com o método abstrato "compare", percorre a
// lista em ordem verificando o primeiro caractere dos atributos o1 & 02 comparando e 
// sinalizando como int < 0 considerado inferior, int = 0 considerado igual e int > 0 
// considerado superior, ordenando a coleção de objetos de forma crescente.
		letra.sort(new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.nome.compareTo(o2.nome);
			}
		});
// objeto Pessoa é representado como "p" e pertence a coleção de objetos <ArrayList>
// "letra", o laço de repetição imprime para cada Pessoa "p" da coleção
// uma linha contendo os atributos "nome" e "idade".
		for (Pessoa p : letra)
			System.out.println(p.nome + " : " + p.idade);
	}
} 