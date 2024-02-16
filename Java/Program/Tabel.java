public class Tabel {
    private int baris;
    private int kolom;

    Tabel(int baris, int kolom) {
        this.baris = baris;
        this.kolom = kolom;
    }

    public void setBaris(int baris) {
        this.baris = baris;
    }

    public int getBaris() {
        return baris;
    }

    public void setKolom(int kolom) {
        this.kolom = kolom;
    }

    public int getKolom() {
        return kolom;
    }

    public void buatBaris(String[] isi, int add) {
        int i = 0, j = 0;

        System.out.print("|");
        for (i = 0; i < isi.length; i++) {

            System.out.print(" ");
            System.out.print(isi[i]);

            if (i == 0) {
                for (j = 0; j < (Shirt.getMaxId() - isi[i].length()); j++) {
                    System.out.print(" ");
                }
            }

            if (i == 1) {
                for (j = 0; j < (Shirt.getMaxName() - isi[i].length()); j++) {
                    System.out.print(" ");
                }
            }

            if (i == 2) {
                for (j = 0; j < (Shirt.getMaxbrand() - isi[i].length()); j++) {
                    System.out.print(" ");
                }
            }

            if (i == 3) {
                for (j = 0; j < (Shirt.getMaxsize() - isi[i].length()); j++) {
                    System.out.print(" ");
                }
            }

            if (i == 4) {
                for (j = 0; j < (Shirt.getMaxmaterial() - isi[i].length()); j++) {
                    System.out.print(" ");
                }
            }

            if (i == 5) {
                for (j = 0; j < (Shirt.getMaxgender() - isi[i].length()); j++) {
                    System.out.print(" ");
                }
            }

            if (i == 6) {
                for (j = 0; j < (Shirt.getMaxcolor() - isi[i].length()); j++) {
                    System.out.print(" ");
                }
            }

            if (i == 7) {
                for (j = 0; j < (Shirt.getMaxsleeveType() - isi[i].length()); j++) {
                    System.out.print(" ");
                }
            }

            if (i == 8) {
                for (j = 0; j < (Shirt.getMaxprice() - isi[i].length()); j++) {
                    System.out.print(" ");
                }
            }

            System.out.print(" |");
        }
        System.out.println("");

        int maxStrip = Shirt.getMaxId() + Shirt.getMaxName() + Shirt.getMaxbrand() + Shirt.getMaxsize()
                + Shirt.getMaxmaterial() + Shirt.getMaxgender() + Shirt.getMaxcolor() + Shirt.getMaxprice() + Shirt.getMaxsleeveType();
        for (i = 0; i < maxStrip + (2 * 9) + 10; i++) {
            System.out.print("-");
        }
        System.out.println("");
    }
}