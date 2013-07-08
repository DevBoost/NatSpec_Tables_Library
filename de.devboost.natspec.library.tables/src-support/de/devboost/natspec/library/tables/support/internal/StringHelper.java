package de.devboost.natspec.library.tables.support.internal;

import java.util.ArrayList;
import java.util.List;

public class StringHelper {

	public String join(List<String> header) {
		StringBuilder result = new StringBuilder();
		int size = header.size();
		for (int i = 0; i < size; i++) {
			String next = header.get(i);
			result.append(next);
			if (i < size - 1) {
				result.append(" ");
			}
		}
		return result.toString();
	}

	public List<String> split(String text, String splitter) {
		List<String> result = new ArrayList<String>();
		String[] parts = text.split(splitter);
		for (String part : parts) {
			result.add(part.trim());
		}
		return result;
	}

}
