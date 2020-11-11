import java.util.Scanner;

class Factorial{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
        
		int factorialNumber,
			result = 1;

		System.out.println("Soal ke-5\n");
		System.out.println("Nama  : Lucky Tri Bhakti");
		System.out.println("Kelas : D3-RPL-4401");    
		System.out.println("NIM   : 6706202055\n");

		System.out.print("Masukan no faktorial: ");
		factorialNumber = userInput.nextInt();

		userInput.close();

		for(int i = 1; i <= factorialNumber; i++){
			result = result * i;
		}

		System.out.print(result);
	}
}