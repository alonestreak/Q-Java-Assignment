class Student{  
    //private data member  
    private String name; 
    private int rollNo;
    private int age;

    Student(String name,int rollNo,int age){
        this.name=name;
        this.rollNo=rollNo;
        this.age=age;
    }

    //getter method for name  
    public String getName(){  
        return name;  
    }  
    public int getRollNo(){  
        return rollNo;  
    }
    public int getAge(){  
        return age;  
    } 

    //setter method for name  
    public void setName(String name){  
        this.name=name;
    }
    public void setRollNo(int rollNo){  
        this.rollNo=rollNo; 
    }
    public void setAge(int age){  
        this.age=age;
    }
}  

 class StudentData{
    public static void main(String args[]){
        Student student=new Student("test",123456,20); 
        student.setName("Sushant");
        student.setRollNo(22059);
        student.setAge(21);
        System.out.println("Name of the student is "+student.getName());
        System.out.println("Roll no of the student is "+student.getRollNo());
        System.out.println("Age of the student is "+student.getAge());
    }
}