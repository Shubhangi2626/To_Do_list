package com.demo;

public class Todo {
	
	    private Long id;
	    private String title;
	    @Override
		public String toString() {
			return "Todo [id=" + id + ", title=" + title + ", completed=" + completed + "]";
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public boolean isCompleted() {
			return completed;
		}
		public void setCompleted(boolean completed) {
			this.completed = completed;
		}
		private boolean completed;
}
