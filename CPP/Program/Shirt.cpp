#include <iostream>
#include <string>
#include "Clothing.cpp"

using namespace std;

// Deklarasi kelas Shirt yang merupakan turunan dari kelas Clothing
class Shirt : public Clothing {
private:
    string color;
    string sleeveType;

    // Atribut statis untuk menyimpan panjang maksimum dari setiap atribut
    static int maxColor;
    static int maxSleeveType;

public:
    // Konstruktor default Shirt yang memanggil konstruktor default dari kelas Clothing
    Shirt() : Clothing() {
        color = "";
        sleeveType = "";
    }

    // Konstruktor Shirt dengan parameter yang memanggil konstruktor parameter dari kelas Clothing
    Shirt(string id, string name, string brand, string price, string size, string material, string gender, string color, string sleeveType)
        : Clothing(id, name, brand, price, size, material, gender), color(color), sleeveType(sleeveType) {

        // Memperbarui nilai maksimum jika panjang atribut melebihi nilai maksimum sebelumnya
        if (this->color.length() > maxColor) {
            maxColor = this->color.length();
        }

        if (this->sleeveType.length() > maxSleeveType) {
            maxSleeveType = this->sleeveType.length();
        }
    }

    // Getter dan Setter untuk atribut color
    string get_color() {
        return color;
    }

    void set_color(string color) {
        this->color = color;
    }

    // Getter dan Setter untuk atribut sleeveType
    string get_sleeveType() {
        return sleeveType;
    }

    void set_sleeveType(string sleeveType) {
        this->sleeveType = sleeveType;
    }

    // Getter untuk nilai maksimum panjang atribut color
    static int getmaxcolor() {
        return maxColor;
    }

    // Getter untuk nilai maksimum panjang atribut sleeveType
    static int getmaxsleeveType() {
        return maxSleeveType;
    }
};
