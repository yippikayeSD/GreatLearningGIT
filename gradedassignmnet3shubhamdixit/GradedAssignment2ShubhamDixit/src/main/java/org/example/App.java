package org.example;

import org.example.architecturefloorbuilder.ArchitectureFloorBuilder;
import org.example.bstconverter.BstToSkewedTreeConverter;
import org.example.bstconverter.Node;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Boolean exit = false;
        System.out.println("-----------Welcome to Graded Assignment 2 - Great Learning----------");
        System.out.println("-----------Created by Shubham Dixit for Great Learning----------");
        while (!exit) {
            System.out.println("Please enter 1 for Architecture Floor Checker");
            System.out.println("Please enter 2 for BST Transaction Converter");
            System.out.println("Please enter 3 for  exit");
            Scanner inputScanner = new Scanner(System.in);
            int userInput = inputScanner.nextInt();
            switch (userInput) {
                case 1:
                    ArchitectureFloorBuilder floorBuilder = new ArchitectureFloorBuilder();
                    System.out.println("---------Welcome to Architecture Floor Checker-----------");
                    System.out.println("Please enter the Number of floors in the given building.");
                    int noOfFloors = inputScanner.nextInt();
                    int[] floorSizeMaster = new int[noOfFloors];
                    int dayCount = 1;
                    while (noOfFloors != 0) {
                        System.out.printf("Please enter floor size on day: %d\n", dayCount);
                        floorSizeMaster[dayCount - 1] = inputScanner.nextInt();
                        dayCount++;
                        noOfFloors--;
                    }
                    floorBuilder.build(floorSizeMaster);
                    break;
                case 2:
                    BstToSkewedTreeConverter tree = new BstToSkewedTreeConverter();
                    tree.node = new Node(50);
                    tree.node.left = new Node(30);
                    tree.node.right = new Node(60);
                    tree.node.left.left= new Node(10);
                    tree.node.right.left= new Node(55);
                    tree.flattenBTToSkewed(BstToSkewedTreeConverter.node);
                    tree.traverseRightSkewed(BstToSkewedTreeConverter.headNode);
                    System.out.println();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Please enter correct option");

            }

        }
    }
}

