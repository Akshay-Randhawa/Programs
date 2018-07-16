#include<stdio.h>
#include<conio.h>
void main()
{
int num;
clrscr();
printf("enter the number ");
scanf("%d",&num);
if(num%2==0)
printf("it is not prime");
else
printf("its a prime");
getch();
}