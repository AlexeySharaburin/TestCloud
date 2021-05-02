package ru.netology.test_cloud.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class PairLoginPass implements Serializable {

     @Column(nullable = false)
     private String login;

     @Column(nullable = false)
     private String password;
}
