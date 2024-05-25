# Chatbot App
This repository contains a simple Java-based Chatbot application. The app features a graphical user interface (GUI) built using Swing, which allows users to interact with the chatbot by typing messages and receiving responses.

# Features
Interactive Chat Interface: Users can type messages into the input field and see the conversation history in the chat area.
Predefined Responses: The chatbot can respond to specific inputs with predefined messages.
Simple and Intuitive Design: The GUI is straightforward and easy to use, making it accessible for all users.
Prerequisites
Java Development Kit (JDK) 8 or higher

# Usage
Once the application is running, a window will appear with a chat area and an input field. Type a message into the input field and click the "Send" button to communicate with the chatbot. The chatbot responds to a few predefined messages:

Hi / Hello: Responds with a greeting.
How are you?: Responds with a predefined message about being a bot.
What's your name?: Responds with the bot's name.
Bye: Responds with a farewell message.
Other inputs: Responds with a message indicating it doesn't understand.
Code Overview
Main Class: Chatbotapp
The Chatbotapp class extends JFrame and implements ActionListener to handle user interactions.

# Components:

JTextArea chatArea: Displays the conversation history.
JTextField inputField: Allows the user to type messages.
JButton sendButton: Sends the user's message when clicked.
Constructor: Sets up the GUI layout and initializes the components.

# actionPerformed: Handles the send button click event, updates the chat area with the user's message, and generates the bot's response.

getBotResponse: Returns a predefined response based on the user's input.


# License
This project is licensed under the MIT License - see the LICENSE file for details.
