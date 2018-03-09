package q01_binarySearch;
/*
 递归方法先构造新的方法签名 a：数组， i：查找起始点 n：查找结束点 q：查找value
 1. mid>q, binary search left, return(arr,i,mid,q)
 2.mid<q, binary search right, return (arr,mid+1,j,q)
 3.mid+q, return true
 4. i=j arry empty, false
 */



public class Solution {

        public boolean contains(int[] arr, int value){
            return  binarySearchR(arr, 0 , arr.length, value);
        }

    private boolean binarySearchR(int[] a, int i, int j, int q) {
            if(i==j)//empty
            {
                return  false;
            }
            int mid=(i+(j-1))/2;
            if (a[mid]>q)//left
            {
                return binarySearchR(a,i,mid,q);
            }
            else if(a[mid]<q)//right
            {
                return binarySearchR(a,mid+1,j,q);
            }
            else if(a[mid]==q)
                return true;


        return false;

    }

}
