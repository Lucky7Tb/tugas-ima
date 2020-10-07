import java.util.Scanner;

class main{

	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);

		System.out.println("Nama  : Lucky Tri Bhakti");
		System.out.println("Kelas : D3-RPLA-4401");
		System.out.println("Nim   : 6706202055\n");

		int pecahanUangSeratusRibu = 0,
			pecahanUangLimaPuluhRibu = 0,
			pecahanUangDuaPuluhRibu = 0,
			pecahanUangSepuluhRibu = 0,
			pecahanUangLimaRibu = 0,
			pecahanUangDuaRibu = 0,
			pecahanUangSeribu = 0,
			pecahanKoinLimaRatus = 0,
			pecahanKoinDuaRatus = 0,
			pecahanKoinSeratus = 0,
			pecahanKoinLimaPuluh = 0,
			pecahanKoinSen = 0,
			sisaUang = 0,
			userUangInput = 12345678;

		System.out.print("Masukan Jumlah Uang : ");
		userUangInput = userInput.nextInt();

		while(sisaUang != userUangInput){
			if(userUangInput - sisaUang >= 100000){
				sisaUang += 100000;
				pecahanUangSeratusRibu++;
			}else if(userUangInput - sisaUang >= 50000){
				sisaUang += 50000;
				pecahanUangLimaPuluhRibu++;
			}else if(userUangInput - sisaUang >= 20000){
				sisaUang += 20000;
				pecahanUangDuaPuluhRibu++;
			}else if(userUangInput - sisaUang >= 10000){
				sisaUang += 10000;
				pecahanUangSepuluhRibu++;
			}else if(userUangInput - sisaUang >= 5000){
				sisaUang += 5000;
				pecahanUangLimaRibu++;
			}else if(userUangInput - sisaUang >= 2000){
				sisaUang += 2000;
				pecahanUangDuaRibu++;
			}else if(userUangInput - sisaUang >= 1000){
				sisaUang += 1000;
				pecahanUangSeribu++;
			}else if(userUangInput - sisaUang >= 500){
				sisaUang += 500;
				pecahanKoinLimaRatus++;
			}else if(userUangInput - sisaUang >= 200){
				sisaUang += 200;
				pecahanKoinDuaRatus++;
			}else if(userUangInput - sisaUang >= 100){
				sisaUang += 100;
				pecahanKoinSeratus++;
			}else if(userUangInput - sisaUang >= 50){
				sisaUang += 50;
				pecahanKoinLimaPuluh++;
			}else{
				sisaUang++;
				pecahanKoinSen++;
			}
		}

		System.out.println(pecahanUangSeratusRibu + " lembar pecahan 100000");
		System.out.println(pecahanUangLimaPuluhRibu + " lembar pecahan 50000");
		System.out.println(pecahanUangDuaPuluhRibu + " lembar pecahan 20000");
		System.out.println(pecahanUangSepuluhRibu + " lembar pecahan 10000");
		System.out.println(pecahanUangLimaRibu + " lembar pecahan 5000");
		System.out.println(pecahanUangDuaRibu + " lembar pecahan 2000\n");

		System.out.println(pecahanUangSeribu + " lembar pecahan 1000");
		System.out.println(pecahanKoinLimaRatus + " keping pecahan 500");
		System.out.println(pecahanKoinDuaRatus + " keping pecahan 200");
		System.out.println(pecahanKoinSeratus + " keping pecahan 100\n");

		System.out.println(pecahanKoinLimaPuluh + " keping pecahan 50\n");

		System.out.println(pecahanKoinSen + " keping pecahan sen\n");
	}
}