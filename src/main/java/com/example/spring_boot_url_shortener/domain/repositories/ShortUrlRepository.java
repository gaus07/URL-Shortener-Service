package com.example.spring_boot_url_shortener.domain.repositories;

import com.example.spring_boot_url_shortener.domain.entities.ShortUrl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ShortUrlRepository extends JpaRepository<ShortUrl, Long> {
    @Query("SELECT su FROM ShortUrl su WHERE su.isPrivate = FALSE ORDER BY su.createdAt DESC")
    List<ShortUrl> findPublicShortUrls();
}
