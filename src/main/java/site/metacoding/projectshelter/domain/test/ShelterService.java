package site.metacoding.projectshelter.domain.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import site.metacoding.projectshelter.domain.test.Shelter.Response.Body.Items.Item;

@RequiredArgsConstructor
@Service
public class ShelterService {

    private final ShelterRepository repository;

    @Transactional
    public List<ShelterDto> download(ShelterDto shelterDto) {

        List<ShelterDto> shelterList = new ArrayList<>();

        try {
            StringBuffer sb = new StringBuffer();

            sb.append("http://openapi.animal.go.kr/openapi/service/rest/animalShelterSrvc/");
            sb.append("shelterInfo?ServiceKey=");
            sb.append(
                    "jDqHGG%2BaNG47ijh6s3XzB%2BuF8fJOeovccnw%2FZtc9wLQUaKJumPo%2Frl1a2ygZ68dv9L0PD7drvpjPAeTnnB9f%2FQ%3D%3D&");
            sb.append("numOfRows=10&");
            sb.append("pageNo=1&");
            sb.append("_type=json");

            URL url = new URL(sb.toString());

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));

            StringBuilder responseJson = new StringBuilder();

            String response;
            while (true) {
                response = br.readLine();

                if (response == null) {
                    break;
                }
                responseJson = responseJson.append(response);
            }

            // System.out.println(responseJson);

            Gson gson = new Gson();
            Shelter responseDto = gson.fromJson(responseJson.toString(), Shelter.class);

            // System.out.println(responseDto);

            List<Item> result = responseDto.getResponse().getBody().getItems().getItem();

            for (int i = 0; i < result.size(); i++) { // result ?????????
                ShelterDto items = new ShelterDto(i,
                        result.get(i).getDataStdDt(),
                        result.get(i).getDsignationDate(),
                        result.get(i).getLat(),
                        result.get(i).getLng(),
                        result.get(i).getRnum(),
                        result.get(i).getSpecsPersonCnt(),
                        result.get(i).getVetPersonCnt(),
                        // ?????????
                        result.get(i).getCareNm(),
                        result.get(i).getOrgNm(),
                        result.get(i).getDivisionNm(),
                        result.get(i).getSaveTrgtAnimal(),
                        result.get(i).getCareAddr(),
                        result.get(i).getJibunAddr(),
                        result.get(i).getWeekOprStime(),
                        result.get(i).getWeekOprEtime(),
                        result.get(i).getWeekCellStime(),
                        result.get(i).getWeekCellEtime(),
                        result.get(i).getWeekendCellStime(),
                        result.get(i).getWeekendCellEtime(),
                        result.get(i).getWeekendOprStime(),
                        result.get(i).getWeekendOprEtime(),
                        result.get(i).getCloseDay(),
                        result.get(i).getCareTel());

                // ?????????

                shelterList.add(items);
            }
            System.out.println("????????? ?????????" + shelterList);
        } catch (Exception e) {
            System.out.println("??????" + e.getMessage());
        }
        List<ShelterDto> shelterEntity = repository.saveAll(shelterList);
        System.out.println("?????? Entity = " + shelterEntity);
        return shelterEntity;
    }
}
