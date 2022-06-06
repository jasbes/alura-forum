package br.com.alura.forum.controller.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class TokenDTO {
    private final String token;
    private final String type;
}
