package com.sunshine.algorithm.basic.tree;

import java.util.HashMap;
import java.util.Map;

/**
 * 字典树节点
 * @author sunshine
 * @created 2020-04-19
 */
public class TrieNode {

	Map<Character, TrieNode> children;

	boolean wordEnd;

	public TrieNode() {
		children = new HashMap<>();
	}
}
