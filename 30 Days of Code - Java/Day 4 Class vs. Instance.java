

public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		this.age = initialAge;
	}

	public void amIOld() {
        if(age < 0){
          age=0;
          System.out.println("Age is not valid, setting age to 0."); 
          System.out.println("You are young.");  
        } else if(age < 13){
            System.out.println("You are young.");      
        } else if(age >= 13 && age < 18){
            System.out.println("You are a teenager.");
        } else if(age >= 18){
            System.out.println("You are old.");
        }
	}

	public void yearPasses() {
  		age += 1;
	}

