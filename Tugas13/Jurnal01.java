// import ;
import java.util.Scanner;

class Jurnal01{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		String name1,
			   name2;
		int time;

		System.out.println("Soal ke-1\n");
        System.out.println("Nama  : Lucky Tri Bhakti");
        System.out.println("Kelas : D3-RPL-4401");    
        System.out.println("NIM   : 6706202055\n");

		System.out.print("Masukan nama 1 :");
		name1 = userInput.nextLine();

		System.out.print("Masukan nama 2 :");
		name2 = userInput.nextLine();

		System.out.print("Masukan Waktu :");
		time = userInput.nextInt();

		userInput.close();

		greeting(name1, time);
		greeting(name2, time);
	}

	public static void greeting(String name, int time) {
		System.out.println("Halo, " + name + " Selamat " + time(time));
	}

	public static String time(int time){
		if(time >= 6 && time <= 11){
			return "pagi.";
		}else if(time >= 12 && time <= 14){
			return "sore.";
		}else if(time >= 15 && time <= 17){
			return "sore.";
		}

		return "malam.";
	}
	
}