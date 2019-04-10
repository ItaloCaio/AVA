package model.rest.facade;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Student;

//Esta classe faz o intermédio entre o front e o back, junto do angular
@Path("/cadastro")
@Produces({MediaType.APPLICATION_JSON , MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class StudentFacade {
	
	static List<Student> students = new ArrayList<>(); // exemplo para retornar no http://localhost:8080/ProjetoEAD/rest/cadastro
	
	Student s = new Student(1, "caio", "123", "caio@email.com", null);
	
	@GET
	public List<Student> getStudents(){
		students.add(s);
		
		return students;
	}
	
}
