// import ;
import java.util.Scanner;

class TP02{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int totalParticipant;
		int[] listNumber;

		System.out.print("Masukan banyak nilai: ");
		totalParticipant = userInput.nextInt();

		listNumber = new int[totalParticipant];

		System.out.print("Masukan angka: ");
		for(int i = 0; i < totalParticipant; i++){
			listNumber[i] = userInput.nextInt();
		}

		userInput.close();

		for(int k = 0; k < totalParticipant; k++){
			for(int j = 1; j <= totalParticipant - 1; j++){
				if(listNumber[j] > listNumber[j - 1]){
					int largerNumber = listNumber[j];
					listNumber[j] = listNumber[j - 1];
					listNumber[j - 1] = largerNumber;
				}
			}
		}

		for(int point : listNumber){
			System.out.print(point + " ");
		}
	}
}