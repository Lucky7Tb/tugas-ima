// import ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Soal02{

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		ArrayList<Integer> listNumber= new ArrayList<Integer>();
		int menu,
			number;

		System.out.println("Soal ke-2\n");
        System.out.println("Nama  : Lucky Tri Bhakti");
        System.out.println("Kelas : D3-RPL-4401");    
        System.out.println("NIM   : 6706202055\n");

        System.out.println("Masukan angka -1 untuk berhenti memasukan angka");
        System.out.print("Masukan angka: ");

        do{
        	number = userInput.nextInt();
        	if(number >= 0){
        		listNumber.add(number);
        	}
        }while(number != -1);

        do{
	    	System.out.println("\n1. Data tidak terbalik");
			System.out.println("2. Data terbalik");
			System.out.println("3. Cari data");
			System.out.println("4. Pengurutan data");
			System.out.println("5. Exit");
			System.out.print("Pilihan: ");
			menu = userInput.nextInt();	

			switch (menu) {
				case 1:
					for(int num : listNumber){
						System.out.print(num + " ");
					}
					System.out.print("\n");
					break;
				case 2:
					for(int index = listNumber.size() - 1; index >= 0; index--){
						System.out.print(listNumber.get(index) + " ");
					}
					System.out.print("\n");
					break;
				case 3:
					System.out.print("Masukan angka yang akan di cari: ");
					int searchData = userInput.nextInt();
					
					if(listNumber.contains(searchData)){
						System.out.println("Angka " + searchData +" ditemukan");

						for(int index = 0; index < listNumber.size(); index++){
							if(listNumber.get(index) == searchData){
								System.out.println("Angka " + searchData +" ditemukan pada index ke-" + index);
							}
						}
					}else{
						System.out.println("Angka " + searchData +" tidak ditemukan");
					}
					break;
				case 4:
					ArrayList<Integer> newArray = new ArrayList<Integer>(listNumber);

					Collections.sort(newArray);

					System.out.println("Ascending: ");
					for(int num : newArray){
						System.out.print(num + " ");
					}

					Collections.sort(newArray, Collections.reverseOrder());
					
					System.out.println("\nDescending: ");					
					for(int num : newArray){
						System.out.print(num + " ");
					}

					System.out.print("\n");
					break;
				case 5:
					System.out.println("Bye bye");
					break;
				default:
					System.out.println("Maaf menu tidak ada");
					break;	
			}
        }while(menu != 5);

	}
}