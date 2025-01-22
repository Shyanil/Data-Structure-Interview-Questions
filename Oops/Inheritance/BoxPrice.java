public class BoxPrice extends BoxCopy{
    // this class have access of Box
    int total_price;

    public BoxPrice(String boxName, int total_price) {
        super(boxName);
        this.total_price = total_price;
    }

    public BoxPrice() {
        this.total_price = -1;
    }

    public BoxPrice(BoxCopy other, int total_price) {
        super(other);
        this.total_price = total_price;
    }

    @Override
    public String toString() {
        return "BoxPrice{" +
                "total_price=" + total_price +
                ", boxName='" + boxName + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", length=" + length +
                '}';
    }

    public BoxPrice(int width, int height, int length, String boxName, int total_price) {
        super(width, height, length, boxName);
        this.total_price = total_price;
    }


}
