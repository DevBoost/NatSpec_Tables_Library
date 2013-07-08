package de.devboost.natspec.library.tables.support;

import java.util.List;

import de.devboost.natspec.annotations.TextSyntax;
import de.devboost.natspec.library.tables.Field;
import de.devboost.natspec.library.tables.Row;
import de.devboost.natspec.library.tables.Table;
import de.devboost.natspec.library.tables.support.internal.StringHelper;

public class TableSyntaxSupport {

	private Table lastTable;

	@TextSyntax("|- #1 -|")
	public Table createTable(List<String> header) {
		if (lastTable != null) {
			lastTable.seal();
		}
		Table table1 = new Table();
		List<Field> headerFields = table1.getHeaders();
		addFields(header, headerFields,"-\\|-");
		lastTable = table1;
		return table1;
	}

	@TextSyntax("| #1 |")
	public void createRow(List<String> text, Table table) {
		Row row = new Row(table);
		List<Field> fields = row.getFields();
		addFields(text, fields, "\\|");
		table.getRows().add(row);
	}

	private void addFields(List<String> words, List<Field> fields, String splitter) {
		StringHelper stringHelper = new StringHelper();
		String headerText = stringHelper.join(words);
		List<String> headers = stringHelper.split(headerText, splitter);
		for (String next : headers) {
			fields.add(new Field(next));
		}
	}
}
