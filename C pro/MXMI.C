#include<iostream.h>
#include<conio.h>
void main()
{
int a,b,c,max,mini;
clrscr();
cout<<"Enter Three Numbers =" ;
cin>>a>>b>>c;
if(a>b&&a>c)
cout<<"Max ="<<a;
else if(b>c&&b>a)
cout<<"Max ="<<b;
else
cout<<"Max ="<<c;
if(a<b&&a<c)
cout<<"Mini ="<<a;
else if(b<a&&b<c)
cout<<"Mini ="<<b;
else
cout<<"Mini ="<<c;
getch();
}