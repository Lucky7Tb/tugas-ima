// import ;
import java.util.ArrayList;
import java.util.Scanner;

class Jurnal01{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		ArrayList<String> listName = new ArrayList<String>();
		String name;

		System.out.println("Soal ke-1\n");
		System.out.println("Nama  : Lucky Tri Bhakti");
		System.out.println("Kelas : D3-RPL-4401");    
		System.out.println("NIM   : 6706202055\n");

		do{
			System.out.print("Masukan nama: ");
			name = userInput.nextLine();

			if(!name.equals("-")){
				listName.add(name);
			}
		}while(!name.equals("-"));

		int randomIndex = (int)(Math.random() * (listName.size() - 1));

		System.out.print(listName.get(randomIndex));
	}
}