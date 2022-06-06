package br.com.alura.forum.controller.dto;

import br.com.alura.forum.model.Topic;
import br.com.alura.forum.model.TopicStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Setter
@Getter
public class TopicDetailsDTO {

    private Long id;
    private String title;
    private String message;
    private LocalDateTime creationDate;
    private String authorName;
    private TopicStatus status;
    private List<RepliesDTO> replies;

    public TopicDetailsDTO(Topic topic) {
        this.id = topic.getId();
        this.title = topic.getTitle();
        this.message = topic.getMessage();
        this.creationDate = topic.getCreationDate();
        this.authorName = topic.getAuthor().getName();
        this.status = topic.getStatus();
        this.replies = new ArrayList<>();
        this.replies.addAll(topic.getReplies().stream().map(RepliesDTO::new).collect(Collectors.toList()));
    }

}
