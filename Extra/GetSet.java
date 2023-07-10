class Person {
   private String name; 
   private int age;
   private String address;

Person(){
    name = "Akash";
    age = 25;
    address = "Kolkata";
}


public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public String getAddress() {
    return address;
}
public void setAddress(String address) {
    this.address = address;
}
}

class GetSet{
public static void main(String[] args) {
    Person ob = new Person();
    ob.setAge(12);
    ob.setName("Kunal");
    ob.setAddress("Delhi");

    System.out.println(ob.getAge());
    System.out.println(ob.getName());
    System.out.println(ob.getAddress());

}
}
