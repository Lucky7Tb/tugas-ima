import java.util.Scanner;

public class JumlahHari {
    
    public static void main(String[] args) {  
        int month,
            year;

        Scanner userInput = new Scanner(System.in);

		System.out.println("Soal ke-2\n");
        System.out.println("Nama  : Lucky Tri Bhakti");
        System.out.println("Kelas : D3-RPL-4401");    
        System.out.println("NIM   : 6706202055\n");

        System.out.print("Bulan : ");
        month = userInput.nextByte();

        System.out.print("Tahun : ");
        year = userInput.nextInt();

        userInput.close();
        
        switch (month) {
            case 1:
                System.out.println("Januari " + year +  " memiliki 31");
                break;
            case 2:
                if(year % 400 == 0){
                    System.out.println("Februari " + year + " memiliki 29");
                }else if(year % 100 != 0 && year % 4 == 0){
                    System.out.println("Februari " + year + " memiliki 29");
                }else{
                    System.out.println("Februari " + year + " memiliki 28");
                }
                break;
            case 3:
                System.out.println("Maret " + year + " memiliki 31");
                break;
            case 4:
                System.out.println("April " + year + " memiliki 30");
                break;
            case 5:
                System.out.println("Mei " + year + " memiliki 31");
                break;
            case 6:
                System.out.println("Juni " + year + " memiliki 30");
                break;
            case 7:
                System.out.println("Juli " + year + " memiliki 31");
                break;
            case 8:
                System.out.println("Agustus " + year + " memiliki 31");
                break;
            case 9:
                System.out.println("September " + year + " memiliki 30");
                break;
            case 10:
                System.out.println("Oktober " + year + " memiliki 31");
                break;
            case 11:
                System.out.println("November " + year + " memiliki 30");
                break;
            case 12:
                System.out.println("Desember " + year + " memiliki 31");
                break;
            default:
                System.out.println("Maaf bulan yang diinputkan tidak tersedia");
                break;
        }
        
    }

}
