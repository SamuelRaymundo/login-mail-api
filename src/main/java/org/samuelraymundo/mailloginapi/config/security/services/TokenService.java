package org.samuelraymundo.mailloginapi.config.security.services;

import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import org.samuelraymundo.mailloginapi.models.entities.User;
import org.springframework.beans.factory.annotation.Value;

public class TokenService {

    @Value("${api.security.token.secret}")
    private String secret;

    public String generateToken(User user){
        try{
            Algorithm algorithm = Algorithm.HMAC256(secret);
            return "later";
        }catch(JWTCreationException exception){
            throw new RuntimeException("Erro ao autenticar");
        }
    }
}
