import java.util.HashMap;

public class Q1583 {
    public int unhappyFriends(int n, int[][] preferences, int[][] pairs) {
        int unhappyPair=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int[] pair : pairs){
            map.put(pair[0],pair[1]);
            map.put(pair[1],pair[0]);
        }
        for(int i=0;i<pairs.length;i++){
            if(!isHappy(pairs[i][0],pairs[i][1],preferences,map)){
                unhappyPair+=1;
            }
            if(!isHappy(pairs[i][1],pairs[i][0],preferences,map)){
                unhappyPair+=1;
            }
        }
        return unhappyPair;
    }
    public boolean isHappy(int person,int friend,int[][] preferences,HashMap<Integer,Integer> map){
        for(int i=0;i<preferences[person].length;i++){
            if(preferences[person][i]==friend){
                return true;
            }
            int currFriend=map.get(preferences[person][i]);
            for(int perferMate:preferences[preferences[person][i]]){
                if(perferMate==person){
                    return false;
                }else if(perferMate==currFriend){
                    break;
                }
            }
        }
        return true;
    }
}
