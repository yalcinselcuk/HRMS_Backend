package HRMS.hrms.DataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMS.hrms.entities.concretes.SystemStaff;

public interface SystemStaffDao extends JpaRepository<SystemStaff,Integer>{

}
