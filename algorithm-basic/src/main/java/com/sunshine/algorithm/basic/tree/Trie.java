package com.sunshine.algorithm.basic.tree;

/**
 * 字典树实现
 * Trie是一种树形结构，是hash树的变种
 * 典型应用是用于统计，排序和保存数据量比较大的字符串（但不仅限于字符串）
 * 所以经常被搜索引擎系统用于文本词频统计
 * 优点：利用字符串的公共前缀来节约存储空间，最大限度减少无谓的字符串比较，查询效率比hash表高
 * @author sunshine
 * @created 2020-04-19
 */
public class Trie {

	private TrieNode root;

	public Trie() {
		root = new TrieNode();
		root.wordEnd = false;
	}

	public void insert(String item) {
		TrieNode node = root;
		for (int i = 0; i < item.length(); i++) {
			char current = item.charAt(i);
			if (!node.children.containsKey(current)) {
				node.children.put(current, new TrieNode());
			}
			node = node.children.get(current);
		}
		node.wordEnd = true;
	}

	public boolean get(String item) {
		TrieNode node = root;
		for (int i = 0; i < item.length(); i++) {
			char current = item.charAt(i);
			if (!node.children.containsKey(current)) {
				return false;
			}
			node = node.children.get(current);
		}
		return node.wordEnd;
	}

	public boolean startsWith(String prefix) {
		TrieNode node = root;
		for (int i = 0; i < prefix.length(); i++) {
			char current = prefix.charAt(i);
			if (!node.children.containsKey(current)) {
				return false;
			}
			node = node.children.get(current);
		}
		return true;
	}
}
