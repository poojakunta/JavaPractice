class MultiDimensionArrays
{

public static void main(String[] args)
{

int matrix[][] = { {5,7,9} ,{8, 6, 11} ,{15,21,19} };

int sum=0;

for(int row = 0; row < 3 ; row ++)
{

for(int column=0 ; column < 3 ; column++)
{ 
		
sum = sum + matrix[row][column];
}
}
System.out.println("Sum is : "+sum);
}
}