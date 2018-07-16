#include<stdio.h>
#include<conio.h>
#include<dos.h>
void main()
{
char a[20],b[20],c;
int age,age2;
FILE *ff;
clrscr();
printf("enter the name and age");
gets(a);
scanf("%d",age);
ff=fopen("record.txt","w");
fprintf(ff,"%s\n%d",a,age);
fclose(ff);
printf("suceesfully saved");
delay(2000);
printf("enter the yes or no ");
scanf("%c",c);
if(c='y')
{
ff=fopen("record.txt","r");
fscanf(ff,"%s%d",&b,&age2);
printf("%s and %d",b,age2);
}
getch();
}