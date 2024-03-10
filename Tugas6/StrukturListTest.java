//223040107_Humaira
package Tugas6;

public class StrukturListTest {
    public static void main(String[] args) {
        // 1. Create list dengan keyword new
        StrukturList list = new StrukturList();

        // 2. Tambah elemen sehingga elemen list berisi (2, 6, 3, 5, 1)
        list.addHead(1);
        list.addHead(5);
        list.addHead(3);
        list.addHead(6);
        list.addHead(2);

        // 3. Tampilkan elemen list
        System.out.print("Tampilkan elemen list: ");
        list.displayElement();

        // 4. Hapus elemen 3 di tengah list
        System.out.println("Hapus elemen 3 di tengah list");
        list.removeMid(3);

        // 5. Tampilkan elemen list
        System.out.print("Tampilkan elemen list: ");
        list.displayElement();

        // Tambahkan lagi instruksi untuk menghapus elemen list di tengah
        System.out.println("Hapus elemen sehingga menjadi 2 1");
        list.removeMid(5);
        list.removeMid(6);

        // Tampilkan elemen list setelah penghapusan lagi
        System.out.print("Tampilkan elemen list: ");
        list.displayElement();
    }
}
