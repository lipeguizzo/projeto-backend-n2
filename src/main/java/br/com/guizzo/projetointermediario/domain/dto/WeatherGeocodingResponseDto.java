package br.com.guizzo.projetointermediario.domain.dto;

public record WeatherGeocodingResponseDto(
        String name,
        Object local_names,
        Long lat,
        Long lon,
        String country,
        String state
) {
}
