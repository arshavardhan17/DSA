package Section5_DS_Algorithms.Linear_S_T_C_46;
//Task: Search the elements of an array 
public class Main {
    public static void main(String[] args) {
        int []arr =new int []{10,20,30,40,50};
        
        //Add 10 to the first element of an array
        // arr[0]+=10; //Time Complexity =O(1) || S.C=O(1)

        for(int i=0;i<arr.length;i++){  //Time Complexity =O(n) || S.C=O(1) ** no aditional space used
            if(arr[i]==40){
                System.out.println("Found At index"+i);
            }
              
        }

        //Total Time Complexity =O(1)+O(n)=O(1+n)==O(n) ** ignore constants
        //Space Complexity ==O(1) 
        //copy the elements of one array to another S.C=O(n) 
    }
}

//linear Search