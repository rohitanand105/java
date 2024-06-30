class person{
    String name;
    int age;
    person(String name, int age){
        this.name = name;
        this.age = age;
        
    }
    String getName(){
        return name;

    }
    int getage(){
        return age;

    }

    int setage(){
        return age;
    }
}

class Pract {
    public static void main(String args[]){
        person a = new person("Rohit", 25);
        person b = new person("Rahul", 26);

        System.out.println("Name is "+ a.getName() + " and age is " + a.getage());
        System.out.println("Name is "+ b.getName() + " and age is " + b.getage());


        
    }
}
