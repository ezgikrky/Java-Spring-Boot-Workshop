package com.example.JavaSpringBootWorkshop.controller;
import com.example.JavaSpringBootWorkshop.service.WelcomeService;
import org.springframework.web.bind.annotation.*;


@RestController // springi tanıtıp contrellerin içine yükledik.
@RequestMapping("/welcome")

public class ChatController {

    private final WelcomeService welcomeService;
    public ChatController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }

    @PostMapping("/prompt")
    public String gratings(@RequestBody String name){ // @RequestBody olmazsa null gelir isim gözükmez
        return welcomeService.sayHi(name);
    }

    // 2 farklı veri gçnderme tipi var
    @GetMapping("/{name}")
    public String sayHi(@PathVariable(name="name") String name){
        return welcomeService.sayHi(name);
    }
}
