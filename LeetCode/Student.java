package exercise.LeetCode;

/**
 * messi-wpy
 * bulider 模式练习
 */

public class Student {
    private int age;
    private String school;
    private String sex;
    private String number;
    private boolean isMumber;
    private String country;

    public Student(){


    }

    private Student(Builder builder){
        age=builder.age;
        sex=builder.sex;
        school=builder.school;
        number=builder.number;
        isMumber=builder.isMumber;
        country=builder.country;



    }
    public static class Builder{
        private int age=0;
        private String school="";
        private String sex="man";
        private String number="0";
        private boolean isMumber=false;
        private String country="China";


        public Builder(){


        }


        public Student builder(){
            return new Student(this);

        }
        public Builder setAge(int age) {
            this.age = age;
            return  this;
        }

        public Builder setSchool(String school) {
            this.school = school;
            return this;
        }

        public Builder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder setNumber(String number) {
            this.number = number;
            return  this;
        }


        public Builder setMumber(boolean mumber) {
            isMumber = mumber;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }
    }

}
