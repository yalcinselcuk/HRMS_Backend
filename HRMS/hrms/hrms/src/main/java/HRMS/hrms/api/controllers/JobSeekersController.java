package HRMS.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMS.hrms.business.abstracts.JobSeekersService;
import HRMS.hrms.core.utilities.results.DataResult;
import HRMS.hrms.core.utilities.results.Result;
import HRMS.hrms.entities.concretes.JobSeekers;


@RestController
@RequestMapping("/api/jobSeekers")
public class JobSeekersController {
	
	private JobSeekersService jobSeekersService;
	
	@Autowired
	public JobSeekersController(JobSeekersService jobSeekersService) {
		super();
		this.jobSeekersService = jobSeekersService;
	}
	
	@GetMapping("/getall")
	public DataResult< List<JobSeekers>> getAll(){
		return this.jobSeekersService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody JobSeekers jobSeekers) {
		return this.jobSeekersService.add(jobSeekers);
	}
}
