package com.summerroot.summerpiece.controlller;

import com.summerroot.summerpiece.domain.Calendar;
import com.summerroot.summerpiece.domain.Member;
import com.summerroot.summerpiece.service.CalendarService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
public class CalendarController {

    private final CalendarService calendarService;

    @GetMapping("/calendar/view")
    public String calendarView(){
        return "calendar/calendarMain";
    }

    @GetMapping("/calendar/schedule")
    @ResponseBody
    public List<Calendar> getScheduleList(){
        Member m = new Member();

        List<Calendar> calendarList = calendarService.findCalendarList(m.getId());

        return calendarList;
    }

    @PostMapping("/calendar/schedule/{id}")
    @ResponseBody
    public String addSchedule(@PathVariable String id){
        return "";
    }


    @DeleteMapping("/calendar/schedule/{id}")
    @ResponseBody
    public String deleteSchedule(@PathVariable String id){
        return "";
    }

    @PutMapping("/calendar/schadule")
    @ResponseBody
    public String updateSchedule(){
        return "";
    }

}
