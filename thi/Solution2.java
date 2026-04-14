package thi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class Solution2 {
    int a=0;
    public int binarySearch(int[] nums, int target) {

        if (nums == null || nums.length == 0) {
            return -1;
        }
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;   // Tránh tràn số
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1; // Không tìm thấy
    }
    public static String mostFrequentString(String sentence){
        if(sentence == null || sentence.trim().isEmpty()){
            return "";
        }
        String[] words = sentence.toLowerCase().split(" ");
        Map<String, Integer> map = new LinkedHashMap<>();
        int maxCount = 0;
        String result = "";
        for(String word:words){
            String cleaned = word;
            if(cleaned.isEmpty()) continue;
            int count = map.getOrDefault(cleaned, 0) +1;
            map.put(cleaned, count);
            if(count > maxCount){
                maxCount = count;
                result = cleaned;
            }
        }
        System.out.println("Word frequencies: " + map);
        return result;
    }
    public static int[] mergeTwoSortedArrrays(int[] arr1 , int[] arr2){
        if (arr1 == null){
            if (arr2 != null){
                return arr2.clone();
            }
            return new int[0];
        }
        if (arr2 == null){
            return arr1.clone();
        }
        int[] mergerd = new int[arr1.length + arr2.length];
        int i =0, j=0 , k = 0 ;
        while(i< arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                mergerd[k++] = arr1[i++];
            }else{
                mergerd[k++] = arr2[j++];
            }
        }
        // Copy any remaining elements from either array
        while(i < arr1.length){
            mergerd[k++] = arr1[i++];
        }
        while(j < arr2.length){
            mergerd[k++] = arr2[j++];
        }
        return mergerd;
    }

    public static void main(String[] args) {

        String sentence = "the cat sat on the mat";
        System.out.println(mostFrequentString(sentence));  // the

        int[ ] arr1 = {1, 3, 5};
        int[ ] arr2 = {2, 4, 6};
        int[] merged = mergeTwoSortedArrrays(arr1, arr2);
        System.out.println(java.util.Arrays.toString(merged));
    }
}
