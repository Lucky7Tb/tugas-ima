// import ;
import java.util.Scanner;

class TP03{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int[] listNumber;

		int listLength,
			modusNumber = 0,
			counterModusNumber = 0;

		System.out.print("Masukan banyak bilangan: ");
		listLength = userInput.nextInt();

		listNumber = new int[listLength];

		System.out.print("Masukan angka: ");
		for(int index = 0; index < listLength; index++){
			listNumber[index] = userInput.nextInt();
		}

		userInput.close();

		for(int i = 0; i < listLength; i++){
			for(int index = 1; index <= listLength - 1; index++){
				if(listNumber[index] > listNumber[index - 1]){
					int angkaTerbesar = listNumber[index];
					listNumber[index] = listNumber[index - 1];
					listNumber[index - 1] = angkaTerbesar;
				}
			}
		}

		for(int j = 0; j < listLength; j++){
			int counter = 0;

			for(int k = 0; k < listLength; k++){
				if(listNumber[j] == listNumber[k]){
					counter++;
				}
			}

			if(counter > counterModusNumber){
				modusNumber = listNumber[j];
				counterModusNumber = counter;
			}else if(counter == counterModusNumber){
				if(listNumber[j] > modusNumber){
					modusNumber = listNumber[j];
				}
			}
		}

		System.out.print("Modus number: " + modusNumber);
	}
}