package com.yassin.labxpert.entiys;


import com.yassin.labxpert.entiys.enums.StatusTest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "\"tests\"")
@Data @AllArgsConstructor @NoArgsConstructor
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "analyse_id")
    private Analyse analyse;

    @OneToOne
    private TestType typeTest;

    @Enumerated(EnumType.STRING)
    private StatusTest statusTest;

    @ManyToMany
    @JoinTable(
            name = "tests_reactifs",
            joinColumns = @JoinColumn(name = "test_id"),
            inverseJoinColumns = @JoinColumn(name = "reactif_id")
    )
    private List<Reactif> reactif;

    @ManyToMany
    @JoinTable(
            name = "test_tool",
            joinColumns = @JoinColumn(name = "test_id"),
            inverseJoinColumns = @JoinColumn(name = "tool_id")
    )
    private List<Tools> tools;
}
