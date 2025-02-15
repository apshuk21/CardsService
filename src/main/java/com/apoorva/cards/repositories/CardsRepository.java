package com.apoorva.cards.repositories;

import com.apoorva.cards.models.Cards;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface CardsRepository extends JpaRepository<Cards, Long> {
    Optional<Cards> findByMobileNumber(String mobileNumber);

    Optional<Cards> findByCardNumber(String cardNumber);
}
