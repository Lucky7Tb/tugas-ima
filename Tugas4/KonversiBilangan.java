import java.util.Scanner;

public class KonversiBilangan {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int n,
            belasan,
            satuan,
            puluhan,
            ratusan;

        System.out.println("Soal ke-5\n");
        System.out.println("Nama  : Lucky Tri Bhakti");
        System.out.println("Kelas : D3-RPL-4401");    
        System.out.println("NIM   : 6706202055\n");

        System.out.print("Masukan angka : ");
        n = userInput.nextInt();

        userInput.close();

        if(n <= 11){
            System.out.println(checkNumber(n));
        }else if(n >= 12 && n <= 19){
            belasan = n % 10;
            System.out.println(checkNumber(belasan) + " belas");
        }else if(n >= 20 && n <= 99){
            puluhan = n / 10;
            if(n % 10 == 0){
                System.out.println(checkNumber(puluhan) + " puluh");
            }else{
                satuan = n % 10;
                System.out.println(checkNumber(puluhan) + " puluh " + checkNumber(satuan));
            }
        }else{
            if(n == 100 || n == 110 || n == 111){
                System.out.println(checkNumber(n));
            }else if(n >= 101 && n <= 109){
                satuan = n % 10
                System.out.println("Seratus " + checkNumber(satuan));
            }else if(n >= 112 && n <= 119){
                belasan = n % 10;
                System.out.println("Seratus " + checkNumber(belasan) + " belas");
            }else{
                ratusan = n / 100;
                if(n % 100 == 0){
                    System.out.println(checkNumber(ratusan) + " ratus");
                }else{
                    puluhan = n % 100;
                    if(puluhan % 10 == 0){
                        puluhan = puluhan / 10;
                        if(ratusan == 1){
                            System.out.println("Seratus " + checkNumber(puluhan) + " puluh");
                        }else{
                            System.out.println(checkNumber(ratusan) + " ratus " + checkNumber(puluhan) + " puluh " );
                        }
                    }else{
                        satuan = n % 10;
                        puluhan = puluhan / 10;
                        if(ratusan == 1){
                            System.out.println("Seratus " + checkNumber(puluhan) + " puluh " + checkNumber(satuan));
                        }else{
                            System.out.println(checkNumber(ratusan) + " ratus " + checkNumber(puluhan) + " puluh " + checkNumber(satuan));
                        }
                    }
                }
            }
        }
    }

    public static String checkNumber(int number){
        switch (number) {
            case 1:
                return "Satu"; 
            case 2:
                return "Dua";
            case 3: 
                return "Tiga";
            case 4:
                return "Empat";
            case 5:
                return "Lima";
            case 6:
                return "Enam";
            case 7:
                return "Tujuh";
            case 8:
                return "Delapan";
            case 9:
                return "Sembilan";
            case 10:
                return "Sepuluh";
            case 11:
                return "Sebelas";
            case 100:
                return "Seratus";
            case 110:
                return "Seratus Sepuluh";
            case 111:
                return "Seratus Sebelas";
            default:
                return "No tidak tersedia";
        }
    }
}
