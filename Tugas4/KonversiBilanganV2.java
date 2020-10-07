import java.util.Scanner;

public class KonversiBilanganV2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Gue bingung di bilngan 1 - 10
        // sama 11 - 19
        // tapi di ratusan
        // Program belom jalan sepenuhnya
        // 311, 201, 704, 810 gabisa
        // Harus nambah logic
       
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

        if(n == 0){
            System.out.println("Nol");
        }else if(n <= 11){
            System.out.println(checkNumber(n));
        }else if(n >= 12 && n <= 19){
            // 15 / 10 = sisanya 5
            //Jadi kita ambil sisanya
            //jadi 5 tambah belas
            belasan = n % 10; // Ngambil satuannya
            System.out.println(checkNumber(belasan) + " belas");
        }else if(n >= 20 && n <= 99){
            puluhan = n / 10; // ngambil digit si puluhan contoh 60 / 10 = 6
            if(n % 10 == 0){ // ngecek puluhan itu bisa di bagi 10 atau tidak contoh 90, 70, 40
                System.out.println(checkNumber(puluhan) + " puluh");
            }else{
                satuan = n % 10; // Ngamil digit satuan contoh 46 ngambil si 6 nya
                System.out.println(checkNumber(puluhan) + " puluh " + checkNumber(satuan));
            }
        }else{
            if(n == 100){
                System.out.println(checkNumber(n));
            }else{
                ratusan = n / 100;
                puluhan = n % 100;

                if(ratusan == 1){
                    if(puluhan <= 11){
                        System.out.println("Seratus " + checkNumber(puluhan));
                    }else if(puluhan > 11 && puluhan <= 19){
                        belasan = puluhan % 10;
                        System.out.println("Seratus " + checkNumber(belasan) + " belas");
                    }else{
                        if(puluhan % 10 == 0){
                            puluhan = puluhan / 10;
                            System.out.println("Seratus " + checkNumber(puluhan) + " puluh");
                        }else{
                            satuan = puluhan % 10;
                            puluhan = puluhan / 10;
                            System.out.println("Seratus " + checkNumber(puluhan) + " puluh " + checkNumber(satuan));
                        }
                    }
                }else{
                    if(puluhan <= 11){
                        System.out.println( checkNumber(ratusan) + " ratus " + checkNumber(puluhan));
                    }else if(puluhan > 11 && puluhan <= 19){
                        belasan = puluhan % 10;
                        System.out.println( checkNumber(ratusan) + " ratus " + checkNumber(belasan) + " belas");
                    }else{
                        if(puluhan % 10 == 0){
                            puluhan = puluhan / 10;
                            System.out.println(checkNumber(ratusan) + " ratus " + checkNumber(puluhan) + " puluh");
                        }else{
                            satuan = puluhan % 10;
                            puluhan = puluhan / 10;
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
            default:
                return "No tidak tersedia";
        }
    }
}
