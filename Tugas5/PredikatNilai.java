import java.util.Scanner;

public class PredikatNilai{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        char nilai;

        System.out.println("Soal ke-1\n");
        System.out.println("Nama  : Lucky Tri Bhakti");
        System.out.println("Kelas : D3-RPL-4401");    
        System.out.println("NIM   : 6706202055\n");

        System.out.print("Masukan nilai anda: ");
        nilai = userInput.findInLine(".").charAt(0);
        nilai = Character.toUpperCase(nilai);

        userInput.close();

        switch (nilai) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Fail");
                break;
        }
    }
}