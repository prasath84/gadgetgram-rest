package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Product;
import com.example.demo.Model.Signup1;
import com.example.demo.Repo.SignupRepo;
@RequestMapping("/signup")
@RestController

public class SignupController {

@Autowired
public SignupRepo SignupRepo;

@PostMapping("/insert")
 public String insertUser(@RequestBody Signup1 signup){
        Signup1 sign = new Signup1();
        sign.setName(signup.getName());
        sign.setEmail(signup.getEmail());
        sign.setPassword(signup.getPassword());
        sign.setConfirmpassword(signup.getConfirmpassword());
        sign.setPhonenumber(signup.getPhonenumber());
        SignupRepo.saveAndFlush(sign);
        return "Signup SuccessFully";
    }

    @GetMapping("/get")
public List<Signup1> getAll() {
    return SignupRepo.findAll();
}

}
