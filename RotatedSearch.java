public class RotatedSearch {
    public int bsearch (int a[], int key)
    {
        int low=0;
        int height=a.length-1;
        while(low <= height)
        {
            int mid = (low+height)/2;
            if (a[mid] == key)
            {
                return mid;
            }
            if (a[low] < a[mid])
            {
                if(key >= a[low] && key< a[mid])
                {
                    height=mid-1;
                }
                else
                {
                    low = mid + 1;
                }
            }
            else
            {
                if (key > a[mid] && key<=a[height])
                {
                    low=mid+1;
                }
                else{
                    height = mid-1;
                }

            }

        }
        return -1;
    }
    public static void main(String args[])
    {
        RotatedSearch ob = new RotatedSearch();
        int arr[] = { 20, 30, 40, 50, 60, 5, 10 };
        int n = arr.length;
        int key = 10;
        int result = ob.bsearch(arr,key);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
    }
}
