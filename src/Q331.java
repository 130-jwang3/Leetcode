import java.util.Stack;

public class Q331 {
    /*
    starting from the first position since it's preorder traversal
    each non null node should have 2 children and one parent, each null node
    should have 0 children and one parent.
    so the next node(if not null) should have a difference of one(parent child relationship)
    to achieve this we can add two to every none null node and decrease one for every node
    if the final result difference is zero means its a valid tree
     */
    public boolean isValidSerialization(String preorder) {
        String[] result=preorder.split(",");
        int diff=1;
        for(int i=0;i< result.length;i++){
            if(!result[i].equals("#")){
                diff+=2;
            }
            diff--;
            if(diff<0){
                return false;
            }
        }
        return diff==0;
    }
}
