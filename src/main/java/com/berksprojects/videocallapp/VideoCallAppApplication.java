package com.berksprojects.videocallapp;

import com.berksprojects.videocallapp.Service.UserService;
import com.berksprojects.videocallapp.User.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideoCallAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(VideoCallAppApplication.class, args);
	}
}
