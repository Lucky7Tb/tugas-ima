import java.util.Scanner;

class TextCounter{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String text = userInput.nextLine();

        int totalCharacters = text.length(),
            totalWords = 0,
            totalSentences = 0;

        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == ' '){
                totalWords++;
            }

            if (text.charAt(i) == '.'){
                totalSentences++;
            }
        }

        System.out.print("Karakter: " + totalCharacters + "\nKata: " + (totalWords+1) + "\nKalimat: " + totalSentences);
    }
}