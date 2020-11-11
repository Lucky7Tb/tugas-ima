class Tes{
	public static void main(String[] args) {
		int counter = 0;

		for(int i = 1; i <= 5; i++){

			for(int j = 0; j < i; j++){
				System.out.print(counter + " ");
				
				counter = counter + 1;

				if(counter > 9){
					counter = 0;
				}
			}

			System.out.print("\n");
		}
	}
}