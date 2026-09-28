import java.util.Arrays;

public class Product {
    private String name;
    private String productionDate;
    private String producer;
    private String countryOfOrigin;
    private int price;
    private boolean status;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", productionDate='" + productionDate + '\'' +
                ", producer='" + producer + '\'' +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", price=" + price +
                ", status=" + status +
                '}';
    }

    public Product(String name, String productionDate, String producer, String countryOfOrigin, int price, boolean status){
        this.name = name;
        this.productionDate = productionDate;
        this.producer = producer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.status = status;
    }

    public static void main(String[] args){
        Product[] productArray = new Product[5];
        productArray[0] = new Product("Samsung S25 Ultra", "01.02.2025","Samsung Corp.", "Korea", 5599, true);
        productArray[1] = new Product("MacBook Pro 14 M3 Pro", "12.11.2024", "Apple Inc.", "China", 2399, true);
        productArray[2] = new Product("Sony WH-1000XM5", "05.06.2023", "Sony Corporation", "Malaysia", 349, false);
        productArray[3] = new Product("LG OLED C3 65\"", "18.03.2023", "LG Electronics", "Korea", 1799, true);
        productArray[4] = new Product("DJI Mavic 3 Pro", "22.05.2023", "SZ DJI Technology", "China", 2199, true);

        for (int i = 0; i < productArray.length; i++){
            System.out.println(productArray[i]);
        }
    }
}
