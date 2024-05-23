package com.luv2code.jobportal.services;

import com.luv2code.jobportal.entity.JobPostActivity;
import com.luv2code.jobportal.repository.JobPostActivityRepository;
import org.springframework.stereotype.Service;

@Service
public class JobPostActivityService {

    private final JobPostActivityRepository jobPostActivityRepository;

    public JobPostActivityService(JobPostActivityRepository jobPostActivityRepository) {
        this.jobPostActivityRepository = jobPostActivityRepository;
    }

    public JobPostActivity addNew(JobPostActivity jobPostActivity) {
        return jobPostActivityRepository.save(jobPostActivity);
    }
}
