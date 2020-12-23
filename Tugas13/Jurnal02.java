// import ;
import java.util.Scanner;

class Jurnal02{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		String lyrics;

		System.out.println("Soal ke-2\n");
        System.out.println("Nama  : Lucky Tri Bhakti");
        System.out.println("Kelas : D3-RPL-4401");    
        System.out.println("NIM   : 6706202055\n");

		System.out.print("Masukan lagu :");
		lyrics = userInput.nextLine();

		userInput.close();
		
		System.out.print(changeLyric(lyrics));
	}

	public static String changeLyric(String lyric) {
		char charReplacer = 'a';
		char[] vowelChar = {'a', 'i', 'u', 'e', 'o', 'A', 'I', 'U', 'E', 'O'}; 
		String newLyric = lyric;
		int lengthLyric = lyric.length() % 5;

		switch(lengthLyric){
			case 1:
				charReplacer = 'e';
				break;
			case 2:
				charReplacer = 'i';
				break;
			case 3:
				charReplacer = 'o';
				break;
			case 4:
				charReplacer = 'u';
				break;
		}

		for(char vowel : vowelChar){
			newLyric = newLyric.replace(vowel, charReplacer);
		}

		return newLyric;
	}

	
}