//import ;
import java.util.Scanner;

class Jurnal01{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		int matriksSize;
		int[][] matriks;

		System.out.println("Soal ke-1\n");
		System.out.println("Nama  : Lucky Tri Bhakti");
		System.out.println("Kelas : D3-RPL-4401");    
		System.out.println("NIM   : 6706202055\n");

		System.out.print("Masukan ukuran matriks: ");
		matriksSize = userInput.nextInt();

		matriks = new int[matriksSize][matriksSize];

		System.out.println("Masukan angka matrisknya: ");

		for(int i = 0; i < matriksSize; i++){
			for(int j = 0; j < matriksSize; j++){
				matriks[i][j] = userInput.nextInt();
			}
		}

		userInput.close();

		System.out.print("\n");

		for(int i = matriksSize - 1; i >= 0; i--){
			for(int j = 0; j < matriksSize; j++){
				System.out.print(matriks[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}