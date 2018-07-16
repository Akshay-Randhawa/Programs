#include<iostream.h>
#include<conio.h>
void main()
{
clrscr();
cout<<"Enter The 4*4 matrix";
int a[4][4],sum=0;
for(int i=0;i<4;i++)
for(int j=0;j<4;j++)
cin>>a[i][j];
for(i=0;i<4;i++)
for(j=0;j<4;j++)
if(i!=j)
sum=a[i][j]+sum;
cout<<sum;
getch();
}