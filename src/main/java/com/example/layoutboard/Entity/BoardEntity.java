package com.example.layoutboard.Entity;

import jakarta.persistence.*;
import lombok.*;

//개발자가 설계한 테이블을 가지고 작업
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name="board")
public class BoardEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id")
    private Integer id; //일련번호
    @Column(name="subject", length = 100, nullable = false)
    private String subject; //제목
    @Column(name="subject", length = 200)
    private String content; //내용
    //length를 이용해서 길이의 제약, input태그에서 같이 제약
}
