package de.harshaheg.learnspringboot;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class HelloController {

	final List<String> animals =  new ArrayList<>();

	@GetMapping("/")
	public String index() {
		return "Hello";
	}


	@PostMapping("/zoo")
	public String addAnimals(@RequestParam(name = "animal") String animal) {
		if(animals.contains(animal)){
			return animal+" already exists";
		}else {
			animals.add(animal);
			return animals.toString();
		}
	}

	@GetMapping("/zoo")
	public String getZooAnimals(){
		if(animals.isEmpty()){
			return "No Animals in the Zoo";
		}else{
			return animals.toString();
		}
	}

	@DeleteMapping("/zoo")
	public String removeZooAnimal(@RequestParam(name = "animal") String animalForDeletion) {
		Iterator<String> a = animals.iterator();
		while(a.hasNext()){
			String zooAnimal = a.next();
			if(zooAnimal.equals(animalForDeletion)){
				a.remove();
				break;
			}
		}
		return animals.toString();

	}

}