package com.ssyoung.inpark_ticket.model;



import lombok.Data;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 이벤트명 또는 공연명 등
    @Column(nullable = false)
    private String eventName;

    // 예매자 정보 (예: 사용자 이름 혹은 사용자 ID)
    @Column(nullable = false)
    private String userName;

    // 예매 일시
    @Column(nullable = false)
    private LocalDateTime reservationDate;

    // 티켓 상태: RESERVED 또는 CANCELLED
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TicketStatus status;

    // 취소 일시 (취소된 경우에만 기록)
    private LocalDateTime cancellationDate;


}