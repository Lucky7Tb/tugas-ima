import java.util.Scanner;

class Star{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
        
        int row;

        System.out.println("Soal ke-6\n");
        System.out.println("Nama  : Lucky Tri Bhakti");
        System.out.println("Kelas : D3-RPL-4401");    
        System.out.println("NIM   : 6706202055\n");

        System.out.print("Masukan banyak baris: ");
        row = userInput.nextInt();
        userInput.close();
		
		for(int i = 1; i <= row; i++){

			for(int j = row; j > i; j--){
				System.out.print(" ");
			}

			for(int k = 1; k <= i; k++){
				System.out.print("*");
			}

			System.out.print("\n");
		}		
	}
}