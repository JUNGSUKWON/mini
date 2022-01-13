package com.example.mini.service;

import com.example.mini.utils.NaverAPI;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class NaverApiService {
    private final NaverAPI api;
    public String searchMovie(String data) {
        return api.searchMovie(data);
    }
}
