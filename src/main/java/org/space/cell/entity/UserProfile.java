package org.space.cell.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "user_profile")
public class UserProfile extends PanacheEntityBase {
    @Id
    @Column(name = "user_id")
    public UUID userId;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", insertable = false, updatable = false,
            foreignKey = @ForeignKey(name = "fk_user_profile_user_id"))
    public Account account;

    @Column(name = "first_name", nullable = false)
    public String firstName;

    @Column(name = "last_name", nullable = false)
    public String lastName;

    @Column(name = "avatar_url", nullable = false)
    public String avatarUrl;
}
