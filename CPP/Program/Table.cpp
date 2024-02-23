// #include <iostream>
// #include <iomanip>
// #include <string>
// #include "Shirt.cpp"

// using namespace std;

// class Tabel
// {
// private:
//     int baris;
//     int kolom;

// public:
//     Tabel(int baris, int kolom)
//     {
//         this->baris = baris;
//         this->kolom = kolom;
//     }

//     void setBaris(int baris)
//     {
//         this->baris = baris;
//     }

//     int getBaris() const
//     {
//         return baris;
//     }

//     void setKolom(int kolom)
//     {
//         this->kolom = kolom;
//     }

//     int getKolom() const
//     {
//         return kolom;
//     }

//     void buatBaris(const string isi[], int add)
//     {
//         int i = 0, j = 0;

//         cout << "|";
//         for (int i = 0; i < kolom; i++) {
//             cout << " " << isi[i];

//             if (i == 0) {
//                 for (int j = 0; j < (Shirt::getMaxId() - isi[i].length()); j++) {
//                     cout << " ";
//                 }
//             }

//             if (i == 1) {
//                 for (int j = 0; j < (Shirt::getMaxName() - isi[i].length()); j++) {
//                     cout << " ";
//                 }
//             }

//             if (i == 2) {
//                 for (int j = 0; j < (Shirt::getMaxBrand() - isi[i].length()); j++) {
//                     cout << " ";
//                 }
//             }

//             if (i == 3) {
//                 for (int j = 0; j < (Shirt::getmaxSize() - isi[i].length()); j++) {
//                     cout << " ";
//                 }
//             }

//             if (i == 4) {
//                 for (int j = 0; j < (Shirt::getmaxMaterial() - isi[i].length()); j++) {
//                     cout << " ";
//                 }
//             }

//             if (i == 5) {
//                 for (int j = 0; j < (Shirt::getmaxGender() - isi[i].length()); j++) {
//                     cout << " ";
//                 }
//             }

//             if (i == 6) {
//                 for (int j = 0; j < (Shirt::getmaxcolor() - isi[i].length()); j++) {
//                     cout << " ";
//                 }
//             }

//             if (i == 7) {
//                 for (int j = 0; j < (Shirt::getmaxsleeveType() - isi[i].length()); j++) {
//                     cout << " ";
//                 }
//             }

//             if (i == 8) {
//                 for (int j = 0; j < (Shirt::getMaxPrice() - isi[i].length()); j++) {
//                     cout << " ";
//                 }
//             }

//             cout << " |";
//         }
//         cout << endl;

//         int maxStrip = Shirt::getMaxId() + Shirt::getMaxName() + Shirt::getMaxBrand() + Shirt::getmaxSize() + Shirt::getmaxMaterial() + Shirt::getmaxGender() + Shirt::getmaxcolor() + Shirt::getMaxPrice() + Shirt::getmaxsleeveType();
//         for (i = 0; i < maxStrip + (2 * kolom) + 10; i++)
//         {
//             std::cout << "-";
//         }
//         cout << endl;
//     }
// };
