package ua.univer.lesson07.market;

import ua.univer.lesson07.people.DiscountAble;


public class ProductList {
    private Product [] products;
    private int count;

    public ProductList(Product[] products) {
        this.products = products;
    }
    public ProductList() {
        this.products = new Product[10];
        count=0;
    }
    public void add(Product p){
        products[count++] = p;
    }

    private double getTotalCost(){
        double sum = 0;
        for (Product p: products) {
           if (p == null) break;
               sum+=p.getPrice();
        }
        return sum;
     }

    public double getTotalCostWithDiscount(DiscountAble discount){
        double totalCost = getTotalCost();
        return totalCost * discount.getDiscount(totalCost);
    }
}
