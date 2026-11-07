
package com.chatbot;

public class NLPProcessor {

    // Convert user message into a clean format
    public String cleanText(String message) {

        // Convert uppercase letters into lowercase
        message = message.toLowerCase();

        // Remove special characters and punctuation
        message = message.replaceAll("[^a-z0-9\\s]", "");

        // Remove unnecessary spaces
        message = message.trim();

        return message;
    }

    // Identify the user's intention
    public String identifyIntent(String message) {

        String text = cleanText(message);

        if (text.matches(".*\\b(hello|hi|hey)\\b.*")) {
            return "greeting";
        }

        if (text.contains("your name") ||
                text.contains("who are you")) {
            return "name";
        }

        if (text.contains("how are you")) {
            return "feeling";
        }

        if (text.contains("help")) {
            return "help";
        }

        if (text.contains("java")) {
            return "java";
        }

        if (text.contains("thank")) {
            return "thanks";
        }

        if (text.contains("bye") ||
                text.contains("goodbye")) {
            return "goodbye";
        }

        return "unknown";
    }
}
