package com.example.memo_homework.repository;


import com.example.memo_homework.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//JpaRepository를 상속받아서 데이터베이스와 연결

public interface MemoRepository extends JpaRepository<Memo, Long> {
    List<Memo> findAllByOrderByModifiedAtDesc();
}