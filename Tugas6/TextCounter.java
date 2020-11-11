import java.util.Scanner;

class TextCounter{
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Soal ke-3\n");
        System.out.println("Nama  : Lucky Tri Bhakti");
        System.out.println("Kelas : D3-RPL-4401");    
        System.out.println("NIM   : 6706202055\n");
        
        String text = userInput.nextLine();

        int totalCharacters = text.length(),
            totalWords = 0,
            totalSentences = 0;

        int counter = 0;

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