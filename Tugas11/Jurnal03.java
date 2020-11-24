// import ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Jurnal03{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		ArrayList<Integer> listNumber = new ArrayList<Integer>();

		int number,
			modusNumber = 0,
			counterModusNumber = 0;

		System.out.print("Masukan angka: ");
		do{
			number = userInput.nextInt();

			if(number != -1){
				listNumber.add(number);
			}
		}while(number != -1);

		userInput.close();

		Collections.sort(listNumber, Collections.reverseOrder());

		for(int j = 0; j < listNumber.size(); j++){
			int counter = 0;

			for(int n : listNumber){
				if(listNumber.get(j) == n){
					counter++;
				}
			}

			if(counter > counterModusNumber){
				modusNumber = listNumber.get(j);
				counterModusNumber = counter;
			}else if(counter == counterModusNumber){
				if(listNumber.get(j) > modusNumber){
					modusNumber = listNumber.get(j);
				}
			}
		}

		System.out.print("Modus Number : " + modusNumber);
	}
}