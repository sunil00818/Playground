#include<stdio.h>
#include<math.h>
int main()
{
  float a,b,c,r1,r2,dt,real,img;
  scanf("%f%f%f",&a,&b,&c);
  dt=((b*b)-(4*a*c));
  if(dt>0)
  {
    r1 = (-b+sqrt(dt))/(2*a);
    r2 = (-b-sqrt(dt))/(2*a);
    printf("root1 = %.2f  root2 = %.2f",r1,r2);
  }
  else if(dt==0)
 {
  r1 = r2 = -b/(2*a);
  printf("root1 = %.2f  root2 = %.2f",r1,r2);
 
 }
  else
  {
    real = -b/(2*a);
    img = sqrt(-dt)/(2*a);
    printf("root1 = %.2f + %.2fi  root2 = %.2f - %.2fi",real,img,real,img);
  }
  return 0;
 }