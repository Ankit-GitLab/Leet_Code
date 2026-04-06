class Solution {
    public int[] answerQueries(int[] arr, int[] queries) {
        int n = arr.length;
        int m = queries.length;
        int[] ans = new int[m];

        Arrays.sort(arr);

        // prefix sum
        for(int i = 1; i < n; i++){
            arr[i] += arr[i-1];
        }

        for(int i = 0; i < m; i++){
            int q = queries[i];
            ans[i] = upperBound(arr, q);
        }

        return ans;
    }

    private int upperBound(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        int res = -1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] <= target){
                res = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return res + 1; // length
    }
}