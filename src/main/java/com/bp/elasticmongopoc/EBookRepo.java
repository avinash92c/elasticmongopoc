package com.bp.elasticmongopoc;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EBookRepo extends ElasticsearchRepository<EBook, String>{

}
