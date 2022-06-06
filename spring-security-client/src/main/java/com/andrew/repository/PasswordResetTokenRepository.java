package com.andrew.repository;

import com.andrew.entity.PasswordResetToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasswordResetTokenRepository extends
        JpaRepository<PasswordResetToken, Long> {

    PasswordResetToken findByToken(String token);
}
