package domisol.domain.board.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class WordRequest {
    private Long boardId;
    private String word;
    private int frequency;
}
