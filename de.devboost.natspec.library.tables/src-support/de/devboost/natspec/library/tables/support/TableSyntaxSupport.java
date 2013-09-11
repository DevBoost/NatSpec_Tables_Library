package de.devboost.natspec.library.tables.support;

import java.util.List;

import de.devboost.natspec.annotations.TextSyntax;
import de.devboost.natspec.library.tables.Field;
import de.devboost.natspec.library.tables.Row;
import de.devboost.natspec.library.tables.Table;
import de.devboost.natspec.library.tables.support.internal.StringHelper;

/**
 * The {@link TableSyntaxSupport} can be referenced from NatSpec template
 * classes to enabled syntax patterns that create tables. The patterns defined
 * by the methods in this class create a model of the table using the classes
 * {@link Table}, {@link Row} and {@link Field}. This model can be accessed by
 * defining a custom test support method with an implicit parameter of type
 * {@link Table}. By doing so, the table that was created last can be accessed.
 */
public class TableSyntaxSupport {

	private Table lastTable;

	/**
	 * Creates a new table header. Use <code>|- Header 1 -|- Header 2 -|</code>
	 * to define the table's column headers.
	 */
	@TextSyntax("|- #1 -|")
	public Table createTable(List<String> header) {
		if (lastTable != null) {
			lastTable.seal();
		}
		Table newTable = new Table();
		List<Field> headerFields = newTable.getHeaders();
		addFields(header, headerFields, "-\\|-");
		lastTable = newTable;
		return newTable;
	}

	/**
	 * Creates a new table row. Use <code>| Value 1 | Value 2 |</code>
	 * to define the table's row values.
	 */
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
