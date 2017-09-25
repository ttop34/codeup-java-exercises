public class Person {
    public static void main(String[] args) {
        Person person = new Person("Elvin");
        person.sayHello();


    }

    private String Name;

    public Person(String aName){
        Name = aName;
    }

    public String getName(){
        return Name;
    }

    public void setName(String name){
         Name = name;
        System.out.println(name);
    }

    public void sayHello(){
        System.out.println("Hello " + Name);
    }

}
