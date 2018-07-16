class Excel
{
public static void main(String[] args)
{
Runtime rt =Runtime.getRuntime();
try
{
//rt.exec("notepad.exe");
rt.exec("C:\\Program Files (x86)\\Microsoft Office\\Office15\\EXCEL.EXE");
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("Hello");
}
}