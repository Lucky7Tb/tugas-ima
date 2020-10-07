import java.util.Scanner;

public class BesokHari {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int dayInputUser,
            n;

        String today = "",
               nextDay = "",
               nDay = "";

		System.out.println("Soal ke-3\n");
        System.out.println("Nama: Lucky Tri Bhakti");
		System.out.println("Kelas: D3-RPLA-4401");
        System.out.println("NIM: 6706202055\n");

        System.out.print("Sekarang hari : ");
        dayInputUser = userInput.nextInt();
        System.out.print("N hari kedepan : ");
        n = userInput.nextInt();

        userInput.close();
       
        if(dayInputUser > 7){
            System.out.println("Tidak ada hari ke-" + dayInputUser);
        }else{
            switch (dayInputUser) {
                case 1:
                    today = "Senin";
                    nextDay = "Selasa";
                    break;
                case 2:
                    today = "Selasa";
                    nextDay = "Rabu";
                    break;
                case 3:
                    today = "Rabu";
                    nextDay = "Kamis";
                    break;
                case 4:
                    today = "Kamis";
                    nextDay = "Jumat";
                    break;
                case 5:
                    today = "Jumat";
                    nextDay = "Sabtu";
                    break;
                case 6:
                    today = "Sabtu";
                    nextDay = "Minggu";
                    break;
                case 7:
                    today = "Minggu";
                    nextDay = "Senin";
                    break;
            }
            if(n % 7 == 0){
                nDay = today;
                System.out.println("Sekarang hari " + today);
                System.out.println("Besok hari " + nextDay);
                System.out.println( n + " hari kedepan adalah hari " + nDay);
            }else if(n > 7){
                int sisaHari = n % 7;
                switch (sisaHari + dayInputUser) {
                    case 1:
                        nDay = "Senin";
                        break;
                    case 2:
                        nDay = "Selasa";
                        break;
                    case 3:
                        nDay = "Rabu";
                        break;
                    case 4:
                        nDay = "Kamis";
                        break;
                    case 5:
                        nDay = "Jumat";
                        break;
                    case 6:
                        nDay = "Sabtu";
                        break;
                    case 7:
                        nDay = "Minggu";
                        break;
                }
                System.out.println("Sekarang hari " + today);
                System.out.println("Besok hari " + nextDay);
                System.out.println( n + " hari kedepan adalah hari " + nDay);
            }else{
                int sum = dayInputUser + n;
                sum = sum > 7 ? sum - 7 : sum;
                switch (sum) {
                    case 1:
                        nDay = "Senin";
                        break;
                    case 2:
                        nDay = "Selasa";
                        break;
                    case 3:
                        nDay = "Rabu";
                        break;
                    case 4:
                        nDay = "Kamis";
                        break;
                    case 5:
                        nDay = "Jumat";
                        break;
                    case 6:
                        nDay = "Sabtu";
                        break;
                    case 7:
                        nDay = "Minggu";
                        break;
                }
                System.out.println("Sekarang hari " + today);
                System.out.println("Besok hari " + nextDay);
                System.out.println( n + " hari kedepan adalah hari " + nDay);
            }
        }
        
    }
    
}