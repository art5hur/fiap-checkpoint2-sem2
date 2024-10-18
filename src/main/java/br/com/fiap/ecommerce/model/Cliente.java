package br.com.fiap.ecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@Column(nullable = false, length = 60)
	private String nome;
	
	@Column(nullable = false, length = 8)
    private String cep;
    
	@Column(nullable = false, length = 60)
    private String logradouro;
    
	@Column(nullable = false, length = 10)
    private String numero;
    
    @Column(length = 50)
    private String complemento;
    
    @Column(nullable = false, length = 50)
    private String bairro;
    
    @Column(length = 50)
    private String municipio;
    
    @Column(nullable = false, length = 2)
    private String uf;
    
        
}
