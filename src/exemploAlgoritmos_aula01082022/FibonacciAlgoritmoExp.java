package exemploAlgoritmos_aula01082022;

//representação recursiva do algoritmo exponencial de Fibonacci conhecido por
//somar o valor das duas posições anteriores de sua ordem p/ resultar no valor da
//posição seguinte, sendo os valores das 2 posições iniciais representados por 1.

public class FibonacciAlgoritmoExp {

// "if" valor da "position" igual a 0 ou 1, retorne 1; fibonacci retorna soma da
// penúltima com antipenúltima posição para representar o valor da próxima.
	static int fibonacci(int position) {
		if (position == 0 || position == 1)
			return 1;
		return fibonacci(position - 1) + fibonacci(position - 2);
	}

// vetor "value" recebe como tamanho do seu índice o valor definido na variável SIZE,
// o loop "for" recebe "x" como contador, indo das posições 0 a 22, realizando a 
// operação declarada no método "fibonacci" e registrando os valores nas posições do
// vetor.
	public static void main(String[] args) {
		int SIZE = 19;
		int[] value = new int[SIZE];
		for (int x = 0; x < SIZE; x++)
			value[x] = fibonacci(x);
		for (int x = 0; x < SIZE; x++)
			System.out.println("Fibonacci(" + x + ") = " + value[x]);
	}
}