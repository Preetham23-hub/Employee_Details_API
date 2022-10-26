package practice.first;

import java.util.Arrays;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Simple_Rest_Controller {

	@GetMapping("/employee")
	public List<Employe> retrieveEmployeDetails() {

		return Arrays.asList(
				new Employe(1, "preetham", "TCS"),
				new Employe(2, "Krunal", "Wipro"),
				new Employe(3, "Raj", "Dell"),
				new Employe(4, "Keshav", "Amazon"),
				new Employe(5, "Aish", "Walmart"),
				new Employe(6, "Gowtham", "vmware"));

	}
}
