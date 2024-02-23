#include <iostream>
#include <string>

using namespace std;

class Product {
private:
    string id;
    string name;
    string brand;
    string price;

    // Atribut statis untuk menyimpan panjang maksimum dari setiap atribut
    static int maxId;
    static int maxName;
    static int maxBrand;
    static int maxPrice;

public:
    // Konstruktor default
    Product() {
        this->id = "";
        this->name = "";
        this->brand = "";
        this->price = "";
    }

    // Konstruktor dengan parameter
    Product(string id, string name, string brand, string price) {
        this->id = id;
        this->name = name;
        this->brand = brand;
        this->price = price;

        // Memperbarui nilai maksimum jika panjang atribut melebihi nilai maksimum sebelumnya
        if (this->id.length() > maxId) {
            maxId = this->id.length();
        }

        if (this->name.length() > maxName) {
            maxName = this->name.length();
        }

        if (this->brand.length() > maxBrand) {
            maxBrand = this->brand.length();
        }

        if (this->price.length() > maxPrice) {
            maxPrice = this->price.length();
        }
    }

    // Getter dan setter untuk id
    string get_id() {
        return id;
    }

    void set_id(string id) {
        this->id = id;
    }

    // Getter dan setter untuk name
    string get_name() {
        return this->name;
    }

    void set_name(string name) {
        this->name = name;
    }

    // Getter dan setter untuk brand
    string get_brand() {
        return this->brand;
    }

    void set_brand(string brand) {
        this->brand = brand;
    }

    // Getter dan setter untuk price
    string get_price() {
        return this->price;
    }

    void set_price(string price) {
        this->price = price;
    }

    // Getter untuk panjang maksimum id
    static int getMaxId() {
        return maxId;
    }

    // Getter untuk panjang maksimum name
    static int getMaxName() {
        return maxName;
    }

    // Getter untuk panjang maksimum brand
    static int getMaxBrand() {
        return maxBrand;
    }

    // Getter untuk panjang maksimum price
    static int getMaxPrice() {
        return maxPrice;
    }

    // Destruktor
    ~Product() {}
};
