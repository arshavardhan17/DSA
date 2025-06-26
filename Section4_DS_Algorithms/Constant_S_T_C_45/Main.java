package Section4_DS_Algorithms.Constant_S_T_C_45;
//Add 10 to the first element of an array
public class Main {
    public static void main(String[] args) {

    int []arr =new int[]{1,2,3,4,5};
    arr[0]+=10;  //Time complexity=O(1)
    System.out.println(arr[0]);  //Time complexity=O(1)

    //O(1)+O(1)==O(2)==O(n) //Constant TimeComplexity

    int num=arr[arr.length -1]; // Space Complexity==int(4bytes)=O(4)
    System.out.println("last element of array is: "+num);
    
     //O(4bytes)=O(n) //constant Space Complexity

    }
}

