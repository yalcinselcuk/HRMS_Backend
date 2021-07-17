package HRMS.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS.hrms.DataAccess.abstracts.JobDao;
import HRMS.hrms.business.abstracts.JobService;
import HRMS.hrms.core.utilities.results.DataResult;
import HRMS.hrms.core.utilities.results.Result;
import HRMS.hrms.core.utilities.results.SuccessDataResult;
import HRMS.hrms.core.utilities.results.SuccessResult;
import HRMS.hrms.entities.concretes.Job;

@Service
public class JobManager implements JobService{
	
	private JobDao jobDao;
	
	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}
	
	@Override
	public DataResult<List<Job>>getAll(){
		return new SuccessDataResult<List<Job>>( jobDao.findAll() , "Data Listelendi");
	}
	@Override
	public Result add(Job job) {
		this.jobDao.save(job);
		return new SuccessResult("İş Eklendi");
	}
}
