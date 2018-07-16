#include<stdio.h>
#include<conio.h>
int main()
{
int i,j,k,s=4;
clrscr();
for(i=1;i<=9;i=i+2)
{
for(k=1;k<=s;k++)
{
printf(" ");
}
for(j=1;j<=i;j++)
{
printf("*");
}
printf("\n");
s--;
}
s=1;
for(i=7;i>=1;i=i-2)
{
for(k=1;k<=s;k++)
{
printf(" ");
}
for(j=1;j<=i;j++)
{
printf("*");
}
printf("\n");
s++;
}
getch();
}