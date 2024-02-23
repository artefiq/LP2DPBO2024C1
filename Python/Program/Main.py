# main.py

# Import kelas Shirt dan Tabel
from Shirt import Shirt
from Tabel import Tabel

def main():
    # Inisialisasi list untuk menyimpan objek-objek Shirt
    list_shirts = []

    # Tambahkan item ke dalam list menggunakan constructor
    new_shirt1 = Shirt("1A", "Kaos", "Gucci", "2501837", "M", "Cotton", "L", "Blue", "Lengan Pendek")
    list_shirts.append(new_shirt1)

    new_shirt2 = Shirt("1B", "Kemeja", "LV", "38476210", "L", "Linen", "Female", "Pink", "Short")
    list_shirts.append(new_shirt2)

    new_shirt3 = Shirt("2A", "T-Shirt", "YSL", "59184756", "XL", "Cotton Combed", "P", "Hijau Botol", "Long")
    list_shirts.append(new_shirt3)

    menu = 0  # Variabel untuk menyimpan pilihan menu pengguna
    repeat = "y"  # String untuk mengontrol kelanjutan loop

    # Loop utama program
    while repeat.lower() == "y":
        print("\nMenu : ")
        print("1. TAMBAH")
        print("2. TAMPIL")
        print("3. UBAH")
        print("4. HAPUS")

        menu = int(input("\nPilih menu yang diinginkan : "))  # Dapatkan pilihan menu pengguna

        if menu == 1:  # CREATE
            n = int(input("\nMasukkan banyak shirt yang ingin ditambah : "))
            for i in range(n):
                id_input = input("Masukkan id : ")
                name_input = input("Masukkan nama : ")
                brand_input = input("Masukkan brand : ")
                size_input = input("Masukkan size : ")
                material_input = input("Masukkan material : ")
                gender_input = input("Masukkan gender : ")
                color_input = input("Masukkan color: ")
                sleeve_type_input = input("Masukkan sleeveType : ")
                price_input = input("Masukkan harga : ")

                # Buat objek Shirt baru dan tambahkan ke dalam list
                temp_shirt = Shirt(id_input, name_input, brand_input, price_input, size_input, material_input,
                                   gender_input, color_input, sleeve_type_input)
                list_shirts.append(temp_shirt)

        elif menu == 2:  # READ
            if not list_shirts:
                print("Tidak ada data shirt\n")
            else:
                print("\nDaftar shirt :")
                tab = Tabel(len(list_shirts), 9)

                # Hitung panjang strip berdasarkan panjang maksimum atribut Shirt
                max_strip = (
                    Shirt.get_max_id() + Shirt.get_max_name() + Shirt.get_max_brand() + Shirt.get_max_size() +
                    Shirt.get_max_material() + Shirt.get_max_gender() + Shirt.get_max_color() +
                    Shirt.get_max_price() + Shirt.get_max_sleeve_type()
                )

                for _ in range(max_strip + ((2 * 9) + 10)):
                    print("-", end="")
                print("")

                # Tampilkan data dalam format tabel menggunakan kelas Tabel
                for i in range(len(list_shirts)):
                    arr_str = [
                        str(list_shirts[i].get_id()), str(list_shirts[i].get_name()), str(list_shirts[i].get_brand()),
                        str(list_shirts[i].get_size()), str(list_shirts[i].get_material()),
                        str(list_shirts[i].get_gender()), str(list_shirts[i].get_color()),
                        str(list_shirts[i].get_sleeve_type()), str(list_shirts[i].get_price())
                    ]

                    tab.create_row(arr_str)

        elif menu == 3:  # UPDATE
            if not list_shirts:
                print("Data Kosong\n")
            else:
                update_id = input("Masukkan ID shirt yang ingin diubah : ")
                found = False

                for i in range(len(list_shirts)):
                    if update_id == list_shirts[i].get_id() and found == False:
                        name_new = input("Masukkan nama baru : ")
                        brand_new = input("Masukkan brand baru : ")
                        size_new = input("Masukkan size baru : ")
                        material_new = input("Masukkan material baru : ")
                        gender_new = input("Masukkan gender baru : ")
                        color_new = input("Masukkan color baru : ")
                        sleeve_type_new = input("Masukkan sleeveType baru : ")
                        price_new = input("Masukkan price baru : ")

                        # Update objek Shirt dengan data baru
                        list_shirts[i] = Shirt(update_id, name_new, brand_new, price_new, size_new, material_new,
                                   gender_new, color_new, sleeve_type_new)

                        found = True
                        print("\n===== Perubahan Berhasil Dilakukan (" + update_id + ") ======\n")

                if not found:
                    print("Tidak ditemukan shirt dengan ID " + update_id + "\n")

        elif menu == 4:  # DELETE
            if not list_shirts:
                print("Data Kosong\n")
            else:
                delete_id = input("Masukkan ID shirt yang ingin dihapus : ")
                found = False

                i = 0
                while i < len(list_shirts):
                    if delete_id == list_shirts[i].get_id():
                        list_shirts.pop(i)
                        found = True
                        print("Shirt dengan ID " + delete_id + " berhasil dihapus")
                    else:
                        i += 1

                if not found:
                    print("Tidak ditemukan shirt dengan ID " + delete_id + "\n")

        else:
            print("Menu yang anda pilih salah\n")

        repeat = input("Apakah masih (y/n) ? ")

if __name__ == "__main__":
    main()