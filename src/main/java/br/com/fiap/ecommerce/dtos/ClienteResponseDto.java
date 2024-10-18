package br.com.fiap.ecommerce.dtos;

import org.modelmapper.ModelMapper;

import br.com.fiap.ecommerce.model.Cliente;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ClienteResponseDto {
	private Long id;
	private String nome;
    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String municipio;
    private String uf;
   

    
    
}
