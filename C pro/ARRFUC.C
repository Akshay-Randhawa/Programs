#include<stdio.h>
#include<conio.h>
void display(int a[])
{
int i ;
for(i=0;i<5;i++)
{
if (a[i]%2==0)
printf("%d\n",a[i]);
}
}
void main()
{
int a[5]={2,5,6,1,4};
clrscr();
display(a);
getch();
}