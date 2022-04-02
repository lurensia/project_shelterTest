package site.metacoding.projectshelter.domain.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.projectshelter.domain.test.ShelterDto;
import site.metacoding.projectshelter.domain.test.ShelterService;

@RequiredArgsConstructor
@Controller
public class TestController {

    private final ShelterService service;

    @GetMapping("/")
    public String Download(ShelterDto shelterDto, Model model) {

        List<ShelterDto> shelterEntity = service.download(shelterDto);

        System.out.println("받은 entity = " + shelterEntity);

        model.addAttribute("list", shelterEntity);

        return "/shelterDownload";
    }

}
