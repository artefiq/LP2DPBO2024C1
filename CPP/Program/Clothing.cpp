#include <iostream>
#include <string>
#include "Product.cpp"

using namespace std;

// Deklarasi kelas Clothing yang merupakan turunan dari kelas Product
class Clothing : public Product {
private:
    string size;
    string material;
    string gender;

    // Atribut statis untuk menyimpan panjang maksimum dari setiap atribut
    static int maxSize;
    static int maxMaterial;
    static int maxGender;

public:
    // Konstruktor default Clothing yang memanggil konstruktor default dari kelas Product
    Clothing() : Product() {
        size = "";
        material = "";
        gender = "";
    }

    // Konstruktor Clothing dengan parameter yang memanggil konstruktor parameter dari kelas Product
    Clothing(string id, string name, string brand, string price, string size, string material, string gender)
        : Product(id, name, brand, price), size(size), material(material), gender(gender) {

        // Memperbarui nilai maksimum jika panjang atribut melebihi nilai maksimum sebelumnya
        if (this->size.length() > maxSize) {
            maxSize = this->size.length();
        }

        if (this->material.length() > maxMaterial) {
            maxMaterial = this->material.length();
        }

        if (this->gender.length() > maxGender) {
            maxGender = this->gender.length();
        }
    }

    // Getter dan Setter untuk atribut size
    string get_size() {
        return size;
    }

    void set_size(string size) {
        this->size = size;
    }

    // Getter dan Setter untuk atribut material
    string get_material() {
        return material;
    }

    void set_material(string material) {
        this->material = material;
    }

    // Getter dan Setter untuk atribut gender
    string get_gender() {
        return gender;
    }

    void set_gender(string gender) {
        this->gender = gender;
    }

    // Getter untuk nilai maksimum panjang atribut size
    static int getmaxSize() {
        return maxSize;
    }

    // Getter untuk nilai maksimum panjang atribut material
    static int getmaxMaterial() {
        return maxMaterial;
    }

    // Getter untuk nilai maksimum panjang atribut gender
    static int getmaxGender() {
        return maxGender;
    }
};
