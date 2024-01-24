package net.avangrid.dodapplication.service;

import net.avangrid.dodapplication.payload.LoginDTO;

public interface AuthService {
    String login(LoginDTO loginDTO);

}
