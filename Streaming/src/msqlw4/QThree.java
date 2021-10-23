package msqlw4;

import java.util.NoSuchElementException;
import java.util.Optional;  

public class QThree {  
	public static void main(String[] args) {
		
		    

		        Monkey m1 = new Monkey("Bob", 1);
		        Monkey m2 = new Monkey("Sam", 2);
		        Monkey m3 = null;

		        Optional<Monkey> om3 = Optional.ofNullable(m1);
		        Optional<Monkey> om4 = Optional.ofNullable(m3);

		        System.out.println(checkForMonkey(om3));
		        System.out.println(checkForMonkey(om3).getClass());
		        System.out.println(checkForMonkey(om3).getName());
		        
		        System.out.println(checkForMonkey(om4));
		        System.out.println(checkForMonkey(om4).getClass());
		        System.out.println(checkForMonkey(om4).getName());
		    }

		    public static Monkey checkForMonkey(Optional<Monkey> monkey) {
		        return monkey.orElseThrow( () -> new NoSuchElementException("There is no monkey here!"));
		    }
		}

   