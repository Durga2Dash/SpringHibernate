package com.mindtree.springHibernateDemo.dao.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mindtree.springHibernateDemo.dao.EmployeeDao;
import com.mindtree.springHibernateDemo.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private HibernateTemplate hibernatetemplate;

	public String create(Employee employee) {
		hibernatetemplate.save(employee);
		return "inserted";
	}

	@Override
	public Employee read(int id) {
		return hibernatetemplate.get(Employee.class, id);

	}

	@Override
	public int update(Employee employee) {
		Employee emp = read(employee.getEmpId());
		emp.setEmailid(employee.getEmailid());
		hibernatetemplate.saveOrUpdate(emp);
		return 1;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		Employee emp = read(id);
		hibernatetemplate.delete(emp);
		return 1;
	}

	@Override
	public List<Employee> getAllEmployee() {
		return hibernatetemplate.loadAll(Employee.class);
	}

}
