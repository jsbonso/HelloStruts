package com.tutorialsdojo.hello.action;

//import com.tutorialsdojo.hello.model.MessageStore;
import com.tutorialsdojo.hello.model.Greeting;
import com.opensymphony.xwork2.ActionSupport;
 
public class HelloWorld extends ActionSupport {
 
    private static final long serialVersionUID = 1L;
 
    //private MessageStore messageStore;
    private Greeting greeting;  
    
    public String execute() throws Exception {
         
    	greeting = new Greeting();
    	greeting.setMessage("Hello Struts!");
        return SUCCESS;
        
    }
 
    public Greeting getGreeting() {
        return greeting;
    }
 
    public void setGreeting(Greeting greeting) {
        this.greeting = greeting;
    }
 
}
