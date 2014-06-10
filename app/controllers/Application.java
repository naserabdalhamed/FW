package controllers;

import models.Calculator;
import play.*;
import play.data.Form;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {
	static Form<Calculator> calForm = Form.form(Calculator.class);
	
    public static Result index() {
    	return redirect( routes.Application.showsum());
    }
    public static Result showsum() {
    	return ok(views.html.index.render(calForm));
    }   
    public static Result sum() {
    	Form<Calculator> filledForm = calForm.bindFromRequest();
  	  if(filledForm.hasErrors()) {
  	    return badRequest(
  	      views.html.index.render(filledForm)
  	    );
  	  } else {
  	    return ok("sum = "+Calculator.sum(filledForm.get())); 
  	  }
    }   
}
