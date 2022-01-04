import java.util.*;

public class Q841 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer>visited=new HashSet<>();
        addKeys(0,rooms,visited);
        if(visited.size()==rooms.size()){
            return true;
        }
        return false;
    }
    public void addKeys(int room,List<List<Integer>> rooms,Set<Integer>visited){
        visited.add(room);
        for(int i=0;i<rooms.get(room).size();i++){
            if(!visited.contains((rooms.get(room)).get(i))){
                addKeys((rooms.get(room)).get(i),rooms,visited);
            }
        }
    }
}
