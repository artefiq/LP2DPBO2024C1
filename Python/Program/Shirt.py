# Shirt.py

from Clothing import Clothing

class Shirt(Clothing):
    # Variabel statis untuk menyimpan panjang maksimum setiap atribut Shirt
    max_color = 0
    max_sleeve_type = 0

    def __init__(self, id, name, brand, price, size, material, gender, color, sleeve_type):
        """
        Menginisialisasi objek Shirt dengan atribut yang diberikan.

        Parameter:
        - id: Identifikasi unik untuk produk kemeja.
        - name: Nama produk kemeja.
        - brand: Merek produk kemeja.
        - price: Harga produk kemeja.
        - size: Ukuran produk kemeja.
        - material: Bahan produk kemeja.
        - gender: Jenis kelamin produk kemeja.
        - color: Warna produk kemeja.
        - sleeve_type: Jenis lengan produk kemeja.
        """
        super().__init__(id, name, brand, price, size, material, gender)
        self.color = color
        self.sleeve_type = sleeve_type

        # Memperbarui panjang maksimum jika panjang atribut saat ini lebih besar
        if len(color) > Shirt.max_color:
            Shirt.max_color = len(color)

        if len(sleeve_type) > Shirt.max_sleeve_type:
            Shirt.max_sleeve_type = len(sleeve_type)

    # Metode Getter dan Setter untuk setiap atribut Shirt
    def get_color(self):
        return self.color

    def set_color(self, color):
        self.color = color

    def get_sleeve_type(self):
        return self.sleeve_type

    def set_sleeve_type(self, sleeve_type):
        self.sleeve_type = sleeve_type

    # Metode Getter untuk panjang maksimum setiap atribut Shirt
    @staticmethod
    def get_max_color():
        return Shirt.max_color

    @staticmethod
    def get_max_sleeve_type():
        return Shirt.max_sleeve_type
