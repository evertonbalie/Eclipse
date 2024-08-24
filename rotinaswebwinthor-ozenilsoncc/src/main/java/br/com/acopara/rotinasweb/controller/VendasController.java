package br.com.acopara.rotinasweb.controller;

import br.com.acopara.rotinasweb.model.Cliente;
import br.com.acopara.rotinasweb.model.Endereco;
import br.com.acopara.rotinasweb.model.Rastreamento;
import br.com.acopara.rotinasweb.model.Usuario;
import br.com.acopara.rotinasweb.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import javax.validation.Valid;
import java.util.Date;

@Controller
@RequestMapping("/vendas")
public class VendasController {

    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    EnderecoRepository enderecoRepository;
    @Autowired
    NumeradoresRepository numeradoresRepository;
    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    PracaRepository pracaRepository;
    @Autowired
    CidadeRepository cidadeRepository;
    @Autowired
    RastreamentoRepository rastreamentoRepository;

    @GetMapping("/cliente/cadastro")
    public String cadastroCliente(ModelMap pracas, ModelMap cidades, Cliente cliente) {

        pracas.addAttribute("pracas", pracaRepository.findAllBySituacaoOrderById("A"));
        cidades.addAttribute("cidades", cidadeRepository.findAllByUf("PA"));

        return "pages/cadastro-cliente";
    }

    @PostMapping("/cliente/salvar")
    public String salvarCliente(@Valid Cliente cliente, BindingResult bindingResult, RedirectAttributes attr) {

        Usuario usuario = usuarioRepository.findByUsuario(SecurityContextHolder.getContext().getAuthentication().getName());
        Cliente cli = clienteRepository.findClienteByCpfCnpj(cliente.getCpfCnpj());

        if (cli == null) {
            if (!bindingResult.hasErrors()){
                cliente.setFantasia(cliente.getNome());
                cliente.setTipoPessoa("F");
                cliente.setInscricaoEstadual("ISENTO");
                cliente.setAtividade(5L);
                cliente.setDataCadastro(new Date());
                cliente.setDataAlteracao(new Date());
                cliente.setInicioAtividades(new Date());
                cliente.setFuncionarioCadastro(usuario.getUsuarioWinthor());
                cliente.setFuncionarioAlteracao(usuario.getUsuarioWinthor());
                cliente.setCodigoPais(1058L);
                if (!cliente.getEmail().isEmpty()) cliente.setEmailNfe(cliente.getEmail());
                cliente.setNumeroCobranca(cliente.getNumeroEntrega());
                cliente.setComplementoCobranca(cliente.getComplementoEntrega());
                cliente.setEnderecoCobranca(cliente.getEnderecoEntrega());
                cliente.setBairroCobranca(cliente.getBairroEntrega());
                cliente.setMunicipioCobranca(cliente.getMunicipioEntrega());
                cliente.setEstadoCobranca(cliente.getUfEntrega());
                cliente.setCepCobranca(cliente.getCepEntrega());
                cliente.setTelefoneCobranca(cliente.getTelefoneEntrega());
                cliente.setCodigoPracaCobranca(cliente.getCodigoPracaEntrega());
                cliente.setEmailCobranca(cliente.getEmail());
                cliente.setComplementoComercial(cliente.getComplementoEntrega());
                cliente.setCodigoCidadeComercial(cliente.getCodigoCidade());
                cliente.setNumeroComercial(cliente.getNumeroEntrega());
                cliente.setBairroComercial(cliente.getBairroEntrega());
                cliente.setMunicipioComercial(cliente.getMunicipioEntrega());
                cliente.setUfComercial(cliente.getUfEntrega());
                cliente.setCepComercial(cliente.getCepEntrega());
                cliente.setEnderecoComercial(cliente.getEnderecoEntrega());
                cliente.setTelefoneComercial(cliente.getTelefoneEntrega());
                cliente.setCepCaixaPostal(cliente.getCepEntrega());
                cliente.setCpfCnpjEntrega(cliente.getCpfCnpj());
                cliente.setEmiteDuplicataMercantil("N");
                cliente.setPermitirAgruparTitulo("N");
                cliente.setAceitaChequeTerceiros("N");
                cliente.setGerarCreditoDevolucao("S");
                cliente.setReceberBoletoPorEmail("S");
                cliente.setPermitirAlterarCobrancaTitulos("N");
                cliente.setBloqueio("N");
                cliente.setCodigoCobranca("D");
                cliente.setLimite(0.00);
                cliente.setEnviaDadosSerasa("N");
                cliente.setValidarMultiploVenda("N");
                cliente.setCodigoRcaUm(1L);
                cliente.setCodigoRcaDois(usuario.getCodigoRca());
                cliente.setCodigoRcaTres(1L);
                cliente.setConsumidorFinal("S");
                cliente.setAceitaVendaFrancionada("S");
                cliente.setClientePassivelDeProtesto("N");
                cliente.setContribuinte("N");
                cliente.setClienteUtilizaCreditoFaturamento("S");
                cliente.setCalculaSt("N");
                cliente.setPisCofinsCumulativo("N");
                cliente.setTelefoneEmpresa(cliente.getTelefoneEntrega());
                cliente.setSituacaoEcommerceUnilever("NAO");

                cliente.setId(numeradoresRepository.getCodigoCliente());
                cliente.setCodigoClientePrincipal(numeradoresRepository.getCodigoCliente());
                numeradoresRepository.updateProximoNumeroCliente(numeradoresRepository.getCodigoCliente() + 1);

                clienteRepository.save(cliente);

                attr.addFlashAttribute("success", "> Cliente cadastrado com sucesso! CÓDIGO: " + (numeradoresRepository.getCodigoCliente() - 1) + "\n> Endereço de entrega principal já foi cadastrado!");
                return "redirect:/vendas/cliente/cadastro";
            }
            return "pages/cadastro-cliente";
        }
        attr.addFlashAttribute("success", "> Cliente já existe em nossa base de dados! CÓDIGO: " + cli.getId());
        return "redirect:/vendas/cliente/cadastro";
    }

    @GetMapping("/enderecoentrega/cadastro")
    public String cadastroEndereco(ModelMap pracas, ModelMap cidades) {

        pracas.addAttribute("pracas", pracaRepository.findAllBySituacaoOrderById("A"));
        cidades.addAttribute("cidades", cidadeRepository.findAllByUf("PA"));

        return "pages/cadastro-endereco";
    }

    @PostMapping("/enderecoentrega/salvar")
    public String salvarEndereco(Endereco endereco, RedirectAttributes attr) {

        Usuario usuario  = usuarioRepository.findByUsuario(SecurityContextHolder.getContext().getAuthentication().getName());

        endereco.setDataCadastro(new Date());
        endereco.setDataAlteracao(new Date());
        endereco.setCodigoFuncionarioCadastro(usuario.getUsuarioWinthor());
        endereco.setCodigoFuncionarioAlteracao(usuario.getUsuarioWinthor());

        endereco.setCodigoSequenciaEndereco(enderecoRepository.proximaSequenciaEndereco(endereco.getCodigoCliente()));
        endereco.setCodigoEndereco(enderecoRepository.proximoCodigoEndereco());

        enderecoRepository.save(endereco);
        attr.addFlashAttribute("success","Endereco cadastrado com sucesso! Você já pode visualiza-lo na 4116");

        return "redirect:/vendas/enderecoentrega";
    }

    @GetMapping("/enderecoentrega/edicao/{id}")
    public String getEdicaoEndereco(@PathVariable(value = "id") Long codigoEndereco, ModelMap model, ModelMap pracas, ModelMap cidades) {
        pracas.addAttribute("pracas", pracaRepository.findAllBySituacaoOrderById("A"));
        cidades.addAttribute("cidades", cidadeRepository.findAllByUf("PA"));
        model.addAttribute("endereco", enderecoRepository.findById(codigoEndereco));
        return "pages/editar-endereco";
    }

    @PostMapping("enderecoentrega/editar")
    public String editarEndereco(Endereco endereco, RedirectAttributes attr) {

        Usuario usuario  = usuarioRepository.findByUsuario(SecurityContextHolder.getContext().getAuthentication().getName());

        endereco.setDataAlteracao(new Date());
        endereco.setCodigoFuncionarioAlteracao(usuario.getUsuarioWinthor());

        enderecoRepository.save(endereco);
        attr.addFlashAttribute("success","Endereco alterado com sucesso! Você já pode visualiza-lo na 4116");

        return "redirect:/vendas/enderecoentrega";
    }

    @GetMapping("/enderecoentrega")
    public String getEnderecoCliente() {
        return "pages/enderecos-cliente";
    }

    @PostMapping("/enderecoentrega/cliente")
    public String getEnderecoCliente(Long codcli, RedirectAttributesModelMap enderecos) {
        enderecos.addFlashAttribute("enderecos",enderecoRepository.findAllByCodigoCliente(codcli));
        return "redirect:/vendas/enderecoentrega";
    }

    @GetMapping("/rastreamento")
    public String getRastreamento(ModelMap rastreamento) {
        Usuario usuario  = usuarioRepository.findByUsuario(SecurityContextHolder.getContext().getAuthentication().getName());

        rastreamento.addAttribute("pedidos", rastreamentoRepository.getPedidosRastreamento(usuario.getCodigoRca()));
        return "pages/rastreamento";
    }

    @ModelAttribute("usuario")
    public Usuario getUsuario() {
        return usuarioRepository.findByUsuario(SecurityContextHolder.getContext().getAuthentication().getName());
    }
}
