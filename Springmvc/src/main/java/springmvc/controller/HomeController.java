package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		System.out.println("this is model only");
		model.addAttribute("name","emran Ansari");
		model.addAttribute("id",786);
		
		
		
		List<String> friends=new ArrayList<String>();
		friends.add("aman");
		friends.add("shanu");
		friends.add("emran");
		friends.add("786");
		model.addAttribute("f",friends);
		
		return "index";
	}
	
	@RequestMapping("/about")
	 public String about()
	 {
		 return "about";
	 }
	
	@RequestMapping("/services")
	public String services()
	{
		return "services";
	}
	
	@RequestMapping("/helper")
	public String helper()
	{
		return "helper";
	}
	
	
	
	// new controller creating for modelandview mthod
	
	// this is static data
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is controller");
	ModelAndView modelandview=new ModelAndView();
	
	modelandview.addObject("name", "emran");
	modelandview.addObject("name", "ar");
	modelandview.addObject("name", "aman");
	modelandview.addObject("name", "jaman");
	modelandview.setViewName("help");
	modelandview.addObject("rollnumber", 123);
	LocalDateTime now=LocalDateTime.now();
	modelandview.addObject("time", now);
	
	
	return modelandview;
	
	
	
		
		
		
		
	}
	
	
	
	
	
	
	}
	
	
	
	
	
	



