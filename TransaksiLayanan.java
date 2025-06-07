public class TransaksiLayanan {
   Pasien pasien;
   Dokter dokter;
   int durasiLayanan, biaya;

   public TransaksiLayanan(Pasien pasien, Dokter dokter, int durasiLayanan) {
       this.pasien = pasien;
       this.dokter = dokter;
       this.durasiLayanan = durasiLayanan;
   }

   public int hitungBiaya() {
       biaya = this.durasiLayanan * 50000;
       return biaya;
   }
   public void tampil()  {
        hitungBiaya();
        System.out.println(pasien + " (" + durasiLayanan + " jam): Rp " + biaya);
   }
}
