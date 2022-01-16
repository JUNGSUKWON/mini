package com.example.mini.web;


import com.example.mini.service.NaverApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ApiController {

    private final NaverApiService naverApiService;

    @GetMapping("/api/v1/movie")
    public String news(@RequestParam(value = "data", defaultValue = "없음") String data) {
        System.out.println(data);
        return naverApiService.searchMovie(data);
    }

}
