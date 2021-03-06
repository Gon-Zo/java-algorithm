package io.gonzo.jpa.app.domain.basic;

import io.gonzo.jpa.app.domain.base.DomainEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Entity
@Table(name = "ORDERS")
@NoArgsConstructor
@AllArgsConstructor
public class Orders extends DomainEntity {

    @Column(name = "TOTAL_PRICE" , nullable = false)
    private BigDecimal totalPrice;

    @Column(name = "COUPON" , nullable = false)
    private BigDecimal coupon;

    @Column(name = "DELIVERY_PRICE" , nullable = false)
    private BigDecimal deliveryPrice;

    @ManyToOne
    private Customers customers;

}
