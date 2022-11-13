package designPattern.builder;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-11
 */
public class Product {
    private String name;
    private Double price;
    private String owner;

    public void reset() {
        this.name = null;
        this.price = null;
        this.owner = null;
    }


    public Product() {
    }

    public Product(String name, Double price, String owner) {
        this.name = name;
        this.price = price;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", owner='" + owner + '\'' +
                '}';
    }
}
