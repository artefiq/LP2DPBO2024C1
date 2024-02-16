public class Clothing extends Product {
    private String size; // Atribut size anggota DPR
    private String material; // Atribut nama anggota DPR
    private String gender; // Atribut gender kerja anggota DPR

    // Atribut statis untuk menyimpan panjang maksimum dari setiap atribut
    private static int maxsize;
    private static int maxmaterial;
    private static int maxgender;

    /**
     * Konstruktor default untuk objek Product.
     * Inisialisasi atribut size, material, gender, dan dengan string kosong.
     */
    public Clothing() {
        super();
        this.size = "";
        this.material = "";
        this.gender = "";
    }

    /**
     * Konstruktor untuk objek Product dengan parameter size, material, gender, dan
     * .
     * Menginisialisasi atribut objek dan memperbarui nilai maxsize, maxmaterial,
     * maxgender, dan max
     * jika panjang atribut yang diinisialisasi melebihi nilai maksimum sebelumnya.
     */
    public Clothing(String id, String name, String brand, String price, String size, String material, String gender) {
        super(id, name, brand, price);
        this.size = size;
        this.material = material;
        this.gender = gender;

        // Memperbarui nilai maksimum jika panjang atribut melebihi nilai maksimum
        // sebelumnya
        if (this.size.length() > maxsize) {
            maxsize = this.size.length();
        }

        if (this.material.length() > maxmaterial) {
            maxmaterial = this.material.length();
        }

        if (this.gender.length() > maxgender) {
            maxgender = this.gender.length();
        }
    }

    /* Getter & Setter */

    /**
     * Getter untuk atribut size.
     * 
     * @return Nilai atribut size.
     */
    public String getsize() {
        return this.size;
    }

    /**
     * Setter untuk atribut size.
     * 
     * @param size Nilai yang akan di-set pada atribut size.
     */
    public void setsize(String size) {
        this.size = size;
    }

    /**
     * Getter untuk atribut material.
     * 
     * @return Nilai atribut material.
     */
    public String getmaterial() {
        return this.material;
    }

    /**
     * Setter untuk atribut material.
     * 
     * @param material Nilai yang akan di-set pada atribut material.
     */
    public void setmaterial(String material) {
        this.material = material;
    }

    /**
     * Getter untuk atribut gender.
     * 
     * @return Nilai atribut gender.
     */
    public String getgender() {
        return this.gender;
    }

    /**
     * Setter untuk atribut gender.
     * 
     * @param gender Nilai yang akan di-set pada atribut gender.
     */
    public void setgender(String gender) {
        this.gender = gender;
    }

    /**
     * Getter untuk nilai maksimum panjang atribut size.
     * 
     * @return Nilai maksimum panjang atribut size.
     */
    public static int getMaxsize() {
        return maxsize;
    }

    /**
     * Getter untuk nilai maksimum panjang atribut material.
     * 
     * @return Nilai maksimum panjang atribut material.
     */
    public static int getMaxmaterial() {
        return maxmaterial;
    }

    /**
     * Getter untuk nilai maksimum panjang atribut gender.
     * 
     * @return Nilai maksimum panjang atribut gender.
     */
    public static int getMaxgender() {
        return maxgender;
    }
}
