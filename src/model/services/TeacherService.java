package model.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.entities.Teacher;

public class TeacherService {
	
	public List<Teacher> findAll(){
		List<Teacher> list = new ArrayList<>();
		list.add(new Teacher(1, "Joao", "12345678901", "987654321", new Date(), 5000.00, "não", "não"));
		list.add(new Teacher(2, "Joa", "12345678901", "987654231", new Date(), 6000.00, "sim", "não"));
		list.add(new Teacher(3, "Joana", "12345678901", "987654231", new Date(), 7000.00, "sim", "sim"));
		return list;
	}	
}
