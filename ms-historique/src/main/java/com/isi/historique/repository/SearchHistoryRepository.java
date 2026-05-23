package com.isi.historique.repository;

import com.isi.historique.domain.SearchHistory;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the SearchHistory entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SearchHistoryRepository extends JpaRepository<SearchHistory, Long> {}
