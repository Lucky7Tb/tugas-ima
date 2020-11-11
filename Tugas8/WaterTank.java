// import ;
import java.util.Scanner;

class WaterTank{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        double waterTankCapacity = 0.0,
               currentCapacity = 0.0,
               remainingCapacity = waterTankCapacity - currentCapacity;

        int userChoise,
            fillCounter = 0;

        boolean useGlass = true,
                useBucket = true,
                useGallon = true,
                useHand = true;

        String usedTool = "";

        System.out.println("Soal ke-1\n");
        System.out.println("Nama  : Lucky Tri Bhakti");
        System.out.println("Kelas : D3-RPL-4401");    
        System.out.println("NIM   : 6706202055\n");

        System.out.print("Masukan kapasitas watertank(liter): ");
        waterTankCapacity = userInput.nextDouble();

        if(waterTankCapacity < 1.0){
            System.out.print("Maaf kapasitas water tank minimal 1 liter");
        }else{
            do{
                System.out.println("Pilih alat untuk mengisi water tank");


                if(useGlass){
                    System.out.println("1. Gelas(1 liter)");
                }

                if(useBucket){
                    System.out.println("2. Ember(10 liter)");
                }

                if(useGallon){
                    System.out.println("3. Gallon(16 liter)");
                }

                if(useHand){
                    System.out.println("4. Tangan(0.2 liter)");
                }

                System.out.print("Pilihan: ");

                userChoise = userInput.nextInt();

                switch (userChoise) {
                    case 1:
                        if(useGlass){
                            usedTool = "gelas";
                            currentCapacity = currentCapacity + 1.0;
                            fillCounter = fillCounter + 1;
                        }else{
                            System.out.println("Maaf pilihan tidak ada");
                        }
                        break;
                    case 2:
                        if(useBucket){
                            usedTool = "ember";
                            currentCapacity = currentCapacity + 10.0;
                            fillCounter = fillCounter + 1;
                        }else{
                            System.out.println("Maaf pilihan tidak ada");
                        }                        
                        break;
                    case 3:
                        if(useGallon){
                            usedTool = "galon";
                            currentCapacity = currentCapacity + 16.0;
                            fillCounter = fillCounter + 1;
                        }else{
                            System.out.println("Maaf pilihan tidak ada");
                        }
                        break;
                    case 4:
                        if(useHand){
                            usedTool = "tangan";
                            currentCapacity = currentCapacity + 0.2;
                            fillCounter = fillCounter + 1;
                        }else{
                            System.out.println("Maaf pilihan tidak ada");
                        }
                        break;
                    default:
                        System.out.println("Maaf pilihan tidak ada");
                        break;
                }

                currentCapacity = Math.round(currentCapacity * 10.0) / 10.0;

                if(userChoise < 1 || userChoise > 4){
                    System.out.println("\nWatertank sekarang berisi " + currentCapacity + " liter");
                }else{
                    System.out.println("\nAlat yang dipilih adalah " + usedTool + ", Watertank sekarang berisi " + currentCapacity + " liter");

                    remainingCapacity = waterTankCapacity - currentCapacity;
                    
                    if(remainingCapacity < 1.0){
                        useGlass = false;
                    }
                    
                    if(remainingCapacity < 10.0){
                        useBucket = false;
                    }
                    
                    if(remainingCapacity < 16.0){
                        useGallon = false;
                    }

                    if(remainingCapacity < 0.2){
                        useHand = false;
                    }
                }
            }while(currentCapacity < waterTankCapacity);
            
            userInput.close();

            System.out.println("Watertank sudah penuh. Proses pengisian dibutuhkan sebanyak: " + fillCounter + " kali");
        }
    }
}