package org.cyrol.dev.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "subcategory")
public class SubCategory {
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NonNull
	private String name;
	
	@ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

}