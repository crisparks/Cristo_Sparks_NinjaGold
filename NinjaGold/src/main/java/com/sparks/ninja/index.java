package com.sparks.ninja;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


	@Controller
public class index {
		
		public int number(int i, int y) {
			Random rand = new Random();
			int n = rand.nextInt(i);
			n += y;
			return n;
		}
		
		@RequestMapping("")
	    public String home(HttpSession session){
	        Integer gold = (Integer) session.getAttribute("gold");
	        if (gold == null){
	            gold = 0;
	        }
	        session.setAttribute("gold", gold + 0);
	        return "index.jsp";
	    }
	    @RequestMapping("/farm")
	    public String farm(HttpSession session){
	    	Integer gold = (Integer) session.getAttribute("gold");
	        if (gold == null){
	            gold = 0;
	        }
	        session.setAttribute("gold", gold + number(20,10) );
	        return "farm.jsp";
	    }
	    @RequestMapping("/house")
	    public String house(HttpSession session){
	    	Integer gold = (Integer) session.getAttribute("gold");
	        if (gold == null){
	            gold = 0;
	        }
	        session.setAttribute("gold", gold + number(5,2) );
	        return "house.jsp";
	    }
	    @RequestMapping("/casino")
	    public String casino(HttpSession session){
	    	Integer gold = (Integer) session.getAttribute("gold");
	        if (gold == null){
	            gold = 0;
	        }
	        if(number(1,0) == 1) {
	        	session.setAttribute("gold", gold + 50 );
	        }
	        else {
	        	session.setAttribute("gold", gold - 50 );
	        }
	        return "casino.jsp";
	    }
	    

	    @RequestMapping("/reset")
	    public String reset(HttpSession session){
	        session.invalidate();
	        return "reset.jsp";
	    }
}
