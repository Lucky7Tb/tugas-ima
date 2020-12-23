// import ;
import java.util.Scanner;

class Latihan01{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		String name1,
			   name2;

		System.out.println("Soal ke-1\n");
        System.out.println("Nama  : Lucky Tri Bhakti");
        System.out.println("Kelas : D3-RPL-4401");    
        System.out.println("NIM   : 6706202055\n");

        System.out.print("Masukan nama 1: ");
        name1 = userInput.nextLine();

        System.out.print("Masukan nama 2: ");
        name2 = userInput.nextLine();

        userInput.close();

        greeting(name1);
        greeting(name2);
	}

	public static void greeting(String name) {
		System.out.println("Hai, " + name + ". Semangat pagi!");
	}

	
}