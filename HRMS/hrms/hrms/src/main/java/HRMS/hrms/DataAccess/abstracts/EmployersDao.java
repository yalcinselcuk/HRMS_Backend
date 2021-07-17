package HRMS.hrms.DataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import HRMS.hrms.entities.concretes.Employers;


public interface EmployersDao extends JpaRepository<Employers,Integer>{
	
	Employers getByCompanyName(String companyName);
	
	Employers getByCompanyNameAndCategory_CategoryId(String companyName,int categoryId);

	List<Employers> getByCompanyNameOrCategory_CategoryId(String companyName,int categoryId);
	
	List<Employers> getByCategoryIn(List<Integer> categories); 
	
	List<Employers> getByCompanyNameContains(String companyName);
	
	List<Employers> getByCompanyNameStartsWith(String companyName);
	
	@Query("From Employers where companyName =: companyName and category.categoryId =: categoryId")
	List<Employers> getByNameAndCategory(String companyName,int categoryId); 

}