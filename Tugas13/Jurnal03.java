// import ;
import java.util.Scanner;

class Jurnal03{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		int height,
			radius;

		System.out.println("Soal ke-3\n");
        System.out.println("Nama  : Lucky Tri Bhakti");
        System.out.println("Kelas : D3-RPL-4401");    
        System.out.println("NIM   : 6706202055\n");

		System.out.print("Masukan jari-jari kerucut: ");
        radius = userInput.nextInt();

        System.out.print("Masukan tinggi kerucut: ");
        height = userInput.nextInt();

		userInput.close();

		System.out.printf("%.3f", coneSurface(height, radius));

	}

	public static double coneSurface(int height, int radius) {
		final double PHI = 3.14159;
		double result;

		result = PHI * radius;

		result = result * (radius + Math.sqrt( Math.pow(height, 2) + Math.pow(radius, 2) ) );

		return result;
	}

	
}