package com.example.demo.UseDemo;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import io.jsonwebtoken.JwtBuilder;

/**
 * @author soiree
 * @version 1.0
 * @date 2021/2/24 11:04
 * @desp
 */
public class ToeknUtils {

    public  static  String getToken(User  user){
        String  token ="";
       token= JWT.create().withAudience(user.getId()).sign(Algorithm.HMAC256(user.getPwd()));
        return   token;
    }

}
