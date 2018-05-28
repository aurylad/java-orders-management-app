package manager.notes;

import java.io.IOException;

//Mediator Pattern
public class User {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(String name) {
		this.name = name;
	}

	public void sendNote(String note) throws IOException {
		Note.buildNote(this, note);
	}
}