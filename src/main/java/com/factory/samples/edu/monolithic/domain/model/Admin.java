package com.factory.samples.edu.monolithic.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
	private Long id;
	private String name;
	private String email;
	private String password;
}
