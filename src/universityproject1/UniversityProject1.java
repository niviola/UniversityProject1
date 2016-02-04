 
package universityproject1;

import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

public class UniversityProject1 {

    public static void main(String[] args) {
        University university = new University();
        university.setAddress(new Address("Palo Alo", "CA", "Street", "95014"));
//        university.setStudent(new Student("Dave", "Smith", 22));
        Map<UUID, Student> listofstudents = university.getListofstudents();
        Student student = new Student("Dave", "Smith", 22);
        student.setAddress(new Address("Cincinnati", "Ohio", "Elm", "45211"));
        Student student1 = new Student("Jane", "Jones", 19);
        student1.setAddress(new Address("Columbus", "Ohio", "Elm", "45211"));
        Student student2 = new Student("Scott", "White", 23);
        student2.setAddress(new Address("Cleveland", "Ohio", "Elm", "45211"));

        listofstudents.put(student.getUserid(), student);
        listofstudents.put(student1.getUserid(), student1);
        listofstudents.put(student2.getUserid(), student2);

        System.out.println(university.getName() + "\n" + university.getTestscore());
        System.out.println(university.getAddress());
        Iterator<Student> iterator = listofstudents.values().iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //System.out.println("UUID = " + university.getStudent().getUserid());
    }

}
