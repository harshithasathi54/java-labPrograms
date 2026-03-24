import java.util.*;
class Student implements Comparable<Student>
{
int id;
String name;
Student(int id, String name)
{
this.id = id;
this.name = name;
}
public int compareTo(Student s)
{
return this.id - s.id;
}
public static void main(String args[])
{
ArrayList<Student> li= new ArrayList<>();
li.add(new Student(3,"Harshitha"));
li.add(new Student(1, "Laikya"));
li.add(new Student(2,"Bhavya"));
li.add(new Student(4, "Mini"));
Collections.sort(li);
for( Student s : li)
{
System.out.println(s.id+ " " +s.name);
}
}
}
