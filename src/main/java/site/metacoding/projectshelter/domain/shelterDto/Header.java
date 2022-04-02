package site.metacoding.projectshelter.domain.shelterDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Header {
    private String resultCode;
    private String resultMsg;
}
