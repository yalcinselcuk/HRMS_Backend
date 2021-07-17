package HRMS.hrms.business.abstracts;

import java.util.List;

import HRMS.hrms.core.utilities.results.DataResult;
import HRMS.hrms.core.utilities.results.Result;
import HRMS.hrms.entities.concretes.Employers;


public interface EmployersService {
	DataResult<List<Employers>> getAll();
	Result add(Employers employers);
	
	DataResult<Employers> getByCompanyName(String companyName);
	
	DataResult<Employers> getByCompanyNameAndCategory_CategoryId(String companyName,int categoryId);

	DataResult<List<Employers>> getByCompanyNameOrCategory_CategoryId(String companyName,int categoryId);
	
	DataResult<List<Employers>> getByCategoryIn(List<Integer> categories); 
	
	DataResult<List<Employers>> getByCompanyNameContains(String companyName);
	
	DataResult<List<Employers>> getByCompanyNameStartsWith(String companyName);
	
	DataResult<List<Employers>> getByNameAndCategory(String companyName,int categoryId);
}
