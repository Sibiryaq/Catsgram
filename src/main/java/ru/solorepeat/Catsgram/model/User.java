package ru.solorepeat.Catsgram.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class User {
    @EqualsAndHashCode.Include
    private String email;
    @EqualsAndHashCode.Exclude
    private String nickname;
    @EqualsAndHashCode.Exclude
    private LocalDate birthdate;

    public User(String email, String nickname, LocalDate birthdate) {
        this.email = email;
        this.nickname = nickname;
        this.birthdate = birthdate;
    }
}
