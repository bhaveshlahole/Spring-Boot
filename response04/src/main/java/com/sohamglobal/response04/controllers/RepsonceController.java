package com.sohamglobal.response04.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sohamglobal.response04.dtos.Film;

@Controller
public class RepsonceController {

		@GetMapping("/")
		public String home()
		{
			return "index.html";
		}
		
		@GetMapping("/showdata")
		public String showData(Model m)
		{
			String developer = "Pitter";
			String company = "Stark industries";
			String technology = "java Spring Boot";
			
			m.addAttribute("devnm",developer);
			m.addAttribute("cnm",company);
			m.addAttribute("tech",technology);
			m.addAttribute("demoby","bhavesh");
			return "ShowingJavaData.jsp";
		}
		
		@GetMapping("/newfilm")
		public String newfilm()
		{
			return "AcceptFilmData.html";
		}
		
		@PostMapping("addfilm")
		public String addFilm(Film obj,Model model)
		{
			System.out.println(obj.getFilmname());
			model.addAttribute("film",obj);
			return "FilmAdded.jsp";
		}
}
