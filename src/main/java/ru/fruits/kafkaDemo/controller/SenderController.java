package ru.fruits.kafkaDemo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.fruits.kafkaDemo.kafka.KafkaProducer;

@RestController
@RequestMapping("/api/v1/send")
@RequiredArgsConstructor
public class SenderController {
    private final KafkaProducer producer;

    @GetMapping("/{message}")
    public void send(@PathVariable String message) {
        producer.send(message);
    }
}
