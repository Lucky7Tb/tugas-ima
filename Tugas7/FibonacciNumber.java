import java.util.Scanner;

class FibonacciNumber{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int fibonacciNumber1,
            fibonacciNumber2,
            fibonacciNumber3,
            nNumber;
        
        System.out.println("Soal ke-1\n");
        System.out.println("Nama  : Lucky Tri Bhakti");
        System.out.println("Kelas : D3-RPL-4401");    
        System.out.println("NIM   : 6706202055\n");

        System.out.print("Bilangan Fibonacci 1: ");
        fibonacciNumber1 = userInput.nextInt();
        
        System.out.print("Bilangan Fibonacci 2: ");
        fibonacciNumber2 = userInput.nextInt();

        System.out.print("Bilangan ke-n: ");
        nNumber = userInput.nextInt();

        userInput.close();

        System.out.print(fibonacciNumber1 + " " + fibonacciNumber2 + " ");
        for(int n = 2; n < nNumber; n++){
            
            fibonacciNumber3 = fibonacciNumber1 + fibonacciNumber2;

            System.out.print(fibonacciNumber3 + " ");

            fibonacciNumber1 = fibonacciNumber2;
            fibonacciNumber2 = fibonacciNumber3;

        }
    } 
}
