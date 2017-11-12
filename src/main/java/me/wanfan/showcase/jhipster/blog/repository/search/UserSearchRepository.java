package me.wanfan.showcase.jhipster.blog.repository.search;

import me.wanfan.showcase.jhipster.blog.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, Long> {
}
