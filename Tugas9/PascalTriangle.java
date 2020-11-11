import java.util.Scanner;

class PascalTriangle{
    public static void main(String[] args) {
        System.out.println("Soal ke-1\n");
        System.out.println("Nama  : Lucky Tri Bhakti");
        System.out.println("Kelas : D3-RPL-4401");    
        System.out.println("NIM   : 6706202055\n");

      
        // pascalTriangle1();
        // pascalTriangle2();
    }

    public static void pascalTriangle1(){
        Scanner userInput = new Scanner(System.in);

        int row;

        System.out.print("Masukan jumlah baris: ");
        row = userInput.nextInt();

        userInput.close();
        for(int i = 1; i <= row; i++){
            
            for(int j = row; j > i; j--){
                System.out.print(" ");
            }

            for(int k = 1; k <= i; k++){
                System.out.print(i + "  ");
            }

            System.out.print("\n");
        }   
    }

    public static void pascalTriangle2(){
        Scanner userInput = new Scanner(System.in);

        int row;

        System.out.print("Masukan jumlah baris: ");
        row = userInput.nextInt();

        userInput.close();
        for(int i = 0; i < row; i++){
            
            for(int j = row; j > i; j--){
                System.out.print(" ");
            }

            for(int k = 0; k <= i; k++){
                int hasil = combination(i) / (combination(k) * combination(i-k));
                System.out.print(hasil + " ");
            }

            System.out.print("\n");
        }   
    }

    public static int combination(int number){
        int result = 1;

        if(number == 0 || number == 1){
            return result;
        }

        for(int i = 1; i <= number; i++){
            result *= i;
        }

        return result;
    }
}