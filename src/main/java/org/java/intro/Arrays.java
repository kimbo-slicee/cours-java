package org.java.intro;

        /* An "ArrayIndexOutOfBoundsException" typically occurs when you try to
            access an element in an array using an index that
            is outside the valid range of the array.

            */
public class Arrays {

            /*[1]:the fixed Array
                if we know thw values we use this syntax int num[]={1,2,3,4,4,5};
                if not, we use the other syntax like int num[]=new int[];
                *  */
    public static int f(){
        int result;
        int i;
        int[] list={1,2,3,4,5,6};
    for( i=0; i<list.length ; i++) System.out.println("➡"+i);
    return result=i;
    }
    /*[2]:Multi Dimensional Array in Java */
    public static void main(String a[]){
        int[][]number =new int[5/*Rows*/][3/*Columns*/];

        for(int i=0;i<number.length ; i++){
            for (int j=0;j<number[i].length ; j++){
                System.out.println(i+"➕"+j);
                number[i][j]= (int) (Math.random()*100);
                System.out.printf(String.valueOf(number[i][j]));

            }
        }

    }
    /*[3] jagged array it s #D Array but with the different size of Rows */
    public void func(){
    int nums[][]=new int[3][];//jagged
        int j=0;
        nums[0]=new int[5];
    nums[1]=new int[4];
    nums[2]=new int[3];
    for (int i=0 ; i<nums.length ; i++){
        System.out.println("You are on the floor 🏢 number = " + i);
        for (;j<nums[i].length;){
            j++;
        }
            System.out.println(" number of suite are 🌟 = " + j);
        j=0;
    }
    /*Resume in the jagged array we have the same number of columns, but different number of rows */

    }
    static class Student{
        public String studentName;
        public int studentAge;
        Student(String studentName, int studentAge){
            this.studentName=studentName;
            this.studentAge=studentAge;
            System.out.println("I'm UIR Student 👽 ");
        }

        public String getStudentName() {
            return studentName;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public int getStudentAge() {
            return studentAge;
        }

        public void setStudentAge(int studentAge) {
            this.studentAge = studentAge;
        }
    }





}
