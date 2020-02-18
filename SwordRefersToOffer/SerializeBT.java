package exercise.SwordRefersToOffer;

import exercise.LeetCode.TreeNode;

public class SerializeBT {
    StringBuilder sb=new StringBuilder();
    int index=0;
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(2);
        root.right=new TreeNode(33);
        root.left.left=new TreeNode(5);
        root.left.right=new TreeNode(99);
        root.left.left.left=new TreeNode(22);
        root.right.right=new TreeNode(11);
        SerializeBT serializeBT=new SerializeBT();
        TreeNode temp=serializeBT.Deserialize(serializeBT.Serialize(root));
        System.out.println(temp.val);
    }
    public String Serialize(TreeNode root) {
        if (root==null) {
            sb.append("#,");
            return sb.toString();
        }
        sb.append(root.val+",");
        Serialize(root.left);
        Serialize(root.right);
        return sb.toString();

    }

    public TreeNode Deserialize(String str) {
        String[] vals=str.split(",");
        return Deserialize(vals);
    }

    public TreeNode Deserialize(String[] vals){
        TreeNode node=null;
        if(!vals[index].equals("#")){
            node=new TreeNode(Integer.parseInt(vals[index]));
            index++;
            node.left=Deserialize(vals);
            index++;
            node.right=Deserialize(vals);
        }
        return node;
    }
}
