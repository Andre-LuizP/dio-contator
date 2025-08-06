import java.util.Scanner;
import br.dio.exceptions.ParametroInvalidoException;

public class Contador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int num1 = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int num2 = scanner.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(num1, num2);	
		}catch (ParametroInvalidoException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println(exception.getMessage());
		}
		
	}
	static void contar(int num1, int num2 ) throws ParametroInvalidoException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção	
		if (num1 >= num2) {
			throw new ParametroInvalidoException("O segundo parâmetro deve ser maior que o primeiro");
		}
		int contagem = num2 - num1;
		//realizar o for para imprimir os números com base na variável contagem
		for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
		
	}
}