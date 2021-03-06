/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Magnus
 */
@Entity
public class DiscountQuantity extends DiscountType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    int quantityForDiscount = 3;
    double discount = 0.2; //20% on all if quantity is 3 or more

    @Override
    public double calcDiscount(double priceItem, int quantity) {
        return quantity >= quantityForDiscount ? priceItem * quantity * discount : 0;
    }

}
