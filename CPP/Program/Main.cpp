#include <bits/stdc++.h>
#include "Shirt.cpp"
// #include "Table.cpp"

using namespace std;

int main()
{
    int i, n = 0, menu, done = 0; // Deklarasi variabel integer i, n, dan menu
    string id;                    // Deklarasi variabel string id
    string name;                  // Deklarasi variabel string name
    string brand;                 // Deklarasi variabel string bidang
    string price;                 // Deklarasi variabel string price
    string size;                  // Deklarasi variabel string size
    string material;              // Deklarasi variabel string material
    string gender;                // Deklarasi variabel string gender
    string color;                 // Deklarasi variabel string color
    string sleeveType;            // Deklarasi variabel string sleevetype

    char ulang = 'y'; // Deklarasi dan inisialisasi variabel char ulang dengan nilai 'y'

    list<Shirt> linked_list; // Membuat objek linked_list dari kelas list dengan template Shirt

    Shirt awal; // Membuat objek awal dari kelas Shirt

    // Menginisialisasi objek awal dengan data
    awal.set_id("1A");
    awal.set_name("Kaos");
    awal.set_brand("Gucci");
    awal.set_price("2501837");
    awal.set_size("M");
    awal.set_material("Cotton");
    awal.set_gender("L");
    awal.set_color("Blue");
    awal.set_sleeveType("Lengan Pendek");
    linked_list.push_back(awal);

    awal.set_id("1B");
    awal.set_name("Kemeja");
    awal.set_brand("LV");
    awal.set_price("38476210");
    awal.set_size("L");
    awal.set_material("Linen");
    awal.set_gender("Female");
    awal.set_color("Pink");
    awal.set_sleeveType("Short");
    linked_list.push_back(awal);

    awal.set_id("2A");
    awal.set_name("T_Shirt");
    awal.set_brand("YSL");
    awal.set_price("59184756");
    awal.set_size("XL");
    awal.set_material("Cotton Combed");
    awal.set_gender("P");
    awal.set_color("Hijau Botol");
    awal.set_sleeveType("Long");
    linked_list.push_back(awal);

    // Loop utama program
    do
    {
        cout << "\nMenu :\n";
        cout << "1. CREATE\n2. READ\n3. UPDATE\n4. DELETE\n\n";

        cout << "Pilih menu : ";
        cin >> menu;

        switch (menu)
        {
        case 1: // CREATE
            cout << "Input banyak shirt yang ingin ditambah :\n";
            cin >> n;
            for (i = 0; i < n; i++)
            {
                Shirt temp;
                cout << "Masukkan data shirt " << (i + 1) << ":\n";
                cout << "ID: ";
                cin >> id;
                temp.set_id(id);
                cout << "Nama: ";
                cin >> name;
                temp.set_name(name);
                cout << "Brand: ";
                cin >> brand;
                temp.set_brand(brand);
                cout << "Price: ";
                cin >> price;
                temp.set_price(price);
                cout << "Size: ";
                cin >> size;
                temp.set_size(size);
                cout << "Material: ";
                cin >> material;
                temp.set_material(material);
                cout << "Gender: ";
                cin >> gender;
                temp.set_gender(gender);
                cout << "Color: ";
                cin >> color;
                temp.set_color(color);
                cout << "Sleeve Type: ";
                cin >> sleeveType;
                temp.set_sleeveType(sleeveType);

                linked_list.push_back(temp);
            }
            break;

        case 2: // READ
            if (linked_list.empty())
            {
                cout << "Tidak ada data shirt\n";
            }
            else
            {
                cout << "\nDaftar shirt :\n";
                int index = 1;
                for (list<Shirt>::iterator it = linked_list.begin(); it != linked_list.end(); it++)
                {
                    cout << (i + 1) << ". " << it->get_id() << " | " << it->get_name() << " | " << it->get_brand() << " | " << it->get_size() << " | " << it->get_material() << " | " << it->get_color() << " | " << it->get_sleeveType() << " | " << it->get_price() << '\n';
                    i++;
                }
                break;
            }

            // else
            // {
            //     cout << "\nDaftar shirt :";
            //     Tabel tab(linked_list.size(), 9);

            //     int maxStrip = Shirt::getMaxId() + Shirt::getMaxName() + Shirt::getMaxBrand() + Shirt::getmaxSize() + Shirt::getmaxMaterial() + Shirt::getmaxGender() + Shirt::getmaxcolor() + Shirt::getMaxPrice() + Shirt::getmaxsleeveType();
            //     for (int i = 0; i < maxStrip + ((2 * 9) + 10); i++)
            //     {
            //         cout << "-";
            //     }
            //     cout << endl;

            //     // Tampilkan data dalam format tabel menggunakan kelas Tabel
            //     for (list<Shirt>::iterator it = linked_list.begin(); it != linked_list.end(); it++)
            //     {
            //         string arrstr[9];
            //         arrstr[0] = it->get_id();
            //         arrstr[1] = it->get_name();
            //         arrstr[2] = it->get_brand();
            //         arrstr[3] = it->get_size();
            //         arrstr[4] = it->get_material();
            //         arrstr[5] = it->get_gender();
            //         arrstr[6] = it->get_color();
            //         arrstr[7] = it->get_sleeveType();
            //         arrstr[8] = it->get_price();

            //         tab.buatBaris(arrstr, 9);
            //     }
            // }
            // break;

            break;

        case 3: // UPDATE
            if (linked_list.empty())
            {
                cout << "Data Kosong\n";
            }
            else
            {
                cout << "Masukkan ID shirt yang ingin diubah : ";
                cin >> id;

                i = 0;
                int ubah = 0;
                // Iterasi melalui linked_list untuk mencari objek dengan ID yang sesuai
                for (list<Shirt>::iterator it = linked_list.begin(); it != linked_list.end(); it++)
                {
                    // Jika ID objek sesuai dengan input pengguna, lakukan update
                    if (id == it->get_id())
                    {
                        cout << "Masukkan Nama baru : ";
                        cin >> name;
                        it->set_name(name);

                        cout << "Masukkan Brand baru : ";
                        cin >> brand;
                        it->set_brand(brand);

                        cout << "Masukkan Size baru : ";
                        cin >> size;
                        it->set_size(size);

                        cout << "Masukkan Material baru : ";
                        cin >> material;
                        it->set_material(material);

                        cout << "Masukkan Color baru : ";
                        cin >> color;
                        it->set_color(color);

                        cout << "Masukkan Sleeve Type baru : ";
                        cin >> sleeveType;
                        it->set_sleeveType(sleeveType);

                        cout << "Masukkan Price baru : ";
                        cin >> price;
                        it->set_price(price);

                        cout << "\n===== Perubahan Berhasil Dilakukan (" << it->get_id() << ") ======\n"
                             << endl;

                        ubah = 1;
                    }
                    i++;
                }

                if (ubah == 0)
                {
                    cout << "tidak ditemukan data dengan id: " << id << endl;
                }
            }
            break;

        case 4: // DELETE
            cout << "Masukkan ID shirt yang ingin dihapus : ";
            cin >> id;

            // Iterasi melalui linked_list untuk mencari objek dengan ID yang sesuai
            for (auto it = linked_list.begin(); it != linked_list.end(); ++it)
            {
                // Jika ID objek sesuai dengan input pengguna, lakukan delete
                if (id == it->get_id() && done != 1)
                {
                    it = linked_list.erase(it);

                    cout << "\n===== Shirt dengan ID " << id << " berhasil dihapus =====\n"
                         << endl;
                    done = 1;
                }
            }

            // Beri pesan jika ID tidak ditemukan
            if (done == 0)
            {
                cout << "Tidak ditemukan shirt dengan ID " << id << "\n";
            }
            break;

        default:
            cout << "Menu yang anda pilih salah\n";
            break;
        }

        cout << "Apakah masih (y/n) ? ";
        cin >> ulang;

    } while (ulang == 'y' || ulang == 'Y');

    return 0;
}
