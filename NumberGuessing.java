
import java.util.Scanner;

public class NumberGuessing {

	// Aqui começa
	// o real joguinho
	public static void
	guessingNumberGame()
	{
		try (
        Scanner sc = new Scanner(System.in)) {
            // Gera os números
            int number = 1 + (int)(100
            					* Math.random());

            // Quantidade de tentativas
            int K = 10;

            int i, guess;

            System.out.println(
            	"Um número foi escolhido"
            	+ " entre 1 e 100."
            	+ " Adivinhe ele"
            	+ " em até 10 tentativas. Boa sorte!");

            for (i = 0; i < K; i++) {

            	System.out.println(
            		"Adivinha aí:");

            	// Confere o palpite
            	guess = sc.nextInt();

            	// Resposta caso o número seja adivinhado
            	if (number == guess) {
            		System.out.println(
            			"Parabéns! Você REALMENTE acertou!"
            			+ " Estou orgulhosa de você!");
            		break;
            	} //As dicas do joguinho
            	else if (number > guess
            			&& i != K - 1) {
            		System.out.println(
            			"O número é"
            			+ " maior do que " + guess);
            	}
            	else if (number < guess
            			&& i != K - 1) {
            		System.out.println(
            			"O número é"
            			+ " menor do que " + guess);
            	}
            }
                   //Caso o número não seja acertado
            if (i == K) {
            	System.out.println(
            		"Suas tentativas acabaram, você não conseguiu adivinhar em"
            		+ " K tentativas.");

            	System.out.println(
            		"O número era " + number);
            }
        }
	}

	//Código Principal
	public static void
	main(String arg[])
	{

		//Invocando a função
		guessingNumberGame();
	}
}
