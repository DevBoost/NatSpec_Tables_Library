package de.devboost.natspec.library.tables;

import java.util.List;

public class Field {

	private String text;
	
	public Field(String text) {
		super();
		this.text = text;
	}

	public Field(List<String> text) {
		super();
		this.text = "";
		for (String word : text) {
			this.text += word;
			this.text += " "; // TODO
		}
	}

	public String getText() {
		return text;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " [" + getText() + "]";
	}
}
