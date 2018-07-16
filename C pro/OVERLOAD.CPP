#include<iostream.h>
#include<conio.h>
void area(float r)
{
cout<<"Area Of the Circle ="<<3.14*r*r<<endl;
}
void area(float l,float b)
{
cout<<"Area Of The Rectangle ="<<l*b<<endl;
}
void main()
{clrscr();
float l,b,r;
cout<<"enter the lbr";
cin>>l>>b>>r;
area(l,b);
area(r);
getch();
}