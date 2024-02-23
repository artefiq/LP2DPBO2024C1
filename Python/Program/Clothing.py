# Clothing.py

from Product import Product

class Clothing(Product):
    # Variabel statis untuk meyimpan panjang maksimum setiap atribut Clothing
    max_size = 0
    max_material = 0
    max_gender = 0

    def __init__(self, id, name, brand, price, size, material, gender):
        """
        Menginisialisasi objek Clothing dengan atribut yang diberikan.

        Parameter:
        - id: Identifikasi unik untuk produk pakaian.
        - name: Nama produk pakaian.
        - brand: Merek produk pakaian.
        - price: Harga produk pakaian.
        - size: Ukuran produk pakaian.
        - material: Bahan produk pakaian.
        - gender: Jenis kelamin produk pakaian.
        """
        super().__init__(id, name, brand, price)
        self.size = size
        self.material = material
        self.gender = gender

        # Memperbarui panjang maksimum jika panjang atribut saat ini lebih besar
        if len(size) > Clothing.max_size:
            Clothing.max_size = len(size)

        if len(material) > Clothing.max_material:
            Clothing.max_material = len(material)

        if len(gender) > Clothing.max_gender:
            Clothing.max_gender = len(gender)

    # Metode Getter dan Setter untuk setiap atribut Clothing
    def get_size(self):
        return self.size

    def set_size(self, size):
        self.size = size

    def get_material(self):
        return self.material

    def set_material(self, material):
        self.material = material

    def get_gender(self):
        return self.gender

    def set_gender(self, gender):
        self.gender = gender

    # Metode Getter untuk panjang maksimum setiap atribut Clothing
    @staticmethod
    def get_max_size():
        return Clothing.max_size

    @staticmethod
    def get_max_material():
        return Clothing.max_material

    @staticmethod
    def get_max_gender():
        return Clothing.max_gender
