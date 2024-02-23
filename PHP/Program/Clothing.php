<?php
require_once 'Product.php';

class Clothing extends Product {
    // Properti tambahan untuk Clothing
    private $size = "";
    private $material = "";
    private $gender = "";

    // Konstruktor untuk membuat objek Clothing dengan memanggil konstruktor parent
    public function __construct($id = "", $name = "", $brand = "", $price = "", $size = "", $material = "", $gender = "") {
        parent::__construct($id, $name, $brand, $price); // Memanggil konstruktor kelas parent
        $this->size = $size;
        $this->material = $material;
        $this->gender = $gender;
    }

    // Getter & Setter methods untuk properti tambahan Clothing
    public function getSize() {
        return $this->size;
    }

    public function setSize($size) {
        $this->size = $size;
    }

    public function getMaterial() {
        return $this->material;
    }

    public function setMaterial($material) {
        $this->material = $material;
    }

    public function getGender() {
        return $this->gender;
    }

    public function setGender($gender) {
        $this->gender = $gender;
    }
}
?>
