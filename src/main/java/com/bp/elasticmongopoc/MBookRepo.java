package com.bp.elasticmongopoc;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MBookRepo extends MongoRepository<MBook, String>{

}
