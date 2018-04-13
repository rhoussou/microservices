package org.cyrol.dev.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor

@Entity
@Table(name = "variant")
public class Variant {
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NonNull
	private String name;

}
