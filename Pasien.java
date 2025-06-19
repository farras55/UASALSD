public class Pasien {
    
        String nama, nik, keluhan;
        int umur;
    
        public Pasien(String nama, String nik, String keluhan, int umur) {
            this.nama = nama;
            this.nik = nik;
            this.keluhan = keluhan;
            this.umur = umur;
        }
        
        public void tampilInformasi() {
            System.out.println("Nama Pasien: " + nama);
            System.out.println("NIK: " + nik);
            System.out.println("Keluhan: " + keluhan);
            System.out.println("Umur: " + umur);
        }
    }