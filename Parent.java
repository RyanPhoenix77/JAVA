class Parent
{
    int value = 1000;
    Parent()
    {
        System.out.println("Parent Constructor");
    }
}
 
class Child extends Parent
{
    int value = 10;
    Child()
    {
        System.out.println("Child Constructor");
    }
}
class Test
{
    public static void main(String[] args)
    {
        Child obj=new Child();
        System.out.println("Reference of Child Type :"
                           + obj.value);
        Parent par = obj;
        System.out.println("Reference of Parent Type : "
                           + par.value);
    }
}