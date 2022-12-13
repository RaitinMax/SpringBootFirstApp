package ru.netology.jclo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.jclo1.systemProfile.SystemProfile;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    private final SystemProfile systemProfile;

    public ProfileController(SystemProfile systemProfile) {
        this.systemProfile = systemProfile;
    }

    @GetMapping
    public String getProfile() {
        return systemProfile.getProfile();
    }
}
