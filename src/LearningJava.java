public class LearningJava {
    public static void main(String[] args)
    {
        String str="Murugesh";
        String str1=str;
        System.out.println(str==str1);
        str="Murugesh";
        System.out.println(str);
        System.out.println(str1.charAt(0));
        System.out.println(str1.toCharArray());
        for(char ch:str1.toCharArray())
        {
            System.out.print("\n"+ch);
        }
        System.out.println(str==str1);

    }
}
