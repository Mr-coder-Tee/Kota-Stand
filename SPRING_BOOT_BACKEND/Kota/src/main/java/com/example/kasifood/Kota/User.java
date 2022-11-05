package com.example.kasifood.Kota;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@AllArgsConstructor
@Document
public class User {
    @Id
    private String id;
    private String fullname;
    private String emial;
    private String phoneNumber;
    private boolean isVarified;
    private boolean isSuspened;
    private String role;
}
