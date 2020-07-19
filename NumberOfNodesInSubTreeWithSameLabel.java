import java.util.*;
class NumberOfNodesInSubTreeWithSameLabel{
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        Map<Integer,List<Integer>> graph = new HashMap<>();
        int[] result = new int[n]; 
        char[] label = labels.toCharArray();
        boolean[] visited = new boolean[n];
        //initialize adjacency list
        for(int i=0;i<n;i++){
            graph.put(i,new ArrayList<Integer>());
        }
        //populate adjacency list
        for(int[] edge: edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        HashMap<Integer, Integer> record = new HashMap<>();
        helper(graph,record,visited,label,0,-1);
        //cpnvert Map<Integer,Integer> to int[]
        for(Map.Entry<Integer,Integer> entry : record.entrySet()){
            result[entry.getKey()] = entry.getValue();
        }
        return result;
    }
    public Map<Character,Integer> helper(Map<Integer,List<Integer>> graph, HashMap<Integer,Integer> record, boolean[] visited, char[] label,int node, int parent){
        if(visited[node]==true){
            return new HashMap<Character,Integer>();
        }
        visited[node]=true;
        Map<Character,Integer> count = new HashMap<>();
        count.put(label[node],count.getOrDefault(label[node], 0)+1);
        for(int child : graph.get(node)){
            if(child == parent)
                continue;
            Map<Character,Integer> count2 = helper(graph,record, visited, label,child,node);
            for(Map.Entry<Character,Integer> e : count2.entrySet()){
                Character key = e.getKey();
                Integer val = e.getValue();
                count.put(key,count.getOrDefault(key, 0)+val);
            }
        }
        record.put(node,count.get(label[node]));
        return count;
    }
}