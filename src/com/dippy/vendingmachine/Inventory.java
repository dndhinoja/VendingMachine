package com.dippy.vendingmachine;

import java.util.HashMap;
import java.util.Map;

public class Inventory{


    Map<Coin,Integer> inventoryCoin = new HashMap<Coin,Integer>();
    Map<Product,Integer> inventoryProduct = new HashMap<Product,Integer>();

    //adding coins
    public void add(Coin coin){
        int count = inventoryCoin.get(coin);
        inventoryCoin.put(coin,count+1);
    }
    public void add(Product product){
        int count = inventoryProduct.get(product);
        inventoryProduct.put(product,count+1);
    }
    //changing or refund coins
    public void deduct(Coin coin){
        if(hasCoin(coin)) {
            int count = inventoryCoin.get(coin);
            inventoryCoin.put(coin, count - 1);
        }
    }

    public boolean hasCoin(Coin coin){
        int totalCoinOfType = inventoryCoin.get(coin);
        return inventoryCoin.get(coin)>0?true:false;
    }

    public Integer quantity(Coin coin){
        if(hasCoin(coin)){
            int value = inventoryCoin.get(coin);
            return value;
        }
        return 0;
    }
}
