package com.example.userlogin.appuser;

import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional(readOnly = true)
public interface AppUserReposiyory {

    Optional<AppUser> findByEmail(String email);
}
