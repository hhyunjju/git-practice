package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
public class PopupService {
    // popup service 작성
    private static final Map<String, String> popupStorage = new HashMap<>();

    public void add(String id, String content) {
        popupStorage.put(id, content);
    }
}
