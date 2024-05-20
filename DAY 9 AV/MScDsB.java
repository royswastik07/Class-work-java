class Student{
    private String name ;
    int age;

    Student(){
        System.out.println("i am a constructor");
    }

    Student (String name){

        System.out.println("Hi my name is "+name);
        this.name = name;
    }

    void setName(String n){
        name=n;
    }

    String getName(){
        return name;
    }
}

public class MScDsB {
    public static void main(String[] args) {
        Student aadith = new Student();
        aadith.setName("Adith");
        System.out.println(aadith.getName());
        // aadith.setName("Adith");
        Student abin = new Student("Abin Roy");
        System.out.println(abin.getName());
    }
}