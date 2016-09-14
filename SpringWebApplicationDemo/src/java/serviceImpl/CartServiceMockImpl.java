/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceImpl;

import java.util.ArrayList;
import java.util.List;
import models.CartInfo;
import models.CustomerPurchasedItem;
import service.CartService;

/**
 *
 * @author ankitmishra
 */
public class CartServiceMockImpl implements CartService {

    @Override
    public CartInfo getCartInfo() {
        CartInfo cartInfo = new CartInfo();
        cartInfo.setItems(prepareMockItemList(3));
        cartInfo.setShipping(15.00);
        cartInfo.setSubTotal(prepareSubTotal(cartInfo.getItems()));
        cartInfo.setTotal(cartInfo.getShipping()+cartInfo.getSubTotal());
        return cartInfo;
        
    }
    
    private List<CustomerPurchasedItem> prepareMockItemList(int n){
        List<CustomerPurchasedItem> itemList = new ArrayList<>();
        for(int i = 1 ;i<= n ;i++){
            CustomerPurchasedItem csi = new CustomerPurchasedItem("item"+i, 100.00*(i+3), i);
            itemList.add(csi);
        }
         return itemList;
    }

    private Double prepareSubTotal(List<CustomerPurchasedItem> items) {
        Double subTotal =0.0;
        for(CustomerPurchasedItem item:items){
            subTotal+=(item.getPrice()*item.getQuantity());
        }
        return subTotal;
    }
    
}
