package br.com.alura.forum.controller.dto;

import br.com.alura.forum.model.Topic;
import lombok.Getter;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;

@Getter
public class TopicDTO {

    private final Long id;
    private final String title;
    private final String message;
    private final LocalDateTime creationDate;

    public TopicDTO(Topic topic) {
        this.id = topic.getId();
        this.title = topic.getTitle();
        this.message = topic.getMessage();
        this.creationDate = topic.getCreationDate();
    }

    public static Page<TopicDTO> converter(Page<Topic> topics) {
        return topics.map(TopicDTO::new);
    }

}
