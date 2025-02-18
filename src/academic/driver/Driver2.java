package academic.driver;

import academic.model.Course;
import academic.model.Enrollment;
import academic.model.Student;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author 12S23012 - Genesis Tombak Panjaitan
 * @author 12S23016 - Frank Niroy Siahaan
 */
public class Driver2 {

    public static void main(String[] _args) {
        //arraylist course
        ArrayList<Course> course = new ArrayList<>();
        //arraylist student
        ArrayList<Student> student = new ArrayList<>();
        //arraylist enroll
        ArrayList<Enrollment> enrol = new ArrayList<>();
        try (Scanner input = new Scanner(System.in)) {
            String temp;
            String temp1;
            
            //objek course
            String id;
            String matkul;
            String sks;
            String nilai;
            
            //objek student
            String nim;
            String nama;
            String tahun;
            String prodi;
            
            //objek enroll
            String ids;
            String nims;
            String year;
            String sems;
            
            while (true) {
                temp = input.nextLine();
                if (temp.equals("---")) {
                    break;
                }
                String[] hasil = temp.split("#");
                temp1 = hasil[0];
                //pengecekan ke course
                if (temp1.equals("course-add")) {
                    id = hasil[1];
                    matkul = hasil[2];
                    sks = hasil[3];
                    nilai = hasil[4];
                    course.add(new Course(id,matkul,sks,nilai));
                    //pengecekan ke student
                } else if (temp1.equals("student-add")) {
                    nim = hasil[1];
                    nama = hasil[2];
                    tahun = hasil[3];
                    prodi = hasil[4];
                    student.add(new Student(nim,nama,tahun,prodi));
                    //pengecekan ke enrol
                } else if(temp1.equals("enrollment-add")) {
                    ids = hasil[1];
                    nims = hasil[2];
                    year = hasil[3];
                    sems = hasil[4];
                    enrol.add(new Enrollment(ids,nims,year,sems));
                }
            }
            // for (Course i : course) {
            //     System.out.println(i.toString());
            // }
            input.close();
           
            
            // for (int i = 0; i < student.size(); i++) {
            //     for (int j = 0; j < enrol.size(); j++) {
            //         if (enrol.get(j).getnims().equals(student.get(i).getnim())) {
            //             break;
            //         } else {
            //             System.out.println("invalid student" + "|" + enrol.get(j).getnims());
            //             break;
            //         }
            //     }
            // }

            for (int i = enrol.size() - 1; i >= 0; i--) {
                Enrollment e = enrol.get(i);
                boolean studentExists = false;
                boolean courseExists = false;
                for (Student s : student) {
                    if (s.getnim().equals(e.getnims())) {
                        studentExists = true;
                        break;
                    }
                }

                for (Course c : course) {
                    if (c.getid().equals(e.getids())) {
                        courseExists = true;
                        break;
                    }
                }

                if (!studentExists || !courseExists) {
                    if (!studentExists && !courseExists) {
                        if (!studentExists) {
                            System.out.println("invalid student|" + e.getnims());
                        }
                        if (!courseExists) {
                            System.out.println("invalid course|" + e.getids());
                        }
                    }
                    enrol.remove(i);
                }
            }

            }
            
            for (int i = course.size() - 1; i >= 0; i--) {
                System.out.println(course.get(i));
            }
            
            
            for (Student j : student) {
                System.out.println(j.toString());
            }
            
            for (Enrollment k : enrol) {
                System.out.println(k.toString());
            }
        }
    }
    