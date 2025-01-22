package Student_Management;

import java.util.Scanner;

public class Student_Info {

    int id, fees, due, math, chem, phy, paid_fee, sum;
    String name;

    void setvalues(String name, int id, int fees, int paid_fee, int math, int chem, int phy) {
        this.id = id;
        this.name = name;
        this.fees = fees;
        this.math = math;
        this.chem = chem;
        this.phy = phy;
        due = this.fees - paid_fee;
        sum = math + chem + phy;
    }

    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);
        int opt = 0;
        boolean choice = true;
        Student_Info[] ob = new Student_Info[2];
        System.out.println("1.Admin");
        System.out.println("2.Student");
        System.out.print("Choose Your Option :");
        opt = s.nextInt();
        if (opt == 1) {
            while (choice) {
                System.out.println("1.Add Student Details");
                System.out.println("2.Edit Student Details");
                System.out.print("Enter your choice");
                opt = s.nextInt();
                switch (opt) {
                    case 1:
                        int id = 0,
                         fees = 0,
                         paid_fee = 0,
                         math = 0,
                         chem = 0, 
                        phy = 0;
                        String name = "";
                        for (int i = 0; i < ob.length; i++) {
                            ob[i] = new Student_Info();
                            System.out.println("Enter Student Name:");
                            name = s.nextLine();
                            System.out.println("Enter Student ID:");
                            id = s.nextInt();
                            s.nextLine();
                            System.out.println("Enter Student Fee:");
                            fees = s.nextInt();
                            s.nextLine();
                            System.out.println("Enter Student Paid Fee:");
                            paid_fee = s.nextInt();
                            s.nextLine();
                            System.out.println("Enter Maths Marks:");
                            math = s.nextInt();
                            s.nextLine();
                            System.out.println("Enter Chem Marks:");
                            chem = s.nextInt();
                            s.nextLine();
                            System.out.println("Enter Phy Marks:");
                            phy = s.nextInt();
                            s.nextLine();
                            ob[i].setvalues(name, id, fees, paid_fee, math, chem, phy);
                        }
                        break;
                    case 2:
                        System.out.println("Enter which detils you want to edit:");
                        System.out.println("1.Name \n 2.Fee \n 3.Maths  \n 4.Chemistry  \n 5.Physics");
                        opt = s.nextInt();
                        System.out.println("Enter student id you want to edit:");
                        int ids = 0;
                        ids = s.nextInt();
                        if (opt == 1) {
                            System.out.println("Enter new name");
                            String nm = s.nextLine();
                            for (int i = 0; i < ob.length; i++) {
                                if (ob[i].id == ids) {
                                    ob[i].name = nm;
                                }
                            }
                        } else if (opt == 2) {
                            System.out.println("Enter new paid fee:");
                            int newfee = s.nextInt();
                            for (int i = 0; i < ob.length; i++) {
                                if (ob[i].id == ids) {
                                    ob[i].paid_fee = newfee;
                                }
                            }
                        } else if (opt == 3) {
                            System.out.println("Enter maths marks:");

                        }
                }
            }
        }
        System.out.println("continiue y/n:");
        char ch = s.next().charAt(0);
        if (ch != 'y') {
            choice = false;
        }
    }
//  boolean flag=true;
//  while(flag) {
//  System.out.println("Choose from Below Options");
//  System.out.println("1.Due");
//  System.out.println("2.Total Marks");
//  System.out.println("3.Grade");
//  int op=s.nextInt();
//  s.nextLine();
//  System.out.println("Enter student id :");
//  int ids=s.nextInt();
//  s.nextLine();

// //  switch(op) {
// //  case 1: //for due calculation
// //       for(int i=0;i<ob.length;i++) {
// //    if(ids==ob[i].id)
// //    System.out.println("Student "+ob[i].name+" due is "+ob[i].due);}
// //    break;
// //  case 2: //for sum of marks
// //     for(int i=0;i<ob.length;i++) {
// //     if(ids==ob[i].id)
// //      System.out.println("Total marks of "+ob[i].name+" is "+ob[i].sum);
// //     }
// //     break;
// //  default:
// //   System.out.println("choose right option");
// //  }
//  System.out.println("continut y/n");
//  char ch=s.next().charAt(0);
//  s.nextLine();
//  if(ch!='y') {
//   flag=false;
//  }
//  }
}
