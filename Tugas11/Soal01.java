import java.util.Scanner;

class Soal01{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int totalData,
			menu;
		int[] listNumber;

		System.out.println("Soal ke-1\n");
        System.out.println("Nama  : Lucky Tri Bhakti");
        System.out.println("Kelas : D3-RPL-4401");    
        System.out.println("NIM   : 6706202055\n");

		System.out.print("Masukan banyak data: ");
		totalData = userInput.nextInt();

		listNumber = new int[totalData];

        System.out.print("Masukan angka: ");
		for(int i = 0; i < totalData; i++){
			listNumber[i] = userInput.nextInt();
		}

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
					for(int number : listNumber){
						System.out.print(number + " ");
					}

					System.out.print("\n");
					break;
				case 2:
					for(int i = totalData - 1; i >= 0; i--){
						System.out.print(listNumber[i] + " ");
					}
					System.out.print("\n");
					break;
				case 3:
					System.out.print("Masukan angka yang akan di cari: ");
					int searchData = userInput.nextInt();
					boolean dataFind = false;

					for(int j = 0; j < totalData; j++){
						if(listNumber[j] == searchData){
							dataFind = true;
							break;
						}
					}

					if(dataFind){
						System.out.println("Angka " + searchData +" ditemukan");
						for(int j = 0; j < totalData; j++){
							if(listNumber[j] == searchData){
								System.out.println("Angka " + searchData +" ditemukan pada index ke-" + j);
							}
						}
					}else{ 
						System.out.println("Angka " + searchData +" tidak ditemukan");
					}
					
					break;
				case 4:
					int[] newArray = listNumber.clone();
					
					for(int k = 0; k < totalData; k++){
						for(int index = 1; index <= totalData - 1; index++){
							if(newArray[index] < newArray[index - 1]){
								int smallNumber = newArray[index];
								newArray[index] = newArray[index - 1];
								newArray[index - 1] = smallNumber;
							}
						}
					}

					System.out.println("Ascending: ");
					for(int number : newArray){
						System.out.print(number + " ");
					}

					System.out.println("\nDescending: ");
					for(int index = totalData - 1; index >= 0; index--){
						System.out.print(newArray[index] + " ");
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