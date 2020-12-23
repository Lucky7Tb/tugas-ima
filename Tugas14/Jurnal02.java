//import ;
import java.util.Scanner;

class Jurnal02{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);		

		int totalCakram;

		System.out.println("Soal ke-2\n");
        System.out.println("Nama  : Lucky Tri Bhakti");
        System.out.println("Kelas : D3-RPL-4401");    
        System.out.println("NIM   : 6706202055\n");

		System.out.print("Masukan jumlah cakram: ");
        totalCakram = userInput.nextInt();
       
        userInput.close();

        towerHanoi(totalCakram, 'A', 'C', 'B');
	}

	private static void towerHanoi(int cakram, char tower1, char tower2, char tower3){
		if(cakram == 1){
			System.out.println("Cakram 1 dipindahkan dari " + tower1 + " ke " + tower2);
			return;
		}
		towerHanoi(cakram - 1, tower1, tower3, tower2);
		System.out.println("Cakram " + cakram + " dipindahkan dari " + tower1 + " ke " + tower2);
		towerHanoi(cakram - 1, tower3, tower2, tower1);
	}
}