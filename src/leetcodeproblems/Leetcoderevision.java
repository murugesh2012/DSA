package leetcodeproblems;

public class Leetcoderevision {
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println("The length of the highest substring:"+longestSubstring(s));
    }

    private static String longestSubstring(String s) {
        int highestStringLength=0;
        String currentString="";
        String result="";
        for(int i=0;i<s.length();i++)
        {
            Character currentCharacter=s.charAt(i);
            if(currentString.indexOf(currentCharacter) !=-1)
            {
                currentString=currentString.substring(currentString.indexOf(currentCharacter)+1);
            }
            currentString+=currentCharacter;
            if(highestStringLength < currentString.length())
            {
                result=currentString;
            }
            highestStringLength=Math.max(highestStringLength,currentString.length());

        }
        return result;
    }

}
