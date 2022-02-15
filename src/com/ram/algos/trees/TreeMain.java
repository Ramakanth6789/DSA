package com.ram.algos.trees;

import com.sun.source.tree.Tree;

public class TreeMain {
    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        TreeNode beer = new TreeNode("Beer");
        TreeNode wine = new TreeNode("Wine");
        TreeNode coffee = new TreeNode("Coffee");
        TreeNode tea = new TreeNode("Tea");
        drinks.addChild(hot);
        drinks.addChild(cold);
        hot.addChild(coffee);
        hot.addChild(tea);
        cold.addChild(beer);
        cold.addChild(wine);

        System.out.println(drinks.print(0));
        System.out.println("-----------------");
        System.out.println(drinks.print(1));
    }
}
