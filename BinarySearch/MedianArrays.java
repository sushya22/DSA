package BinarySearch;

public class MedianArrays {

    public static void findMedianBrute(int[] arr1,int[] arr2)
    {
        int[] result = new int[arr1.length+arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<=arr2[j])
            {
                result[k]=arr1[i];
                i++;
                k++;
            }
            else
            {
               result[k]=arr2[j];
               j++;
               k++;
            }
        }
        
        System.out.println(result.length%2!=0?(double)result[result.length/2]:(double)((double)result[(result.length/2)]+(double)result[(result.length/2 - 1)])/(double)2);
        
    }

    public static void findMedianBetter(int[] arr1,int[] arr2)
    {
        int n = arr1.length+arr2.length;
        int el1index = n/2;
        int el2index = n/2 - 1;
        int el1 = 0;
        int el2 = 0;
        int i = 0;
        int j = 0;
        int counter = 0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<=arr2[j])
            {
               if(counter==el1index)
               {
                 el1 = arr1[i];
               }
               if(counter==el2index)
               {
                el2 = arr1[i];
               }
               counter++;
               i++;
            }
            else
            {
               if(counter==el1index)
               {
                 el1 = arr2[j];
               }
               if(counter==el2index)
               {
                el2 = arr2[j];
               }
               counter++;
               j++;
            }
        }

        while(i<arr1.length)
        {
            if(counter==el1index)
               {
                 el1 = arr1[i];
               }
               if(counter==el2index)
               {
                el2 = arr1[i];
               }
               counter++;
               i++;
        }

        while(j<arr2.length)
        {
            if(counter==el1index)
               {
                 el1 = arr2[j];
               }
               if(counter==el2index)
               {
                el2 = arr2[j];
               }
               counter++;
               j++;
        }
        
        System.out.println(n%2!=0?(double)el1:((double)el1+(double)el2)/(double)2);
    }

    public static double findMedianOpt(int[] arr1,int[] arr2)
    {
        int n1 = arr1.length;
        int n2 = arr2.length;
        if(n1>n2) 
        {
            return findMedianOpt(arr2,arr1);
        }
        int left = 0;
        int right = n1;
        int total = (n1+n2+1)/2;
        while(left<=right)
        {
            int mid1 = (left+right)/2;
            int mid2 = total - mid1;
            int l1 = mid1>0?arr1[mid1-1]:Integer.MIN_VALUE;
            int l2 = mid2>0?arr2[mid2-1]:Integer.MIN_VALUE;
            int r1 = mid1<n1?arr1[mid1]:Integer.MAX_VALUE;
            int r2 = mid2<n2?arr2[mid2]:Integer.MAX_VALUE;
            if(l1<=r2 && l2<=r1)
            {
                return (n1+n2)%2==0? ((double)((double)Math.max(l1,l2))+(double)(Math.min(r1,r2)))/2.0:(double) Math.max(l1,l2);
                
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr1 = new int[]{2,4,6};
        int[] arr2 = new int[]{1,3,5};
        System.out.println(findMedianOpt(arr1,arr2));
    }   
}
