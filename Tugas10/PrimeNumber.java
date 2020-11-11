import java.util.Scanner;

class PrimeNumber{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        int numberInput;
        boolean isPrimeNumber = true;

        System.out.println("Soal ke-2\n");
        System.out.println("Nama  : Lucky Tri Bhakti");
        System.out.println("Kelas : D3-RPL-4401");    
        System.out.println("NIM   : 6706202055\n");
        
        System.out.print("Masukan angka: ");
        numberInput = userInput.nextInt();

        userInput.close();

        for(int angka = 2; angka < numberInput; angka++){
            if(numberInput != angka){
                if(numberInput % angka == 0){
                    isPrimeNumber = false;
                    break;
                }
            }
        }

        if(isPrimeNumber && numberInput > 1){
            System.out.println("YA\n");
        }else{
            System.out.println("BUKAN\n");
        }

        isPrimeNumber = true;
    }
}