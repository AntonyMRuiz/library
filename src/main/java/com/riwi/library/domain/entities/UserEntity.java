package com.riwi.library.domain.entities;

import java.util.List;

import com.riwi.library.utils.enums.RoleUser;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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

@Entity(name = "user")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String username;

    @Column(length = 100, nullable = false)
    private String password;

    @Column(length = 100, nullable = false)
    private String email;

    @Column(length = 100, nullable = false)
    private String fullName;

    @Enumerated(EnumType.STRING)
    private RoleUser role;

    @OneToMany(
        mappedBy = "userId",
        cascade = CascadeType.ALL,
        orphanRemoval = false,
        fetch = FetchType.EAGER
    )
    private List<Loan> loans;

    @OneToMany(
        mappedBy = "userId",
        cascade = CascadeType.ALL,
        orphanRemoval = false,
        fetch = FetchType.EAGER
    )
    private List<Reservation> reservations;

}
