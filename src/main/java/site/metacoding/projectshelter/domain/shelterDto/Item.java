package site.metacoding.projectshelter.domain.shelterDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Item {
    private String careAddr;
    private String careNm;
    private String careTel;
    private String closeDay;
    private String dataStdDt;
    private String divisionNm;
    private String dsignationDate;
    private String jibunAddr;
    private String lat;
    private String lng;
    private String orgNm;
    private String saveTrgtAnimal;
    private Integer rnum;
    private Integer specsPersonCnt;
    private Integer vetPersonCnt;
    private String weekCellEtime;
    private String weekCellStime;
    private String weekOprEtime;
    private String weekOprStime;
    private String weekendCellEtime;
    private String weekendCellStime;
    private String weekendOprEtime;
    private String weekendOprStime;
}
