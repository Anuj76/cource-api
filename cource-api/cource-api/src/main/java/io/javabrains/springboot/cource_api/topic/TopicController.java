package io.javabrains.springboot.cource_api.topic;

//import java.lang.reflect.Array;
//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class TopicController {
	
	@Autowired
	TopicService scService;
	
	@GetMapping("/topics")
	public List<Topic> allTopics() {
		return scService.getAllTopics();
	}
	
	@GetMapping("/topics/{id}")
	public Topic byId(@PathVariable String id) {
		return scService.getById(id);
	}
	
	@PostMapping("/topics")
	public void add(@RequestBody Topic topic) {
		scService.addToList(topic);
	}
	
	@PutMapping("topics/{id}")
	public Topic update(@PathVariable String id, @RequestBody Topic topic) {
		
		return scService.updateById(topic, id);
	}
	
	@DeleteMapping("/topics/{id}")
	public void deleteById(@PathVariable String id) {
		 scService.deleteById(id);
	}
	
	
}
