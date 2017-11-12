package me.wanfan.showcase.jhipster.blog.repository.search;

import me.wanfan.showcase.jhipster.blog.domain.Tag;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the Tag entity.
 */
public interface TagSearchRepository extends ElasticsearchRepository<Tag, Long> {
}
