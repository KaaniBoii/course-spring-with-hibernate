package de.oette.course.G05;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Actor {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<Movie> movies = new ArrayList<>();

    private Actor() {
    }

    public Actor(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }
}
