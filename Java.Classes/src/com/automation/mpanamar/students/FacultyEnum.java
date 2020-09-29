package com.automation.mpanamar.students;

    enum FacultyEnum {
        MATH("Mathematics Faculty"),
        PHYSICS("Physics Faculty"),
        CONSTRUCTIONAL("Constructional Faculty"),
        PHILOLOGICAL("Philological Faculty"),
        MILITARY("Military Faculty");

        private String title;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        FacultyEnum(String s) {
            title = s;
        }

    };
    class FacultyInfo {


        private int courseNumber;
        private int groupNumber;
        private FacultyEnum facultyName;

        @Override
        public String toString() {
            return "FacultyInfo [ " +
                    "Course Number=" + courseNumber +
                    ", Group Number=" + groupNumber +
                    ", Faculty Name=" + facultyName + "]";

        }

        public int getCourseNumber() {
            return courseNumber;
        }

        public void setCourseNumber(int courseNumber) {
            this.courseNumber = courseNumber;
        }

        public int getGroupNumber() {
            return groupNumber;
        }

        public void setGroupNumber(int groupNumber) {
            this.groupNumber = groupNumber;
        }

        public FacultyEnum getFacultyName() {
            return facultyName;
        }

        public void setFacultyName(FacultyEnum facultyName) {
            this.facultyName = facultyName;
        }

        public FacultyInfo(int courseNumber, int groupNumber, FacultyEnum facultyName) {
            this.courseNumber = courseNumber;
            this.groupNumber = groupNumber;
            this.facultyName = facultyName;
        }
    }
