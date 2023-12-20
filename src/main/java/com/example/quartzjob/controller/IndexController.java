package com.example.quartzjob.controller;

import java.util.List;

import com.example.quartzjob.entity.SchedulerJobInfo;
import com.example.quartzjob.service.SchedulerJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    private SchedulerJobService scheduleJobService;

    @GetMapping("/index")
    public String index(Model model){
        List<SchedulerJobInfo> jobList = scheduleJobService.getAllJobList();
        model.addAttribute("jobs", jobList);
        return "index";
    }

}