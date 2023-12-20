package com.example.quartzjob.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table
@Entity
public class SchedulerJobInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobId;
    private String jobName;
    private String jobGroup;
    private String jobStatus;
    private String jobClass;
    private String cronExpression;
    private String descN;
    private String interfaceName;
    private Long repeatTime;
    private Boolean cronJob;
}
