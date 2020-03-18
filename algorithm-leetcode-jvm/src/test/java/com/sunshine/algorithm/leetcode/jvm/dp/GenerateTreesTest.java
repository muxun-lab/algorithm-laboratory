package com.sunshine.algorithm.leetcode.jvm.dp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-03-18
 */
@DisplayName("不同的二叉搜索树II单元测试")
public class GenerateTreesTest {

	@Test
	public void generateTreesRecursionTestOne() {
		new GenerateTress().generateTreesRecursion(3);
	}

	@Test
	public void generateTreesDynamicProgrammingTestOne() {
		new GenerateTress().generateTrees(3);
	}

	@Test
	public void generateTreesDynamicProgrammingUpgradeTestOne() {
		new GenerateTress().generateTreesDynamicProgrammingUpgrade(3);
	}
}
