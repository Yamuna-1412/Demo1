package sprint.bootexample.sprintbootexample.PostandGet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Question1and2 {

	//Create  a simple Rest APU to print the hello world in browser using @GetMapping
	@GetMapping("/hello")
	public  String home()
	{
		return "Hello World";
	}
	
	//Post the message using @PostMapping
	@PostMapping(path="/hello",consumes="text/plain", produces="application/json")
	public String disply(@RequestBody String s)
 	{
	  	System.out.print(s);
  

	return s;
}
	
}
