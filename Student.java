import java.util.Scanner;

public class Student {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name of student: ");
        String n = in.nextLine();
        System.out.print("Enter roll no of student: ");
        String r = in.nextLine();
        System.out.print("Enter marks of the student: ");
        int m1 = in.nextInt();
        System.out.print("Enter the attendance report of the student : ");
        int m2 = in.nextInt();

        if (m1 < 0) {
            m1 = 0;
        }

        if (m2 >= 75) {
            m1 = m1 * 110 / 100;
            if (m1 > 100) {
                m1 = 100;
            }
        }
        System.out.println("Attendance:" + m2);
        System.out.println("Marks of the student:" + m1);
        System.out.print("Name :" + n);
        System.out.print("Roll no :" + r);
        {
            in.close();
        }
    }

}
