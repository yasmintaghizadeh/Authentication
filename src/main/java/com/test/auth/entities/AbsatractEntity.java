package com.test.auth.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;
@Data
@MappedSuperclass
public class AbsatractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    @Version
    private Integer version;

    @CreatedDate
    private Date insertTime;

    @LastModifiedDate
    private Date updateTime;
}
