import java.util.*;
public class playing_with_good_string {
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        String s=l.next();
        System.out.println(vowel(s));
    }
    public static int vowel(String s){
int ans =0;
int c=0;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(isvowel(ch)){
                c++;
            }
            else{
                ans=Math.max(ans,c);
                c=0;

            }
    
}
ans=Math.max(c,ans);
return ans;
    }
    public static boolean isvowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
}
