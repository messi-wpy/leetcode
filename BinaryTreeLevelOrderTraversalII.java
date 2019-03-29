package leetcode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeLevelOrderTraversalII {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists=new ArrayList<>();
        levelTraver(lists,root,0);
        Collections.reverse(lists);
        return lists;
    }

    private void levelTraver(List<List<Integer>>list , TreeNode tree,int level){
        if (tree==null)return;
        if (level==list.size())
            list.add(new ArrayList<Integer>());
        levelTraver(list,tree.left,level+1);
        levelTraver(list,tree.right,level+1);

        List<Integer> l=list.get(level);
        l.add(tree.val);

    }
}
