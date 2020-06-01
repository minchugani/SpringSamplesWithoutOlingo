package com.springsamples.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.springsamples.entities.SequenceId;
@Service
public class seqgeneratorservice {
	@Autowired
	private MongoOperations mongoOperations;
public int getseq(String seqnam) {
	
	Query query = new Query(Criteria.where("_id").is(seqnam));

    Update update = new Update();
update.inc("seq", 1);

FindAndModifyOptions options = new FindAndModifyOptions();
options.returnNew(true);

SequenceId seqId =   mongoOperations.findAndModify(query, update, options, SequenceId.class);

return (int) seqId.getSeq();
	
	
}
}
