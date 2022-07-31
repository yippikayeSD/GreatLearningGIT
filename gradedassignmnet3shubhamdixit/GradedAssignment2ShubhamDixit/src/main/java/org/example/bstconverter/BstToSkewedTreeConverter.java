package org.example.bstconverter;


public class BstToSkewedTreeConverter {
    /*
     * Created by DXYT on 7/31/2022 inside the package - org.example.bstconverter
     * @author - SDixit-MSC
     */


    public static Node node;
    static Node prevNode = null;
    public static Node headNode = null;

    public static void flattenBTToSkewed(Node root) {

        if (root == null) {
            return;
        }
        flattenBTToSkewed(root.left);
        Node rightNode = root.right;
        Node leftNode = root.left;

        if (headNode == null) {
            headNode = root;
        } else {
            prevNode.right = root;
        }
        root.left = null;
        prevNode = root;


        flattenBTToSkewed(rightNode);
    }

    public static void traverseRightSkewed(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        traverseRightSkewed(root.right);
    }
}
