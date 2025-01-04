import java.util.*;
public class BOOK_ALLOCATION {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
	int nob=sc.nextInt();//no of books
	int nos=sc.nextInt();//no of student
	int [] page = new int[nob];
	for (int i = 0; i < page.length; i++) {
		page[i]=sc.nextInt();
		
	}
	System.out.println(min(page, nos));
}
}

public static int min(int [] page,int nos){
	int l=0;
	int h=0;
	for ( int i = 0; i < page.length; i++) {
		h+=page[i];
		
	}
	int ans=0;
	while(l<=h){
		int mid=(l+h)/2;
		if(isit(page,nos,mid)==true){
			ans=mid;
			h=mid-1;
		}
		else{
			l=mid+1;
		}
	}
	return ans;


}
public static boolean isit(int[] page,int nos,int mid ){
	int student=1;
	int readpage=0;
	for (int i = 0; i < page.length;) {
		if(readpage + page[i]<=mid){
			readpage +=page[i];
			i++;
		}
		else{
			student++;
			readpage=0;

		}
		if(student>nos){
			return false;
		}
		
	}

return true;
}
	
}

