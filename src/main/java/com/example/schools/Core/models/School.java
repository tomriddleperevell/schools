package com.example.schools.Core.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "schools")
public class School {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, unique = true)
	private Long Id;

	@Column(name = "name")
	private String name;



}
