package kousi.variables;

public class Counter1{
static int count=0;
int c=0;

public static void inc()
{
count++;
System.out.println(count);
}

public void inc1()
{
c++;
System.out.println(c);
}

public static void main(String args[])
{
Counter1 c1=new Counter1();
Counter1 c2=new Counter1();
Counter1 c3=new Counter1();
c1.inc();
c2.inc();
c3.inc();

c1.inc1();
c2.inc1();
c3.inc1();
}
}
