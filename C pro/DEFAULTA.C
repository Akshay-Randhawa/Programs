#include<iostream.h>
#include<conio.h>
void volume(int l, int b ,int h=20)
{
cout<<"volume ="<<l*b*h;
}
void main()
{
clrscr();
int v;
volume(10,5,30);
volume(5,7);
getch();
}