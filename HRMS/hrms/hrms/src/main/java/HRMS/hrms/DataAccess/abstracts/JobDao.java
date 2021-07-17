package HRMS.hrms.DataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMS.hrms.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job,Integer>{

}
