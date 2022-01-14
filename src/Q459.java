public class Q459 {
    public boolean repeatedSubstringPattern(String s) {
        int len=s.length();
        int[] repeat=getNext(s);
        if(repeat[len-1]==-1){
            return false;
        }
        if(len%(len-repeat[len-1]-1)==0){
            return true;
        }
        return false;
    }
    private int[] getNext(String s){
        int repeat[]=new int[s.length()];
        int j=-1;
        repeat[0]=j;
        for(int i=1;i<s.length();i++){
            while(j>=0&&s.charAt(i)!=s.charAt(j+1)){
                j=repeat[j];
            }
            if(s.charAt(i)==s.charAt(j+1)){
                j++;
            }
            repeat[i]=j;
        }
        return repeat;
    }
}
