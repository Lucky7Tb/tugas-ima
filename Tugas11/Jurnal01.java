// import ;
import java.util.ArrayList;
import java.util.Scanner;

class Jurnal01{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		ArrayList<String> listName = new ArrayList<String>();
		String name;

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