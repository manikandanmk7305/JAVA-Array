1.Maximum Element in an Array:

You are playing the PUBG game and you entered into the Bootcamp. There you viewed the drop box which was filled with guns. 
you have to choose the biggest gun in the drop box. Find the biggest gun and you will get the chicken dinner. Input Format: 
Input consists of n+1 integers. The first integer corresponds to ‘n’ , the size of the array. The next ‘n’ integers correspond 
to the elements in the array. Assume that the maximum value of n is 15. Output Format: Refer sample output for details.
Example 1:

Input: 

 
5

2

3

6

8

1


Output:

8 is the maximum element in the array

Code:
 import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int n,a[]=new int[100],i,j,max=0;
    n=in.nextInt();
    for(i=0;i<n;i++)
      a[i]=in.nextInt();
    for(i=0;i<n;i++){
      for(j=i+1;j<n;j++){
        if(a[j]>max)
          max=a[j];
      }
    }
    System.out.print(max+" is the maximum element in the array");
  }
}
