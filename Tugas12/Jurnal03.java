// import ;
import java.util.Scanner;

class Jurnal03{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		System.out.println("Soal ke-1\n");
		System.out.println("Nama  : Lucky Tri Bhakti");
		System.out.println("Kelas : D3-RPL-4401");    
		System.out.println("NIM   : 6706202055\n");

		int matriksSize,
			value = 1,
			row = 0,
			column = 0,
			maxRow,
			maxColumn;

		int[][] matriks;

		System.out.print("Masukan ukuran matriks spiral: ");
		matriksSize = userInput.nextInt();

		userInput.close();

		matriks = new int[matriksSize][matriksSize];
		maxRow = matriksSize - 1;
		maxColumn = matriksSize - 1;

		while(value <= Math.pow(matriksSize, 2)){

			for(int index = row; index <= maxRow; index++){
				matriks[index][column] = value++;
			}

			for(int index = column + 1; index <= maxColumn; index++){
				matriks[maxRow][index] = value++;
			}

			for(int index = maxRow - 1; index >= row; index--){
				matriks[index][maxColumn] = value++;
			}

			for(int index = maxColumn - 1; index > column; index--){
				matriks[row][index] = value++;
			}

			row++;
			column++;
			maxRow--;
			maxColumn--;
		}

		for(int i = 0; i < matriksSize; i++){
			for(int k = 0; k < matriksSize; k++){
				System.out.print(matriks[i][k] + "\t");
			}
			System.out.print("\n");
		}

	}
}