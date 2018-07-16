#include<iostream.h>
#include<conio.h>
void main()
{
clrscr();
cout<<"Enter The 5 Elements = ";
int a[5],i;
for(i=0;i<5;i++)
cin>>a[i];
for(i=0;i<5;i++)
cout<<"a["<<i<<"] = "<<a[i]<<endl;
getch();
}