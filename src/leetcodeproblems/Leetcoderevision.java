package leetcodeproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Leetcoderevision {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("The length of the highest substring:" + longestSubstring(s));
        //https://leetcode.com/problems/3sum/description/
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(find3Sum(nums));

        //https://leetcode.com/problems/valid-parentheses/description/
        String parenthesesString = "([]{{}[]})";
        System.out.println(validParentheses(parenthesesString));
        //https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
        int[] inputDuplicateArray={1,1,2};
        System.out.println(removeDuplicateFromSortedArray(inputDuplicateArray));
        //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
        int[] findFirstAndLast={5,7,7,8,8,10};int target=8;
        System.out.println(findFirstAndLastElement(findFirstAndLast,target));
        //https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
        int[] buyPrices={1,2,3,4,5};
        System.out.println(bestDaytoBuyAndSell(buyPrices));
        System.out.println(maxProfit(buyPrices));

    }

    private static int maxProfit(int[] buyPrices) {
        int maxProfit = 0;
        int currMin = Integer.MAX_VALUE;
        int totalProfit=0;
        for (int price : buyPrices) {
            if (price < currMin) currMin = price;
            else
            {
                maxProfit = Math.max(maxProfit, price - currMin);
                totalProfit+=maxProfit;
                maxProfit=0;
                currMin=price;
            }}

        return totalProfit;
    }

    private static int bestDaytoBuyAndSell(int[] buyPrices) {
        int noOfDays=buyPrices.length;
        int start=0,next,maxProfit=0;
        while(start<noOfDays-1)
        {
            for(next=start+1;next<noOfDays-1;next++)
            {
                maxProfit=Math.max(maxProfit,buyPrices[next]-buyPrices[start]);
            }
            start++;
        }
        return maxProfit;
    }

    private static int[] findFirstAndLastElement(int[] findFirstAndLast, int target) {
        int[] result=new int[2];
        result[0]=findRange(findFirstAndLast,target,true);
        result[1]=findRange(findFirstAndLast,target,false);
        return result;
    }
    static int findRange(int[] nums, int target, boolean findStartIndex) {
        int start = 0;
        int end = nums.length - 1;
        int result = -1;
        while (start <= end) {
            int mid=start+(end-start)/2;
            if(target > nums[mid])
            {
                start=mid+1;
            } else if(target < nums[mid])
            {
                end=mid-1;
            } else if(target == nums[mid])
            {
                result=mid;
                if(findStartIndex)
                {
                    end=mid-1;
                }else
                {
                    start=mid+1;
                }
            }
        }
        return result;
        }

    private static int removeDuplicateFromSortedArray(int[] nums) {
        int length=nums.length;
        int start=0,right=start+1;
        if(length<=0) return 0;
        int count=1;
        while(right<=length-1)
        {
            if(nums[start]!=nums[right])
            {
                start++;
                nums[start]=nums[right];
            }
            right++;
        }
        return start+1;
    }

    private static boolean validParentheses(String parenthesesString) {
        Stack<Character> result = new Stack<>();
        for (char c : parenthesesString.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                result.push(c);
            } else {

                if (result.isEmpty()) return false;
                char tempChar = result.pop();
                if (c == ')' && tempChar != '(') {
                    return false;
                } else if (c == ']' && tempChar != '[') {
                    return false;
                } else if (c == '}' && tempChar != '{') {
                    return false;
                }

            }
        }
        return result.isEmpty();

    }

    private static String longestSubstring(String s) {
        int highestStringLength = 0;
        String currentString = "";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            Character currentCharacter = s.charAt(i);
            if (currentString.indexOf(currentCharacter) != -1) {
                currentString = currentString.substring(currentString.indexOf(currentCharacter) + 1);
            }
            currentString += currentCharacter;
            if (highestStringLength < currentString.length()) {
                result = currentString;
            }
            highestStringLength = Math.max(highestStringLength, currentString.length());

        }
        return result;
    }

    private static List<List<Integer>> find3Sum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int length = nums.length;
        if (length <= 0) return result;
        for (int i = 0; i < length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                }
            }
        }
        return result;
    }

}
