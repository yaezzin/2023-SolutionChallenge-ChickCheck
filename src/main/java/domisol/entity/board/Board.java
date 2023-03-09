package domisol.entity.board;

import domisol.entity.member.Member;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@RequiredArgsConstructor
@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String location;

    private LocalDateTime start;

    private LocalDateTime end;

    private String description;

    @ManyToOne
    private Member member;

}
