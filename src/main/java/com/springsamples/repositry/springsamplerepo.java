package com.springsamples.repositry;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.springsamples.entities.CompanyData;
import com.springsamples.entities.Vendor;
@Repository
public interface springsamplerepo extends MongoRepository<Vendor , Integer>{
	
//Vendor findOne(String id);
	
public List<Vendor> findVendorByName(String name);

public List<CompanyData> findCompanydataByvendornumber(Integer id);
public List<Vendor> findVendorByVendornumber(Integer id);
public List<Vendor> findVendorByCompdataCompanycode(String compcode);
}
