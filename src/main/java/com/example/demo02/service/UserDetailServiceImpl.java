package com.example.demo02.service;

import com.example.demo02.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserDetailServiceImpl implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 这里查一下数据库
        User user = new User() {{
            setUsername("liushuo");
            setPassword("$2a$10$u3xCuvcTep.DnnTHRSX2s.KxQTGxo/GAUGYaU.M890ifZW66yRf12");
        }};
        return user;
    }
}
