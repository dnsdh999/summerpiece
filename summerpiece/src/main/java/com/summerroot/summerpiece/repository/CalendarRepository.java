package com.summerroot.summerpiece.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class CalendarRepository {

    private final EntityManager em;

}
