package site.metacoding.projectshelter.domain.web;

import java.net.URI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import site.metacoding.projectshelter.domain.shelterDto.ShelterResponseDto;

@RestController
public class TestApiController {

    @GetMapping("/test")
    public void test() {

        try {
            String key = "jDqHGG%2BaNG47ijh6s3XzB%2BuF8fJOeovccnw%2FZtc9wLQUaKJumPo%2Frl1a2ygZ68dv9L0PD7drvpjPAeTnnB9f%2FQ%3D%3D";

            URI uri = new URI(
                    "http://openapi.animal.go.kr/openapi/service/rest/animalShelterSrvc/shelterInfo?&ServiceKey="
                            + key + "&numOfRows=2&pageNo=1&_type=json");

            RestTemplate restTemplate = new RestTemplate();

            ShelterResponseDto response = restTemplate.getForObject(uri, ShelterResponseDto.class);

            System.out.println(response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
