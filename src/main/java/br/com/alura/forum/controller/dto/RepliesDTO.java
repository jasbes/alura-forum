package br.com.alura.forum.controller.dto;

import br.com.alura.forum.model.Replies;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class RepliesDTO {

    private final Long id;
    private final String message;
    private final LocalDateTime creationDate;
    private final String authorName;

    public RepliesDTO(Replies replies) {
        this.id = replies.getId();
        this.message = replies.getMessage();
        this.creationDate = replies.getCreationDate();
        this.authorName = replies.getAuthor().getName();
    }

}
