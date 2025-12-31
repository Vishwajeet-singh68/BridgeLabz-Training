package sorting;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        mergeSort(arr, 0, arr.length-1);
        for(int i:arr)
            System.out.println(i+" ");
    }
    public static void mergeSort(int arr[], int start, int end){
        if(start>=end)
            return;
        int mid=start+(end-start)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        mergeTwoSortedArray(arr, start, mid, end);
    }
    public static void mergeTwoSortedArray(int arr[], int left, int mid, int right){
        int first=mid-left+1;
        int second=right-mid;

        int arr1[]=new int[first];
        int arr2[]=new int[second];

        for(int i=0;i<first;i++){
            arr1[i]=arr[left+i];
        }
        for(int i=0;i<second;i++){
            arr2[i]=arr[mid+i+1];
        }

        int i=0,j=0,k=left;

        while(i<first && j<second){
            if(arr1[i]<=arr2[j])
                arr[k++]=arr1[i++];

            else
                arr[k++]=arr2[j++];
        }

        while(i<first)
            arr[k++]=arr1[i++];

        while(j<second)
            arr[k++]=arr2[j++];

    }
}
