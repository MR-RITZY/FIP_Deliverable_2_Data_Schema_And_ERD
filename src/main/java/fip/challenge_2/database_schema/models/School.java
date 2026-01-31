package fip.challenge_2.database_schema.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String address;

    @Column(unique = true, nullable = false)
    private String registrationID;

    @Column(nullable = false)
    private LocalDate doe;



    @OneToMany(mappedBy ="school", fetch=FetchType.LAZY)
    private Set<Faculty> faculties = new HashSet<>();


    @OneToMany(mappedBy ="school", fetch = FetchType.LAZY)
    private Set<OperationalUnit> operationalUnits = new HashSet<>();



}
