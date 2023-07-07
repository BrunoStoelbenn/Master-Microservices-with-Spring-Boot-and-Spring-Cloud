package com.in28minutes.springboot.learnspringboot;

public class Course {
        private int id;
        private String courseName;
        private String groupOfLearning;

        public Course (int id, String courseName, String groupOfLearning){
            super();
            this.id = id;
            this.courseName = courseName;
            this.groupOfLearning = groupOfLearning;
        }

        public int getId(){
            return this.id;
        }
        public void setId(int id){
            this.id = id;
        }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getGroupOfLearning() {
        return groupOfLearning;
    }

    public void setGroupOfLearning(String groupOfLearning) {
        this.groupOfLearning = groupOfLearning;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", groupOfLearning='" + groupOfLearning + '\'' +
                '}';
    }
}
