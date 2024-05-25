import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chatbotapp extends JFrame implements ActionListener {
    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton;

    public Chatbotapp() {
        chatArea = new JTextArea(20, 50);
        chatArea.setEditable(false);
        chatArea.setLineWrap(true);
        chatArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(chatArea);

        inputField = new JTextField(40);
        sendButton = new JButton("Send");
        sendButton.addActionListener(this);

        JPanel inputPanel = new JPanel();
        inputPanel.add(inputField);
        inputPanel.add(sendButton);

        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.SOUTH);

        setTitle("Chatbot App");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String userText = inputField.getText();
        if (!userText.trim().isEmpty()) {
            chatArea.append("You: " + userText + "\n");
            String botResponse = getBotResponse(userText);
            chatArea.append("Bot: " + botResponse + "\n");
            inputField.setText("");
        }
    }

    private String getBotResponse(String input) {
        input = input.toLowerCase();
        switch (input) {
            case "hi":
            case "hello":
                return "Hello! How can I assist you today?";
            case "how are you?":
                return "I'm a bot, so I don't have feelings, but I'm here to help you!";
            case "what's your name?":
                return "I'm your friendly chatbot!";
            case "bye":
                return "Goodbye! Have a great day!";
            default:
                return "I'm sorry, I don't understand that. Can you please rephrase?";
        }
    }

    public static void main(String[] args) {
        new Chatbotapp();
    }
}
