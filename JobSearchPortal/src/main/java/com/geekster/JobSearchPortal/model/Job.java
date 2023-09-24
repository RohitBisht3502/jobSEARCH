package com.geekster.JobSearchPortal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Job {
    @Id
    private Long jobId;

    private String jobTitle;
    private String jobDescription;
    private String jobLocation;
    private Double jobSalary;
    private String companyEmail;
    private String companyName;
    private String employerName;
    @Enumerated(EnumType.STRING)
    private Type jobType;
    private LocalDateTime jobDateTime;
}
