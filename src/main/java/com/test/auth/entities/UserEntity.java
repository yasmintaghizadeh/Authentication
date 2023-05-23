package com.test.auth.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;
import org.hibernate.validator.constraints.UniqueElements;


@Data
@Entity
@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)

public class UserEntity extends AbsatractEntity {
    private Long phoneNumber;
    @Column(unique = true)
    private String username;
    private String password;
    private String name;
    private String family;
    private Long nationalId;


}
