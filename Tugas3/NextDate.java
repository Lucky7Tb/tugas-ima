import java.util.Scanner;

public class NextDate {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int dateInputUser,
            monthInputUser,
            yearInputUser,
            nDateInputUser,
            nextDate,
            nextMonth,
            nextYear,
            nDate,
            nMonth,
            nYear,
            maxDate;

        String month;

        boolean isKabisat;

        System.out.println("Soal ke-4\n");
        System.out.println("Nama  : Lucky Tri Bhakti");
        System.out.println("Kelas : D3-RPL-4401");    
        System.out.println("NIM   : 6706202055\n");

        System.out.print("Tahun : ");
        yearInputUser = userInput.nextInt();
        
        System.out.print("Bulan : ");
        monthInputUser = userInput.nextInt();
        
        System.out.print("Tanggal : ");
        dateInputUser = userInput.nextInt();

        System.out.print("N hari kedepan : ");
        nDateInputUser = userInput.nextInt();

        userInput.close();

        if( (yearInputUser % 400 == 0) || (yearInputUser % 100 != 0 && yearInputUser % 4 == 0) ){
            isKabisat = true;
        }else{
            isKabisat = false;
        }

        month = getMonth(monthInputUser);
        nMonth = monthInputUser;
        nextMonth = monthInputUser + 1;
        nYear = yearInputUser;
        maxDate = getMaxDate(monthInputUser, isKabisat);

        System.out.println(month + " memiliki hari sebanyak " + maxDate);
        System.out.println("Hari ini tanggal : " + dateInputUser + " " + month + " " + yearInputUser);

        if(dateInputUser == maxDate){
            if(month.equals("Desember")){
                month = getMonth(1);
                nextYear = yearInputUser + 1;
            }else{
                month = getMonth(nextMonth);
                nextYear = yearInputUser;
            }
            nextDate = 1;
        }else{
            nextDate = dateInputUser + 1;
            nextYear = yearInputUser;
        }

        System.out.println("Besok tanggal : " + nextDate + " " + month + " " + nextYear);

        month = getMonth(monthInputUser);

        if(dateInputUser == maxDate){
            if(month.equals("Desember")){
                nMonth = 1;
                nYear++;
            }else{
                nMonth++;
                maxDate = getMaxDate(nMonth, isKabisat);
            }
            nDate = nDateInputUser;
        }else{
            int selisih = maxDate - dateInputUser;

            if(selisih > nDateInputUser || selisih == nDateInputUser){
                nDate = dateInputUser + nDateInputUser;
            }else{
                nDate = nDateInputUser - selisih;
                nMonth = monthInputUser + 1;
                maxDate = getMaxDate(nMonth, isKabisat);
            }
        }

        if(nDate > maxDate){            
            while(nDate > maxDate){
                nDate -= maxDate;
                nMonth++;
                maxDate = getMaxDate(nMonth, isKabisat);
                
                if( (nYear % 400 == 0) || (nYear % 100 != 0 && nYear % 4 == 0) ){
                    isKabisat = true;
                }else{
                    isKabisat = false;
                }

                maxDate = getMaxDate(nMonth, isKabisat);

                if(nMonth > 12){
                    nMonth = 1;
                    nYear++;
                }
            }
        }

        month = getMonth(nMonth);

        System.out.println(nDateInputUser + " hari lagi tanggal " + nDate + " " + month + " " + nYear);

    }

    public static String getMonth(int month){
        if(month == 1){
            return "Januari";
        }else if(month == 2){
            return "Februari";
        }else if(month == 3){
            return "Maret";
        }else if(month == 4){
            return "April";
        }else if(month == 5){
            return "Mei";
        }else if(month == 6){
            return "Juni";
        }else if(month == 7){
            return "Juli";
        }else if(month == 8){
            return "Agustus";
        }else if(month == 9){
            return "September";
        }else if(month == 10){
            return "Oktober";
        }else if(month == 11){
            return "November";
        }
        return "Desember";
    }

    public static int getMaxDate(int month, boolean isKabisat){
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return isKabisat ? 29 : 28;
        }
    }
    
}
