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

        do{
            System.out.println("Untuk keluar masukan angka 0 atau 1");
            System.out.print("Masukan angka: ");
            numberInput = userInput.nextInt();
            userInput.close();
            if(numberInput > 1){
                
                for(int angka = 2; angka < numberInput; angka++){
                    if(numberInput != angka){
                        if(numberInput % angka == 0){
                            isPrimeNumber = false;
                            break;
                        }
                    }
                }

                if(isPrimeNumber){
                    System.out.println("Prima\n");
                }else{
                    System.out.println("Bukan Prima\n");
                }
                
                isPrimeNumber = true;
            }
        }while(numberInput != 0 && numberInput != 1);

    }
}