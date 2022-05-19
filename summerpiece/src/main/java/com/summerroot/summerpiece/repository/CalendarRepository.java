package com.summerroot.summerpiece.repository;

import com.summerroot.summerpiece.domain.Calendar;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class CalendarRepository {

    private final EntityManager em;

    public List<Calendar> findCalendarList(int memberId) {
        String jpql = "select c from Calendar c wherw c.member = " + memberId;

        return em.createQuery(jpql, Calendar.class).getResultList();
    }
}
