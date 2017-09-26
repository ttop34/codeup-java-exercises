public class Person {
    public static void main(String[] args) {
        Person person = new Person("Elvin");
        person.setName("Jamar");


    }

    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }


    public void setName(String aName){
         name = aName;
        System.out.println(name);
    }

    public void sayHello(){
        System.out.println("Hello " + name);
    }

}
