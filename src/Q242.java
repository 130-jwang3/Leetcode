import java.util.HashMap;

public class Q242 {
    public boolean isAnagram(String s, String t) {
        int[] alphabet=new int[26];
        for(int i=0;i<s.length();i++){
            alphabet[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            alphabet[t.charAt(i)-'a']--;
        }
        for(int i=0;i<alphabet.length;i++){
            if(alphabet[i]!=0){
                return false;
            }
        }
        return true;
    }
}
