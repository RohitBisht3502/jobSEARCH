package com.geekster.JobSearchPortal.repo;

import com.geekster.JobSearchPortal.model.Job;
import com.geekster.JobSearchPortal.model.Type;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJobRepo extends CrudRepository<Job,Long> {

    


}
