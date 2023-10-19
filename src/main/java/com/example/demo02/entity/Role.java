package com.example.demo02.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import java.time.LocalDateTime;

@Data
@KeySequence("seq_t_role")
@TableName("t_role")
public class Role implements GrantedAuthority {

    @TableId(type = IdType.INPUT)
    private Long id;

    private String roleName;
    private String roleCode;
    private LocalDateTime createTime;

    @Override
    public String getAuthority() {
        return roleCode;
    }
}
