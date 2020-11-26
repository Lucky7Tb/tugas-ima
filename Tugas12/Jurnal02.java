// import ;
import java.util.Scanner;

class Jurnal02{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		int[][] ticTacToe = new int[3][3];
		int oCounter = 0,
			xCounter = 0;
		char character = '-';
		boolean win = false;

		System.out.println("Soal ke-2\n");
		System.out.println("Nama  : Lucky Tri Bhakti");
		System.out.println("Kelas : D3-RPL-4401");    
		System.out.println("NIM   : 6706202055\n");

		System.out.println("Silahkan angka tic tac toe: ");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				ticTacToe[i][j] = userInput.nextInt();
			}
		}

		userInput.close();

		System.out.print("\n");

		// Cek Horizontal
		for(int i = 0; i < 3; i++){
			for(int k = 0; k < 3; k++){
				if(ticTacToe[i][k] == 1){
					oCounter++;
					if(oCounter == 3){
						character = 'o';
						oCounter = 0;
						win = true;
						break;
					}
				}else if(ticTacToe[i][k] == 2){
					xCounter++;
					if(xCounter == 3){
						character = 'x';
						xCounter = 0;
						win = true;
						break;
					}
				}
			}
			oCounter = 0;
			xCounter = 0;
		}

		if(!win){
			//Cek Vertical
			for(int l = 0; l < 3; l++){
				for(int m = 0; m < 3; m++){
					if(ticTacToe[m][l] == 1){
						oCounter++;
						if(oCounter == 3){
							character = 'o';
							oCounter = 0;
							win = true;
							break;
						}
					}else if(ticTacToe[m][l] == 2){
						xCounter++;
						if(xCounter == 3){
							character = 'x';
							xCounter = 0;
							win = true;
							break;
						}
					}	
				}

				oCounter = 0;
				xCounter = 0;
			}
		}

		if(!win){
			//Cek Diagonal kiri dan kanan
			int maxSize = 2; 
			for(int l = 0; l < 3; l++){
				//Cek diagonal kiri ke kanan
				if(ticTacToe[l][l] == 1){
					++oCounter;
					if(oCounter == 3){
						character = 'o';
						oCounter = 0;
						win = true;
						break;
					}
				}else if(ticTacToe[l][l] == 2){
					++xCounter;
					if(xCounter == 3){
						character = 'x';
						xCounter = 0;
						win = true;
						break;
					}
				}

				//Cek diagonal kanan ke kiri
				if(ticTacToe[l][maxSize] == 1){
					++oCounter;
					if(oCounter == 3){
						character = 'o';
						oCounter = 0;
						win = true;
						break;
					}
				}else if(ticTacToe[l][maxSize] == 2){
					++xCounter;
					if(xCounter == 3){
						character = 'x';
						xCounter = 0;
						win = true;
						break;
					}
				}
				maxSize--;
			}
		}

		if(!win){
			for(int i = 0; i < 3; i++){
				for(int num : ticTacToe[i]){
					if(num == 0){
						character = '?';
						break;
					}
				}
			}
		}

		System.out.print(character);
	}
}