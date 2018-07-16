#include<iostream.h>
#include<conio.h>
#include<iomanip.h>
class college
{
int rno,m1,m2,m3,tm;
float per;
char grade;
public:
void input()
{
cout<<"enter the roll no. ,m1,m2,m3";
cin>>rno>>m1>>m2>>m3;
tm=m1+m2+m3;
per=tm*3/100;
if(per=>80)
grade='a';
else if(per=>70)
grade='b';
else if(per=>60)
grade='c';
else if(per=>50)
grade='d';
else
grade ='f';
}
void result()
{
cout<<setw(10)<<rno<<setw(10)<<m1<<setw(10)<<m2<<setw(10)<<m3<<setw(10)<<tm<<setw(10)<<per<<setw(10)<<grade<<endl;
}
}c[5];
void main()
{
for(int i=0;i<5;i++)
{
c[i].input();
}
for(i=0;i<5;i++)
{
c[i].result();
}
getch();
}