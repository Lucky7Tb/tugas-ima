import java.util.Scanner;

class test{

	public static void main(String[] args){
		 Scanner userInput = new Scanner(System.in);

		String name,
			   password;

		System.out.print("Masukan nama anda : ");
		name = userInput.nextLine();

		System.out.print("Masukan password anda : ");
		password = userInput.nextLine();


		if(name.equals("Lucky") && password.equals("123456")){
			System.out.println("Masuk cuy");
		}else{
			System.out.println("Salah");
		}

	}
}