#include<stdio.h>

int main()
{
   char str[80];
   char Command[4][20];

   int No1 = 0,No2 = 0;

   printf("Enter two numbers: \n");
   scanf("%d%d",&No1,&No2);

   printf("First number is : %d\n",No1);
   printf("Second number is : %d\n",No2);

   return 0;
}