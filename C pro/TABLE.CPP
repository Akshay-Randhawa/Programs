#include<iostream.h>
#include<conio.h>
#include<iomanip.h>
class table
{
int n;
public :
void input()
{
cout<<"enter the number";
cin>>n;
}
void print();
}t;
void table :: print()
{
for(int i=1;i<10;i++)
cout<<setw(10)<<n*i<<endl;
}
void main()
{
clrscr();
t.input();
t.print();
getch();
}