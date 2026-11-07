
package com.chatbot;

import java.util.HashMap;
import java.util.Map;

public class KnowledgeBase {

    private final Map<String, String> responses;

    public KnowledgeBase() {

        responses = new HashMap<>();

        responses.put(
                "greeting",
                "Hello! Welcome to AI Chatbot. How can I help you?"
        );

        responses.put(
                "name",
                "I am an AI chatbot developed using Java and NLP."
        );

        responses.put(
                "feeling",
                "I am doing great! Thank you for asking."
        );

        responses.put(
                "help",
                "I can answer questions about Java and basic topics."
        );

        responses.put(
                "java",
                "Java is an object-oriented programming language."
        );

        responses.put(
                "thanks",
                "You're welcome! Happy to help you."
        );

        responses.put(
                "goodbye",
                "Goodbye! Have a wonderful day."
        );

        responses.put(
                "unknown",
                "Sorry, I don't understand that question. Please try another question."
        );
    }

    public String getResponse(String intent) {

        return responses.getOrDefault(
                intent,
                responses.get("unknown")
        );
    }
}

