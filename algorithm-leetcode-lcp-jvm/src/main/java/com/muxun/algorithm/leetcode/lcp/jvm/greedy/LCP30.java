package com.muxun.algorithm.leetcode.lcp.jvm.greedy;

import java.util.PriorityQueue;

/**
 * 题号: LCP30
 * 题目:
 * 链接:
 * 详情:
 * @author 慕勋
 * @created 2024/2/6
 */
public class LCP30 {

    /**
     * 思路: 贪心算法+优先队列
     * 一定失败的条件，加血+扣血 <= 0
     * 否则，能加血的时候就加血，扣血不超过当前生命值就扣血，如果扣超了就从前面扣血最多的拿回来，并加回生命值
     * @param nums
     * @return
     */
    public int magicTower(int[] nums) {
        int sum = 1;
        for (int num : nums) {
            sum += num;
        }
        if (sum <= 0) {
            return -1;
        }
        int count = 0;
        int hp = 1;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            // 先存起来
            if (num < 0) {
                queue.offer(num);
            }
            hp += num;
            if (hp < 1) {
                hp -= queue.poll();
                count++;
            }
        }
        return count;
    }
}
