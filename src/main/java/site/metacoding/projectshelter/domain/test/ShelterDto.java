package site.metacoding.projectshelter.domain.test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class ShelterDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String dataStdDt;
    private String dsignationDate;
    private String lat;
    private String lng;
    private Integer rnum;
    private Integer specsPersonCnt;
    private Integer vetPersonCnt;

    private String careNm; // 동물보호센터명 1
    private String orgNm; // 관리기관명 2
    private String divisionNm; // 동물보호센터유형 3
    private String saveTrgtAnimal; // 구조대상동물 4
    private String careAddr; // 소재지 도로명 주소 5
    private String jibunAddr; // 소재지 지번 주소 6
    private String weekOprStime; // 평일운영시작시각7
    private String weekOprEtime; // 평일운영종료시각8
    private String weekCellStime; // 평일분양시작시각9
    private String weekCellEtime; // 평일분양종료시각10
    private String weekendCellStime; // 주말운영시작시각11
    private String weekendCellEtime; // 주말운영종료시각12
    private String weekendOprStime; // 주말분양시작시각13
    private String weekendOprEtime; // 주말분양종료시각14
    private String closeDay; // 휴무일15
    private String careTel; // 전화번호16

}
