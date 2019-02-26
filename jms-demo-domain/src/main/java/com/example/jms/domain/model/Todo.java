package com.example.jms.domain.model;

import java.io.Serializable;

public class Todo implements Serializable {

	private static final long serialVersionUID = -1L;

	private String title;
	
	private String description;

	private boolean finished;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	@Override
	public String toString() {
		return "Todo [title=" + title + ", description=" + description + ", finished=" + finished + "]";
	}

	
	
}