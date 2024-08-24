package curso.api.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import curso.api.rest.model.Pcempr;
import curso.api.rest.model.Pcsetor;
import curso.api.rest.repository.PcemprRepository;
import curso.api.rest.repository.SetorRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController/*Arquitetura REST**/
@RequestMapping(value = "/app")
public class IndexController {
	
	
	@Autowired /*se fosse CDI seria @Inject*/
	private SetorRepository setorRepository;
	@Autowired
	private PcemprRepository pcemprRepository;
	
	
	/*Teste banco*/	
	@GetMapping(value="/{id}", produces ="application/json")
	public ResponseEntity<Pcsetor> initTeste(@PathVariable(value ="id") Long id){
		Optional<Pcsetor> setor = setorRepository.findById(id);
		
		return new ResponseEntity(setor.get(), HttpStatus.OK);
		
	}
	
	/*Pequisa todos os setores*/
	@GetMapping(value="/", produces = "application/json")
	public ResponseEntity<List<Pcsetor>>Usuarios(){
		
		List<Pcsetor> list= (List<Pcsetor>) setorRepository.findAll();
		
		return new ResponseEntity(list,HttpStatus.OK);
	}
	
	/*Consultar colaborador por matricula*/	
	@GetMapping(value="/empregados/{id}", produces ="application/json")
	public ResponseEntity<Pcempr> BuacarPorMtricula(@PathVariable(value ="id") String id){
		Optional<Pcempr> empregados = pcemprRepository.findById(id);
		
		return new ResponseEntity(empregados.get(), HttpStatus.OK);
			
		
		
	}
	
	//adiciona  colaborador
	@PostMapping(value = "/", produces = "application/json")
	public ResponseEntity<Pcempr> cadastrar(@RequestBody Pcempr empregado) {

		Pcempr emprsalvo = pcemprRepository.save(empregado);

		return new ResponseEntity<Pcempr>(emprsalvo, HttpStatus.OK);

	}

	//atualiza colaborador
	@PutMapping(value = "/atualiza", produces = "application/json")
	public ResponseEntity<Pcempr> atualizar(@RequestBody Pcempr empregado) {

		Pcempr emprsalvo = pcemprRepository.save(empregado);

		return new ResponseEntity<Pcempr>(emprsalvo, HttpStatus.OK);

	}
	
	//cadastar passando parâmetro id	
	@GetMapping(value="/empregado/{id}", produces ="application/json")
	public ResponseEntity<Pcempr> initTeste1(@PathVariable(value ="id") String id){
		Optional<Pcempr> pcempr = pcemprRepository.findById(id);
		
		return new ResponseEntity(pcempr.get(), HttpStatus.OK);
		
	}
	
	
	//cadastar passando parâmetro id	
		@DeleteMapping(value="/{id}", produces ="application/text")
		public String delete(@PathVariable(value ="id") String id){
			 pcemprRepository.deleteById(id);
			
			return "ok";
			
		}
	
	
	/*Codigo esprando ajuste*/
	@PutMapping(value="/{iduser}/codvenda/{id}", produces = "application/json")
	public ResponseEntity<List<Pcempr>>todosempr(@PathVariable Long iduser, @PathVariable Long id){
		
		//List<Pcempr> list= (List<Pcempr>) pcemprRepository.findAll();
		
		return new ResponseEntity("id uduario: "+iduser+"\n"+"idvenda: "+id,HttpStatus.OK);
	}
	

}
