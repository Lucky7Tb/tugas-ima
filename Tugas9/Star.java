33import java.util.Scanner;

class Star{
	public static void main(String[] args) {
	   Scanner userInput = new Scanner(System.in);
		
		int row;

		System.out.println("Soal ke-3\n");
		System.out.println("Nama  : Lucky Tri Bhakti");
		System.out.println("Kelas : D3-RPL-4401");    
		System.out.println("NIM   : 6706202055\n");

		System.out.print("Masukan jumlah baris: ");
		row = userInput.nextInt();

		userInput.close();

		System.out.println("\nBintang pola ke-1");

		for(int i = 1; i <= row; i++){
			for(int j = 1; j <= row; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}

		System.out.println("\nBintang pola ke-2");

		for(int i = 1; i <= row; i++){

			for(int j = 0; j < i; j++){
				System.out.print("*");
			}

			System.out.print("\n");
		}

		System.out.println("\nBintang pola ke-3");

		for(int i = 1; i <= row; i++){

			for(int k = row; k >= i; k--){
				System.out.print("*");
			}

			System.out.print("\n");
		}

		System.out.println("\nBintang pola ke-4");

		for(int i = 1; i <= row; i++){

			for(int j = 1; j < i; j++){
				System.out.print(" ");
			}

			for(int j = row; j >= i; j--){
				System.out.print("*");
			}

			System.out.print("\n");
		}

		System.out.println("\nBintang pola ke-5");

		for(int i = 1; i <= row; i++){

			for(int j = row; j > i; j--){
				System.out.print(" ");
			}

			for(int k = 0; k < i; k++){
				System.out.print("*");
			}

			System.out.print("\n");
		}
	}
}
