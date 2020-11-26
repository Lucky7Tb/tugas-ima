// import ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Jurnal02{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		ArrayList<Integer> listNumber = new ArrayList<Integer>();

		int number;

		System.out.println("Soal ke-2\n");
		System.out.println("Nama  : Lucky Tri Bhakti");
		System.out.println("Kelas : D3-RPL-4401");    
		System.out.println("NIM   : 6706202055\n");

        System.out.println("Masukan angka -1 untuk berhenti memasukan angka");
		System.out.print("Masukan angka: ");
		do{
			number = userInput.nextInt();
			if(number != -1){
				listNumber.add(number);
			}
		}while(number != -1);


		Collections.sort(listNumber, Collections.reverseOrder());

		for(int num : listNumber){
			System.out.print(num + " ");
		}

	}
}