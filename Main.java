import java.util.Scanner;

class Main 
{
  public static Person[] p = new Person[3];
  public static void main(String[] args) 
  {
    func1();
    for(int i = 0; i < 3; i++)
    {
      p[i].print();
    }
  }

  public static void func1()
  {
    Scanner input = new Scanner(System.in);
    for(int i = 0; i < 3; i++)
    {
      System.out.println("ENTER PERSON DATA");
      input = new Scanner(System.in);
      String name = input.nextLine();
      String second_name = input.nextLine();
      int age = input.nextInt();
      p[i] = new Person(name, second_name, age);
    }
  }
}

class Person
{
  String name;
  String second_name;
  int age;

  public Person(String name1, String second_name1, int age1)
  {
    name = name1;
    second_name = second_name1;
    age = age1;
  }

  public void print()
  {
    System.out.println("PERSON DATA{name: " + name + "; second_name: " + second_name + "; age: " + age + "}");
  }
}
