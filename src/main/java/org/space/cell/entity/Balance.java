package org.space.cell.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "balance")
public class Balance extends PanacheEntityBase {
    @Id
    @Column(name = "user_id")
    public UUID userId;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", insertable = false, updatable = false,
            foreignKey = @ForeignKey(name = "fk_balance_user_id"))
    public Account account;

    @Column(name = "points", nullable = false)
    public int points;

    @Column(name = "bonus_coins", nullable = false)
    public int bonusCoins;
}
