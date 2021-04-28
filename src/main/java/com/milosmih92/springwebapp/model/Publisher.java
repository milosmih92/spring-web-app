package com.milosmih92.springwebapp.model;

import java.io.Serializable;
import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "publisher")
@AllArgsConstructor
@NoArgsConstructor
public class Publisher implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String name;

    private String addressLine;

    private String city;

    private String state;

    private String zipCode;

    @OneToOne(mappedBy = "publisher")
    private Book book;

}
