// import ;
import java.util.Scanner;

class Latihan02{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		double minTemperature,
			   avgTemperature,
			   maxTemperature;

		System.out.println("Soal ke-2\n");
        System.out.println("Nama  : Lucky Tri Bhakti");
        System.out.println("Kelas : D3-RPL-4401");    
        System.out.println("NIM   : 6706202055\n");

        System.out.print("Masukan suhu minimal(Celcius): ");
        minTemperature = userInput.nextDouble();

        System.out.print("Masukan suhu rata-rata(Celcius): ");
        avgTemperature = userInput.nextDouble();

        System.out.print("Masukan suhu maksimal(Celcius): ");
        maxTemperature = userInput.nextDouble();

        userInput.close();

        System.out.println("Minimal dalam Fahrenheit: " + changeToFahrenheit(minTemperature));
        System.out.println("Rata-rata dalam Fahrenheit: " +  changeToFahrenheit(avgTemperature));
        System.out.println("Maksimal dalam Fahrenheit: " + changeToFahrenheit(maxTemperature));
     
	}

	public static double changeToFahrenheit(double temperature) {

		return temperature * 9 / 5 + 32; 
		
	}

	
}