package org.space.cell.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(
        name = "account",
        uniqueConstraints = @UniqueConstraint(
                name = "uc_account_email",
                columnNames = {"email"}
        )
)
public class Account extends PanacheEntityBase {

    @Id
    @Column(name = "user_id")
    public UUID userId;

    @Column(name = "email", nullable = false)
    @Email
    @NotNull
    public String email;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    @Column(name = "last_login", nullable = false)
    public Instant lastLogin;

    @Column(name = "is_verified_email", nullable = false)
    public boolean verifiedEmail;

    public String getPasswordHash() {
        return passwordHash;
    }
}
