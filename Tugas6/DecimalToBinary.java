import java.util.Scanner;

class DecimalToBinary{

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String binner = "";
        
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