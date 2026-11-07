
package com.chatbot;

import javax.swing.*;
import java.awt.*;

public class ChatGUI extends JFrame {

    private JTextArea chatArea;
    private JTextField inputField;

    private JButton sendButton;
    private JButton clearButton;

    private ChatBot chatbot;

    public ChatGUI() {

        chatbot = new ChatBot();

        setTitle("Artificial Intelligence Chatbot");
        setSize(600, 500);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setLayout(new BorderLayout(10, 10));

        // Chat display area
        chatArea = new JTextArea();

        chatArea.setEditable(false);

        chatArea.setFont(
                new Font("Arial", Font.PLAIN, 15)
        );

        chatArea.setLineWrap(true);
        chatArea.setWrapStyleWord(true);

        JScrollPane scrollPane =
                new JScrollPane(chatArea);

        add(scrollPane, BorderLayout.CENTER);

        // Input panel
        JPanel inputPanel =
                new JPanel(new BorderLayout(5, 5));

        inputField = new JTextField();

        sendButton = new JButton("Send");

        clearButton = new JButton("Clear");

        inputPanel.add(inputField, BorderLayout.CENTER);

        inputPanel.add(sendButton, BorderLayout.EAST);

        JPanel bottomPanel =
                new JPanel(new BorderLayout());

        bottomPanel.add(inputPanel, BorderLayout.CENTER);

        bottomPanel.add(clearButton, BorderLayout.EAST);

        add(bottomPanel, BorderLayout.SOUTH);

        // Welcome message
        chatArea.append(
                "Chatbot: Hello! Welcome to AI Chatbot.\n\n"
        );

        // Send button action
        sendButton.addActionListener(
                e -> sendMessage()
        );

        // Enter key action
        inputField.addActionListener(
                e -> sendMessage()
        );

        // Clear button action
        clearButton.addActionListener(
                e -> chatArea.setText("")
        );

        setVisible(true);
    }

    private void sendMessage() {

        String message = inputField.getText().trim();

        if (message.isEmpty()) {
            return;
        }

        chatArea.append("You: " + message + "\n");

        String response = chatbot.getReply(message);

        chatArea.append(
                "Chatbot: " + response + "\n\n"
        );

        inputField.setText("");

        chatArea.setCaretPosition(
                chatArea.getDocument().getLength()
        );
    }
}
