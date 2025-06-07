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
        front = rear = -1;
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

    
    public Pasien layaniPasien() {
        if (IsEmpty()) {
            System.out.println(" Antrian kosong");
            return null;
        }
        Pasien 
    }
}