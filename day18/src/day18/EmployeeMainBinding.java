package com.src;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class EmployeeMainBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		employee e=new employee();
		e.setEmpid(34);
		e.setEmpname("devi");
		e.setEmpaddress("erode");
		employee e1=new employee();
		e1.setEmpid(12);
		e1.setEmpname("gowri");
		e1.setEmpaddress("dindigul");
try {
		JAXBContext con=JAXBContext.newInstance(employee.class);
	    Marshaller  ms=con.createMarshaller();
	     
			ms.marshal(e,System.out);
			File f=new File("employee.xml");
			ms.marshal(e1,f );
			System.out.println("inserted in to file");
		} catch (JAXBException j) {
			// TODO Auto-generated catch block
			j.printStackTrace();
		}
	    
	
	}
	}


