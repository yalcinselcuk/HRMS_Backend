package HRMS.hrms.business.abstracts;

import java.util.List;

import HRMS.hrms.core.utilities.results.DataResult;
import HRMS.hrms.core.utilities.results.Result;
import HRMS.hrms.entities.concretes.Job;


public interface JobService {
	DataResult<List<Job>> getAll();
	Result add(Job job);
}
