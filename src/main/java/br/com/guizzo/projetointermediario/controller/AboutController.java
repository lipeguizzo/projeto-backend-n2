package br.com.guizzo.projetointermediario.controller;

import br.com.guizzo.projetointermediario.domain.dto.AboutCreateDto;
import br.com.guizzo.projetointermediario.domain.entity.About;
import br.com.guizzo.projetointermediario.service.AboutCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sobre")
public class AboutController {

    @Autowired
    AboutCreateService aboutCreateService;

    @GetMapping()
    public ResponseEntity<?> findAbout() {
        try {
            AboutCreateDto dto = new AboutCreateDto("Serviço de meteorologia", "Filipe Guizzo");
            return ResponseEntity.ok(aboutCreateService.execute(dto));
        }catch (Exception error){
            return ResponseEntity.badRequest().body(error);
        }
    }
}
