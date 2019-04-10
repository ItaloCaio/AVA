package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity
@Table(name="student")
public class Student implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_student")
	private Integer codStudent;
	
	@Column(name="name", length= 50, nullable=false)
	private String name;
	
	@Column(name = "password", length = 50, nullable = false) // Atributos do banco
	private String password;
	
	@Column(name= "email", length = 50, nullable = false)
	private String email;
	
	@OneToMany(mappedBy="student")
	private List<MyClasses> myClasses;
	
	

	public Student(Integer codStudent, String name, String password, String email, List<MyClasses> myClasses) {
		super();
		this.codStudent = codStudent;
		this.name = name;
		this.password = password;
		this.email = email;
		this.myClasses = myClasses;
	}
	
	public Student(){
		
	}

	public Integer getCodStudent() {
		return codStudent;
	}

	public void setCodStudent(Integer codStudent) {
		this.codStudent = codStudent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<MyClasses> getMyClasses() {
		return myClasses;
	}

	public void setMyClasses(List<MyClasses> myClasses) {
		this.myClasses = myClasses;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codStudent == null) ? 0 : codStudent.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (codStudent == null) {
			if (other.codStudent != null)
				return false;
		} else if (!codStudent.equals(other.codStudent))
			return false;
		return true;
	}
	
	
	
}
