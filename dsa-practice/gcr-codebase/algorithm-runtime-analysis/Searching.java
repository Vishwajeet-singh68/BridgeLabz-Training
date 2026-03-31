package algorithmruntimeanalysis;

public class Searching {
    public static int linearSearch(int arr[],int n){
        for(int i:arr){
            if(i==n)
                return i-1;
        }
        return -1;
    }
    public static int binarySearch(int arr[], int n){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==n)
                return mid;
            else if(n>=arr[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]=new int[1000];
        for(int i=0;i<1000;i++){
            arr[i]=i+1;
        }
        long startLinear=System.nanoTime();
        System.out.println(linearSearch(arr, 500));
        long endLinear=System.nanoTime();

        long startBinary=System.nanoTime();
        System.out.println(binarySearch(arr, 500));
        long endBinary=System.nanoTime();

        System.out.println("Linear search: "+(endLinear-startLinear));
        System.out.println("Binary Search: "+(endBinary-startBinary));
    }
}
