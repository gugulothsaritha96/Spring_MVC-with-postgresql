package com.rungroup.web.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="club")
public class Club {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String photourl;
    private String content;
    @CreationTimestamp
    private LocalDateTime createdon;
    @UpdateTimestamp
    private LocalDateTime updatedon;

}
