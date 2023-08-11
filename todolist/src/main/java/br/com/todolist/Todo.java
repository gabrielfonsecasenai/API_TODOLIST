package br.com.todolist;

import jakarta.persistence.*;

@Entity

public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(length = 255, nullable = false)
    private String description;

    @Column(nullable = false)
    private StatusEnum status = StatusEnum.NOT_STARTED;

}
