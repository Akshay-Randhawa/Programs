#include<stdio.h>
#include<conio.h>
void main()
{
char a[20];
int age;
FILE *ff;
clrscr();
printf("enter the name and age");
gets(a);
scanf("%d",age);
ff=fopen("record.txt","w");
fprint(ff,"%s\n%d",name,age);
fclose(ff);
printf("suceesfully saved");
getch();
}