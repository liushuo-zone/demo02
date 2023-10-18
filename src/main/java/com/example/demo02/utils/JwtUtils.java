package com.example.demo02.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

import java.util.Date;

public class JwtUtils {

    public static String createToken(String id) {
        return Jwts.builder()
                .claim("id", id)
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 10))
                .compact();
    }

    public static String parseToken(String token) {
        Claims claims = Jwts.parser().parseClaimsJwt(token).getBody();
        return claims.get("id", String.class);
    }

}
