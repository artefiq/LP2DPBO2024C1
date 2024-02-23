<?php
class Product {
    // Properti untuk menyimpan data Product
    private $id = "";
    private $name = "";
    private $brand = "";
    private $price = "";

    // Konstruktor untuk membuat objek Product
    public function __construct($id = "", $name = "", $brand = "", $price = "") {
        $this->id = $id;            // Inisialisasi properti id dengan nilai dari parameter atau string kosong jika tidak ada parameter
        $this->name = $name;        // Inisialisasi properti name dengan nilai dari parameter atau string kosong jika tidak ada parameter
        $this->brand = $brand;      // Inisialisasi properti brand dengan nilai dari parameter atau string kosong jika tidak ada parameter
        $this->price = $price;      // Inisialisasi properti price dengan nilai dari parameter atau string kosong jika tidak ada parameter
    }

    // Getter & Setter methods untuk mengakses dan mengubah nilai properti

    public function getId() {
        return $this->id;           // Mengembalikan nilai properti id
    }

    public function setId($id) {
        $this->id = $id;            // Mengubah nilai properti id dengan nilai dari parameter
    }

    public function getName() {
        return $this->name;         // Mengembalikan nilai properti name
    }

    public function setName($name) {
        $this->name = $name;        // Mengubah nilai properti name dengan nilai dari parameter
    }

    public function getbrand() {
        return $this->brand;        // Mengembalikan nilai properti brand
    }

    public function setbrand($brand) {
        $this->brand = $brand;      // Mengubah nilai properti brand dengan nilai dari parameter
    }

    public function getprice() {
        return $this->price;        // Mengembalikan nilai properti price
    }

    public function setprice($price) {
        $this->price = $price;      // Mengubah nilai properti price dengan nilai dari parameter
    }
}
?>
