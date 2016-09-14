/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;

/**
 *
 * @author ankitmishra
 */
public class CartInfo {
    private List<CustomerPurchasedItem> items;
    private Double subTotal;
    private Double shipping;
    private Double total;

    public List<CustomerPurchasedItem> getItems() {
        return items;
    }

    public void setItems(List<CustomerPurchasedItem> items) {
        this.items = items;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Double getShipping() {
        return shipping;
    }

    public void setShipping(Double shipping) {
        this.shipping = shipping;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
    
}
