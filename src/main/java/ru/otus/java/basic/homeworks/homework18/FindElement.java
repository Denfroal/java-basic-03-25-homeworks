package ru.otus.java.basic.homeworks.homework18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindElement<T extends Comparable<T>> implements SearchTree<T> {
    private static class Node <T> {
        T data;
        Node <T> left;
        Node <T> right;
        public Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    private final Node<T> root;

    public FindElement(List<T> sortedList) {
        this.root = buildTreeFromSortedList(sortedList, 0, sortedList.size() - 1);
    }
    private Node<T> buildTreeFromSortedList(List<T> sortedList, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        Node<T> node = new Node<>(sortedList.get(mid));
        node.left = buildTreeFromSortedList(sortedList, start, mid - 1);
        node.right = buildTreeFromSortedList(sortedList, mid + 1, end);

        return node;
    }
    @Override
    public T find(T element) {
        return findRecursive(root, element);
    }
    private T findRecursive(Node<T> node, T element) {
        if (node == null) {
            return null;
        }
        int comparison = element.compareTo(node.data);
        if (comparison == 0) {
            return node.data;
        } else if (comparison < 0) {
            return findRecursive(node.left, element);
        } else {
            return findRecursive(node.right, element);
        }
    }

    @Override
    public List<T> getSortedList(List<T> list) {
        return list.stream().sorted().collect(Collectors.toList());
    }
}
