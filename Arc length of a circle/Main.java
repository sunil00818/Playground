#include<stdio.h>
int main()
{
  float angle,r,len;
  scanf("%f%f",&angle,&r);
  len=2*3.14*r*(angle/360);
  printf("%.2f",len);
  return 0;
}