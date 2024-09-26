package com.example.springbootRabbitMQ.usermanagement.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateUserDTO {
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
}