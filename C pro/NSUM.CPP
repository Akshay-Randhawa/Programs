#include<iostream.h>
#include<conio.h>
void main()
{
int i,num,sum =0;
clrscr();
cout<<"Enter The Number From 1 to N For Its Sum =";
cin>>num;
for(i=1;i<=num;i++)
{
sum=sum+i;
}
cout<<"Sum ="<<sum;
getch();
}
