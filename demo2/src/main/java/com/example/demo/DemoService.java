package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DemoService {
    // demo service 작성
    private final PopupService popupService;

    public void printBabo() {
        System.out.println("Babo");
        popupService.add("1", "Babo");
    }

}
