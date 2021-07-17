package HRMS.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS.hrms.DataAccess.abstracts.EmployersDao;
import HRMS.hrms.business.abstracts.EmployersService;
import HRMS.hrms.core.utilities.results.DataResult;
import HRMS.hrms.core.utilities.results.Result;
import HRMS.hrms.core.utilities.results.SuccessDataResult;
import HRMS.hrms.core.utilities.results.SuccessResult;
import HRMS.hrms.entities.concretes.Employers;



@Service
public class EmployersManager implements EmployersService{
	
	private EmployersDao employersDao;
	
	@Autowired
    public EmployersManager(EmployersDao employersDao) {
		super();
		this.employersDao = employersDao;
	}
	
	@Override
	public DataResult<List<Employers>>getAll(){
		return new SuccessDataResult<List<Employers>>
		( employersDao.findAll(),"Data Listelendi");
	}
	@Override
	public Result add(Employers employers) {
		this.employersDao.save(employers);
		return new SuccessResult("İş Veren Eklendi");
	}

	@Override
	public DataResult<Employers> getByCompanyName(String companyName) {
		return new SuccessDataResult<Employers>
		( employersDao.getByCompanyName(companyName),"Data Listelendi");
	}

	@Override
	public DataResult<Employers> getByCompanyNameAndCategory_CategoryId(String companyName, int categoryId) {
		return new SuccessDataResult<Employers>
		( employersDao.getByCompanyNameAndCategory_CategoryId(companyName, categoryId),"Data Listelendi");
	}

	@Override
	public DataResult<List<Employers>> getByCompanyNameOrCategory_CategoryId(String companyName, int categoryId) {
		return new SuccessDataResult<List<Employers>>
		( employersDao.getByCompanyNameOrCategory_CategoryId(companyName, categoryId),"Data Listelendi");

	}

	@Override
	public DataResult<List<Employers>> getByCategoryIn(List<Integer> categories) {
		return new SuccessDataResult<List<Employers>>
		( employersDao.getByCategoryIn(categories),"Data Listelendi");

	}

	@Override
	public DataResult<List<Employers>> getByCompanyNameContains(String companyName) {
		return new SuccessDataResult<List<Employers>>
		( employersDao.getByCompanyNameContains(companyName),"Data Listelendi");

	}

	@Override
	public DataResult<List<Employers>> getByCompanyNameStartsWith(String companyName) {
		return new SuccessDataResult<List<Employers>>
		( employersDao.getByCompanyNameStartsWith(companyName),"Data Listelendi");

	}

	@Override
	public DataResult<List<Employers>> getByNameAndCategory(String companyName, int categoryId) {
		return new SuccessDataResult<List<Employers>>
		( employersDao.getByNameAndCategory(companyName, categoryId),"Data Listelendi");

	}
}