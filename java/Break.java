class Break{
public static void main(String[] args){
Boolean t=true;
first:
{
second:
{
third:
{
System.out.println("before the break");
if(t) 
System.out.println("this won't execute");
}
System.out.println("this won't execute");
}

System.out.println("this is after a second break");
}
}
}