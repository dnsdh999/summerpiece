package com.summerroot.summerpiece.controlller;

import com.summerroot.summerpiece.domain.Member;
import com.summerroot.summerpiece.service.CalendarService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
@RequiredArgsConstructor
public class CalendarController {

    private final CalendarService calendarService;

    @GetMapping("/calendar/view")
    public String calendarView(){
        return "calendar/calendarMain";
    }

    @GetMapping("/calendar/getSchedule")
    @ResponseBody
    public String getSchedule(){
        Member m = new Member();

        calendarService.findCalendarList(m.getId());

        return "";
    }

    @PostMapping("/calendar/addSchedule")
    @ResponseBody
    public String addSchedule(){
        return "";
    }

}
