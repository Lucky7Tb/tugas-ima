// import ;
import java.util.Scanner;

class TP01{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int totalParticipant,
			randomParticipant;
		String[] listPeserta;

		System.out.println("Soal ke-1\n");
		System.out.println("Nama  : Lucky Tri Bhakti");
		System.out.println("Kelas : D3-RPL-4401");    
		System.out.println("NIM   : 6706202055\n");

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