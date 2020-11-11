import java.util.Scanner;

class DecimalToBinary{

    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        String binner = "";
       
        System.out.println("Soal ke-2\n");
        System.out.println("Nama  : Lucky Tri Bhakti");
        System.out.println("Kelas : D3-RPL-4401");    
        System.out.println("NIM   : 6706202055\n");
        
        int bilangan = userInput.nextInt();
        
        do{
            binner += String.valueOf(bilangan%2);
            bilangan /= 2;
        }while(bilangan != 0);
        
        StringBuilder stringBuilder = new StringBuilder(binner);
        
        stringBuilder.reverse();
        
        System.out.print(stringBuilder.toString());
    }

}