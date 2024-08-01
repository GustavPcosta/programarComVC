package programa.vc.com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import programa.vc.com.Services.UsuarioInterface;
import programa.vc.com.model.Usuario;
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
 
	
	@Autowired
	private UsuarioInterface cService;

	@PostMapping
	public ResponseEntity<Usuario> criarUsuario(@Validated @RequestBody Usuario user) {
		cService.criarUsuario(user);
		return ResponseEntity.ok(user);

	}
	
}
