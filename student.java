public class student {
    int id;
    String name;
    int age;
    String course;
    float cgpa;

    public student(int id, String name,int age,String coures,float cgpa){
         this.id = id;
         this.name = name;
         this.age = age;
         this.course = coures;
         this.cgpa = cgpa; 
    }

    public int getId(){
         return id;
    }
    public  String getname(){
        return name;
    }
    public int getAge(){
        return  age;
    }
    public  String  getCourse(){
        return course;
    }
    public float getcgpa(){
        return  cgpa;
    }
    public void display(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Course:"+course);
        System.out.println("Cgpa:"+cgpa);
    }
    
  
}