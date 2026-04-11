class Solution {
    public int maxSatisfied(int[] arr, int[] grumpy, int k) {
    int n = arr.length;
    
    int base = 0;
    for (int i = 0; i < n; i++) {
        if (grumpy[i] == 0) {
            base += arr[i];
        }
    }

    int extra = 0;
    for (int i = 0; i < k; i++) {
        if (grumpy[i] == 1) {
            extra += arr[i];
        }
    }

    int maxExtra = extra;

    for (int i = k; i < n; i++) {
        if (grumpy[i] == 1) {
            extra += arr[i];
        }
        if (grumpy[i - k] == 1) {
            extra -= arr[i - k];
        }
        maxExtra = Math.max(maxExtra, extra);
    }

    return base + maxExtra;
}
}