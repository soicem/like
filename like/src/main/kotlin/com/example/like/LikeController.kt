package com.example.like

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class LikeController {
    @GetMapping("/")
    fun index(@RequestParam("like") like: String) = "$like!"
}