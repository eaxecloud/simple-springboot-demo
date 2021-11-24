package xyz.fullstacks.demo.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="user")
public class User implements Serializable{

	private static final long serialVersionUID = -508967921456052375L;

	@Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
 
    @Column
    private String name;
    
    @Column
    private String email;
 
    @Column
    private Short age;
}