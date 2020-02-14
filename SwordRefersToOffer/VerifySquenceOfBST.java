package exercise.SwordRefersToOffer;

public class VerifySquenceOfBST {

    public static void main(String[] args) {
        int []sequence={5,7,6,9,11,10,8};
        VerifySquenceOfBST v=new VerifySquenceOfBST();

        System.out.println(v.VerifySquenceOfBST(sequence));
    }
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length==0)
            return false;
        return Verify(sequence,0,sequence.length);
    }
    public boolean Verify(int [] sequence,int start,int length) {

        int root=sequence[length-1];
        int i=start;
        while (i<length&&sequence[i]<root){
            i++;
        }
        int j=i;
        for (; j <length ; j++) {
            if (sequence[j]<root)
                return false;
        }
        boolean left=true;
        boolean right=true;
        if (i>start)
            left=Verify(sequence,start,i);
        if (i<length-1)
        right=Verify(sequence,i,length-1);
        return left&&right;
    }
}
