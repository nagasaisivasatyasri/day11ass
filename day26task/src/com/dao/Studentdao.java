package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.model.Student;

public class Studentdao {
	private JdbcTemplate temp;
Studentdao(){}
	public Studentdao(JdbcTemplate temp) {
		super();
		this.temp = temp;
	}
	
public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}
public int insertStudent(Student s)
{
	String sql="insert into student values("+s.getId()+",'"+s.getName()+"')";
	return temp.update(sql);
	
}
public int updateStudent(Student s)
{
	String sql="update student set sname='surya' where sid="+s.getId();
	return temp.update(sql);
}
public int deleteStudent(Student s)
{
	String sql="delete from student where sid="+s.getId();
	return temp.update(sql);
}
public List<Student>  getStudent(){
	String sql="select * from student";
	ResultSetExtractor rse=new ResultSetExtractor() {

		@Override
		public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<Student> list=new ArrayList<>();
			while(rs.next())
			{
			list.add(new Student(rs.getInt(1),rs.getString(2)));
				
			}
			return list;
		}
		
	};
	return (List<Student>) temp.query(sql,rse);
	
}

}
