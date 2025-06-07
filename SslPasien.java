import UASALSD.Pasien;

public class SslPasien {
    NodePasien head, tail;
    int size;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahPasien(Pasien p) {
        NodePasien nodeBaru = new NodePasien(p);
        if (isEmpty()) {
            head = nodeBaru;
            tail = nodeBaru;
        } else {
            tail.next = nodeBaru;
            tail = nodeBaru;
        }
        System.out.println(">> Pasien masuk ke dalam antrian");
    }

    public Pasien layaniDanAmbilPasien () {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            Pasien p = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return p;
        }
    }

    public Pasien tampilAntrian() {
        System.out.println();
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            NodePasien current = head;
            while (current != null) {
                current.data.tampilInformasi();
                current = current.next;
            }
        }
    }

    public int hitungSisa() {
        int sisa = 0;
        NodePasien current = head;
        while (current != null) {
            sisa++;
            current = current.next;
        }
        return sisa;
    }
}
