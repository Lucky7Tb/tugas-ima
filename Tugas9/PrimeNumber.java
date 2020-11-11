import java.util.Scanner;

class PrimeNumber{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		int deret;
		boolean isPrimeNumber = true;
	   
		System.out.println("Soal ke-2\n");
		System.out.println("Nama  : Lucky Tri Bhakti");
		System.out.println("Kelas : D3-RPL-4401");    
		System.out.println("NIM   : 6706202055\n");

		System.out.print("Masukan jumlah deret: ");
		deret = userInput.nextInt();

		userInput.close();

		for(int i = 1; i <= deret; i++){

			for(int angka = 2; angka <= deret; angka++){
				if(i != angka){
					if(i % angka == 0){
						isPrimeNumber = false;
						break;
					}
				}
			}

			if(isPrimeNumber && i != 1){
				System.out.print(i + " ");
			}
			
			isPrimeNumber = true;
		}
	}
}