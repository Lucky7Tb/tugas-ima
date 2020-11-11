class Kambing{
    public static void main(String[] args) {
        
        System.out.println("Soal ke-1\n");
        System.out.println("Nama  : Lucky Tri Bhakti");
        System.out.println("Kelas : D3-RPL-4401");    
        System.out.println("NIM   : 6706202055\n");

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