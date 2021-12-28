public class inheritance2 {
    public static void main(String[] args) {
        
    }
}

class Place {
    public int m_size;
    public String m_name;
    public int xLocation;
    public int yLocation;
    public Human[] members;
}

class Mammal {
    public String m_name;
    public int m_age;

    class School extends Place {
        public int numberOfStudents;
        public int numberOfTeachers;
        public Student[] students;
        public Teacher[] teachers;
    }
}

class Human extends Mammal {
    public Human[] childrens;
    public String lastName;
    public Dog[] dogs;
}

class Teacher extends Human {
    public String subject;
    public Student[] students;
}

class Dog extends Mammal {
    public String humanOwner;
}

class Student extends Human {
    public int[] grades;
    public Teacher teacher;
}


