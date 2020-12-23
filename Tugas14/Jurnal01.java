//import ;
import java.util.ArrayList;
import java.util.Scanner;

class Jurnal01{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);		

		int number1,
			number2;

		System.out.println("Soal ke-1\n");
        System.out.println("Nama  : Lucky Tri Bhakti");
        System.out.println("Kelas : D3-RPL-4401");    
        System.out.println("NIM   : 6706202055\n");

        number1 = userInput.nextInt();
        number2 = userInput.nextInt();

       	System.out.print(FPB(number1, number2));
	}

	private static int FPB(int number1, int number2){
		if(number1 >= number2 && number1 % number2 == 0){

			return number2;
		}else if(number1 < number2){

			return FPB(number2, number1);
		}else{

			return FPB(number2, number1 % number2);
		}
	}
}