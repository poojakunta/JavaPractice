class FibonacciSeries
{
public static int fibonacci(int n)
{
if(n==0 )
{
return 0;
}

else if(n==1 || n==2)
{
return 1;
}
else
{
return (fibonacci(n-1)+fibonacci(n-2));

}

}
public static void main(String args[])
{
int number = 10;
System.out.println("Fibonacci Series using recursion: ");
for(int i = 0; i < number; i++){
System.out.print(fibonacci(i)+" ");
}
}
}
