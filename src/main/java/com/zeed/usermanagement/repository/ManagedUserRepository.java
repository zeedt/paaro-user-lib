package com.zeed.usermanagement.repository;

import com.zeed.usermanagement.models.ManagedUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagedUserRepository extends JpaRepository<ManagedUser,Long> {

    ManagedUser findOneByEmailAndPassword(String email, String password);

    ManagedUser findOneByEmail(String email);

}
