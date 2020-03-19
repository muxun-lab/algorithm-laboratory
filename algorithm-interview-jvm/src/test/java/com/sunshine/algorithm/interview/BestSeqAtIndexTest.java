package com.sunshine.algorithm.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-03-19
 */
@DisplayName("马戏团人塔单元测试")
public class BestSeqAtIndexTest {

	@Test
	public void bestSeqAtIndexTestOne() {
		Assertions.assertEquals(6, new BestSeqAtIndex().bestSeqAtIndex(new int[]{65, 70, 56, 75, 60, 68}, new int[]{100, 150, 90, 190, 95, 110}));
	}

	@Test
	public void bestSeqAtIndexTestTwo() {
		Assertions.assertEquals(5, new BestSeqAtIndex().bestSeqAtIndex(new int[]{5401, 9628, 3367, 6600, 6983, 7853, 5715, 2654, 4453, 8619}, new int[]{3614, 1553, 2731, 7894, 8689, 182, 7632, 4465, 8932, 4304}));
	}

	@Test
	public void bestSeqAtIndexDPTestOne() {
		Assertions.assertEquals(6, new BestSeqAtIndex().bestSeqAtIndexDP(new int[]{65, 70, 56, 75, 60, 68}, new int[]{100, 150, 90, 190, 95, 110}));
	}

	@Test
	public void bestSeqAtIndexDPTestTwo() {
		Assertions.assertEquals(5, new BestSeqAtIndex().bestSeqAtIndexDP(new int[]{5401, 9628, 3367, 6600, 6983, 7853, 5715, 2654, 4453, 8619}, new int[]{3614, 1553, 2731, 7894, 8689, 182, 7632, 4465, 8932, 4304}));
	}
}
