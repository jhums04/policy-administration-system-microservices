package com.policyadminsystem.policyadminsystem.repository;

import com.policyadminsystem.policyadminsystem.entity.AccountOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountOwnerRepository extends JpaRepository<AccountOwner, Long> {
}
