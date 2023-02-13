package com.sms;
public class Main {
public static void main(String[] args) {
Teacher lizzy = new Teacher(1,"Lizzy",500);
Teacher mellisa = new Teacher(2,"Mellisa",700);
Teacher vanderhorn = new Teacher(3,"Vanderhorn",600);
Teacher[] teacherArray = new Teacher[]{lizzy,mellisa,vanderhorn};


Student tamasha = new Student(1,"Tamasha",4);
Student rakshith = new Student(2,"Rakshith Vasudev",12);
Student rabbi = new Student(3,"Rabbi",5);
Student[] studentArray = new Student[]{tamasha,rabbi,rakshith};


School ghs = new School(teacherArray,studentArray);

Teacher megan = new Teacher(6,"Megan", 900);

ghs.addTeacher(megan);


tamasha.payFees(5000);
rakshith.payFees(6000);
System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

System.out.println("------Making SCHOOL PAY SALARY----");
lizzy.receiveSalary(lizzy.getSalary());
System.out.println("GHS has spent for salary to " + lizzy.getName()
+" and now has $" + ghs.getTotalMoneyEarned());

vanderhorn.receiveSalary(vanderhorn.getSalary());
System.out.println("GHS has spent for salary to " + vanderhorn.getName()
        +" and now has $" + ghs.getTotalMoneyEarned());


System.out.println(rakshith);

mellisa.receiveSalary(mellisa.getSalary());

System.out.println(mellisa);


}
}