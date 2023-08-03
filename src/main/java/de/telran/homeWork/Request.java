package de.telran.homeWork;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Request {
    private String message;
    private int senderId;
}
