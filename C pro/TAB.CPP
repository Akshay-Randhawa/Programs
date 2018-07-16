#include<iostream.h>
#include<conio.h>
void main()
{
int i,num;
clrscr();
cout<<"Enter The Number For The Table";
cin>>num;
for(i=1;i<11;i++)
cout<<num<<"*"<<i<<"="<<i*num<<endl;
getch();
}
