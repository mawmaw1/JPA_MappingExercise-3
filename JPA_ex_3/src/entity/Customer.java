/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

/**
 *
 * @author Magnus
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Customer implements Serializable {
    
    @OneToMany
    private List<DiscountType> dt = new ArrayList();

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

    public void getPrice(double pricePerItem, int quantity) {

    }

    public List<DiscountType> getDt() {
        return dt;
    }

    public void setDt(List<DiscountType> dt) {
        this.dt = dt;
    }
}
