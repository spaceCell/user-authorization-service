package org.space.cell.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "payment")
public class Payment extends PanacheEntityBase {
    @Id
    @Column(name = "payment_id")
    public UUID paymentId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, foreignKey = @ForeignKey(name = "fk_payment_user_id"))
    public Account account;

    @Column(name = "card_last4", nullable = false)
    public String cardLast4;

    @Column(name = "card_brand", nullable = false)
    public String cardBrand;

    @Column(name = "is_default", nullable = false)
    public boolean isDefault;
}
