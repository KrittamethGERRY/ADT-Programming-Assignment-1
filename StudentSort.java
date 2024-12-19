import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.FileNotFoundException;
import java.util.Vector;

import java.io.File;

public class StudentSort {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(args[args.length-1].toString());
        Scanner input = new Scanner(file);
        Vector<String> text = new Vector<String>(10);
        Vector<Student> std = new Vector<Student>(10);
        boolean isOpen = false;



        while (input.hasNextLine()) {
            String line = input.nextLine();
            StringTokenizer st = new StringTokenizer(line, ",");
            if (line.contains("67211") || line.contains("66211") || line.contains("65211")
            || line.contains("64211")|| line.contains("63211") || line.contains("62211"))   {
                if (st.hasMoreTokens()) {
                    st.nextToken();
                }
                while (st.hasMoreTokens()) {
                    text.add(st.nextToken());
                }
            }
        }
        for (int i = 0; i < text.size(); i+= 3) {
            Student student = new Student(null, null, null);
            student.setStudentID(text.get(i));
            student.setfName(text.get(i+1));
            student.setlName(text.get(i+2));
            std.add(student);
        }

        if (args.length > 1) {
            switch (args[0]) {
                case "-n": System.out.println("Sort by student ID: "); Sorting.sortByID(std);
                    break;
                case "-f": System.out.println("Sort by first name: "); Sorting.sortByFName(std);
                    break;
                case "-l": System.out.println("Sort by last name: "); Sorting.sortByLName(std);
                    break;
                case "-s": System.out.println("Search first name:"); 
                if (args.length > 2) {
                    Sorting.searchName(std, args[1]);
                }
                    break;        
                default: System.out.println("Invalid option");
                    break;
            }
        }

        input.close();
    }



}