package com.rungroup.web.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@Builder
public class ClubDto {

    private Long id;
    private String title;
    private String photourl;
    private String content;
    private LocalDateTime createdon;
    private LocalDateTime updatedon;
}
