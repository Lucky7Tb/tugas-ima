//import ;
import java.util.ArrayList;

class Jurnal02{
	public static void main(String[] args) {
		int[] deret = {0, 0, 0, 0};

		for(int i = 0; i < deret.length; i++){
			for(int j = deret.length-1; j > i; j--){
				deret[j] = deret[j] + 3;
				System.out.print(deret[j] + " ");
			}
			deret[i] = deret[i] / 2;
			System.out.println(deret[i]);
		}
		
	}
}