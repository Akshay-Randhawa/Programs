#include<stdio.h>
#include<conio.h>
void main()
{
int i,j,k,s=4;
clrscr();
for(i=1;i>=9;i=i+2)
{
for(j=1;j>=s;j--)
{
printf(" ");
}
for(k=1;k<=i;j++)
{
printf("*");
}
printf("\n");
s--;
}
getch();
}


