#include<stdio.h>
int main()
{
  int num,last,second;
  scanf("%d",&num);
  last=num%100;
  second=last;
  second=last/10;
  printf("%d",second);
  return 0;
}