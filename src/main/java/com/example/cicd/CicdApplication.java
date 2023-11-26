package com.example.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CicdApplication {

  @GetMapping("/welcome")
    public String welcome(){
    return "welcome to javatechine";
  }
//  echo "# CICD_IMPL" >> README.md
//  git init
//  git add README.md
//  git commit -m "first commit"
//  git branch -M main
//  git remote add origin https://github.com/bapusultane/CICD_IMPL.git
//  git push -u origin main
	public static void main(String[] args) {
		SpringApplication.run(CicdApplication.class, args);
	}

}
