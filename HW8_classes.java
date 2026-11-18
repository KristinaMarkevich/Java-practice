//    Задача 1
// Создайте в отдельном файле класс Car с полями brand (марка, String) и speed (скорость, int).
//  Поля private. Добавьте конструктор с двумя параметрами, getter для каждого поля и метод info(),
//  который печатает, например: Audi едет со скоростью 60 км/ч.
//  В main создайте две машины с разными данными и вызовите info() у каждой.

public class Car {
    private String brand;
    private int speed;

    public Car(String brand, int speed){
        this.brand = brand;
        if(speed > 0) {
            this.speed = speed;
        } else {
            this.speed = 0;
        }
    }

    public String getBrand(){
        return brand;
    }

    public int getSpeed(){
        return speed;
    }

    public void info(){
        System.out.println(brand + " is driving at a speed of " + speed);
    }

}

Car miata = new Car("Mazda", 220);
        Car infiniti = new Car("Nissan", 110);
        Car wrong = new Car("VW", -50);

        miata.info();
        infiniti.info();
        wrong.info();

        System.out.println(miata.getBrand() + " - " + miata.getSpeed());
        System.out.println(infiniti.getBrand() + " - " + infiniti.getSpeed());

//    Задача 4 
//
//    Условие : класс Product с полями title, price, quantity, все private.
//    Конструктор с тремя параметрами, отрицательные цена и количество заменяются на 0.
//    Методы totalCost(), sell(int count) (возвращает boolean) и getters.

//    В main создайте массив из 4 товаров. Затем циклом:
//    выведите название и общую стоимость каждого товара;
//    найдите товар с наибольшей общей стоимостью и выведите его название;
//    посчитайте и выведите общую стоимость всех товаров на складе.
//
//    После этого продайте несколько штук одного товара через sell и убедитесь,
//    что общая стоимость изменилась.

public class Product {
    private String title;
    private double price;
    private int quantity;

    public Product(String title, double price, int quantity){
        this.title = title;
        if(price < 0){
            this.price = 0;
        } else {
            this.price = price;
        }
        if(quantity < 0){
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }

    public double totalCost(){
        return quantity * price;
    }

    public boolean sell(int count){
        if(count > 0 && quantity - count >= 0){
            quantity -= count;
            return true;
        }
        return false;
    }

    public String getTitle(){
        return title;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }
}

Product [] store = new Product[4];
    store[0] = new Product("Apple", 2.1,5);
    store[1] = new Product("Pen", 1.3,2);
    store[2] = new Product("Pineapple", 4.5,3);
    store[3] = new Product("Mazda Miata", 15000.6,1);


    Product max = store[0];
    double totalCostAllItems = 0.0;

    for(int i = 0; i < store.length; i++){
        System.out.println("Title: " + store[i].getTitle() + " and total cost: " + store[i].totalCost());
        if(max.totalCost() < store[i].totalCost()){
            max = store[i];
        }
        totalCostAllItems += store[i].totalCost();
    }

    System.out.println("The most expensive item: " + max.getTitle());
    System.out.println("Total cost of all items: " + totalCostAllItems);

   store[0].sell(3);
   System.out.println(store[0].getQuantity());

 // Задача 3
//    Используйте ваш класс Student (с name, age, конструктором, getters, setAge, isAdult, birthday).
//    Создайте массив из 5 студентов с разным возрастом, хотя бы двое младше 18. В main:
//
//    Посчитайте и выведите, сколько студентов совершеннолетних (через isAdult()).
//    Посчитайте и выведите средний возраст группы.
//    Найдите самого младшего студента и выведите его имя через getter.

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        if(age < 0){
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public void introduce(){
        System.out.println("My name is " + name + ", i'm " + age + " years old");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public void haveBirthday() {
        age = age + 1;
    }

    public void setName(String name){
        if(!name.equals("")){
            this.name = name;
        }
    }

    public boolean isAdult(){
        return age >= 18;
    }
}


    Student [] classA = new Student[5];
    classA[0] = new Student("Nick", 18);
    classA[1] = new Student("Lola", 12);
    classA[2] = new Student("Luke", 19);
    classA[3] = new Student("Aloha", 3);
    classA[4] = new Student("Gomer", 55);

    int countAdults = 0;
    int sumAge = 0;
    Student theYoungestStudent = classA[0];

    for(int i = 0; i < classA.length; i++){
        if(classA[i].isAdult()){
            countAdults++;
        }
        sumAge += classA[i].getAge();
        if(theYoungestStudent.getAge() > classA[i].getAge()){
            theYoungestStudent = classA[i];
        }
    }
    System.out.println(countAdults);
    System.out.println(sumAge * 1.0 / classA.length);
    System.out.println(theYoungestStudent.getName());
