package com.example.ticket;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    //List<Ticket> findByUser(User user);

    Optional<Ticket> findById(Long id);
    @Query("SELECT t FROM Ticket t")
    List<Ticket> findAllTickets();

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO ticket (title, description, user_id, status) VALUES (:title, :description, :userId, :status)", nativeQuery = true)
    void insertTicket(@Param("title") String title,
                      @Param("description") String description,
                      @Param("userId") Long userId,
                      @Param("status") String status);

    @Modifying
    @Transactional
    @Query("UPDATE Ticket t SET t.status = :status WHERE t.id = :id")
    void updateTicketStatus(@Param("id") Long id, @Param("status") String status);

}




