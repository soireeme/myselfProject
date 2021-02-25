package com.example.demo.jwtTest;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;

/**
 * @author soiree
 * @version 1.0
 * @date 2021/2/24 8:51
 * @desp
 */
public class JWTTest {

    public static void main(String[] args) {
        Key key= Keys.secretKeyFor(SignatureAlgorithm.HS256);
        Date  date= new Date();

        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.DATE,1);
        //把日期往后增加一天,整数  往后推,负数往前移动


        Date   date1=calendar.getTime();
        JwtBuilder builder=Jwts.builder().setId(UUID.randomUUID().toString())
                .setSubject("admin")
                .setIssuedAt(date)
                .setExpiration(date1)
                .claim("id","123")
                .claim("name","soiree")
                .signWith(key);
        String  jwt= builder.compact();
        System.out.println("生成的 jwt :" +jwt);

        Jws<Claims> result=Jwts.parser().setSigningKey(key).parseClaimsJws(jwt);







        Claims body = result.getBody();
        System.out.println("载荷-标准中注册的声明 id:" + body.getId());
        System.out.println("载荷-标准中注册的声明 subject:" + body.getSubject());
        System.out.println("载荷-标准中注册的声明 issueAt:" + body.getIssuedAt());
        System.out.println("载荷-标准中注册的声明 getExpiration:" + body.getExpiration());



        System.out.println("载荷-公共的声明的 id:" + result.getBody().get("id"));
        System.out.println("载荷-公共的声明的 name:" + result.getBody().get("name"));
        System.out.println("载荷-公共的声明的 sex:" + result.getBody().get("sex"));
    }




}
