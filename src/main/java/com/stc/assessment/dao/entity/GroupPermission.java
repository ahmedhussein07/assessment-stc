package com.stc.assessment.dao.entity;

import jakarta.persistence.*;
import lombok.Data;


import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "group_permission")
public class GroupPermission {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;

    @Column(name = "GROUP_NAME")
    private String groupName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "groupPermission", cascade = CascadeType.REMOVE)
    private List<Permissions> permissionsList;
}
