package com.manish.learnspringsecurity.todo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class todos {
	
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	private static final List<Todo> TODOS_LIST = List.of(new Todo("manish", "Learn Spring boot"), (new Todo("manish", "Learn React JS")));

	@GetMapping("/todos")
	public List<Todo> retrieveTodos(){
		return TODOS_LIST;
	}
	
	@GetMapping("/users/{username}/todos")
	public Todo retrieveTodosForASpecificUser(@PathVariable String username){
		return TODOS_LIST.get(0);
	}
	
	@PostMapping("/users/{username}/todos")
	public void createTodoForASpecificUser(@PathVariable String username,
			@RequestBody Todo todo) {
		logger.info("Create {} for {}", todo, username);
		
	}

}

record Todo(String username, String description) {}