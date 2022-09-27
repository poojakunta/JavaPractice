class Arrays
{
public static void main(String[] args){


int nums[]={2,6,8,10,15,20};

System.out.println("Length : "+nums.length);

int sum=0;

for(int i=0 ;i <nums.length;i++){
sum = sum + nums[i];
}
System.out.println("Sum is :"+sum);


}
}