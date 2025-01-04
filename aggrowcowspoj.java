import java.util.* ;
public class aggrowcowspoj{
   
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
 
int t=sc.nextInt();
while(t>0){
int n=sc.nextInt();//no of  stalls
int c=sc.nextInt();//no of cows
int [ ] stall= new int [n];
for (int i = 0; i < stall.length; i++) {
    stall[i]=sc.nextInt();

}
Arrays.sort(stall);
System.out.println(largest(stall, c));
t--;
}



}
public static int largest(int[]stall,int c){
    int n=stall.length;
    int l=0;
    int h= stall[n-1]-stall[0];
    int ans =0;
    while (l<=h) {
        int mid=(l+h)/2;
        if(isitpossible(stall,c,mid)==true){
            ans=mid;
            l=mid+1;

        }
        else{
            h=mid-1;
        }
        
    }
    return ans;
}
public static boolean isitpossible(int[]stall,int c,int mid){
    int cow=1;
    int pos=stall[0];
    for (int i = 0; i < stall.length; i++) {
        if (stall[i]-pos>=mid) {
            cow++;
            pos=stall[i];
            
        }
        if (cow==c){
            return true;
        }
        
        
    }
    return false;

}
}



