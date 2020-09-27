/*Create a class Student with the variables to represent the name
of the student and marks of the five subjects, use constructor to
initilize the variables. Write method to compute total average
marks, method to calculate letter grade, mutator and accessor
methods, toString method to return object as a string. Create
Driver class to demonstrate the functioning of the above.*/
    public class Student {
        String name;
        int a[];
        // assigning value
        public Student () {
            this.a = a;
            this.name = name;
        }
        // get mutator method
        public int[] getA() {
            return a;
        }
        // set mutator 
        public int[] setA( int a[] ) {
            return this.a=a;
        }
        // taking names 
        public String getName() {
            return name;
        }
        // set names 
    public String setName( String name ) {
        return this.name=name;
    }
    // method for avg
    public int avg(int a[]) {
        int s=0;
        for (int i: a) {
        s= s+i;
        }
        return s;
    }
    // grading 
    public String Grade(int avg){
        if(avg>90){
            return "A";
        }
        else if(avg>=81 && avg<=90){
            return "B";
        }
        else if(avg>=71 && avg<=80){
            return "C";
        }
        else if(avg>=61 && avg<=70){
            return "D";
        }
        else if(avg>=51 && avg<=60){
            return "E";
        }
        else {
            return "F";
        }
    }
}