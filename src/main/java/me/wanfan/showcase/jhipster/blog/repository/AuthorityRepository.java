package me.wanfan.showcase.jhipster.blog.repository;

import me.wanfan.showcase.jhipster.blog.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
