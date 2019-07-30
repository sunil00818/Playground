#include<stdio.h>
int main()
{
  int dia;
  float area,r,PI=3.14;
  scanf("%d",&dia);
  r=(float)dia/2;
  area=PI*r*r;
  printf("%.2f",area);
  return 0;
}