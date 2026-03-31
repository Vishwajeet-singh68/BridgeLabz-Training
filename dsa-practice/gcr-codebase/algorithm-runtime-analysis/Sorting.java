package algorithmruntimeanalysis;

import sorting.MergeSort;

import java.util.Arrays;

public class Sorting {
    public static void quickSort(int arr[], int start, int end){
        if(start>=end)
            return;
        int pi=pivot(arr, start, end);
        quickSort(arr, start,pi-1);
        quickSort(arr,pi+1,end);
    }
    public static int pivot(int arr[], int low, int high){
        int pivot=arr[high];
        int i=low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
    }

    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int bubble[]=new int[10001];
        for(int i=0;i<10001;i++){
            bubble[i]=10001-i;
        }

        int merge[]=bubble.clone();
        int quick[]=bubble.clone();

        long startBubble=System.nanoTime();
        bubbleSort(bubble);
        long endBubble=System.nanoTime();

        long startMerge=System.nanoTime();
        MergeSort.mergeSort(merge,0,merge.length-1);
        long endMerge=System.nanoTime();

        long startQuick=System.nanoTime();
        quickSort(quick, 0, quick.length-1);
        long endQuick=System.nanoTime();

        System.out.println("Bubble sort: "+(endBubble-startBubble));
        System.out.println("Merge Sort: "+(endMerge-startMerge));
        System.out.println("Quick Sort: "+(endQuick-startQuick));
    }
}
