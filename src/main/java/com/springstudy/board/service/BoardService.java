package com.springstudy.board.service;

import com.springstudy.board.entity.Board;
import com.springstudy.board.repository.BoardRepository;
import jakarta.servlet.http.PushBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.swing.plaf.PanelUI;
import java.util.List;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    //글 생성 처리
    public void write(Board board) {
        board.getContent();
        boardRepository.save(board);
    }
    //게시글 리스트 처리
    public List<Board> boardList() {

        return boardRepository.findAll();
    }

    //특정 게시글 불러오기
    public Board boardView(Model model){

        model .addAttribute("board",boardRepository.findAll(id));
        return "boardview";
    }
}
