package HRMS.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import HRMS.hrms.business.abstracts.EmployersService;
import HRMS.hrms.core.utilities.results.DataResult;
import HRMS.hrms.core.utilities.results.Result;
import HRMS.hrms.entities.concretes.Employers;


@RestController
@RequestMapping("/api/employers")
public class EmployersController {
	
	private EmployersService employersService;
	
	@Autowired
	public EmployersController(EmployersService employersService) {
		super();
		this.employersService = employersService;
	}
	
	@GetMapping("/getall")
	public DataResult< List<Employers>> getAll(){
		return this.employersService.getAll();
	}
	@PostMapping("/add")
	public Result add (@RequestBody Employers employers) {
		return this.employersService.add(employers);
	}
	
	@GetMapping("/getByCompanyName")
	public DataResult <Employers> getByCompanyName(@RequestParam String companyName){
		return this.employersService.getByCompanyName(companyName);
	}
	
}


