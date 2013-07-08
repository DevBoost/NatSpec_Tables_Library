package de.devboost.natspec.library.tables.test;

import org.junit.Test;

import de.devboost.natspec.library.tables.support.TableSyntaxSupport;

public class CalculationTest {

	protected TableSyntaxSupport tableSyntaxSupport = new TableSyntaxSupport();
	protected CalculatorTestSupport calculatorTestSupport = new CalculatorTestSupport();
	
	@Test
	public void executeScript() throws Exception {
		// The code in this method is generated from: /de.devboost.natspec.library.tables.test/src-test/de/devboost/natspec/library/tables/test/CalculationTest.natspec
		// Never change this method or any contents of this file, all local changes will be overwritten.
		
		// |- Factor A (Input) -|- Factor B (Input) -|- Result (Output) -|
		de.devboost.natspec.library.tables.Table table_Factor_A__Input______Factor_B__Input______Result__Output_ = tableSyntaxSupport.createTable(java.util.Arrays.asList(new java.lang.String[] {"Factor", "A", "(Input)", "-|-", "Factor", "B", "(Input)", "-|-", "Result", "(Output)"}));
		// | 1 | 1 | 1 |
		tableSyntaxSupport.createRow(java.util.Arrays.asList(new java.lang.String[] {"1", "|", "1", "|", "1"}), table_Factor_A__Input______Factor_B__Input______Result__Output_);
		// | 23 | 23 | 529 |
		tableSyntaxSupport.createRow(java.util.Arrays.asList(new java.lang.String[] {"23", "|", "23", "|", "529"}), table_Factor_A__Input______Factor_B__Input______Result__Output_);
		// | 0 | 17 | 0 |
		tableSyntaxSupport.createRow(java.util.Arrays.asList(new java.lang.String[] {"0", "|", "17", "|", "0"}), table_Factor_A__Input______Factor_B__Input______Result__Output_);
		// | -2 | 8 | -16 |
		tableSyntaxSupport.createRow(java.util.Arrays.asList(new java.lang.String[] {"-2", "|", "8", "|", "-16"}), table_Factor_A__Input______Factor_B__Input______Result__Output_);
		// | -21 | -2 | 42 |
		tableSyntaxSupport.createRow(java.util.Arrays.asList(new java.lang.String[] {"-21", "|", "-2", "|", "42"}), table_Factor_A__Input______Factor_B__Input______Result__Output_);
		// Validate whether Factor A times Factor B gives Result
		calculatorTestSupport.validateMultiplication(table_Factor_A__Input______Factor_B__Input______Result__Output_);
		
	}

}