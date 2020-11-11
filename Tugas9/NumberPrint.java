import java.util.Scanner;

class NumberPrint{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
        
        String threeDigitNumber;

        System.out.println("Soal ke-4\n");
        System.out.println("Nama  : Lucky Tri Bhakti");
        System.out.println("Kelas : D3-RPL-4401");    
        System.out.println("NIM   : 6706202055\n");

        System.out.print("Masukan jumlah 3 digit angka: ");
        threeDigitNumber = userInput.nextLine();
        
        userInput.close();

       	if(threeDigitNumber.length() == 3){
       		for(int i = 0; i < 3; i++){
       			printNumber(threeDigitNumber.charAt(i));
       		}
       	}else{
       		System.out.println("Maaf masukan hanya 3 digit angka");
       	}

	}

	public static void printNumber(char number){
		int row = 9;
		switch(number){
			case '0':
				for(int i = 1; i <= row; i++){
					if(i == 1 || i == 9){
						for(int j = 1; j < 9; j++){
							System.out.print("0");
						}
					}else{
						System.out.print("0");
					
						for(int k = 1; k <= 6; k++){
							System.out.print(" ");
						}

						System.out.print("0");
					}

					System.out.print("\n");
				}
				System.out.print("\n");
				break;
			case '1':
				for(int i = 1; i <= row; i++){
					if(i == 1){
						for(int j = 1; j <= 5; j++){
							System.out.print("1");
						}
					}else if(i == 9){
						for(int k = 1; k <= i; k++){
							System.out.print("1");
						}
					}else{
						for(int l = 1; l < 5; l++){
							System.out.print(" ");
						}
						System.out.print("1");
					}

					System.out.print("\n");
				}
				System.out.print("\n");
				break;
			case '2':
				for(int i = 1; i <= row; i++){
					if(i == 1 || i == 5 || i == 9){
						for(int j = 1; j <= 9; j++){
							System.out.print("2");
						}
					}else if(i == 2 || i == 3 || i == 4){
						for(int k = 1; k <= 8; k++){
							System.out.print(" ");
						}
						System.out.print("2");
					}else{
						System.out.print("2");
					}

					System.out.print("\n");
				}
				System.out.print("\n");
				break;
			case '3':
				for(int i = 1; i <= row; i++){
					
					if(i == 1 || i == 5 || i == 9){
						for(int k = 1; k <= 9; k++){
							System.out.print("3");
						}
					}else{
						for(int j = 1; j <= 8; j++){
							System.out.print(" ");
						}

						System.out.print("3");
					}

					System.out.print("\n");
				}
				System.out.print("\n");
				break;
			case '4':
				for(int i = 1; i <= row; i++){
					
					if(i <= 4 ){
						System.out.print("4");
						for(int k = 1; k <= 7; k++){
							System.out.print(" ");
						}
						System.out.print("4");
					}else if(i == 5){
						for(int j = 1; j <= 9; j++){
							System.out.print("4");
						}
					}else{
						for(int k = 1; k <= 8; k++){
							System.out.print(" ");
						}
						System.out.print("4");
					}

					System.out.print("\n");
				}
				System.out.print("\n");
				break;
			case '5':
				for(int i = 1; i <= row; i++){
					if(i == 1 || i == 5 || i == 9){
						for(int j = 1; j <= 9; j++){
							System.out.print("5");
						}
					}else if(i == 2 || i == 3 || i == 4){
						System.out.print("5");
					}else{
						for(int k = 1; k <= 8; k++){
							System.out.print(" ");
						}
						System.out.print("5");
					}

					System.out.print("\n");
				}
				System.out.print("\n");
				break;
			case '6':
				for(int i = 1; i <= row; i++){
					
					if(i == 1 || i == 5 || i == 9){
						for(int k = 1; k <= 9; k++){
							System.out.print("6");
						}
					}else if(i >= 2 && i <= 4){
						System.out.print("6");
					}else{
						System.out.print("6");
						for(int k = 1; k <= 7; k++){
							System.out.print(" ");
						}
						System.out.print("6");
					}

					System.out.print("\n");
				}
				System.out.print("\n");
				break;
			case '7':
				for(int i = 1; i <= row; i++){
					
					if(i == 1){
						for(int k = 1; k <= 9; k++){
							System.out.print("7");
						}
					}else{
						for(int j = 1; j <= 8; j++){
							System.out.print(" ");
						}

						System.out.print("7");
					}
					
					System.out.print("\n");
				}
				System.out.print("\n");
				break;
			case '8':
				for(int i = 1; i <= row; i++){
					if(i == 1 || i == 5 || i == 9){
						for(int j = 1; j < 9; j++){
							System.out.print("8");
						}
					}else{
						System.out.print("8");
					
						for(int k = 1; k <= 6; k++){
							System.out.print(" ");
						}

						System.out.print("8");
					}

					System.out.print("\n");
				}
				System.out.print("\n");
				break;
			case '9':
				for(int i = 1; i <= row; i++){
					if(i == 1 || i == 5 || i == 9){
						for(int j = 1; j < 9; j++){
							System.out.print("9");
						}
					}else if(i >= 2 && i <= 4){
						System.out.print("9");
						for(int k = 1; k <= 6; k++){
							System.out.print(" ");
						}
						System.out.print("9");
					}
					else{
						for(int k = 1; k <= 7; k++){
							System.out.print(" ");
						}

						System.out.print("9");
					}

					System.out.print("\n");
				}
				System.out.print("\n");
				break;
		}
	}
}