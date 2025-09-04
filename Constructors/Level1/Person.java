class Person{
    String name;
    int age;

//Default Constructor
    public Person(){
        this.name="Ram";
        this.age=35;


        } 
        //Copy Constructor
        
    public Person(Person other){
        this.name=other.name;
        this.age=other.age;
        
    }
           }