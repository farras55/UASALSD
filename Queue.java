public class Queue {
    int size;
    int front;
    int rear;
    int max;
    TransaksiLayanan[] data;

    public Queue(int n) {
        max = n;
        data = new TransaksiLayanan[max];
        size = 0;
        front = -1;
        rear = -1;
    }
    
    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void tambah(TransaksiLayanan t) {
        if (IsFull()) {
            System.out.println("Riwayat Transaksi penuh");
            return;
        } else if (IsEmpty()) {
            front = rear = 0;
        } 
        rear++;
        data[rear] = t;
        size++;
    }

    public void tampil() {
        System.out.println("-- RIWAYAT TRANSAKSI --");
        if (IsEmpty()) {
            System.out.println("Riwayat Transaksi kosong. ");
            return;
        }
        System.out.println("Daftar Transaksi: ");
        int idx = front;
        for (int i = 0; i < size; i++) {
            data[idx].tampil();
            idx = (idx + 1) % max;
        }
    }
}