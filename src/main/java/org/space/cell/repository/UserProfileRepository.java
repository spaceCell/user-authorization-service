package org.space.cell.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import org.space.cell.entity.Account;
import org.space.cell.entity.UserProfile;

import java.util.UUID;

@ApplicationScoped
public class UserProfileRepository implements PanacheRepositoryBase<UserProfile, UUID> {
}
