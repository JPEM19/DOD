package net.avangrid.dodapplication.payload;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginDTO {
    private String usernameOrEmail;
    private String password;
}
