package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

 
@XmlRootElement //Para retornar um xml
@Entity //Para dizer que é uma entidade
@Table(name="my_classes") //Criar uma tabela no bando de dados com nome professor
public class MyClasses implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id // indica chave primaria
	@GeneratedValue(strategy=GenerationType.IDENTITY)  // @GeneratedValue informa que a geração do valor do identificador único da entidade será gerenciada pelo provedor de persistência
	//IDENTITY - Informamos ao provedor de persistência que os valores a serem atribuídos ao identificador único serão gerados pela coluna de auto incremento do banco de dados.
	@Column(name="cod_my_classes") //nome da coluna no banco
	private Integer codMyClasses;
	
	@ManyToOne //relação muitos para um
	@JoinColumn(name="classes_codStudent", referencedColumnName="cod_student") //ligação por chave estrangeira
	private Student student;

	
	public MyClasses(){
		
	}
	
	public MyClasses(Integer codMyClasses, Student student) {
		super();
		this.codMyClasses = codMyClasses;
		this.student = student;
	}

	public Integer getCodMyClasses() {
		return codMyClasses;
	}

	public void setCodMyClasses(Integer codMyClasses) {
		this.codMyClasses = codMyClasses;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codMyClasses == null) ? 0 : codMyClasses.hashCode());
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
		MyClasses other = (MyClasses) obj;
		if (codMyClasses == null) {
			if (other.codMyClasses != null)
				return false;
		} else if (!codMyClasses.equals(other.codMyClasses))
			return false;
		return true;
	}
	
	
	
	

}
