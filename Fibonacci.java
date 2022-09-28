class Fibonacci
{
public static void main(String args[])
{
int i=0,j=1,k,count=10;
   
System.out.print("The List of Fibonacci Series is: "+i+" "+j);
 
for(int n=2; n<count; n++)
{    
k=i+j;    
System.out.print(" "+k);    
i=j;    
j=k;    
} 
}
}
  