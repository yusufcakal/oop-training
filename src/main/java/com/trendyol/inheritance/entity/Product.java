package com.trendyol.inheritance.entity;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "product")
@SequenceGenerator(name = "id_generator", sequenceName = "seq_product")
public class Product extends BaseEntity {

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Column(name = "owner_id", nullable = false)
    private BigDecimal ownerId;

    @JoinColumn()
    @Column(name = "category", nullable = false)
    private String category;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(BigDecimal ownerId) {
        this.ownerId = ownerId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
