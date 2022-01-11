package com.example.movie.naver;

import com.example.mini.naver.NaverClient;
import com.example.mini.naver.dto.SearchImageReq;
import com.example.mini.naver.dto.SearchMovieReq;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class NaverClientTest {

    @Autowired
    private NaverClient naverClient;

    @Test
    public void searchMovieTest(){

        var search = new SearchMovieReq();
        search.setQuery("지옥");

        var result = naverClient.searchMovie(search);
        System.out.println(result);
//        Assertions.assertNotNull(result.getItems().stream().findFirst().get().getDirector());
    }

    @Test
    public void searchImageTest(){
        var search = new SearchImageReq();
        search.setQuery("오징어게임");

        var result = naverClient.searchImage(search);
        System.out.println(result);
    }
}
