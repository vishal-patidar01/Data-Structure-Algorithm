public class TrappedRainWater {

    public static void trappedRainWater(int height[]) {
        
        int n = height.length;

        // calculate left max boundary
        int leftmax[] = new int[n];
        leftmax[0] = height[0];

        for(int i=1; i<=n; i++) {
            leftmax[i] = Math.max()
        }

        // calculate Right max boundary
        // Loop
        // water level = min(leftmax, rightmax)
        // trapped water = water level - height
    }
    public static void main(String args[]) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
    }
    
}
