import java.util.Scanner;

public class GanjilGenap{


	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);

		int angka;
		System.out.println("Soal ke-1\n");
		
		System.out.println("Nama: Lucky Tri Bhakti");
		System.out.println("Kelas: D3-RPLA-4401");
		System.out.println("NIM: 6706202055");

		System.out.print("Masukan angka: ");
		angka = userInput.nextInt();
		
		userInput.close();

		if(angka % 2 == 0){
			System.out.println("Genap");
			
		}else{
			System.out.println("Ganjil");
		}
	}

}