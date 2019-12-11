package exercise.SwordRefersToOffer;

import com.sun.source.tree.Tree;
import exercise.LeetCode.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class BinaryTreeTravel {

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.right=new TreeNode(6);
        root.left.right.left=new TreeNode(7);
        root.left.right.right=new TreeNode(8);

        BinaryTreeTravel travel=new BinaryTreeTravel();
        travel.levelTravel(root);

    }

    public void preOrder1(TreeNode root){
        if (root!=null){
            travel(root);
            preOrder1(root.left);
            preOrder1(root.right);
        }

    }
    public void travel(TreeNode root){
        System.out.println(root.val);
    }
    public void preOrder2(TreeNode root){
        ArrayDeque<TreeNode>stack=new ArrayDeque<>();
        if (root==null)
            return;
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode tree=stack.pop();
            travel(tree);
            if (tree.right!=null){
                stack.push(tree.right);
            }
            if (tree.left!=null){
                stack.push(tree.left);
            }

        }
    }

    public void preOrder3(TreeNode root){
        ArrayDeque<TreeNode>stack=new ArrayDeque<>();
        while (root!=null||!stack.isEmpty()){
            if (root!=null){
                travel(root);
                stack.push(root);
                root=root.left;
            }
            else
            {
                root=stack.pop();
                root=root.right;
            }


        }

    }
    public void inOrder1(TreeNode root){
        if (root!=null){
            inOrder1(root.left);
            travel(root);
            inOrder1(root.right);
        }

    }

    public void inOrder2(TreeNode root){
        ArrayDeque<TreeNode>stack=new ArrayDeque<>();
        while (root!=null||!stack.isEmpty()){
            if (root!=null){
                stack.push(root);
                root=root.left;
            }
            else {
                TreeNode temp=stack.pop();
                travel(temp);
                root=temp.right;
            }


        }

    }

    public void postOrder1(TreeNode root){
        if (root!=null){
            postOrder1(root.left);
            postOrder1(root.right);
            travel(root);
        }

    }
    public void postOrder2(TreeNode root){
        ArrayDeque<TreeNode>stack=new ArrayDeque<>();
        TreeNode pre=null;
        TreeNode cur=null;
        if (root==null)
            return;
        stack.push(root);
        while (!stack.isEmpty()){
            cur=stack.peek();
            if ((cur.left==null&&cur.right==null)||
                    (pre!=null&&(pre==cur.left||pre==cur.right))){
                stack.pop();
                travel(cur);
                pre=cur;
            }
            else {
                if (cur.right!=null){
                    stack.push(cur.right);

                }
                if (cur.left!=null){
                    stack.push(cur.left);
                }

            }


        }

    }

    public void levelTravel(TreeNode root){
        Deque<TreeNode>queue=new LinkedList<>();
        if (root==null)
            return;

        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode cur=queue.poll();
            travel(cur);
            if (cur.left!=null){
                queue.offer(cur.left);
            }
            if (cur.right!=null)
                queue.offer(cur.right);


        }

    }



}
