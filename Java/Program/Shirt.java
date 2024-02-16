public class Shirt extends Clothing {
    private String color; // Atribut color anggota DPR
    private String sleeveType; // Atribut nama anggota DPR

    // Atribut statis untuk menyimpan panjang maksimum dari setiap atribut
    private static int maxcolor;
    private static int maxsleeveType;

    /**
     * Konstruktor default untuk objek Product.
     * Inisialisasi atribut color, sleeveType, , dan dengan string kosong.
     */
    public Shirt() {
        super();
        this.color = "";
        this.sleeveType = "";
    }

    /**
     * Konstruktor untuk objek Product dengan parameter color, sleeveType, ,
     * dan
     * .
     * Menginisialisasi atribut objek dan memperbarui nilai maxcolor, maxsleeveType,
     * max, dan max
     * jika panjang atribut yang diinisialisasi melebihi nilai maksimum sebelumnya.
     */
    public Shirt(String id, String name, String brand, String price, String size, String material, String gender, String color, String sleeveType) {
        super(id, name, brand, price, size, material, gender);
        this.color = color;
        this.sleeveType = sleeveType;

        // Memperbarui nilai maksimum jika panjang atribut melebihi nilai maksimum
        // sebelumnya
        if (this.color.length() > maxcolor) {
            maxcolor = this.color.length();
        }

        if (this.sleeveType.length() > maxsleeveType) {
            maxsleeveType = this.sleeveType.length();
        }
    }

    /* Getter & Setter */

    /**
     * Getter untuk atribut color.
     * 
     * @return Nilai atribut color.
     */
    public String getcolor() {
        return this.color;
    }

    /**
     * Setter untuk atribut color.
     * 
     * @param color Nilai yang akan di-set pada atribut color.
     */
    public void setcolor(String color) {
        this.color = color;
    }

    /**
     * Getter untuk atribut sleeveType.
     * 
     * @return Nilai atribut sleeveType.
     */
    public String getsleeveType() {
        return this.sleeveType;
    }

    /**
     * Setter untuk atribut sleeveType.
     * 
     * @param sleeveType Nilai yang akan di-set pada atribut sleeveType.
     */
    public void setsleeveType(String sleeveType) {
        this.sleeveType = sleeveType;
    }

    /**
     * Getter untuk nilai maksimum panjang atribut color.
     * 
     * @return Nilai maksimum panjang atribut color.
     */
    public static int getMaxcolor() {
        return maxcolor;
    }

    /**
     * Getter untuk nilai maksimum panjang atribut sleeveType.
     * 
     * @return Nilai maksimum panjang atribut sleeveType.
     */
    public static int getMaxsleeveType() {
        return maxsleeveType;
    }
}
