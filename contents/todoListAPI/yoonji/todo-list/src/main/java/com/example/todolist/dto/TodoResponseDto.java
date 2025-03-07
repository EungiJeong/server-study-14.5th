package com.example.todolist.dto;

import com.example.todolist.domain.Todo;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class TodoResponseDto {
    private Long id;
    private String name;
    private String content;
    private Boolean isCompleted;

    @Builder
    public TodoResponseDto(Todo todo) {
        this.id = todo.getId();
        this.name = todo.getMember().getName();
        this.content = todo.getContent();
        this.isCompleted = todo.getIsCompleted();
    }
}
