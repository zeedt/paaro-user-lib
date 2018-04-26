package com.zeed.usermanagement.repository;

import com.zeed.usermanagement.models.ManagedUserAuthority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManagedUserAuthorityRepository extends JpaRepository<ManagedUserAuthority,Long> {

    List<ManagedUserAuthority> findAllByManagedUserId(Long id);

    List<ManagedUserAuthority> findAllByManagedUserIdIn(List<Long> id);

}
