package com.exampleM.Minh.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 50,message = "GHAHAH")
    @NotBlank(message = "plsss")
    @Column(name = "name",length = 50,nullable = false)
    private String name;

    @Size(max = 250,message = "DESSDA")
    @Column(name = "description",length = 250)
    private String description;

    @ManyToMany(mappedBy="roles")
    private Set<User>users=new HashSet<>();
}
