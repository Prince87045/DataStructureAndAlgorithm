//Find the trapped water in a bar graph
//Time complexity - O(n)
public class TrappingRainwater {
    public static int trappedWater(int height[]){
        int n = height.length;
        int trappedWater = 0; 
        int waterLevel;

        //max left boundary array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        //max right boundary array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);;
        }

        for(int i=0;i<n;i++){
            waterLevel = Math.min(leftMax[i],rightMax[i]);
            trappedWater += waterLevel-height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int totalTrap = trappedWater(height);
        System.out.println("Total trap water is : "+totalTrap);
    }
}
