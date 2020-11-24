import java.util.Scanner;

class Jurnal03 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
			
		int row,
			counter = 0;

		System.out.println("Soal ke-3\n");
		System.out.println("Nama  : Lucky Tri Bhakti");
		System.out.println("Kelas : D3-RPL-4401");    
		System.out.println("NIM   : 6706202055\n");

		System.out.print("Masukan jumlah baris: ");
		row = userInput.nextInt();

		userInput.close();
		
		for(int i = 0; i < row; i++){
			for(int j = 0; j <= i; j++){
				System.out.print(counter);
				counter = counter + 1;
				if(counter > 9){
					counter = 0;
				}
			}

			System.out.print("\n");
		}	
	}
}