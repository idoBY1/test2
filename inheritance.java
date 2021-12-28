
public class inheritance {
    public static void main(String[] args) {
        Programmer emp1 = new Programmer(600000, 3, "java");
        Programmer emp2 = new Programmer(5968, 4, "c++");
        Programmer emp3 = new Programmer(0.1, 5, "java script");

        theOldest(emp1, emp2, emp3);
        therichest(emp1, emp2, emp3);
    }

    static void theOldest(Programmer emp1, Programmer emp2, Programmer emp3) {
        if (emp1.getM_age() > emp2.getM_age() && emp1.getM_age() > emp3.getM_age()) {
            System.out.println("Programmer 1 is the oldest");
        } 
        else if (emp2.getM_age() > emp1.getM_age() && emp2.getM_age() > emp3.getM_age()) {
            System.out.println("Programmer 2 is the oldest");
        } 
        else if (emp3.getM_age() > emp1.getM_age() && emp3.getM_age() > emp2.getM_age()) {
            System.out.println("Programmer 3 is the oldest");
        } 
        else {
            System.out.println("no one is the oldest");
        }
    }

    static void therichest(Programmer emp1, Programmer emp2, Programmer emp3) {
        if (emp1.getM_salary() > emp2.getM_salary() && emp1.getM_salary() > emp3.getM_salary()) {
            System.out.println("Programmer 1 is the richest");
        } 
        else if (emp2.getM_salary() > emp1.getM_salary() && emp2.getM_salary() > emp3.getM_salary()) {
            System.out.println("Programmer 2 is the richest");
        } 
        else if (emp3.getM_salary() > emp1.getM_salary() && emp3.getM_salary() > emp2.getM_salary()) {
            System.out.println("Programmer 3 is the richest");
        } 
        else {
            System.out.println("no one is the richest");
        }
    }
}

class Employee {
    private double m_salary;
    private int m_age;

    public int getM_age() {
        return m_age;
    }
    public double getM_salary() {
        return m_salary;
    }

    public void setM_age(int m_age) {
        this.m_age = m_age;
    }
    public void setM_salary(double m_salary) {
        this.m_salary = m_salary;
    }

    public Employee(double salary, int age) {
        m_salary = salary;
        m_age = age;
    }

    public void printValues() {
        System.out.print(String.format("%s %s ", m_salary, m_age));
    }
}

class Programmer extends Employee {

    private String m_language;

    public Programmer(double salary, int age, String language) {
        super(salary, age);
        m_language = language;
    }

    public void printPValues() {
        printValues();
        System.out.print(String.format("%s", m_language));
    }
}
