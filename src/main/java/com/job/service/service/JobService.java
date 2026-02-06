package com.job.service.service;

import com.job.service.entity.JobEntity;
import com.job.service.repo.JobRepo;
import com.job.service.request.JobRequestDto;
import com.job.service.response.JobResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@RequiredArgsConstructor
public class JobService {
    private final JobRepo jobRepo;

    public JobResponseDto createJob(JobRequestDto dto){
        JobEntity entity = new JobEntity();
        entity.setId(dto.getId());
        entity.setTitle(dto.getTitle());
        entity.setCompany(dto.getCompany());
        entity.setCreatedBy(entity.getCreatedBy());
        entity.setLastUpdatedBy(entity.getLastUpdatedBy());
        entity.setCreatedDate(Instant.now());
        entity.setLastUpdatedDate(Instant.now());
        jobRepo.save(entity);
        return JobResponseDto.builder().msg("Job Created Successfully").build();
    }
}
