//wap to search the element in rotated sorted array
public class three 
{
    public static int search(int arr[],int target,int si,int ei)
    {
        // base case
        if(si > ei)
        {
            return -1;
        }
        int mid=si+(ei-si)/2;
        //case found

        if(arr[mid] == target)
        {
            return mid;
        }
        //for mid on  line 1
        if(arr[si] <=arr[mid])
        {
            
            if(arr[si]<=target && target<=arr[mid])
            {
                //case a-left side
                return search(arr, target, si, mid-1);
            }
            else{
                //case b- right side
                return search(arr, target, mid+1, ei);
            }

        }
        else
        {
            if(arr[mid]<= target && target<=arr[ei])
            {
                //case c- mid right side
                return search(arr, target, mid+1, ei);
            }
            else{
                //case d- mid left side
                return search(arr, target, si, mid-1);
            }

        }

    }
    
    public static void main(String[]args)
    {
        int arr[]={4,5,6,7,0,1,2};
        int target=6;
        //int tragetidx=search(arr, target, 0, arr.length-1);
        //System.out.println(tragetidx);
       System.out.println(search(arr, target, 0, arr.length-1)); 
    }
    
}
