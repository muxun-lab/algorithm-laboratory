package com.sunshine.algorithm.array;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-01-24
 */
@DisplayName("杨辉三角升级版测试类")
public class PascalTriangleUpgradeTest {

	@Test
	public void pascalTriangleUpgradeTestOne() {
		new PascalTriangleUpgrade().getRow(5).forEach(System.out::println);
	}

	@Test
	public void pascalTriangleUpgradeTestTwo() {
		new PascalTriangleUpgrade().getRow(2).forEach(System.out::println);
	}

	@Test
	public void pascalTriangleUpgradeTestThree() {
		new PascalTriangleUpgrade().getRow(1).forEach(System.out::println);
	}

	@Test
	public void pascalTriangleUpgradeTestFour() {
		new PascalTriangleUpgrade().getRow(0).forEach(System.out::println);
	}
}
