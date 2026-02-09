package com.job.service;

import com.job.service.request.JobRequestDto;
import com.job.service.response.JobResponseDto;
import com.job.service.service.JobService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/jobs")
public class JobController {

    private final JobService service;

    @PostMapping
    public JobResponseDto createJob(@Valid @RequestBody JobRequestDto dto){
        return service.createJob(dto);
    }

    @DeleteMapping("/delete/{id}")
    public JobResponseDto deleteJob(@PathVariable Long id)
    {
        service.deleteJob(id);
        return JobResponseDto.builder().msg("Job Deleted Successfully.").build();
    }

}
