package exercise.SwordRefersToOffer;

public class ComplexClone {

    static class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public RandomListNode Clone(RandomListNode pHead)
    {
        cloneNode(pHead);
        cloneRandomNode(pHead);
        return divide(pHead);

    }

    public void cloneNode(RandomListNode pHead){
        RandomListNode pNode=pHead;
        while (pNode!=null){
            RandomListNode node=new RandomListNode(pNode.label);
            node.next=pNode.next;
            pNode.next=node;
            pNode=node.next;
        }

    }

    public void cloneRandomNode(RandomListNode pHead){
        RandomListNode pNode=pHead;
        while (pNode!=null){
            if (pNode.random!=null){
                pNode.next.random=pNode.random.next;
            }
            pNode=pNode.next.next;
        }
    }

    public RandomListNode divide(RandomListNode pHead){
        if (pHead==null)return null;
        RandomListNode pNode=pHead;

        RandomListNode pCloneHead;
        RandomListNode pClone;
        pCloneHead=pClone=pNode.next;
        pNode.next=pNode.next.next;
        pNode=pNode.next;
        while (pNode!=null){
            pClone.next=pNode.next;
            pClone=pClone.next;
            pNode.next=pNode.next.next;
            pNode=pNode.next;


        }
        return pCloneHead;
    }
}
