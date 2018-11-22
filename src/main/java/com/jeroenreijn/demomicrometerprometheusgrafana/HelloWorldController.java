package com.jeroenreijn.demomicrometerprometheusgrafana;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public ResponseEntity<Message> index() {
        Message helloWorld = new Message("Hello World");
        return ResponseEntity.ok(helloWorld);
    }

    class Message {
        private String text;

        public Message(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }
}
