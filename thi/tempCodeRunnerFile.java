package thi;

public class a {
    public static void main(String[] args) {
    Solution sol = new Solution();
    
    int[] mang = {1, 5, 3, 5, 7};
    int k = 8;
    
    int ketQua = sol.capsobosung(mang, k);
    System.out.println(ketQua);   // Kết quả sẽ là 3
    System.out.println(sol.lengthOfLongestSubstring("abcabcbb"));  
    int[] score1 = {1, 0, 2};
    System.out.println(sol.chiakeo(score1));


}
}
