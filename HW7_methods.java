public class Book {

    private String title;
    private int pages;

    public Book(String title, int pages){
        this.title = title;
        this.pages = pages;
    }

    public String getTitle(){
        return title;
    }

    public int getPages(){
        return pages;
    }

    public void info(){
        System.out.println("Book: " + title + ", " + pages + " pages");
    }

    public void setPages(int newPages){
        if(newPages > 0){
            pages = newPages;
        }
    }

}

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

/            Задание 1. Новый класс.
//    Создайте в отдельном файле класс Book с полями title (название, String)
//    и pages (количество страниц, int). Поля сделайте private.
//    Добавьте конструктор с двумя параметрами (используйте this),
//    getter для каждого поля и метод info(), который печатает: Книга "Java",
//        300 страниц. В main создайте две книги и вызовите info() у каждой.

    Book oblomov = new Book("Oblomov", 356);
    Book gamlet = new Book("Gamlet", 120);

    oblomov.info();
    gamlet.info();

//    Задание 2. Setter с проверкой.
//            В Book добавьте setter setPages(int newPages): количество страниц должно
//    меняться т олько если новое значение больше 0. Проверьте в main: сначала поставьте 250,
//        потом -10, потом 0, и выведите результат после каждого вызова.
//            Какое значение останется в конце и почему?


    oblomov.setPages(250);
    oblomov.info();
    oblomov.setPages(-10);
    oblomov.info();
    oblomov.setPages(0);
    oblomov.info();


//    Задание 3. Метод с параметром и результатом.В Student добавьте метод boolean isAdult (),
//            который возвращает true, если возраст 18 или больше.
//    Создайте трёх студентов с разным возрастом (например, 17, 18 и 25)и выведите результат isAdult ()
//    для каждого. Затем вызовите birthday() у студента 17 лет(метод из темы 4 нужно вернуть в класс,
//        он у вас уже есть) и проверьте isAdult() ещё раз.

        Student alex = new Student("Alex", 17);
        Student matina = new Student("Matina", 18);
        Student oma = new Student("Oma", 25);

        System.out.println(alex.isAdult());
        System.out.println(matina.isAdult());
        System.out.println(oma.isAdult());

        alex.haveBirthday();
        System.out.println(alex.isAdult());


//    Задание 4. Проверка в конструкторе.
//            Сейчас new Student("Олег", -10) создаёт студента с возрастом -10.
//    Измените конструктор так, чтобы он не принимал отрицательный возраст.
//            Условие: если переданный возраст отрицательный, в поле записывается 0.
//    Проверьте в main два объекта: с возрастом 20 и с возрастом -10.

        Student kris = new Student("Kris", 20);
        Student niki = new Student("Niki", -10);

    System.out.println(kris.getName());
    System.out.println(kris.getAge());
    System.out.println(niki.getName());
    System.out.println(niki.getAge());

//    Задание 5. Мини-проект: массив объектов.
//    Создайте массив из трёх студентов (Student[] group = new Student[3];)
//    и заполните каждую ячейку через new Student(...).
//    Затем циклом for выведите информацию о каждом через introduce().
//            Потом найдите в цикле самого старшего студента и выведите его имя через getter.

    Student[] group = new Student[3];
    group[0] = new Student("Miki", 20);
    group[1] = new Student("Kanda", 19);
    group[2] = new Student("Amis", 22);



    Student oldest = group[0];
    for(int i =0; i < group.length; i++){
        if(group[i].getAge() > oldest.getAge()){
            oldest = group[i];
        }
    }


    System.out.println(oldest.getName());
    oldest.setAge(30);
    System.out.println(group[2].getAge());
