// import java.util.*;
public class arraycc1{
	public static void update(int marks[],int nonchangeble){
		nonchangeble=10;
		for(int i=0;i<marks.length;i++){
			marks[i]=marks[i]+1;
		}
		System.err.println("val="+nonchangeble);
	}
public static void main(String args[])
{
	int marks[]={98,95,91};
	int nonchangeble=5;
	update(marks,nonchangeble);
	for(int i=0;i<marks.length;i++){
		System.out.print(marks[i]+" ");
	}
	System.out.println();
	System.err.println("Non Changeable value="+nonchangeble);
}
}