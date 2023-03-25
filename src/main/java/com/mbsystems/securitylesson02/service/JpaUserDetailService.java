package com.mbsystems.securitylesson02.service;

import com.mbsystems.securitylesson02.entities.Users;
import com.mbsystems.securitylesson02.repository.UsersRepository;
import com.mbsystems.securitylesson02.security.SecurityUser;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JpaUserDetailService implements UserDetailsService {

    private final UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername( String username ) throws UsernameNotFoundException {
        var usersOptional = this.usersRepository.findUsersByUsername( username );

        return usersOptional.map(SecurityUser::new)
                .orElseThrow( () -> new UsernameNotFoundException( "Username not found " + username ) );
    }
}
