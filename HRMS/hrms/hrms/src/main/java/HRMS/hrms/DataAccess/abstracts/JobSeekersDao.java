package HRMS.hrms.DataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMS.hrms.entities.concretes.JobSeekers;

public interface JobSeekersDao extends JpaRepository<JobSeekers,Integer>{

}
