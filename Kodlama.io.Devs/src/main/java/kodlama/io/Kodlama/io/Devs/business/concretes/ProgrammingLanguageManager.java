package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.IProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstarct.IProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements IProgrammingLanguageService {
    private IProgrammingLanguageRepository _programmingLanguageRepo;
	public ProgrammingLanguageManager(IProgrammingLanguageRepository _programmingLanguageRepo) {
		super();
		this._programmingLanguageRepo = _programmingLanguageRepo;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return _programmingLanguageRepo.getAll();
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		
		return _programmingLanguageRepo.getById(id);
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		if(checkExistProgrammingLanguageId(programmingLanguage.getId()) 
				&& checkExistProgrammingLanguageName(programmingLanguage)
			&& checkEmptyProgrammingLanguage(programmingLanguage.getName()) ) {
				_programmingLanguageRepo.add(programmingLanguage);
			
		}
		
		
	}

	@Override
	public void delete(int id) {
		_programmingLanguageRepo.delete(id);
		
		
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		  
	      
	            _programmingLanguageRepo.update(programmingLanguage);
	      
		
		
	}
	
	//------
	public boolean checkExistProgrammingLanguageId(int id) {
		for(ProgrammingLanguage list: getAll()) {
			if(list.getId()== id) {
				return false;
			}
		}
		return true;
	}
	
	public boolean checkExistProgrammingLanguageName(ProgrammingLanguage programmingLanguage) {
		for(ProgrammingLanguage list: getAll()) {
			if(list.getName().equals(programmingLanguage.getName())) {
				return false;
			}
		}
		return true;
	}
	
	public boolean checkEmptyProgrammingLanguage(String name) {
		if(name.isEmpty()) {
			return false;
		}
		return true;
	}

}
