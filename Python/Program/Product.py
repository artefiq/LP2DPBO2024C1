# Product.py

class Product:
    # Variabel statis untuk menyimpan panjang maksimum setiap atribut
    max_id = 0
    max_name = 0
    max_brand = 0
    max_price = 0

    def __init__(self, id, name, brand, price):
        """
        Menginisialisasi objek Product dengan atribut yang diberikan.

        Parameter:
        - id: Identifikasi unik untuk produk.
        - name: Nama produk.
        - brand: Merek produk.
        - price: Harga produk.
        """
        self.id = id
        self.name = name
        self.brand = brand
        self.price = price

        # Memperbarui panjang maksimum jika panjang atribut saat ini lebih besar
        if len(id) > Product.max_id:
            Product.max_id = len(id)

        if len(name) > Product.max_name:
            Product.max_name = len(name)

        if len(brand) > Product.max_brand:
            Product.max_brand = len(brand)

        if len(str(price)) > Product.max_price:
            Product.max_price = len(str(price))

    # Metode Getter dan Setter untuk setiap atribut Product
    def get_id(self):
        return self.id

    def set_id(self, id):
        self.id = id

    def get_name(self):
        return self.name

    def set_name(self, name):
        self.name = name

    def get_brand(self):
        return self.brand

    def set_brand(self, brand):
        self.brand = brand

    def get_price(self):
        return self.price

    def set_price(self, price):
        self.price = price

    # Metode Getter untuk panjang maksimum setiap atribut
    @staticmethod
    def get_max_id():
        return Product.max_id

    @staticmethod
    def get_max_name():
        return Product.max_name

    @staticmethod
    def get_max_brand():
        return Product.max_brand

    @staticmethod
    def get_max_price():
        return Product.max_price
