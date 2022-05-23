package com.summerroot.summerpiece.service;

import com.summerroot.summerpiece.domain.Board;
import com.summerroot.summerpiece.domain.Member;
import com.summerroot.summerpiece.domain.Project;
import com.summerroot.summerpiece.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;


    public List<Board> findAll() {
        return boardRepository.findAll();
    }
}
