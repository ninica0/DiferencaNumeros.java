import java.util.Scanner;

public class DiferencaNumeros {

	public static void main(String[] args) {
Scanner sc =  new Scanner(System.in);
		
		int a, b, res;
		
		System.out.print("Digite um número: ");
		a = sc.nextInt();
		System.out.println("Digite outro número: " );
		b = sc.nextInt();
		
		if (a > b) {
			res = a-b;
		}else {
			res= b-a;
		}
		System.out.println("A diferença do número maior para  o menor é: " + res);
		}

	}