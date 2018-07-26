package com.zeed.usermanagement.repository;

import com.zeed.usermanagement.models.Authority;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface AuthorityRepository extends PagingAndSortingRepository<Authority,Long> {

    Authority findAuthorityById(Long id);

    List<Authority> findAllByIdIn(List<Long> ids);

    Authority findAuthorityByAuthority(String authority);

    List<Authority> findAuthoritiesByAuthorityIn(Set<String> authority);

}
