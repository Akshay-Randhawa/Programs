#include<stdio.h>
#include<conio.h>
void main()
{
int x=10,*y;
y=&x;
clrscr();
printf("%u",y);
printf("\n%d",*y);
printf("\n%d",*&x);
getch();
}