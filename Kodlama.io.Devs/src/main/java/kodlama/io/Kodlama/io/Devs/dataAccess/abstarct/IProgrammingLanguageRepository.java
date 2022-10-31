package kodlama.io.Kodlama.io.Devs.dataAccess.abstarct;

import java.util.List;



import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;


public interface IProgrammingLanguageRepository {
	List<ProgrammingLanguage> getAll();
    
	ProgrammingLanguage getById(int id);
	void add(ProgrammingLanguage programmingLanguage);
	void delete(int id);
	void update(ProgrammingLanguage programmingLanguage);
	

}
