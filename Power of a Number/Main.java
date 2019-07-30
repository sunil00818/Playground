#include <stdio.h>
int main()
{
  	int base,ans=1,exp,i;
    scanf("%d%d",&base,&exp);
    if(exp>=0)
    {
      for(i=1;i<=exp;i++)
      {
        ans=ans*base;
      }
      printf("%d",ans);
    }
    else
    {
      printf("Wrong input");
    }

    return 0;
}