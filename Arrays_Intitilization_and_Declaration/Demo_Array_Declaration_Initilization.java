// Package Declaration
package Arrays_Intitilization_and_Declaration;
//Public class declaration
public class DemoArray_Initilization {
    public static void main(String[] args) {
        // Array Declaration 
        int arr[] = new int[3];
        // Array Initialization
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        // Array Declaration and Initialization 
        int arr1[]= {20,30,40,50,60};     
        // Using a Normal for Loop to iterate through the array
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
        // Using Enhanced for Loop to iterate through the array
        for(int num:arr){
            System.out.println(num);
        }
        // Using a Normal for Loop to iterate through the array
        for(int i1=0;i1<arr1.length;i1++)
        {
            System.out.println("Element at index " + i1 + ": " + arr1[i1]);
        }
         // Using Enhanced for Loop to iterate through the array
        for(int num1:arr1){
            System.out.println(num1);
        
}
