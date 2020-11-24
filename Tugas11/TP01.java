// import ;
import java.util.Scanner;

class TP01{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int totalParticipant,
			randomParticipant;
		String[] listPeserta;

		System.out.print("Masukan berapa banyak peserta: ");
		totalParticipant = userInput.nextInt();

		listPeserta = new String[totalParticipant];

		randomParticipant = (int)(Math.random() * totalParticipant - 1);

		for(int i = 0; i < totalParticipant; i++){
			listPeserta[i] = userInput.next();
		}

		userInput.close();

		System.out.print("\n" + listPeserta[randomParticipant]);
	}
}