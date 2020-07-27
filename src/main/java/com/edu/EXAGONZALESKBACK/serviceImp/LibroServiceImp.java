package com.edu.EXAGONZALESKBACK.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.EXAGONZALESKBACK.dao.LibroDao;
import com.edu.EXAGONZALESKBACK.entity.Libro;
import com.edu.EXAGONZALESKBACK.service.LibroService;
@Service
public class LibroServiceImp implements LibroService {
	@Autowired
	private LibroDao librodao;
	@Override
	public List<Libro> readAll() {
		return librodao.readAll();
	}

}
