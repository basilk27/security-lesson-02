package com.mbsystems.securitylesson02.security;

import com.mbsystems.securitylesson02.entities.Authority;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@RequiredArgsConstructor
public class SecurityAuthority implements GrantedAuthority {

    private final Authority authority;

    @Override
    public String getAuthority() {
        return this.authority.getName();
    }
}
