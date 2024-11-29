package com.example._2024_danpoong_team_39_be.careAssignment;

import com.example._2024_danpoong_team_39_be.calendar.Calendar;
import com.example._2024_danpoong_team_39_be.domain.CareAssignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface CareAssignmentRepository extends JpaRepository<CareAssignment, Long> {

    Optional<CareAssignment> findById(Long id);

//    @Query("SELECT ca FROM CareAssignment ca " +
//            "JOIN ca.calendars c " +
//            "WHERE c.date = :date " +
//            "AND c.startTime BETWEEN :startTime AND :endTime " +
//            "OR c.endTime BETWEEN :startTime AND :endTime")
//    List<CareAssignment> findCareAssignmentsByDateAndTimeRange(@Param("date") LocalDate date,
//                                                               @Param("startTime") LocalTime startTime,
//                                                               @Param("endTime") LocalTime endTime);
}
