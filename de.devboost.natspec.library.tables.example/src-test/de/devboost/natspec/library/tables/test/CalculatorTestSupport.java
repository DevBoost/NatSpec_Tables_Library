package de.devboost.natspec.library.tables.test;

import static org.junit.Assert.assertEquals;
import de.devboost.natspec.annotations.TextSyntax;
import de.devboost.natspec.example.calculator.Calculator;
import de.devboost.natspec.library.tables.Row;
import de.devboost.natspec.library.tables.Table;

public class CalculatorTestSupport {

	@TextSyntax("Validate whether Factor A times Factor B gives Result")
	public void validateMultiplication(Table inputData) {
		Calculator calculatorToTest = new Calculator();
		for (Row dataRow : inputData.getRows()) {
			Integer computedResult = calculatorToTest.multiply(
					dataRow.getField("Factor A (Input)").getInteger(), 
					dataRow.getField("Factor B (Input)").getInteger());
			
			Integer expectedResult = dataRow.getField("Result (Output)")
					.getInteger();
			assertEquals(expectedResult, computedResult);
		}
	}

}
