package com.bobocode.demo.controller;

import com.bobocode.demo.client.NasaPicturesClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/nasa/pictures")
@RequiredArgsConstructor
public class NasaPicturesController {
    private final NasaPicturesClient nasaPicturesClient;

    @GetMapping
    public String getAllPicturesUrl(){
        return nasaPicturesClient.getAllPicturesUrl()
                .stream()
                .collect(Collectors.joining("\n"));
    }
}
