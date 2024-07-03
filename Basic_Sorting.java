public class Basic_Sorting {
    //Printing an array
    public static void PrintArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }


    //Bubble sorting
    public static void BubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int br=0;
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    br=1;
                }

            }
            if(br==0){
                break;
            }
        }
    }


    //Selection sort
    public static void SelectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minpos=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }


    //Insertion SOrt
    public static void InsertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int currelem=arr[i];
            int prevpos=i-1;
            while(prevpos >= 0 && currelem < arr[prevpos]){
                arr[prevpos +1 ] = arr[prevpos];
                prevpos--;
            }
            arr[prevpos+1]=currelem;
        }
    }
    

    
    public static void main(String[] args) {
        //Bubble SOrt
        //selection sort
        // Insertion sort
        
        
        int arr[]={5,3,7,2,9,0};
        SelectionSort(arr);
        PrintArray(arr);


    }
}
