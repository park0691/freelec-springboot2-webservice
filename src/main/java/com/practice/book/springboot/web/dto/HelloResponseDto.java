package com.practice.book.springboot.web.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HelloResponseDto {
    private String name;
    private int amount;
}
