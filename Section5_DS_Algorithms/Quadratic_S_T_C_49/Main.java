package Section5_DS_Algorithms.Quadratic_S_T_C_49;

public class Main {
    public static void main(String[] args) {
        int []arr=new int[]{3,4,5,10,0,5,6,25,30};
        int target =10;
        //Task: Find the pairs whose sum is =(10)
        for (int i=0;i<arr.length;i++){ //T.C=O(n)
            for(int j=i+1;j<arr.length;j++){//T.C=O(n^2)
                if(arr[i]+arr[j]==target){
                    System.out.println("pair:"+arr[i]+" "+arr[j]);
                }
            }
        }
    }
    
}
//Space Complexity=O(1)
//Time Complexity =O(n^2)
//The same problem can be colved in O(n)T.C by using HashMap