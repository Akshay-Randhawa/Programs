#include<iostream.h>
#include<conio.h>
void main()
{
clrscr();
cout<<"Enter the First Array Of 5 =";
int a[5],b[5];
for(int i=1;i<6;i++)
cin>>a[i];
cout<<"Enter the Second Array Of 5 =";
for(int j=1;j<6;j++)
cin>>b[j];
cout<<"Addition"<<endl;
for(i=1;i<6;i++)
{
int c[5];
 c[i]=a[i]+b[i];
 cout<<c[i]<<endl;
 }
 getch()
 }