package org.junit;

public class StringUtils {

    public String reverse(String s){
        String ans="";
        for(int i=0;i<s.length();i++)
            ans=s.charAt(i)+ans;

        return ans;
    }

    public boolean isPlaindrome(String s){
        String reverse=reverse(s);
        return s.equals(reverse);
    }

    public String toUpperCase(String s){
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=97 && s.charAt(i)<=122)
                ans+=(char)(s.charAt(i)-32);
            else
                ans+=s.charAt(i);
        }

        return ans;
    }
}
