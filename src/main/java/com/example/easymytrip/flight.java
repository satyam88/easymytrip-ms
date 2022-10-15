package com.example.easymytrip;

@RestController
public class flight {
    @GetMapping("/myflight")
    public String getData(){
        return "Please book your hhhh Flight ticket, Choose Your Fav Airlines Idigo";
    }

}