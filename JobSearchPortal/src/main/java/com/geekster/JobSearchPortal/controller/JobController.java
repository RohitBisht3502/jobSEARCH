package com.geekster.JobSearchPortal.controller;

import com.geekster.JobSearchPortal.model.Job;
import com.geekster.JobSearchPortal.model.Type;
import com.geekster.JobSearchPortal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JobController {
    @Autowired
    JobService jobService;

    @PostMapping("Jobs")
    public String addJobs(@RequestBody List<Job> newJob){
       return jobService.addJobs(newJob);
    }

    @GetMapping("Jobs")
    public List<Job> getJobs(){
        return jobService.getJobs();
    }

    @DeleteMapping("Job/id/{id}")
    public String removeJobs(@PathVariable Long id){
        return jobService.removeJobs(id);
    }
    @PutMapping("Job/id/{id}")
    public String updateJobById(@RequestParam Long id,@RequestParam double price){
        return jobService.updateJobById(id,price);
    }



}

