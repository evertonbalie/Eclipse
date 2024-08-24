package br.com.acopara.rotinasweb.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.acopara.rotinasweb.model.Numeradores;
import br.com.acopara.rotinasweb.repository.NumeradoresRepository;

@RestController
@RequestMapping(value = "/api/numeradores")
public class NumeradoresEndpoint {

    @Autowired
    NumeradoresRepository numeradoresRepository;

    @GetMapping
    public Numeradores numeradores() {
        return numeradoresRepository.getOne((long) 2152);
    }

    @GetMapping("/cliente")
    public Long getCodcli(){
        return numeradoresRepository.getCodigoCliente();
    }

    @PutMapping("/cliente")
    public ResponseEntity<?> updateCliente() {
        numeradoresRepository.updateProximoNumeroCliente(numeradoresRepository.getCodigoCliente() + 1);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
