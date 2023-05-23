class Vehicle {
    private int year;
    private String brand;
    private String model;
    private int miles;
    private int price;

    public Vehicle(int year, String brand, String model, int miles, int price) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.miles = miles;
        this.price = price;
    }
    public boolean worthBuying(int maxPrice) {

        return (price <= maxPrice);
      }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }
}


// (1). ORIGINAL CODE BEFORE MOFIFYING ACCESS TO PRIVATE
//class Vehicle {
//    public int mYear;
//    public String mBrand;
//    public String mModel;
//    public int mMiles;
//    public int mPrice;
//
//    public Vehicle(int year, String brand, String model, int miles, int price) {
//        mYear = year;
//        mBrand = brand;
//        mModel = model;
//        mMiles = miles;
//        mPrice = price;
//    }
//    public boolean worthBuying(int maxPrice) {
//        return (mPrice <= maxPrice);
//    }
//}