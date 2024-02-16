import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

/**
 * Kelas untuk mengelola program utama, menangani operasi berbasis menu untuk
 * shirt.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Shirt> list = new ArrayList<>(); // ArrayList untuk menyimpan objek Shirt

        // tambahkan item kedalam list menggunakan constructor
        // item 1
        Shirt newShirt1 = new Shirt("1A", "Kaos", "Gucci", "2501837", "M", "Cotton",
                "L", "Blue", "Lengan Pendek");
        list.add(newShirt1);
        // item 2
        Shirt newShirt2 = new Shirt("1B", "Kemeja", "LV", "38476210", "L", "Linen",
                "Female", "Pink", "Short");
        list.add(newShirt2);
        // item 3
        Shirt newShirt3 = new Shirt("2A", "T-Shirt", "YSL", "59184756", "XL", "Cotton Combed",
                "P", "Hijau Botol", "Long");
        list.add(newShirt3);

        int menu; // Variabel untuk menyimpan pilihan menu pengguna
        String ulang = "y"; // String untuk mengontrol kelanjutan loop

        // Loop utama program
        while (ulang.equals("y")) {
            System.out.println("\nMenu : ");
            System.out.println("1. TAMBAH");
            System.out.println("2. TAMPIL");
            System.out.println("3. UBAH");
            System.out.println("4. HAPUS");

            System.out.print("\nPilih menu yang diinginkan : ");
            menu = sc.nextInt(); // Dapatkan pilihan menu pengguna

            if (menu == 1) { // CREATE
                System.out.print("\nMasukkan banyak anggota yang ingin ditambah : ");
                int n = sc.nextInt();

                // Input data untuk n objek Shirt
                for (int i = 0; i < n; i++) {
                    System.out.print("Masukkan id : ");
                    String id = sc.next();
                    System.out.print("Masukkan nama : ");
                    String name = sc.next();
                    System.out.print("Masukkan brand : ");
                    String brand = sc.next();
                    System.out.print("Masukkan size : ");
                    String size = sc.next();
                    System.out.print("Masukkan material : ");
                    String material = sc.next();
                    System.out.print("Masukkan gender : ");
                    String gender = sc.next();
                    System.out.print("Masukkan color: ");
                    String color = sc.next();
                    System.out.print("Masukkan sleeveType : ");
                    String sleeveType = sc.next();
                    System.out.print("Masukkan harga : ");
                    String harga = sc.next();

                    // Buat objek Shirt dan tambahkan ke dalam daftar
                    Shirt temp = new Shirt(id, name, brand, harga, size, material, gender, color, sleeveType);
                    list.add(temp);
                }
            } else if (menu == 2) { // READ
                if (list.isEmpty()) {
                    System.out.println("Tidak ada data shirt\n");
                } else {
                    System.out.println("\nDaftar shirt :");
                    Tabel tab = new Tabel(list.size(), 9);

                    int maxStrip = Shirt.getMaxId() + Shirt.getMaxName() + Shirt.getMaxbrand() + Shirt.getMaxsize()
                            + Shirt.getMaxmaterial() + Shirt.getMaxgender() + Shirt.getMaxcolor() + Shirt.getMaxprice() + Shirt.getMaxsleeveType();
                    for (int i = 0; i < maxStrip + ((2 * 9) + 10); i++) {
                        System.out.print("-");
                    }
                    System.out.println("");

                    // Tampilkan data dalam format tabel menggunakan kelas Tabel
                    for (int i = 0; i < list.size(); i++) {
                        String[] arrstr = new String[9];
                        arrstr[0] = "" + list.get(i).getId();
                        arrstr[1] = "" + list.get(i).getName();
                        arrstr[2] = "" + list.get(i).getbrand();
                        arrstr[3] = "" + list.get(i).getsize();
                        arrstr[4] = "" + list.get(i).getmaterial();
                        arrstr[5] = "" + list.get(i).getgender();
                        arrstr[6] = "" + list.get(i).getcolor();
                        arrstr[7] = "" + list.get(i).getsleeveType();
                        arrstr[8] = "" + list.get(i).getprice();

                        tab.buatBaris(arrstr, 9);
                    }
                }
            } else if (menu == 3) { // UPDATE
                if (list.isEmpty()) {
                    System.out.println("Data Kosong\n");
                } else {
                    System.out.print("Masukkan ID shirt yang ingin diubah : ");
                    String updateId = sc.next();
                    boolean ketemu = false;

                    // Ubah data objek Shirt berdasarkan ID yang diberikan
                    for (int i = 0; i < list.size(); i++) {
                        Shirt x = list.get(i);
                        if (updateId.equals(x.getId())) {
                            System.out.print("Masukkan nama baru : ");
                            String namaBaru = sc.next();
                            System.out.print("Masukkan brand baru : ");
                            String brandBaru = sc.next();
                            System.out.print("Masukkan size baru : ");
                            String sizeBaru = sc.next();
                            System.out.print("Masukkan material baru : ");
                            String materialBaru = sc.next();
                            System.out.print("Masukkan gender baru : ");
                            String genderBaru = sc.next();
                            System.out.print("Masukkan color baru : ");
                            String colorBaru = sc.next();
                            System.out.print("Masukkan sleeveType baru : ");
                            String sleeveTypeBaru = sc.next();
                            System.out.print("Masukkan price baru : ");
                            String priceBaru = sc.next();
                            list.set(i, new Shirt(updateId, namaBaru, brandBaru, priceBaru, sizeBaru, materialBaru,
                                    genderBaru, colorBaru, sleeveTypeBaru));
                            ketemu = true;
                            System.out.println("\n===== Perubahan Berhasil Dilakukan (" + updateId + ") ======\n");
                        }
                    }

                    // Beri pesan jika ID tidak ditemukan
                    if (!ketemu) {
                        System.out.println("Tidak ditemukan shirt dengan ID " + updateId + "\n");
                    }
                }
            } else if (menu == 4) { // DELETE
                if (list.isEmpty()) {
                    System.out.println("Data Kosong\n");
                } else {
                    System.out.print("Masukkan ID shirt yang ingin dihapus : ");
                    String deleteId = sc.next();
                    boolean ketemu = false;

                    Iterator<Shirt> iterator = list.iterator();
                    while (iterator.hasNext()) {
                        Shirt x = iterator.next();
                        if (x.getId().equals(deleteId)) {
                            iterator.remove();
                            ketemu = true;
                            System.out.println("shirt dengan ID " + deleteId + " berhasil dihapus");
                        }
                    }

                    // Beri pesan jika ID tidak ditemukan
                    if (!ketemu) {
                        System.out.println("Tidak ditemukan shirt dengan ID " + deleteId + "\n");
                    }
                }
            } else {
                System.out.println("Menu yang anda pilih salah\n");
            }

            System.out.print("Apakah masih (y/n) ? ");
            ulang = sc.next();
        }

        sc.close();
    }
}
