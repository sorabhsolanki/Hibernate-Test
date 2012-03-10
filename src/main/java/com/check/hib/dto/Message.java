package com.check.hib.dto;

import java.util.HashSet;
import java.util.Set;

public class Message {

	private Long id;
	private String messageText;
	private Set<Event> events = new HashSet<Event>();
	
	public Set<Event> getEvents() {
		return events;
	}
	public void setEvents(Set<Event> events) {
		this.events = events;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMessageText() {
		return messageText;
	}
	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}	
	
	
}
