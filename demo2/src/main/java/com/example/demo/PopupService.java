package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PopupService {
    // popup service 작성
    private static final Map<String, String> popupStorage = new HashMap<>();

    public void add(String id, String content) {
        popupStorage.put(id, content);
    }
}
