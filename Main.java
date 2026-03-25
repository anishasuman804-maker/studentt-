class Student {
    int id;
    String name;
    String grade;

    Student() {
        System.out.println("***** STUDENT REPORT *****");
        id = 101;
        name = "anisha";
        grade = "11";
    }

    void displayDetails() {
        System.out.println(id + " | " + name + " | " + grade);
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}