package com.cafe33.web;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

import com.cafe33.web.pages.HomePage;

/**
 * @author Riseven
 */
public class Cafe33Web extends WebApplication {
    public Cafe33Web() {
        
    }
    
    @Override
    public void init(){
    	
    }

	@Override
	public Class<? extends Page> getHomePage() {
		// TODO Auto-generated method stub
		return HomePage.class;
	}
}
  