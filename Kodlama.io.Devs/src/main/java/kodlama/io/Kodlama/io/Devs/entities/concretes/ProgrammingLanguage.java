package kodlama.io.Kodlama.io.Devs.entities.concretes;

public class ProgrammingLanguage {
	public String name;
	public int id;
	
	public ProgrammingLanguage() {
		super();
	}

	public ProgrammingLanguage(int id, String name) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
  
	

}
