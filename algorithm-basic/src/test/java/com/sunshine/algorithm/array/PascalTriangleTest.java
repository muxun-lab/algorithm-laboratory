package com.sunshine.algorithm.array;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-01-24
 */
@DisplayName("杨辉三角测试类")
public class PascalTriangleTest {

	@Test
	public void pascalTriangleTestOne() {
		new PascalTriangle().generate(5).forEach(System.out::println);
	}

	@Test
	public void pascalTriangleTestTwo() {
		new PascalTriangle().generate(2).forEach(System.out::println);
	}

	@Test
	public void pascalTriangleTestThree() {
		new PascalTriangle().generate(1).forEach(System.out::println);
	}

	@Test
	public void pascalTriangleTestFour() {
		new PascalTriangle().generate(0).forEach(System.out::println);
	}

	@Test
	public void pascalTriangleTestFive() {
		new PascalTriangle().generateSolutionTwo(5).forEach(System.out::println);
	}

	@Test
	public void pascalTriangleTestSix() {
		new PascalTriangle().generateSolutionTwo(2).forEach(System.out::println);
	}

	@Test
	public void pascalTriangleTestSeven() {
		new PascalTriangle().generateSolutionTwo(1).forEach(System.out::println);
	}

	@Test
	public void pascalTriangleTestEight() {
		new PascalTriangle().generateSolutionTwo(0).forEach(System.out::println);
	}
}
