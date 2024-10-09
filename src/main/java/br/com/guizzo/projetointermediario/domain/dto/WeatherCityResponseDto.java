package br.com.guizzo.projetointermediario.domain.dto;

import java.util.List;

public record WeatherCityResponseDto(
        Object coord,
        List<Object> weather,
        String base,
        Object main,
        Integer visibility,
        Object wind,
        Object rain,
        Object clouds,
        Integer dt,
        Object sys,
        Integer timezone,
        Integer id,
        String name,
        Integer cod
) { }
