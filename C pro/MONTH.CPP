#include<iostream.h>
#include<conio.h>
void main()
{
int num;
clrscr();
cout<<"Enter The Number For The Month";
cin>>num;
switch(num)
{
case 1:
cout<<"Jan";
break;
case 2:
cout<<"Feb";
break;
case 3:
cout<<"March";
break;
default:
cout<<"Invalid";
}
getch();
}