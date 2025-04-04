
class Person1 {
    
    String name;
    int age;

   
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Car {
    
    String brand;
    String model;
    Person owner; 

  
    public Car(String brand, String model, Person owner) {
        this.brand = brand;
        this.model = model;
        this.owner = owner;
    }

    
    public void displayCarDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model);
        System.out.print("Owned by: ");
        owner.displayDetails();
    }
}


public class MultipleClassesExample {
    public static void main(String[] args) {
      
        Person1 person2 = new Person("Alice", 25);
        Person1 person3 = new Person("Bob", 30);

        
        Car car1 = new Car("Toyota", "Corolla", person1);
        Car car2 = new Car("Honda", "Civic", person2);

       
        car1.displayCarDetails();
        car2.displayCarDetails();
    }
}
