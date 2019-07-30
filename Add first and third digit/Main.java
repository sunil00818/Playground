#include <stdio.h>
 
int main()
{
    int num, last,c;
    scanf("%d", &num);
    last = num%10;
    while(num>=10)
    {
        num = num/10;
    }
  c=last+num;
  printf("%d",c);
  return 0;
}