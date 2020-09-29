package com.automation.mpanamar.students;

public class Student {
    public Student(int id, PersonalInfo info, FacultyInfo facultyInfo) {
        this.id = id;
        this.info = info;
        this.facultyInfo = facultyInfo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PersonalInfo getInfo() {
        return info;
    }

    public void setInfo(PersonalInfo info) {
        this.info = info;
    }

    public FacultyInfo getFacultyInfo() {
        return facultyInfo;
    }

    public void setFacultyInfo(FacultyInfo facultyInfo) {
        this.facultyInfo = facultyInfo;
    }

    @Override
    public String toString() {
        return "\nStudent's Name=" + info.getName() + "\nStudent's Surname=" + info.getSurname() + "\nStudent's Midname=" + info.getMiddleName() +
                "\nStudent's address=" + info.getAddress() + "\nStudent's phone=" + info.getPhoneNumber() + "\n" + info.getStudentBirth() +
                "\nStudent's " + getFacultyInfo() + "\n";

    }

    private int id;
    private PersonalInfo info;
    private FacultyInfo facultyInfo;


    public static Student[] getStudents() {
        return new Student[]{
                new Student(1,
                        new PersonalInfo("Mikhail", "Panamar", "Petrovich", "Folush", "375295842691",
                                new StudentBirth(1998, 12, 5)),
                        new FacultyInfo(1, 161, FacultyEnum.MATH)),
                new Student(2,
                        new PersonalInfo("Ivan", "Ivanov", "Ivanovich", "Y.Kupala", "375336584152",
                                new StudentBirth(1996, 5, 5)),
                        new FacultyInfo(4, 131, FacultyEnum.CONSTRUCTIONAL)),
                new Student(3,
                        new PersonalInfo("Pavel", "Kevl", "Dmitrievich", "Solomovoi", "375336589452",
                                new StudentBirth(1994, 5, 5)),
                        new FacultyInfo(1, 161, FacultyEnum.MATH)),
                new Student(4,
                        new PersonalInfo("Maksim", "Sem", "Vitalievich", "Kolas", "375296974123",
                                new StudentBirth(1997, 9, 29)),
                        new FacultyInfo(1, 141, FacultyEnum.MILITARY)),
                new Student(5,
                        new PersonalInfo("Kirill", "Rudy", "Andreevich", "Kolas", "375336597123",
                                new StudentBirth(2000, 4, 30)),
                        new FacultyInfo(1, 171, FacultyEnum.PHILOLOGICAL))

        };

    }

    public static void main(String[] args) {

        System.out.println("Get students from 161 Group: ");
        getStudentByGroup(getStudents(), 161);
        System.out.println("----------------------------------");
        System.out.println("Get students born after 1997: ");
        getStudentByAge(getStudents(),1997);
        System.out.println("----------------------------------");
        System.out.println("Get students from Constructional Faculty: ");
        getStudentByFaculty(getStudents(),FacultyEnum.CONSTRUCTIONAL);
        System.out.println("----------------------------------");
        System.out.println("All students: ");
        getAllStudents(getStudents());


    }

    public static void getStudentByGroup(Student[] students, int groupNumber) {
        for (Student student : students) {
            if (student.getFacultyInfo().getGroupNumber() == 161) {
                System.out.println(student);
            }
        }


    }

    public static void getStudentByAge(Student[] students, int age) {
        for (Student student : students) {
            if (student.getInfo().getStudentBirth().getYear()>age) {
                System.out.println(student);
            }
        }
    }
    public static void getStudentByFaculty(Student[] students, FacultyEnum FacultyName) {
        for (Student student : students) {
            if (student.getFacultyInfo().getFacultyName()==FacultyName) {
                System.out.println(student);
            }
        }
    }
    public static void getAllStudents(Student[] students) {
        for (Student student : students) {
                System.out.println(student);

        }
    }
}

        



