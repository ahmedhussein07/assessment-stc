package com.stc.assessment.dao.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Blob;

@Entity
@Data
@Table(name = "files")
public class Files {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;

    @Column(name = "binary_data")
    @Lob
    private byte[] binary_data;

    @OneToOne
    @JoinColumn(name = "ITEM_ID",referencedColumnName = "id")
    private Item item;
}
