package easy;

public class PeakIndexInAMountainArray {

    public int peakIndexInMountainArray(int[] arr) {

        int l = 0;
        int r = arr.length-1;

        while(l<r){

            int m = (r+l)/2;

            if(arr[m]<arr[m+1]){
                l = m+1;
            }else{
                r = m;
            }
        }

        return l;

    }
}
