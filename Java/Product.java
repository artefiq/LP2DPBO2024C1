/**
 * Kelas Product merepresentasikan objek anggota DPR dengan atribut id, name,
 * brand, dan price.
 */
public class Product {
    private String id; // Atribut id anggota DPR
    private String name; // Atribut nama anggota DPR
    private String brand; // Atribut brand kerja anggota DPR
    private String price; // Atribut price anggota DPR

    // Atribut statis untuk menyimpan panjang maksimum dari setiap atribut
    private static int maxId;
    private static int maxName;
    private static int maxbrand;
    private static int maxprice;

    /**
     * Konstruktor default untuk objek Product.
     * Inisialisasi atribut id, name, brand, dan price dengan string kosong.
     */
    public Product() {
        this.id = "";
        this.name = "";
        this.brand = "";
        this.price = "";
    }

    /**
     * Konstruktor untuk objek Product dengan parameter id, name, brand, dan price.
     * Menginisialisasi atribut objek dan memperbarui nilai maxId, maxName,
     * maxbrand, dan maxprice
     * jika panjang atribut yang diinisialisasi melebihi nilai maksimum sebelumnya.
     */
    public Product(String id, String name, String brand, String price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;

        // Memperbarui nilai maksimum jika panjang atribut melebihi nilai maksimum
        // sebelumnya
        if (this.id.length() > maxId) {
            maxId = this.id.length();
        }

        if (this.name.length() > maxName) {
            maxName = this.name.length();
        }

        if (this.brand.length() > maxbrand) {
            maxbrand = this.brand.length();
        }

        if (this.price.length() > maxprice) {
            maxprice = this.price.length();
        }
    }

    /* Getter & Setter */

    /**
     * Getter untuk atribut id.
     * 
     * @return Nilai atribut id.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Setter untuk atribut id.
     * 
     * @param id Nilai yang akan di-set pada atribut id.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter untuk atribut name.
     * 
     * @return Nilai atribut name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter untuk atribut name.
     * 
     * @param name Nilai yang akan di-set pada atribut name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter untuk atribut brand.
     * 
     * @return Nilai atribut brand.
     */
    public String getbrand() {
        return this.brand;
    }

    /**
     * Setter untuk atribut brand.
     * 
     * @param brand Nilai yang akan di-set pada atribut brand.
     */
    public void setbrand(String brand) {
        this.brand = brand;
    }

    /**
     * Getter untuk atribut price.
     * 
     * @return Nilai atribut price.
     */
    public String getprice() {
        return this.price;
    }

    /**
     * Setter untuk atribut price.
     * 
     * @param price Nilai yang akan di-set pada atribut price.
     */
    public void setprice(String price) {
        this.price = price;
    }

    /**
     * Getter untuk nilai maksimum panjang atribut id.
     * 
     * @return Nilai maksimum panjang atribut id.
     */
    public static int getMaxId() {
        return maxId;
    }

    /**
     * Getter untuk nilai maksimum panjang atribut name.
     * 
     * @return Nilai maksimum panjang atribut name.
     */
    public static int getMaxName() {
        return maxName;
    }

    /**
     * Getter untuk nilai maksimum panjang atribut brand.
     * 
     * @return Nilai maksimum panjang atribut brand.
     */
    public static int getMaxbrand() {
        return maxbrand;
    }

    /**
     * Getter untuk nilai maksimum panjang atribut price.
     * 
     * @return Nilai maksimum panjang atribut price.
     */
    public static int getMaxprice() {
        return maxprice;
    }
}
