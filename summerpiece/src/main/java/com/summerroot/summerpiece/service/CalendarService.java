package com.summerroot.summerpiece.service;

import com.summerroot.summerpiece.domain.Calendar;
import com.summerroot.summerpiece.repository.CalendarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class CalendarService {

    private final CalendarRepository calendarRepository;

    public List<Calendar> findCalendarList(int id) {
        return calendarRepository.findCalendarList(id);
    }
}
