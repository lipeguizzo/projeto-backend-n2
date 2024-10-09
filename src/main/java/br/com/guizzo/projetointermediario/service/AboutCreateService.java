package br.com.guizzo.projetointermediario.service;

import br.com.guizzo.projetointermediario.domain.dto.AboutCreateDto;
import br.com.guizzo.projetointermediario.domain.entity.About;
import org.springframework.stereotype.Service;

@Service
public class AboutCreateService {
    public About execute(AboutCreateDto dto){
        return new About(dto.project(), dto.name());
    }
}
