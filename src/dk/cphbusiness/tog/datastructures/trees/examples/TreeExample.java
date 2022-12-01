package dk.cphbusiness.tog.datastructures.trees.examples;

import dk.cphbusiness.tog.datastructures.trees.BinaryTree;

import java.util.Random;

public class TreeExample
{
	public static void main(String[] args)
	{
		BinaryTree tree = new BinaryTree();
		Random rnd = new Random();
		for(int i = 0; i < 20; ++i)
		{
			int number = rnd.nextInt(100) + 1;
			System.out.println("number: " + number);
			tree.add(number);
		}
		System.out.println("Output:");
		tree.print();

	}
}
