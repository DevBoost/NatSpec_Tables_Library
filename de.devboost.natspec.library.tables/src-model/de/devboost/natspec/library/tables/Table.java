package de.devboost.natspec.library.tables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Table {

	private List<Field> headers = new ArrayList<Field>();
	private List<Row> rows = new ArrayList<Row>();

	public List<Field> getHeaders() {
		return headers;
	}

	public List<Row> getRows() {
		return rows;
	}

	public void seal() {
		this.headers = Collections.unmodifiableList(headers);
		this.rows = Collections.unmodifiableList(rows);
		// Seal rows
		for (Row row : rows) {
			row.seal();
		}
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " " + rows.toString();
	}
}
