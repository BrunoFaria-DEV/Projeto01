import java.util.Locale;
import java.util.Scanner;
public class AppCalculadora {
	
	//Método main(Principal)
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double primeiroValor;
		double segundoValor;
		String operacao;
		boolean continuar;
		
		do {
			
			System.out.println("Digite o valor um: ");
			primeiroValor = scanner.nextDouble();
			
			System.out.println("Digite a operação( +, -, /, *): ");
			operacao = scanner.next();
			
			System.out.println("Digite o vator dois: ");
			segundoValor = scanner.nextDouble();
			
			//chamada do método que realiza as operações matemáticas
			System.out.println("Resultado: " + realizarCalculo(primeiroValor, segundoValor, operacao) );
			
			continuar = novaOperacao();
		} while (continuar);
		
		System.out.println("Fechando Calculadora.../n Programa encerrado!!");
	}
	
	public static boolean novaOperacao() {
		Scanner scannerNvOp = new Scanner(System.in);
		
		System.out.println("Nova operação?  (S/N)");
		return !scannerNvOp.nextLine().toUpperCase(Locale.ROOT).equals("N");
		
	}
	
	//Método de cálculo
	public static Double realizarCalculo(double primeiroValor, double segundoValor, String operacao){
		double resultado = 0.0;
		
		switch (operacao) {
		case "+":
			resultado = primeiroValor + segundoValor;
			break;
		case "-":
			resultado = primeiroValor - segundoValor;
			break;
		case "/":
			resultado = primeiroValor / segundoValor;
			break;
		case "*":
			resultado = primeiroValor * segundoValor;
			break;
		default:
			System.out.println("Operação inválida!!");
			break;
		}
		return resultado;
	}
}
