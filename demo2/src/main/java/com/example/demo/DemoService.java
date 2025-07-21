package com.example.demo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
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
