class Student {
    int rollNo;
    String name;
    int marks;
}

public class PrintClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "yashasvi";
        s1.rollNo = 1;
        s1.marks = 100;

        Student s2 = new Student();
        s2.name = "xyz";
        s2.rollNo = 2;
        s2.marks = 90;

        Student s3 = new Student();
        s3.name = "abc";
        s3.rollNo = 3;
        s3.marks = 80;

        //Create Array of Students not of int type
        // we are creating student array which can hold
        // students references

        Student students[] = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        int nums[] = new int[4];
        nums[0] = 3;
        nums[1] = 1;
        nums[2] = 5;
        nums[3] = 7;

// Loops
//        for(int i=0;i<students.length;i++){
//            System.out.println(students[i].name + " " + students[i].rollNo + " "+ students[i].marks);
//        }

        //For each loop Or Enhanced for loop
//        for(int n:nums){
//            System.out.println(n);
//        }

        for (Student stud : students) {
            System.out.println(stud.name + " " + stud.rollNo + " " + stud.marks);
        }

    }
}
