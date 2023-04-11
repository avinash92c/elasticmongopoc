package com.bp.elasticmongopoc;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "books")
public class EBook extends Book{

}
