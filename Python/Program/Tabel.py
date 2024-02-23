# Tabel.py

from Shirt import Shirt

class Tabel:
    def __init__(self, rows, columns):
        """
        Inisialisasi objek Tabel dengan jumlah baris dan kolom.

        Parameter:
        - rows: Jumlah baris dalam tabel.
        - columns: Jumlah kolom dalam tabel.
        """
        self.rows = rows
        self.columns = columns

    # Metode Setter dan Getter untuk atribut rows
    def set_rows(self, rows):
        self.rows = rows

    def get_rows(self):
        return self.rows

    # Metode Setter dan Getter untuk atribut columns
    def set_columns(self, columns):
        self.columns = columns

    def get_columns(self):
        return self.columns

    def create_row(self, data):
        """
        Membuat baris tabel berdasarkan data yang diberikan.

        Parameter:
        - data: List data untuk setiap kolom dalam baris.

        Baris tabel akan dicetak dengan format yang sesuai dengan panjang maksimum atribut Shirt.
        """
        i = 0
        j = 0

        print("|", end="")
        for i in range(len(data)):
            print(" " + str(data[i]), end="")

            # Menyesuaikan panjang setiap kolom berdasarkan panjang maksimum atribut Shirt
            if i == 0:
                for j in range(Shirt.get_max_id() - len(str(data[i]))):
                    print(" ", end="")

            if i == 1:
                for j in range(Shirt.get_max_name() - len(str(data[i]))):
                    print(" ", end="")

            if i == 2:
                for j in range(Shirt.get_max_brand() - len(str(data[i]))):
                    print(" ", end="")

            if i == 3:
                for j in range(Shirt.get_max_size() - len(str(data[i]))):
                    print(" ", end="")

            if i == 4:
                for j in range(Shirt.get_max_material() - len(str(data[i]))):
                    print(" ", end="")

            if i == 5:
                for j in range(Shirt.get_max_gender() - len(str(data[i]))):
                    print(" ", end="")

            if i == 6:
                for j in range(Shirt.get_max_color() - len(str(data[i]))):
                    print(" ", end="")

            if i == 7:
                for j in range(Shirt.get_max_sleeve_type() - len(str(data[i]))):
                    print(" ", end="")

            if i == 8:
                for j in range(Shirt.get_max_price() - len(str(data[i]))):
                    print(" ", end="")

            print(" |", end="")
        print("")

        # Menyesuaikan panjang strip berdasarkan panjang maksimum atribut Shirt
        max_strip = Shirt.get_max_id() + Shirt.get_max_name() + Shirt.get_max_brand() + Shirt.get_max_size() + \
                    Shirt.get_max_material() + Shirt.get_max_gender() + Shirt.get_max_color() + \
                    Shirt.get_max_price() + Shirt.get_max_sleeve_type()

        for i in range(max_strip + (2 * 9) + 10):
            print("-", end="")
        print("")
