public class PrefixSumArray {
    public static int[] constructPrefixSumArray(int[] arr) {
        int[] prefixSum = new int[arr.length];
        
        
        prefixSum[0] = arr[0];
        
      
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        
        return prefixSum;
    }

  
    }
}
