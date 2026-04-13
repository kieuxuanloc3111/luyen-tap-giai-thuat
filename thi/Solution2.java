package thi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class Solution2 {
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
        return result;
    }
    public int[] mergeTwoSortedArrrays(int[] arr1 , int[] arr2){
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
            
        }
    }
    // public static String mostFrequentWord(String sentence) {
    //     if (sentence == null || sentence.trim().isEmpty()) {
    //         return "";
    //     }
        
    //     String[] words = sentence.toLowerCase().split(" ");
    //     System.out.println("Words: " + java.util.Arrays.toString(words));
    //     Map<String, Integer> map = new LinkedHashMap<>();
    //     int maxCount = 0;
    //     String result = "";
        
    //     for (String word : words) {
    //         String cleaned = word;
    //         System.out.println(cleaned);
    //         if (cleaned.isEmpty()) continue;
            
    //         int count = map.getOrDefault(cleaned, 0) + 1;
    //         map.put(cleaned, count);
    //         System.out.println(cleaned + ": " + count);
            
    //         if (count > maxCount) {
    //             maxCount = count;
    //             result = cleaned;
    //         }
    //     }
    //     System.out.println("Final Map: " + map);
    //     return result;
    // }
    public static void main(String[] args) {

        

        String sentence = "the cat sat on the mat";
        System.out.println(mostFrequentString(sentence));  // the
    }
}
