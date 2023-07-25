import java.util.Random;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random numrandom = new Random();
		boolean acertou = false;
		int erros = 0;
		int sorteio = numrandom.nextInt(100);
		System.out.println("Numero sorteado:"+ sorteio);
		
		while (true) {
		    System.out.println("Adivinhe o número sorteado!!!:");
		    int tentativa = input.nextInt();
		    if (tentativa==sorteio) {
		        break;
		    } else {
		        if (tentativa>sorteio){
		            System.out.println("O número é menor que "+tentativa);
		        }else{
		            System.out.println("O número é maior que "+tentativa);
		        }
		        erros += 1;
		    }
		}
		System.out.println("Parabéns você acertou, o número era "+sorteio+" mas você errou " + erros + " vezes!");
	}
}	