package com.example.memo_homework.dto;

import lombok.Getter;

@Getter
public class MemoRequestDto {
    private String title;
    private String username;
    private String contents;
    private String password;

}