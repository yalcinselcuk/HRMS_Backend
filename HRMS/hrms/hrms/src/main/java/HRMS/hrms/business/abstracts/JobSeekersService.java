package HRMS.hrms.business.abstracts;

import java.util.List;

import HRMS.hrms.core.utilities.results.DataResult;
import HRMS.hrms.core.utilities.results.Result;
import HRMS.hrms.entities.concretes.JobSeekers;

public interface JobSeekersService {
	DataResult<List<JobSeekers>> getAll();
	Result add(JobSeekers jobSeekers);
}
