import java.util.Vector;

public class Sorting {

    // SORT BY STUDENT IDs
    public static void sortByID(Vector<Student> std) {
        Vector<Student> sortedStudent = new Vector<Student>(10);


        for (int i = 0; i < std.size(); i++) {
            sortedStudent.add(std.get(i)); // Assign each student to the sortedStudent vector
        }
        for (int h = 0; h <sortedStudent.size(); h++){
        
        for (int i = 1; i < sortedStudent.size(); i++) {
            int j = Integer.parseInt(sortedStudent.get(i-1).getStudentID());
            int k = Integer.parseInt(sortedStudent.get(i).getStudentID());

            if (j > k) {
                Student temp = sortedStudent.get(i);
                sortedStudent.set(i, sortedStudent.get(i-1));
                sortedStudent.set(i-1, temp);
            }
        }

    }
        for (int i = 0; i < sortedStudent.size(); i++)  {
            System.out.println(sortedStudent.get(i).getStudentID() + " " + sortedStudent.get(i).getfName() + " " + sortedStudent.get(i).getlName());
        }

        System.out.println("Sort By Student ID Successfully.");

    }


    // SORT BY FIRST NAME
    public static void sortByFName(Vector<Student> std) {
        Vector<Student> sortedStudent = new Vector<Student>(10);

        for (int i = 0; i < std.size(); i++) {
            sortedStudent.add(std.get(i));
        }

        for (int h = 0; h <sortedStudent.size(); h++){
        
            for (int i = 1; i < sortedStudent.size(); i++) {
                char j = sortedStudent.get(i-1).getfName().charAt(0);
                char k = sortedStudent.get(i).getfName().charAt(0);
    
                if (j > k) {
                    Student temp = sortedStudent.get(i);
                    sortedStudent.set(i, sortedStudent.get(i-1));
                    sortedStudent.set(i-1, temp);
                }
            }
    
        }
            for (int i = 0; i < sortedStudent.size(); i++)  {
                System.out.println(sortedStudent.get(i).getStudentID() + " " + sortedStudent.get(i).getfName() + " " + sortedStudent.get(i).getlName());
            }
            System.out.println("Sort By First Name Successfully.");
    
    }

    // SORT BY LAST NAME
    public static void sortByLName(Vector<Student> std) {
        Vector<Student> sortedStudent = new Vector<Student>(10);

        for (int i = 0; i < std.size(); i++) {
            sortedStudent.add(std.get(i));
        }

        for (int h = 0; h <sortedStudent.size(); h++){
        
            for (int i = 1; i < sortedStudent.size(); i++) {
                char j = sortedStudent.get(i-1).getlName().charAt(0);
                char k = sortedStudent.get(i).getlName().charAt(0);
    
                if (j > k) {
                    Student temp = sortedStudent.get(i);
                    sortedStudent.set(i, sortedStudent.get(i-1));
                    sortedStudent.set(i-1, temp);
                }
            }
    
        }
            for (int i = 0; i < sortedStudent.size(); i++)  {
                System.out.println(sortedStudent.get(i).getStudentID() + " " + sortedStudent.get(i).getfName() + " " + sortedStudent.get(i).getlName());
            }
            System.out.println("Sort By Last Name Successfully.");
    
    }

    // LINEAR SEARCH FOR THE FIRST NAME
    public static void searchName(Vector<Student> std, String name) {
        boolean isFound = false;
        Vector<Student> studentList = new Vector<Student>(10);
        String tempName = name.toLowerCase();
        for (int i = 0; i < std.size(); i++) {
            studentList.add(std.get(i));
        }

        for (int i = 0; i < studentList.size(); i++) {
            if (tempName.equals(studentList.get(i).getfName().toLowerCase().trim())) {
                isFound = !isFound;
                System.out.println( name + " is found at index " + i);
            }
        }
        if (!isFound) {
            System.out.println(name + " does not exist in this table.");
        }

    }

}
