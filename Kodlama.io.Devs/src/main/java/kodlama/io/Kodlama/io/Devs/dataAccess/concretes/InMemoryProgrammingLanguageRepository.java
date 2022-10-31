package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstarct.IProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements IProgrammingLanguageRepository {

	List<ProgrammingLanguage> languages;
	
	public InMemoryProgrammingLanguageRepository() {
		languages = new ArrayList<ProgrammingLanguage>();
		languages.add(new ProgrammingLanguage(1, "java"));
		languages.add(new ProgrammingLanguage(2, "js"));
		languages.add(new ProgrammingLanguage(3, "phyton"));
		languages.add(new ProgrammingLanguage(4, "c++"));
		
	}

    @Override
	public List<ProgrammingLanguage> getAll() {
		
		return languages;
	}
    
    @Override
    public ProgrammingLanguage getById(int id) {
    	for(ProgrammingLanguage programmingLanguage : languages) {
    		if(programmingLanguage.getId() == id) {
    			return programmingLanguage;
    		}
    	}
    	return null;
    }
    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
    	languages.add(programmingLanguage);
    }

	@Override
	public void delete(int id) {
		ProgrammingLanguage programmingLanguage = getById(id);
		languages.remove(programmingLanguage);
		
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		ProgrammingLanguage language = getById(programmingLanguage.getId());
		if(programmingLanguage.getId() == language.getId()) {
			language.setName(programmingLanguage.getName());
			
		}
		
	}
    
    
    
    
    

}
