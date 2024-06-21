package com.riwi.library.domain.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(length = 100, nullable = false)
    private String author;

    @Column(length = 11, nullable = false)
    private Integer publicationYear;

    @Column(length = 50, nullable = false)
    private String genre;

    @Column(length = 20, nullable = false)
    private String isbn;

    @OneToMany(
        mappedBy = "bookId",
        cascade = CascadeType.ALL,
        orphanRemoval = false,
        fetch = FetchType.EAGER
    )
    private List<Loan> loans;

    @OneToMany(
        mappedBy = "bookId",
        cascade = CascadeType.ALL,
        orphanRemoval = false,
        fetch = FetchType.EAGER
    )
    private List<Reservation> resevations;
}
