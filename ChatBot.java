
package com.chatbot;

public class ChatBot {

    private final NLPProcessor nlp;
    private final KnowledgeBase knowledgeBase;

    public ChatBot() {

        // Create NLP processor object
        nlp = new NLPProcessor();

        // Create knowledge base object
        knowledgeBase = new KnowledgeBase();
    }

    // Generate response for user message
    public String getReply(String userMessage) {

        // Identify user's intention
        String intent = nlp.identifyIntent(userMessage);

        // Get suitable response
        return knowledgeBase.getResponse(intent);
    }
}
