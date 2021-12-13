package eidi.mergesort;

import eidi.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> four = new List<>(4);
        List<Integer> three = new List<>(3, four);
        List<Integer> two = new List<>(2, three);
        List<Integer> one = new List<>(1, two);

        List<Integer> eight = new List<>(8);
        List<Integer> seven = new List<>(7, eight);
        List<Integer> six = new List<>(6, seven);
        List<Integer> five = new List<>(5, six);

        List<Integer> merged = MergeSort.merge(five, one);
        List<Integer> sorted = MergeSort.sort(merged);

        System.out.println("Merged: " + merged.toString());
        System.out.println("Sorted: " + sorted.toString());
    }

}
