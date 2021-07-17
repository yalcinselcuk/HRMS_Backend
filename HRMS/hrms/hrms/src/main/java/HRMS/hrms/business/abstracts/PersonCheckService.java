package HRMS.hrms.business.abstracts;

import HRMS.hrms.entities.concretes.JobSeekers;

public interface PersonCheckService {
	boolean ifCheckRealPerson(JobSeekers jobSeekers);
}
