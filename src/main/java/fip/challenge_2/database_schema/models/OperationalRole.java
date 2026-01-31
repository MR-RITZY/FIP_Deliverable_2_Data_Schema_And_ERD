package fip.challenge_2.database_schema.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"role", "unit_id"}, name = "role_unit_uk")})
public class OperationalRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String role;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "unit_id", nullable = false)
    private OperationalUnit  operationalUnit;

    @OneToMany(mappedBy = "operationalRole")
    private List<NonAcademicStaff> nonAcademicStaffs;


}
