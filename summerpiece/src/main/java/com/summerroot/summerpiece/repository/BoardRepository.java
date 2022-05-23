package com.summerroot.summerpiece.repository;

import com.summerroot.summerpiece.domain.Board;
import com.summerroot.summerpiece.domain.Member;
import com.summerroot.summerpiece.domain.Project;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardRepository {
    private final EntityManager em;

    public List<Board> findAll() {
        return em.createQuery("select b from Board b", Board.class)
                .getResultList();
    }
}
