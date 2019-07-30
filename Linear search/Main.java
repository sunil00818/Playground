#include<stdio.h>
 main()
 {
   int array[100], search, c, number;
   scanf("%d",&number);
   for ( c = 0 ; c < number ; c++ )
     scanf("%d",&array[c]);
   scanf("%d",&search);
   for ( c = 0 ; c < number ; c++ )
   {
     if ( array[c] == search ) 
     {
       printf("%d", c+1);
       break;
     }
   }
   if ( c == number )
     printf("%d isn't present in the array.\n", search);
   return 0;
 }