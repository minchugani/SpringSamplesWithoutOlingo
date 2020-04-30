package com.springsamples.repositry;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springsamples.entities.Vendor;

public interface springsamplerepo extends MongoRepository<Vendor , Integer>{

}
