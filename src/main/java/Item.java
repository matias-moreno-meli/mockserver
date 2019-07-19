public class Item {

    int id;
    String title;
    String category_id;
    float price;
    String currency_id;
    int quantity;
    String condition;
    String [] pictures;

    public Item() {
    }

    public Item(int id) {
        this.id = id;
        this.title = "Titulo del Item";
        this.category_id = "MLA" + id;
        this.price = 100;
        this.currency_id = "ARS";
        this.quantity = 10;
        this.condition = "New";
        this.pictures = new String[] {"img1.png", "img2.png"};
    }


}
