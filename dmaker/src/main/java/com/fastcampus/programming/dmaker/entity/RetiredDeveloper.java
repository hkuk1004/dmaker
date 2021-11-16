package com.fastcampus.programming.dmaker.entity;

import com.fastcampus.programming.dmaker.type.DeveloperLevel;
import com.fastcampus.programming.dmaker.type.DeveloperSkillType;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
public class RetiredDeveloper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;


    private String memberId; // 특정아이디
    private String name; // 이름

    // Auditing 방식
    @CreatedDate    // 생성 시점
    private LocalDateTime createdAt;

    @LastModifiedDate   // 수정 시점
    private LocalDateTime updatedAt;

}
