package programa.vc.com.ServicesImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import programa.vc.com.Repository.UsuarioRepository;
import programa.vc.com.Services.UsuarioInterface;
import programa.vc.com.model.Usuario;
@Service
public class UsuarioImpl implements UsuarioInterface {
	
	@Autowired
	private UsuarioRepository cRepository;
	
	
	@Override
	public Usuario criarUsuario(Usuario user) {
		return cRepository.save(user);
	}
}
