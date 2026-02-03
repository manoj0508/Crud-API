package org.manoj.crudApi.entity;

import jakarta.persistence.*;

@Entity
@Table(name="PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "PID")
    private String productId;

    @Column(name = "PNAME")
    private String productName;

    @Column(name = "PTYPE")
    private String productType;

    @Column(name = "PDESC")
    private String description;

    @Column(name = "DNAME")
    private String displayName;

    @Column(name = "MNAME")
    private String manufactureName;

}
