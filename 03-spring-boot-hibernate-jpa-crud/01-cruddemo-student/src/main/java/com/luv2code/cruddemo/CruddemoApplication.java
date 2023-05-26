package com.luv2code.cruddemo;

import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.luv2code.cruddemo.dao.StudentDao;
import com.luv2code.cruddemo.entity.Student;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao) {
		return runner -> {
			// createStudent(studentDao);
			// createMultipleStudent(studentDao);
			// readStudent(studentDao);
			// queryForStudents(studentDao);
			// queryForStudentsByLastName(studentDao);
			// updateStudent(studentDao);
			// deleteStudent(studentDao);
			// System.out.println(studentDao);
			deleteAllStudent(studentDao);
		};
	}

	private void deleteAllStudent(StudentDao studentDao) {
		System.out.println("Deleting all student");
		int numRowsDeleted = studentDao.deleteAll();
		System.out.println("Deleted Row count: " + numRowsDeleted);
	}

	private void deleteStudent(StudentDao studentDao) {
		int studentId = 3;
		System.out.println("Deleting student id: " + studentId);
		studentDao.delete(studentId);
	}

	private void updateStudent(StudentDao studentDao) {

		// retrieve student based on the id : primary key
		int studentId = 1;
		System.out.println("Getting student with id : " + studentId);
		Student myStudent = studentDao.findById(studentId);

		// chage first name to "scooby"
		System.out.println("Updating student ...");
		myStudent.setFirstName("Jhon");

		// update the student
		studentDao.update(myStudent);
		// display the updated student
		System.out.println("Update student: " + myStudent);

	}

	private void queryForStudentsByLastName(StudentDao studentDao) {
		// get a list of students
		List<Student> theStudents = studentDao.findByLastName("Doe");

		// display list of students
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}

	}

	private void queryForStudents(StudentDao studentDao) {
		// get a list of students
		List<Student> theStudents = studentDao.findAll();

		// display list of students
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDao studentDao) {
		// create the student object
		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("Mckey", "Hamber", "mckey@luv2code.com");

		// save the student object
		System.out.println("Saving the student ..,");
		studentDao.save(tempStudent);

		// display id of the saved student
		int theID = tempStudent.getId();
		System.out.println("Saved student. Generated id: " + theID);

		// retrieve student based on the id: primary key
		System.out.println("Retrieving student with id : " + theID);
		Student myStudent = studentDao.findById(theID);

		// display student
		System.out.println("Found the student: " + myStudent);
	}

	private void createMultipleStudent(StudentDao studentDao) {
		// create the student object
		System.out.println("Creating new student object ...");
		Student tempStudent1 = new Student("John", "Doe", "john@luv2code.com");
		Student tempStudent2 = new Student("Mary", "Becky", "marry@luv2code.com");
		Student tempStudent3 = new Student("Bonita", "Adam", "bonita@luv2code.com");
		// save the student object
		System.out.println("Saving the student ..,");
		studentDao.save(tempStudent1);
		studentDao.save(tempStudent2);
		studentDao.save(tempStudent3);

		// display id of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent1.getId());
		System.out.println("Saved student. Generated id: " + tempStudent2.getId());
		System.out.println("Saved student. Generated id: " + tempStudent3.getId());

	}

	private void createStudent(StudentDao studentDao) {

		// create the student object
		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("Paul", "Doe", "paul@luv2code.com");

		// save the student object
		System.out.println("Saving the student ..,");
		studentDao.save(tempStudent);

		// display id of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());
	}

}
