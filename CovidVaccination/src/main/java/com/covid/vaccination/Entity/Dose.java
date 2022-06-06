package com.covid.vaccination.Entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
public class Dose {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long doseRefId;
    private Integer user_id;
    private boolean dose=true;
}
