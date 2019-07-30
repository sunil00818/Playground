#include<stdio.h>
int main()
{
  int num,n,c,a,b,n1;
  scanf("%d",&num);
  n=num%10;
  a=n;
  n1=num/10;
  b=n1;
  c=a+b;
  printf("%d",c);
  return 0;
}