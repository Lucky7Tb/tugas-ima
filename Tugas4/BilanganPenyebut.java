import java.util.Scanner;

public class BilanganPenyebut {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int n;

        System.out.println("Soal ke-5\n");
        System.out.println("Nama  : Lucky Tri Bhakti");
        System.out.println("Kelas : D3-RPL-4401");    
        System.out.println("NIM   : 6706202055\n");

        System.out.print("Masukan bilangan: ");
        n = userInput.nextInt();

        userInput.close();

        System.out.println(n / 1000000 + " Jutaan");
        System.out.println((n / 100000) % 10 + " Ratus ribu");
        System.out.println((n / 10000) % 10 + " Puluhan ribu");
        System.out.println((n / 1000) % 10 + " Ribuan");
        System.out.println((n / 100) % 10 + " Ratusan");
        System.out.println((n / 10) % 10 + " Puluhan");
        System.out.println(n % 10 + " Satuan");


    }    
}
