package com.geekster.JobSearchPortal.service;

import com.geekster.JobSearchPortal.model.Job;
import com.geekster.JobSearchPortal.model.Type;
import com.geekster.JobSearchPortal.repo.IJobRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    IJobRepo jobRepo;

    public String addJobs(List<Job> newJob) {
        jobRepo.saveAll(newJob);
        return "JOBS ADDED";
    }


    public List<Job> getJobs(){
        return (List<Job>) jobRepo.findAll();
    }


    public String removeJobs(Long id) {
         jobRepo.deleteById(id);
        return "JOBS REMOVED";
    }

    public String updateJobById(Long id, double price) {
        Job job = jobRepo.findById(id).orElse(null);
        if(job != null)
        {
            job.setJobSalary(price);
            jobRepo.save(job);
            return "salary updated!!";
        }
        else {
            return "job not found!";
        }
    }

}
