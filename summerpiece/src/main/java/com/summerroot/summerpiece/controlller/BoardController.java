package com.summerroot.summerpiece.controlller;

import com.summerroot.summerpiece.domain.Board;
import com.summerroot.summerpiece.domain.Member;
import com.summerroot.summerpiece.domain.Project;
import com.summerroot.summerpiece.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping("board/list")
    public String boardList(HttpServletRequest request){
        List<Board> boardList = boardService.findAll();
        for(Board b:boardList){
            System.out.println(b);
        }

        return "board/boardList";
    }

}
