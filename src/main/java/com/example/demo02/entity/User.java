package com.example.demo02.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

@Data
@TableName("t_user")
@KeySequence(value = "seq_t_user", dbType = DbType.POSTGRE_SQL)
public class User implements UserDetails {

    @TableId(type = IdType.INPUT)
    private Long id;

    private String username;

    private String password;

    private LocalDateTime createTime;

    @TableField(exist = false)
    private List<Role> roleList;

    @Override
    public Collection<Role> getAuthorities() {
        return roleList;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
