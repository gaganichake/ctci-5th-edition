package org.ctci.chapter8.Question8_7;

import java.util.ArrayList;

public abstract class Conversation {
	protected ArrayList<User> participants = new ArrayList<>();
	protected int id;
	protected ArrayList<Message> messages = new ArrayList<>();
	
	public ArrayList<Message> getMessages() {
		return messages;
	}
	
	public boolean addMessage(Message m) {
		messages.add(m);
		return true;
	}
	
	public int getId() {
		return id;
	}
}
