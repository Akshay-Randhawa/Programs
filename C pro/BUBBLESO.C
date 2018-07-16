#include<stdio.h>
#include<conio.h>
void main()
{
int a[4]={20,5,70,2};
int i,j,t;
clrscr();
for(i=0;i<=3;i++)
{
for(j=0;j=3-i;j++)
{
if(a[j]>a[j+1])
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
for(i=0;i<4;i++){
printf("%d \n",a[i]);}
getch();
}