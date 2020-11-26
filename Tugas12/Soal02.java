//import ;
import java.util.Scanner;

class Soal02{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		int[][] matriks;
		int matriksSize,
			multiplyNumber;

		System.out.println("Soal ke-2\n");
		System.out.println("Nama  : Lucky Tri Bhakti");
		System.out.println("Kelas : D3-RPL-4401");    
		System.out.println("NIM   : 6706202055\n");

		System.out.print("Masukan ukuran matriks: ");
		matriksSize = userInput.nextInt();

		System.out.print("Masukan angka perkalian: ");
		multiplyNumber = userInput.nextInt();

		matriks = new int[matriksSize][matriksSize];

		System.out.println("Masukan angka matriksnya: ");
		
		for(int i = 0; i < matriksSize; i++){
			for(int j = 0; j< matriksSize; j++){
				matriks[i][j] = userInput.nextInt() * multiplyNumber;
			}
		}

		userInput.close();

		System.out.print("\n");

		for(int index = 0; index < matriksSize; index++){
			for(int num : matriks[index]){
				System.out.print(num + " ");
			}
			System.out.print("\n");
		}

	}
}