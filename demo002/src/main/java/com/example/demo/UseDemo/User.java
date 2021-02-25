package com.example.demo.UseDemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author soiree
 * @version 1.0
 * @date 2021/2/24 10:57
 * @desp
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    String Id;
    String userName;
    String pwd;

}
