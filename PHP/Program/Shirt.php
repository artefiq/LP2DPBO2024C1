<?php
require_once 'Clothing.php';

class Shirt extends Clothing {
    // Properti tambahan untuk menyimpan data khusus Shirt
    private $color = "";
    private $sleeveType = "";

    // Konstruktor untuk membuat objek Shirt dengan memanggil konstruktor parent
    public function __construct($id = "", $name = "", $brand = "", $price = "", $size = "", $material = "", $gender = "", $color = "", $sleeveType = "") {
        parent::__construct($id, $name, $brand, $price, $size, $material, $gender); // Memanggil konstruktor kelas parent
        $this->color = $color;
        $this->sleeveType = $sleeveType;
    }

    // Getter & Setter methods untuk properti tambahan Shirt
    public function getColor() {
        return $this->color;
    }

    public function setColor($color) {
        $this->color = $color;
    }

    public function getSleeveType() {
        return $this->sleeveType;
    }

    public function setSleeveType($sleeveType) {
        $this->sleeveType = $sleeveType;
    }
}
?>
