package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.user;


@Controller
public class ContactController {
	
	
	
	
	@ModelAttribute
	public void commondataform(Model m) {
		
		m.addAttribute("Header", "learn with emran");
		m.addAttribute("Desc","Home for programmer");
		System.out.println("firt execute this before method");
		
	}
	
	@RequestMapping("/contact")
	public String showform( Model m) {
		System.out.println("after that");
		
		return "contact";
	}
	
	
	
	
	@RequestMapping(value ="/processform" , method =RequestMethod.POST)
  public String  HandleForm(@ModelAttribute user user , Model model) {
		System.out.println(user);
//		model.addAttribute("Header", "learn with emran");
//		model.addAttribute("Desc","Home for programmer");
		//model.addAttribute(user);
		
		return "success";
		
	}
}
		
//		
//		 model.addAttribute("email",userEmail);
//		  model.addAttribute("userName",userName);
//			model.addAttribute("password",userPassword);
//			  
//
//
//  System.out.println(userEmail);
//  System.out.println(userName);
//  System.out.println(userPassword);
//	  return "success";
//  }
//}



  
//  old vesion h ye use nahi hota hain
  
//  (HttpServletRequest request)
//	  {
//		String email=request.getParameter("email");
//		System.out.println(email);
//	  
	  
	  
	  
	  //( @RequestParam("email") String userEmail, 
//			      @RequestParam("userName") String userName ,
//			      @RequestParam("password") String userPassword ) {
//		
//		
//		  System.out.println(userEmail);
//		  System.out.println(userName);
//		  System.out.println(userPassword);
//			  return " ";
//		  }


	
	

	  
		 
		 
	// model annotation ke liye bnata hain
		
		
		
//		user user=new user();
//		user.setEmail(userEmail);
//		user.setUserName(userName);
//		user.setPassword(userPassword);
////		
//		
//		System.out.println(user);
//		
//		model.addAttribute("user",user);
//		
//	  model.addAttribute("email",userEmail);
//	  model.addAttribute("userName",userName);
//		model.addAttribute("password",userPassword);
//		  
	
//// ye wala param annotation wala  handler hain
//( @RequestParam("email") String userEmail, 
//	      @RequestParam("userName") String userName ,
//		      @RequestParam("password") String userPassword , Model model) {
//			
//			
//			
//			
//			
//			user user=new user();
//		user.setEmail(userEmail);
//		user.setUserName(userName);
//		user.setPassword(userPassword);
//		System.out.println(user);
//		
//		model.addAttribute("user",user);
//		  return "success";
//	}
