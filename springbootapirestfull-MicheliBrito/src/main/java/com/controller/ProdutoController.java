package com.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dtos.ProdutoRecordDto;
import com.model.Produto;
import com.repository.ProdutoRepository;

import jakarta.validation.Valid;



import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
//@RequestMapping(value="/app")
public class ProdutoController {

	@Autowired
	ProdutoRepository produtorepository;

	// adiciona produto
	@PostMapping("/produtos")
	public ResponseEntity<Produto> salvarProduto(@RequestBody @Valid ProdutoRecordDto produtoRecordDto) {

		var produto = new Produto();
		BeanUtils.copyProperties(produtoRecordDto, produto);
		return ResponseEntity.status(HttpStatus.CREATED).body(produtorepository.save(produto));

	}

	// atualiza produto
	@PutMapping("/produtos/{id}")
	public ResponseEntity<Object> AtualizarProduto(@PathVariable(value = "id") UUID id,
			@RequestBody @Valid ProdutoRecordDto produtoRecordDto) {

		Optional<Produto> produto1 = produtorepository.findById(id);

		if (produto1.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado");
		}

		var produto = produto1.get();
		BeanUtils.copyProperties(produtoRecordDto, produto);
		return ResponseEntity.status(HttpStatus.OK).body(produtorepository.save(produto));
	}

	// lista todos os produtos
	@GetMapping(value = "/produtos")
	public ResponseEntity<List<Produto>> getAllProduto() {

		List<Produto> produtoList = produtorepository.findAll();
		
		if(!produtoList.isEmpty()) {
			
			for (Produto produto: produtoList) {
				
				UUID id = produto.getIdproduto();
				produto.add(linkTo(methodOn(ProdutoController.class).getOneProduto(id)).withSelfRel());
				
				
				
			}
			
			
			
			
		}
//		Retorna todos modo tradidiocnal
//		return ResponseEntity.status(HttpStatus.OK).body(produtorepository.findAll());
	 
		return ResponseEntity.status(HttpStatus.OK).body(produtoList);

	}

	
	// Buscar por id
	@GetMapping(value = "/produtos/{id}")
	public ResponseEntity<Object> getOneProduto(@PathVariable(value = "id") UUID id) {

		Optional<Produto> produto0 = produtorepository.findById(id);
		if (produto0.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado");

		}
		produto0.get().add(linkTo(methodOn(ProdutoController.class).getAllProduto()).withRel("Produto Lista"));
		return ResponseEntity.status(HttpStatus.OK).body(produto0.get());

	}

	// deletar produto
	@DeleteMapping("/produtos/{id}")
	public ResponseEntity<Object> DeletarProduto(@PathVariable(value = "id") UUID id,
			@RequestBody @Valid ProdutoRecordDto produtoRecordDto) {

		Optional<Produto> produto1 = produtorepository.findById(id);

		if (produto1.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado");
		}

		produtorepository.delete(produto1.get());

		return ResponseEntity.status(HttpStatus.OK).body("produto deletado com sucesso!");
	}

}
