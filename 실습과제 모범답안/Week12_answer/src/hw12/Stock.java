package hw12;

public class Stock {
    private String name; // 종목
    private int price; // 구매 가격
    private int amt; // 개수

    public Stock(String name, int price, int amt) {
        this.name = name;
        this.price = price;
        this.amt = amt;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmt() {
        return this.amt;
    }

    public void setAmt(int amt) {
        this.amt = amt;
    }

}
