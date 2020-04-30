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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springsamples.entities.Vendor;
import com.springsamples.entities.rule;
import com.springsamples.repositry.springsamplerepo;


@RestController
@RequestMapping("vendordata")
public class springsamplecontroller {
	@Autowired
	springsamplerepo repo ;


	@PostMapping("/Create")
	public @ResponseBody ResponseEntity<Vendor> createUser(@RequestBody Vendor vendor) {
		  try {
			  String country ;
			  country = vendor.getCountry();
	          // load up the knowledge base
	          KieServices ks = KieServices.Factory.get();
	          KieContainer kContainer = ks.getKieClasspathContainer();
	          KieSession kSession = kContainer.newKieSession("ksession-rules");

	          // go !
	          rule ex = new rule();
	          ex.setKey1(country);
	          kSession.insert(ex);
	          kSession.fireAllRules();
	      } catch (Throwable t) {
	          t.printStackTrace();
	      }
		  
		repo.insert(vendor);
		return ResponseEntity.ok(vendor);
	}
	
 @GetMapping("/all")
 public List<Vendor> getvendordata() {
	 
	 return repo.findAll();
 }
}

