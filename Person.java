public class Person {

    private String firstName;
    private String lastName;
    private String gender;

    public Person() {
    }

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person[firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + "]";
    }

    public boolean equals(Person p) {
        return this.firstName.equals(p.firstName) && this.lastName.equals(p.lastName) && this.gender.equals(p.gender);
    }
}

class Teacher extends Person {

    private String department;
    private String[] courses;

    public Teacher(String firstName, String lastName, String gender, String department, String[] courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        String courseList = "";
        for (String c : courses) {
            courseList += c + " ";
        }

        return super.toString() + ", Teacher[department=" + department + ", courses=" + courseList.trim() + "]";
    }

    public boolean equals(Teacher t) {
        return super.equals(t) && department.equals(t.department) && java.util.Arrays.equals(courses, t.courses);
    }
}

class Student extends Person {

    private String studentId;

    public Student() {
        super();
    }

    public Student(String firstName, String lastName, String gender, String studentId) {
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return super.toString() + ", Student[studentId=" + studentId + "]";
    }

    public boolean equals(Student s) {
        return super.equals(s) && studentId.equals(s.studentId);
    }
}