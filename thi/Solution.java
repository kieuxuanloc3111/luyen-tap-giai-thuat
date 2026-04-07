package thi;
import java.util.Arrays;
import java.util.HashMap;
public class Solution {
    
    public int capsobosung(int[] n, int k) {
        
        if (n == null || n.length < 2) {
            return 0;
        }
        
        HashMap<Long, Integer> map = new HashMap<>();
        
        long soLuongCap = 0;
        
        for (int i = 0; i < n.length; i++) {
            
            long canTim = (long)k - n[i];
            
            if (map.containsKey(canTim)) {
                soLuongCap += map.get(canTim);
            }
            

            long soHienTai = n[i];
            
            if (map.containsKey(soHienTai)) {
                int soLanCu = map.get(soHienTai);
                map.put(soHienTai, soLanCu + 1);
            } else {
                map.put(soHienTai, 1);
            }
        }
        
        return (int) soLuongCap;
    }

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        HashMap<Character, Integer> lastindex = new HashMap<>();
        int left= 0 ;
        int maxLength = 0;

        for(int right=0 ; right<s.length() ; right++) {
            char kytuhientai = s.charAt(right);

            if (lastindex.containsKey(kytuhientai) && lastindex.get(kytuhientai) >= left) {
                left = lastindex.get(kytuhientai) + 1;
            }

            lastindex.put(kytuhientai,right );
        
            int dodaihientai = right - left + 1;
            maxLength = Math.max(maxLength, dodaihientai);

        }
        return maxLength;
    }

    public int chiakeo(int[] score){
        if (score == null || score.length == 0) {
            return 0;
        }

        int n= score.length;
        int[] candy = new int[n];

        for(int i=0; i<n; i++) {
            candy[i] = 1;
        }

        for(int i=1;i <n; i++) {
            if(score[i] > score[i-1]) {
                candy[i] = candy[i-1] + 1;
            }
        }

        for (int i=n-2;i<=0; i--){
            if(score[i]> score[i+1]) {
                candy[i] = Math.max(candy[i], candy[i+1] + 1);
            }
        }

        long total = 0;
        for (int c : candy) {
            total += c;
        }
        
        return (int) total;
    }
}