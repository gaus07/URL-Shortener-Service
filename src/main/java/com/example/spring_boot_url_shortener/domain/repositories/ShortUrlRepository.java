package com.example.spring_boot_url_shortener.domain.repositories;

import com.example.spring_boot_url_shortener.domain.entities.ShortUrl;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ShortUrlRepository extends JpaRepository<ShortUrl, Long> {
    @Query("SELECT su FROM ShortUrl su LEFT JOIN FETCH su.createdBy WHERE su.isPrivate = FALSE")
    Page<ShortUrl> findPublicShortUrls(Pageable pageable);

    boolean existsByShortKey(String shortKey);
    Optional<ShortUrl> findByShortKey(String shortKey);
}
