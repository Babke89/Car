
import java.util.Set;
import loops.Loops;
import person.Person;
import person.Student;
import person.Teacher;


public class Main {
    
    public static void main(String[] args) {

//        Car myCar = new Car();
//        myCar.printMainAttributes();
//        Car companyCar = new Car(150, 30, 2000, false, "ERF-456", 'B', 3500, 6001);
//
//        companyCar.changeModel("Fiat");
//        companyCar.changeMaxFuel(150);
//        companyCar.fuelUp();
//        companyCar.changeConsumption(10);
//        companyCar.travel(10);
//        companyCar.printMainAttributes();
//
//        Car audi = new Car();
//        audi.fuelUp();
//        audi.changeModel("Audi");
//        audi.changeConsumption(20);
//
//        Car testAuto = new Car();
//        testAuto.printMainAttributes();
//        testAuto.getIn(2);
//        testAuto.printMainAttributes();
//
//        testAuto.getIn(4);
//        testAuto.printMainAttributes();
//        testAuto.getIn(2);
//        testAuto.printMainAttributes();
//
//    }
//        testAuto.getOut(3);
//        testAuto.printMainAttributes();
//        testAuto.getOut(2);
//        testAuto.printMainAttributes();
//        WHILE loop}
//            Loops testLoop = new Loops();
//            Loops.testDoWhileloop();
//            Loops.testDoWhileloop();
//            Loops.testForLoop();
//            
//            
//            Loops.testDoubleForLoop();
//            
//            Loops.testMultiplicationTable();
//        Person p1 = new Person();
//        p1.setName("Milica");
//        p1.setSurname("Peric");
//        p1.setJmbg("252501231");
//        p1.showData();
//        
//        Person p2 = new Person("Stefan", "Babic", "219204243");
//        p2.showData();
        
        
        Student studentJovan = new Student("Jovan", "Jovanovic", "224826381");
        studentJovan.setCurrentYear(2);
        studentJovan.setIndexNumber("502/2014");
        studentJovan.showData();
        
        Student studentMarija = new Student("Marija", "Radoman", "08129470030", "302/2013", 4);
         studentMarija.showData();
          
        Teacher teacherPetar = new Teacher("Petar", "Petrovic", "2486934893", "Matematika", 10);
        teacherPetar.showData();
                }
    
}
