package UASALSD;

public class Pasien {
    
        String nama, nik, keluhan;
    
        public Pasien(String nama, String nik, String keluhan) {
            this.nama = nama;
            this.nik = nik;
            this.keluhan = keluhan;
        }
        public void tampilInformasi() {
            System.out.println("NIK " + nik + ", Nama: " + nama + ", Keluhan: " + keluhan);
        }
    }