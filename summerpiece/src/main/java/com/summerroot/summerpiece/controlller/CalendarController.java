package com.summerroot.summerpiece.controlller;

import com.summerroot.summerpiece.domain.Calendar;
import com.summerroot.summerpiece.domain.Member;
import com.summerroot.summerpiece.service.CalendarService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.TypeMismatchException;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
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
    public List<Calendar> getScheduleList(@AuthenticationPrincipal Member member){

        List<Calendar> calendarList = calendarService.findCalendarList(member.getId());

        return calendarList;
    }

    @PostMapping("/calendar/schedule")
    @ResponseBody
    public String addSchedule(@AuthenticationPrincipal Member member, @ModelAttribute Calendar calendar){
        calendar.calendarInfoInit(member);
        calendarService.saveCalendar(calendar);
        return calendar.getId().toString();
    }

    @GetMapping("/calendar/schedule/{id}")
    @ResponseBody
    public Calendar getSchedule(@PathVariable Long id){
        Calendar calendar = calendarService.findCalendar(id);
        return calendar;
    }

    @PutMapping("/calendar/schadule/{id}")
    @ResponseBody
    public String updateSchedule(@PathVariable("id") Long id, @ModelAttribute Calendar calendar){
        calendar.updateCalendar(id);
        calendarService.updateCalendar(calendar);

        return id.toString();
    }

    @DeleteMapping("/calendar/schedule/{id}")
    @ResponseBody
    public String deleteSchedule(@PathVariable("id") Long id){
        calendarService.deleteCalendar(id);
        return id.toString();
    }

    @ExceptionHandler(TypeMismatchException.class)
    public String handleTypeMismatchException() {
        return "error/500";
    }

}
