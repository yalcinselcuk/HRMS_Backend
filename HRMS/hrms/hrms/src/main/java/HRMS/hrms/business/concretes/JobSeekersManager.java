package HRMS.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS.hrms.DataAccess.abstracts.JobSeekersDao;
import HRMS.hrms.business.abstracts.JobSeekersService;
import HRMS.hrms.core.utilities.results.DataResult;
import HRMS.hrms.core.utilities.results.Result;
import HRMS.hrms.core.utilities.results.SuccessDataResult;
import HRMS.hrms.core.utilities.results.SuccessResult;
import HRMS.hrms.entities.concretes.JobSeekers;

@Service
public class JobSeekersManager implements JobSeekersService{
	
	private JobSeekersDao jobSeekersDao;
	
	@Autowired
    public JobSeekersManager(JobSeekersDao jobSeekersDao) {
		super();
		this.jobSeekersDao = jobSeekersDao;
	}
	
	@Override
	public DataResult<List<JobSeekers>>getAll(){
		return new SuccessDataResult<List<JobSeekers>>(jobSeekersDao.findAll(),"Data Listelendi");
	}

	@Override
	public Result add(JobSeekers jobSeekers) {
		this.jobSeekersDao.save(jobSeekers);
		return new SuccessResult("iş Arayan Kişi Eklendi");
	}
	
	
}
