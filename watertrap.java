public class watertrap {
    public static void WaterTrapping(int height[]){
        int n=height.length;
        //1.Calculate Left Max Boundary-Array
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }
        //2.Calculate Right Max Boundary-Array
        int RightMax[]=new int[n];
        RightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            RightMax[i]=Math.max(height[i],RightMax[i+1]);
        }
        //Loop
        int Trapped_Rain_Water=0;
        
        for(int i=0;i<n;i++){
            //3.WaterLevel=min(Left max Boundary,Right max Boundary)
           int  waterLevel=Math.min(leftMax[i], RightMax[i]);
            //4.water trapped=WaterLevel-height
          Trapped_Rain_Water+=waterLevel-height[i];
        }
        

       
        System.out.println("Total Trapped Water="+Trapped_Rain_Water);
        
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        WaterTrapping(height);
        
    }
}
