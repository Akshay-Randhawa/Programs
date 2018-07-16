#include<stdio.h>
#include<conio.h>
void main()
{
int n,a[10],i=0,j;
clrscr();
puts("enter the number =");
scanf("%d",&n);
while(n>0)
{
a[i++]=n%2;
n=n/2;
}
for(j=i-1;j>0;j--)
{
printf("%d",a[j]);
}
getch();
}
