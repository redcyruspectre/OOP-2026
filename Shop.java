public class Shop {
    String name;
    Product[] productList;

    public Shop (){
    }
    public Shop(String name, Product[] list) {
        this.name = name;
        this.productList = list;
       

    }
    public void addProcuct(Product product) {
        productList[productCount] = product;
        productCount++;

    }
    public void displayProduct(){
        for (int i = 0; i < productList; i++)
           // if(productList[i] != null)
        System.out.println(productList[i].getInfo());

    }
}
