public class Pasien {
    
        String nama, nik, keluhan;
    
        public Pasien(String nama, String nik, String keluhan) {
            this.nama = nama;
            this.nik = nik;
            this.keluhan = keluhan;
        }
        
        public void tampilInformasi() {
            System.out.println("Nama Pasien: " + nama);
            System.out.println("NIK: " + nik);
            System.out.println("Keluhan: " + keluhan);
        }
    }