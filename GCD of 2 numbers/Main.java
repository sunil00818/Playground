#include <stdio.h>
int main()
{
  int num1,num2,small,i;
  scanf("%d%d",&num1,&num2);
  small=num1>num2?num1:num2;
  for(i=small;i>-1;i--)
  {
    if(num1%i==0 && num2%i==0)
    {
      printf("%d",i);
      break;
    }
  }
   
   return 0;
}