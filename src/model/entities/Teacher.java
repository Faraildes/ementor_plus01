package model.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class Teacher implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private String cpf;
	private String phone;
	private Date admissionDate;
	private Double salary;
	private Boolean chefia;
	private Boolean coordenador;
	
	public Teacher() {
	}	
	
	public Teacher(Integer id, String name, String cpf, String phone, Date admissionDate, Double salary, Boolean chefia,
			Boolean coordenador) {
		
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.phone = phone;
		this.admissionDate = admissionDate;
		this.salary = salary;
		this.chefia = chefia;
		this.coordenador = coordenador;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Boolean getChefia() {
		return chefia;
	}

	public void setChefia(Boolean chefia) {
		this.chefia = chefia;
	}

	public Boolean getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(Boolean coordenador) {
		this.coordenador = coordenador;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", cpf=" + cpf + ", phone=" + phone + ", admissionDate="
				+ admissionDate + ", salary=" + salary + ", chefia=" + chefia + ", coordenador=" + coordenador + "]";
	}
}
	