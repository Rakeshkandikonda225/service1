package com.job.service.request;

import lombok.Data;

import java.time.Instant;

@Data
public class JobRequestDto {
    private Long id;
    private String title;
    private String description;
    private String location;
    private String company;
    private String createdBy;
    private String lastUpdatedBy;
    private Instant createdDate;
    private Instant lastUpdatedDate;
}
