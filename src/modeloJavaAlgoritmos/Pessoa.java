package modeloJavaAlgoritmos;

// classe para representação do objeto Pessoa com método constructor para
// utilização dos atributos da classe de forma externa.

public class Pessoa {
	public int idade;
	public String nome;

// constructor recebe a palavra reservada "this" para sinalizar que as 
// variáveis int idade & String nome são informações recebidas nos parâmetros 
// do construtor equivalente aos atributos da classe instanciada.
	public Pessoa(int idade, String nome) {
		this.idade = idade;
		this.nome = nome;
	}
} 