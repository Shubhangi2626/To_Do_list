package service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.Todo;

public class ToDoService {

	 private Repository todoRepository;

	    public List<Todo> getAllTodos() {
	        return todoRepository.findAll();
	    }

	    public Todo getTodoById(Long id) {
	        return todoRepository.findById(id).orElse(null);
	    }

	    public Todo saveTodo(Todo todo) {
	        return todoRepository.save(todo);
	    }

	    public void deleteTodo(Long id) {
	        todoRepository.deleteById(id);
	    }
}
