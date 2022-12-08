package com.example.memo_homework.controller;

import com.example.memo_homework.dto.MemoRequestDto;
import com.example.memo_homework.entity.Memo;
import com.example.memo_homework.repository.MemoRepository;
import com.example.memo_homework.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemoController {

    private final MemoService memoService;

    @GetMapping("/")
    public ModelAndView home() {
        return new ModelAndView("index");
    }

    @PostMapping("/api/memosHW")
    public Memo createMemo(@RequestBody MemoRequestDto requestDto){
        return memoService.createMemo(requestDto);
    }

    @GetMapping("/api/memosHW")
    public List<Memo> getMemos(){
        return memoService.getMemos();
    }

    @PutMapping("/api/memosHW/{id}")
    public Long updateMemo(@PathVariable Long id, @RequestBody MemoRequestDto requestDto) {
        return memoService.update(id, requestDto);
    }
    @DeleteMapping("/api/memosHW/{id}")
    public Long deleteMemo(@PathVariable Long id) {
        return memoService.deleteMemo(id);
    }

    @GetMapping("/api/memosHW/{id}")
    @PutMapping("/api/memosHW/{id}")
    public Long passwordCheck(@PathVariable Long id) {
        return memoService.deleteMemo(id);
    }



}
