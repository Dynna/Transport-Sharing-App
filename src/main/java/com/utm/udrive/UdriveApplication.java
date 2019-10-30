package com.utm.udrive;

import com.utm.udrive.dao.DaoImplementation;
import com.utm.udrive.dao.DaoInterface;
import com.utm.udrive.service.UserClass;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class UdriveApplication {

	public static void main(String[] args) {
		DaoImplementation dao = new DaoImplementation();

		UserClass dina = new UserClass();
		dina.setName("Dina");
		dina.setSurnname("Bizgu");
		dina.setEmail("dina@mail.com");
		dina.setAddress("starii dub");

		UserClass dan = new UserClass();
		dan.setName("Dan");
		dan.setSurnname("Luncasu");
		dan.setEmail("dan@mail.com");
		dan.setAddress("starii dub");

		dao.usersToDataBase(dina, dan);


		//SpringApplication.run(UdriveApplication.class, args);
	}


}
