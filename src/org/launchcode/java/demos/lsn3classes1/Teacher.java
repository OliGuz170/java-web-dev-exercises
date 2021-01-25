package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Teacher {
//    public static void main(String[] args) {
        private String firstName;
        private String lastName;
        private String subject;
        private int yearsTeaching;

        public String getFirstName(){
            return firstName;
        }

        public void setFirstName(String firstName){
            this.firstName = firstName;
        }

        public String getlastName(){
            return lastName;
        }

        public void setLastName(String lastName){
            this.lastName = lastName;
        }
        public String getsubject(){
            return subject;
        }

        public void setsubject(String subject){
            this.subject = subject;
        }

        public String getyearsTeaching(){
            return yearsTeaching;
        }

        public void setYearsTeaching(int yearsTeaching){
        this.yearsTeaching = yearsTeaching;
        }
}

