package site.metacoding.projectshelter.domain.test;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Shelter {
    private Response response;

    @AllArgsConstructor
    @Data
    class Response {
        private Header Header;
        private Body Body;

        @AllArgsConstructor
        @Data
        class Header {
            private int resultCode;
            private String resultMsg;
        }

        @AllArgsConstructor
        @Data
        class Body {
            private Items items;
            private Integer numOfRows;
            private Integer pageNo;
            private Integer totalCount;

            @AllArgsConstructor
            @Data
            class Items {
                private List<Item> item;

                @AllArgsConstructor
                @Data
                class Item {
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
            }
        }
    }
}
