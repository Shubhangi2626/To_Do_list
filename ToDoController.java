package service;

import java.util.List;

import com.demo.Todo;

public class ToDoController {
	
	  private ToDoService todoService;

	 
	    public List<Todo> getAllTodos() {
	        return todoService.getAllTodos();
	    }

	    
	    public Todo getTodoById(@PathVariable Long id) {
	        return todoService.getTodoById(id);
	    }

	    public Todo createTodo(@RequestBody Todo todo) {
	        return todoService.saveTodo(todo);
	    }

	  
	    public Todo updateTodo(@PathVariable Long id, @RequestBody Todo todo) {
	        todo.setId(id);
	        return todoService.saveTodo(todo);
	    }
	    public void deleteTodo(@PathVariable Long id) {
	        todoService.deleteTodo(id);
	    }
	}

}
