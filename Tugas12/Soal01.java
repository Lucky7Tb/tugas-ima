// import ;
import java.util.Scanner;

class Soal01{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		System.out.println("Soal ke-1\n");
		System.out.println("Nama  : Lucky Tri Bhakti");
		System.out.println("Kelas : D3-RPL-4401");    
		System.out.println("NIM   : 6706202055\n");

		int[][] matriks;

		int matriksSize,
			value = 1,
			row = 0,
			column = 0,
			maxRow,
			maxColumn;

		System.out.print("Masukan ukuran matriks spiral: ");
		matriksSize = userInput.nextInt();

		userInput.close();

		matriks = new int[matriksSize][matriksSize];
		maxRow = matriksSize - 1;
		maxColumn = matriksSize - 1;

		while(value <= Math.pow(matriksSize, 2)){
			for(int index = column; index <= maxColumn; index++){
				matriks[row][index] = value++;
			}

			for(int index = row + 1; index <= maxRow; index++){
				matriks[index][maxColumn] = value++;
			}

			for(int index = maxColumn - 1; index >= column; index--){
				matriks[maxRow][index] = value++;
			}

			for(int index = maxRow - 1; index > row; index--){
				matriks[index][column] = value++;
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