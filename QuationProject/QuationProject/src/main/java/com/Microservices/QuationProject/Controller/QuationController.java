package com.Microservices.QuationProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.Microservices.QuationProject.Model.QuationEntity;
import com.Microservices.QuationProject.Model.QuationWrapper;
import com.Microservices.QuationProject.Model.Responce;
import com.Microservices.QuationProject.Service.QuationService;


@RestController
@RequestMapping("quation")
public class QuationController {

	@Autowired
	QuationService quationservice;
	
	@PostMapping("/add")
	public ResponseEntity<QuationEntity> addQuation(@RequestBody QuationEntity quation){
		return quationservice.addQuation(quation);
	}
	
	@GetMapping("/AllQuations")
	public ResponseEntity<List<QuationEntity>> getAllQuations() {
		return quationservice.getAllQuations();
	}
	
	@GetMapping("category/{category}")
	public ResponseEntity<List<QuationEntity>> getQuationsByCategory(@PathVariable String category) {
		return quationservice.getQuationsBycategory(category);
	}
	
	@GetMapping("genarate")
	public ResponseEntity<List<Integer>> getQuationForQuiz
					(@RequestParam String categoryName,@RequestParam Integer numQuations){
		return quationservice.getQuationsForQuiz(categoryName,numQuations);
	}
	
	@PostMapping("/getQuations")
	public ResponseEntity<List<QuationWrapper>> getQuationsFromId(@RequestBody List<Integer> quationIds){
		return quationservice.getQuationsFromId(quationIds);
	}
	
	@PostMapping("/getScore")
	public ResponseEntity<Integer> getScore(@RequestBody List<Responce> responces){
		return quationservice.getScore(responces);
	}
}


