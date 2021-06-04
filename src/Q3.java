import java.util.HashMap;

public class Q3 {
    public int lengthOfLongestSubstring(String s) {
        /*
        1.iterate through string s
            1.1 put each index and character into a hashmap
            1.2 check if the hashmap contains the character at current position
                1.2.1 find the index of the repeated character and check if it's longer than the previous index of repeated note
            1.3 check if the previous max is bigger or the new max due to repeated character is longer
        2.return max
         */
        HashMap<Character,Integer> map=new HashMap<>();
        int max=0,j=0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                j=Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max=Math.max(max,i-j+1);
        }
        return max;
    }
}
