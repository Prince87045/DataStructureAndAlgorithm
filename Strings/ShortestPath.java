package Strings;
//Given a route containing 4 directions(E,W,N,S)
//Find the shortest path to reach destination
public class ShortestPath {
    public static float distance(String str){
        int x = 0 , y = 0;
        for(int i=0; i<str.length(); i++){
            char dir = str.charAt(i);
            if(dir == 'E'){
                x++;
            } else if(dir == 'W'){
                x--;
            } else if(dir == 'N'){
                y++;
            } else{
                y--;
            }
        }
        return (float)Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(distance(str));
    }
}
