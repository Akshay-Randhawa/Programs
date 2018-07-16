#include<iostream.h>
#include<conio.h>
class student
{
int rollno,age;
char name[20],course[10];
public:
void input()
{
 cout<<"Enter the Roll no,name,age,course";
 cin>>rollno>>name>>age>>course;
 }
void print()
{
cout<<rollno<<name<<age<<course<<endl;
}
}a[5];
void main()
{
clrscr();
for(int i=0;i<5;i++)
{
a[i].input();
}
for(i=0;i<5;i++)
{
a[i].print();
}
getch();
}