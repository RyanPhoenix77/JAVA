import java.util.Scanner;
public class Student
 {
   private String name;
   private int age;
   public Student()
   {
   }
   public Student(String name, int age)
   {
      this.name = name;
      this.age = age;
   }
   public Student copyObject(Student std)
   {
      this.name = std.name;
      this.age = std.age;
      return std;
   }
   public void displayData()
   {
      System.out.println("Name : "+this.name);
      System.out.println("Age : "+this.age);
   }
   public static void main(String[] args) 
   {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter your name ");
      String name = sc.next();
      System.out.println("Enter your age ");
      int age = sc.nextInt();
      Student std = new Student(name, age);
      System.out.println("Contents of the original object");
      std.displayData();
      System.out.println("Contents of the copied object");
      Student copyOfStd = new Student().copyObject(std);
      copyOfStd.displayData();
   }
}