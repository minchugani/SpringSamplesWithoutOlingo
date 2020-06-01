package com.springsamples.controller;

import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springsamples.entities.CompanyData;
import com.springsamples.entities.SequenceId;
import com.springsamples.entities.Vendor;
import com.springsamples.entities.rule;
import com.springsamples.repositry.springsamplerepo;
import com.springsamples.service.seqgeneratorservice;


@RestController
@RequestMapping("vendordata")
public class springsamplecontroller {
	@Autowired
	springsamplerepo repo ;
	@Autowired
    seqgeneratorservice seqsrv;

	@PostMapping("/Create")
	public @ResponseBody ResponseEntity<Vendor> createUser(@RequestBody Vendor vendor) {
//		  try {
//			  String country ;
//			  country = vendor.getCountry();
//	          // load up the knowledge base
//	          KieServices ks = KieServices.Factory.get();
//	          KieContainer kContainer = ks.getKieClasspathContainer();
//	          KieSession kSession = kContainer.newKieSession("ksession-rules");
//
//	          // go !
//	          rule ex = new rule();
//	          ex.setKey1(country);
//	          kSession.insert(ex);
//	          kSession.fireAllRules();
//	      } catch (Throwable t) {
//	          t.printStackTrace();
//	      }
		
//		vendor.setVendornumber(seqsrv.getseq("sequence"));
		repo.insert(vendor);
		return ResponseEntity.ok(vendor);
	}
	
 @GetMapping("/all")
public List<Vendor> getvendorid(){
List<Vendor> vendname1 = repo.findVendorByName("chaitra");
////	return vendname1
//@RequestParam(value="vendor") String vendor
////	 
return vendname1;

}
 
 @GetMapping("/all1")
 public List<CompanyData> getcompany(){
 List<CompanyData> comp= repo.findCompanydataByvendornumber(236);
//// 	return vendname1
 //@RequestParam(value="vendor") String vendor
//// 	 
 return comp;

 }
 
 @GetMapping("/all2")
 public List<Vendor> getvendorid1(){
	 List<Vendor> vendname2 = repo.findVendorByVendornumber(69);
////	 	return vendname1
	 //@RequestParam(value="vendor") String vendor
////	 	 
	 return vendname2;

	 }
 
 @GetMapping("/all3")
 public List<Vendor> getvendor2(){
	 List<Vendor> vendname2 = repo.findVendorByCompdataCompanycode("C041");
////	 	return vendname1
	 //@RequestParam(value="vendor") String vendor
////	 	 
	 return vendname2;

	 }
}

