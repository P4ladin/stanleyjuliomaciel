package stanleyjuliomaciel.dao;

import stanleyjuliomaciel.domain.Profissao;

public interface ProfissaoDao {

		void save(Profissao profissao);
		
		void update(Profissao profissao);
		
		void delete(Long id);
		
		Profissao findById(Long id);
		
		
		java.util.List<Profissao> findAll();
	}



