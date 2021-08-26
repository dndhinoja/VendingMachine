package com.dippy.vendingmachine;

import java.util.List;

public class VendingMachineImpl {
    private long totalSales;
    private Product currentItem;
    private long currentBalance;



    Inventory cashInventory = new Inventory();
    private void initialize(){
        for(Coin c: Coin.values()){
           // System.out.println(c.value);
            cashInventory.inventoryCoin.put(c,5);
        }
    }


    public Bucket<Product, List<Coin>> collectItemAndChange() {
        Product item = collectItem();
        totalSales = totalSales + currentItem.getPrice();

        List<Coin> change = collectChange();
        return new Bucket<Product, List<Coin>>(item, change); }




}
