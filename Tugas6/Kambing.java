class Kambing{
    public static void main(String[] args) {
        int kambing = 100;
        double bulan = 0;

        while(kambing < 150){
            int pertambahanKambing = kambing * 5 / 100;
            kambing += pertambahanKambing;
            
            bulan += 6;

        };
        System.out.print((bulan/12) + " Tahun ");
    }
}