package org.space.cell.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import org.space.cell.entity.Balance;
import org.space.cell.entity.Payment;

import java.util.UUID;

@ApplicationScoped
public class BalanceRepository implements PanacheRepositoryBase<Balance, UUID> {
}
