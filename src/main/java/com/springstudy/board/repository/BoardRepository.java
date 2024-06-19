package com.springstudy.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springstudy.board.entity.Board;
//주석
@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {
}

