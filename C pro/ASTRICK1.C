#include<stdio.h>
#include<conio.h>
void main()
{
int i,j;
clrscr();
for (i=1;i<=7;i=i+2)
{
for(j=1;j<=i;j++)
{
printf("*");
}
printf("\n");
}
getch();
}