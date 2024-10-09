package br.com.guizzo.projetointermediario.controller;

import br.com.guizzo.projetointermediario.domain.dto.WeatherCityResponseDto;
import br.com.guizzo.projetointermediario.domain.dto.WeatherGeocodingDto;
import br.com.guizzo.projetointermediario.domain.dto.WeatherGeocodingResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

import java.util.ArrayList;

@RestController
@RequestMapping("/clima")
public class ClimateController {

    private String apiKey = "bdf08755b0987783701f25fd7610b828";

    private RestClient client = RestClient.create("https://api.openweathermap.org/");

    @GetMapping("/{city}")
    public ResponseEntity<?> findClimate(@PathVariable String city) {
        try {
            WeatherCityResponseDto data = client
                    .get()
                    .uri("data/2.5/weather?q=" + city + "&appid=" + apiKey)
                    .retrieve()
                    .body(WeatherCityResponseDto.class);
            return ResponseEntity.ok(data);
        }catch (Exception error){
            return ResponseEntity.badRequest().body(error);
        }
    }

    @PostMapping()
    public ResponseEntity<?> createGeocoding(@RequestBody WeatherGeocodingDto dto) {
        try {
            ArrayList<WeatherGeocodingResponseDto> data = client
                    .get()
                    .uri("geo/1.0/direct?q=" + dto.city() + "&appid=" + apiKey)
                    .retrieve()
                    .body(ArrayList.class);
            return ResponseEntity.ok(data);
        }catch (Exception error){
            return ResponseEntity.badRequest().body(error);
        }
    }
}
