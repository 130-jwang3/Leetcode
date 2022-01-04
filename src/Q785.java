import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Q785 {
    public boolean isBipartite(int[][] graph) {
        Set<Integer> visited=new HashSet<>();
        int[]color=new int[graph.length];
        for(int i=0;i<color.length;i++){
            color[i]=-1;
        }
        for(int i=0;i< graph.length;i++){
            if(!rightColor(graph,i,color)){
                return false;
            }
        }
        return true;
    }
    public boolean rightColor(int[][]graph,int node,int[]color){
        if(color[node]==-1){
            color[node]=1;
        }
        for(int i=0;i<graph[node].length;i++){
            if(color[graph[node][i]]==-1){
                if(color[node]==1){
                    color[graph[node][i]]=2;
                }else if(color[node]==2){
                    color[graph[node][i]]=1;
                }
                if(rightColor(graph,graph[node][i],color)==false){
                    return false;
                }
            }else if(color[node]==color[graph[node][i]]) {
                return false;
            }
        }return true;
    }
}
