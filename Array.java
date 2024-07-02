public class Array {
    //Find lagest and Min number in an array
    public static void LargesMintNumArr(int arr[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("maximum element in that array is "+ max);
        System.out.println("Minimum element in that array is "+ min);
    }

    //Binary Search (this method only aplicable for the sorted array)
    public static int BinarySearch(int arr[], int key){
        int firstIndx=0;
        int lastIndx=arr.length-1;
        while(firstIndx<=lastIndx){
            int mid=(firstIndx + lastIndx) / 2;
            if(key == arr[mid]){
                return mid;
            }
            else if(arr[mid]>key){
                lastIndx = mid-1;
            }
            else{
                firstIndx = mid+1;
            }
        }
        return -1;
    }


    //Creste a function to print all element of an array
    public static void PrintArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    //Reverse of an array
    public static void ReveserArray(int arr[]){
        int firstIndx=0;
        int lastIndx= arr.length - 1;
        while(firstIndx < lastIndx){
            int temp=arr[lastIndx];
            arr[lastIndx]=arr[firstIndx];
            arr[firstIndx]=temp;
            firstIndx++;
            lastIndx--;
        }
    }

    //Print Pair of Array
    public static void PrintPairOfArray(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+arr[i]+" "+ arr[j]+") ");
            }
            System.out.println();
        }
    }


    
    //print sub Array
    public static void PrintSubArray(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    


    //Find out the Maximum sum of Sub Array Using Kadan's Algo (TC = O(n))
    public static void MaxSubArraySum(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int CurrentSum =0;
        for(int i=0; i<arr.length; i++){
            CurrentSum += arr[i];
            if(CurrentSum<0){
                CurrentSum = 0;
            }
            maxSum = Math.max(maxSum, CurrentSum);
        }
        System.out.println(maxSum);
    }
    
    

    //Fin sum of maximum sub array using Prefix subarray
    public static void MaxSumPrefixSubArr(int arr[]){
        int prefixarr[]=new int[arr.length-1];
        prefixarr[0]=arr[0];
        int CurrentSum=0;
        int maxsum= Integer.MIN_VALUE;

        // calculating prefix subarray
        for(int i=1; i<arr.length; i++){
            prefixarr[i]= arr[i] + prefixarr[i-1] ;
        }
        PrintArr(prefixarr);
    }
    
    //Check is an array is Sorted or Not
    public static boolean IsSorted(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }


    // <=== Trapping rainwater=====>
    // Given n non-negative integer representing an evaluation map where the width of each bar is 1, compute how much water     it can trap after raining

    public static int TrappingRainwater(int arr[]){
        if(IsSorted(arr) || (arr.length<3)){
            return 0;
        }
        int TotalWater=0;

        int leftmax[]=new int[arr.length];
        leftmax[0]=arr[0];
        int Rightmax[]=new int[arr.length];
        Rightmax[arr.length-1]=arr[arr.length-1];

        //calculate leftmax
        for(int i=1; i<arr.length; i++){
            if(leftmax[i-1] < arr[i]){
                leftmax[i]=arr[i];
            }else{
                leftmax[i]=leftmax[i-1];
            }
        }

        //calculate RightMax
        for(int i=arr.length-2; i>=0; i--){
            if(Rightmax[i+1]<arr[i]){
                Rightmax[i]=arr[i];
            }else{
                Rightmax[i]=Rightmax[i+1];
            }
        }
        
        for(int i=0;i<arr.length; i++){
            int waterLevel = Math.min(leftmax[i], Rightmax[i]);
            TotalWater += waterLevel-arr[i];
        }
        return TotalWater;
    }


    //stock Prices = [7, 1, 5 ,3, 6, 4]
    // You are given stock on the ith day . You want to maximize your profit by choosing a single day to buy one stock and choosing a diffrent day in the future to sell that stock Return the maximum profit , if you do not achieve any profit then return 0

    public static int StockBuySell(int stock[]){
        int profit = 0;
        int buy = stock[0];
        
        for(int i=1; i<stock.length; i++){
            int sellingprice=stock[i];
            if(buy < sellingprice){
                int tempProf = sellingprice - buy;
                if(tempProf > profit){
                    profit = tempProf;
                }
            }
            else{
                buy = sellingprice;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
    
        // int arr[]={1,-2,-3,4,5,6,-7};
        //Find largest element
        // LargesMintNumArr(arr);

        //search element in sorted Array
        // System.out.println(BinarySearch(arr, 2));

        // ReveserArray(arr);
        // PrintArr(arr);
        // PrintSubArray(arr);

        // MaxSubArraySum(arr);

        // System.out.println(IsSorted(arr));


        // int Boundary[]={4,2,0,6,3,2,5};
        // System.out.println(TrappingRainwater(Boundary));

        // int stock[]={7, 1, 5 ,3, 6, 4};
        // System.out.println(StockBuySell(stock));


        int MaxSubarr[]={1, -2, 6, -1,3};
        MaxSumPrefixSubArr(MaxSubarr);

    }
}
