public class reverse_words_in_String {

    public static void main(String[] args) {
        String s="     hello   world   bye    indian cows";
        s.trim();
        String[]arr=s.split("\s+");
        String ans="";
        for (int i = arr.length-1; i>=0; i--) {
            ans+=arr[i]+" ";
            
        }
        System.out.println(ans.trim());
    }
}