package thi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution34 {
    public static List<String> fizzBuzz(int n){
        List<String> result = new ArrayList<>();
        for(int i=1; i<=n ; i ++){
            if(i%3 ==0 && i%5 ==0){
                result.add("FizzBuzz");
            }else if(i%3 ==0){
                result.add("Fizz");
            }else if(i%5 ==0){
                result.add("Buzz");
            }else{
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
    public static Map<String,List<Integer>> classifyNumbers(List<Integer> numbers){
        Map<String, List<Integer>> result = new HashMap<>();
        result.put("negative", new ArrayList<>());
        result.put("zero", new ArrayList<>());
        result.put("positive", new ArrayList<>());

        for(int num:numbers){
            if(num < 0){
                result.get("negative").add(num);}
                else if(num == 0 ){
                    result.get("zero").add(num);
                }
                else{
                    result.get("positive").add(num);
                }
            }
            return result;
        }
    public static int[] getPositiveNumbers(int[] arr){
        if(arr == null || arr.length ==0) return new int[0];
        List<Integer> positives = new ArrayList<>();
        for(int num: arr){
            if(num > 0) positives.add(num);
        }
        int[] result = new int[positives.size()];
        for(int i=0; i< positives.size();i++){
            result[i]= positives.get(i);
        }
        return result;
    }
    public static Map<Character,Integer> countCharacterOccurrences(String str){
        Map<Character, Integer> charCount = new HashMap<>();
        for(char c: str.toLowerCase().toCharArray()){
            charCount.put(c, charCount.getOrDefault(c, 0)+1);
        }
        return charCount;
    }
    
    public static void main(String[] args) {
        System.out.println(fizzBuzz(5));
        List<Integer> numbers = List.of(-3, -2, -1, 0, 1, 2, 3);
        Map<String, List<Integer>> classified = classifyNumbers(numbers);
        System.out.println(classified);
    String s = "internship";
    System.out.println(s.length());
    System.out.println(s.indexOf("ship"));
    System.out.println(s.toUpperCase().substring(0, 6));
    }   
}

