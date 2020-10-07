import java.util.Scanner;
import java.util.Calendar;

public class NextDate {
    
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Calendar myCalendar = Calendar.getInstance();

        int dateInputUser,
            monthInputUser,
            yearInputUser,
            nDateInputUser,
            monthTotalDate,
            nextDate,
            nextYear;
        
        String month,
               nextMonth;

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

        myCalendar.set(yearInputUser, monthInputUser-1, dateInputUser);
        monthTotalDate = myCalendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        
        month = getMonth(monthInputUser);
        
        System.out.println(month + " memiliki hari sebanyak " + monthTotalDate);
        System.out.println("Hari ini tanggal : " + myCalendar.get(Calendar.DATE) + " " + month + " " + myCalendar.get(Calendar.YEAR));

        if(dateInputUser == monthTotalDate){
            if(month.equals("Desember")){
                nextMonth = getMonth(1);
                nextYear = yearInputUser + 1;
            }else{
                nextMonth = getMonth((myCalendar.get(Calendar.MONTH) + 1) + 1);
                nextYear = yearInputUser;
            }
            nextDate = 1;
        }else{
            nextDate = dateInputUser + 1;
            nextMonth = getMonth(myCalendar.get(Calendar.MONTH) + 1);
            nextYear = yearInputUser;
        }

        System.out.println("Besok tanggal : " + nextDate + " " + nextMonth + " " + nextYear);

        myCalendar.add(Calendar.DATE, nDateInputUser);
        month = getMonth(myCalendar.get(Calendar.MONTH) + 1);

        System.out.println(nDateInputUser + " hari lagi tanggal " + myCalendar.get(Calendar.DATE) + " " + month + " " + myCalendar.get(Calendar.YEAR));

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


}
