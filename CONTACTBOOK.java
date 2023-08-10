import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phoneNumber;
    }
}

public class ContactBookApp extends JFrame {

    private List<Contact> contacts;
    private JTextArea contactDisplayArea;
    private JTextField nameField;
    private JTextField phoneNumberField;

    public ContactBookApp() {
        contacts = new ArrayList<>();

        setTitle("Contact Book");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel inputPanel = new JPanel(new GridLayout(3, 2));

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        JLabel phoneNumberLabel = new JLabel("Phone Number:");
        phoneNumberField = new JTextField();

        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(phoneNumberLabel);
        inputPanel.add(phoneNumberField);

        JButton addButton = new JButton("Add Contact");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String phoneNumber = phoneNumberField.getText();

                if (!name.isEmpty() && !phoneNumber.isEmpty()) {
                    Contact contact = new Contact(name, phoneNumber);
                    contacts.add(contact);
                    updateContactDisplay();
                    nameField.setText("");
                    phoneNumberField.setText("");
                }
            }
        });

        contactDisplayArea = new JTextArea();
        contactDisplayArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(contactDisplayArea);

        Container contentPane = getContentPane();
        contentPane.add(inputPanel, BorderLayout.NORTH);
        contentPane.add(addButton, BorderLayout.CENTER);
        contentPane.add(scrollPane, BorderLayout.SOUTH);
    }

    private void updateContactDisplay() {
        contactDisplayArea.setText("");
        for (Contact contact : contacts) {
            contactDisplayArea.append(contact.toString() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ContactBookApp().setVisible(true);
            }
        });
    }
}import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phoneNumber;
    }
}

public class ContactBookApp extends JFrame {

    private List<Contact> contacts;
    private JTextArea contactDisplayArea;
    private JTextField nameField;
    private JTextField phoneNumberField;

    public ContactBookApp() {
        contacts = new ArrayList<>();

        setTitle("Contact Book");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel inputPanel = new JPanel(new GridLayout(3, 2));

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        JLabel phoneNumberLabel = new JLabel("Phone Number:");
        phoneNumberField = new JTextField();

        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(phoneNumberLabel);
        inputPanel.add(phoneNumberField);

        JButton addButton = new JButton("Add Contact");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String phoneNumber = phoneNumberField.getText();

                if (!name.isEmpty() && !phoneNumber.isEmpty()) {
                    Contact contact = new Contact(name, phoneNumber);
                    contacts.add(contact);
                    updateContactDisplay();
                    nameField.setText("");
                    phoneNumberField.setText("");
                }
            }
        });

        contactDisplayArea = new JTextArea();
        contactDisplayArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(contactDisplayArea);

        Container contentPane = getContentPane();
        contentPane.add(inputPanel, BorderLayout.NORTH);
        contentPane.add(addButton, BorderLayout.CENTER);
        contentPane.add(scrollPane, BorderLayout.SOUTH);
    }

    private void updateContactDisplay() {
        contactDisplayArea.setText("");
        for (Contact contact : contacts) {
            contactDisplayArea.append(contact.toString() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ContactBookApp().setVisible(true);
            }
        });
    }
  }import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phoneNumber;
    }
}

public class ContactBookApp extends JFrame {

    private List<Contact> contacts;
    private JTextArea contactDisplayArea;
    private JTextField nameField;
    private JTextField phoneNumberField;

    public ContactBookApp() {
        contacts = new ArrayList<>();

        setTitle("Contact Book");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel inputPanel = new JPanel(new GridLayout(3, 2));

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        JLabel phoneNumberLabel = new JLabel("Phone Number:");
        phoneNumberField = new JTextField();

        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(phoneNumberLabel);
        inputPanel.add(phoneNumberField);

        JButton addButton = new JButton("Add Contact");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String phoneNumber = phoneNumberField.getText();

                if (!name.isEmpty() && !phoneNumber.isEmpty()) {
                    Contact contact = new Contact(name, phoneNumber);
                    contacts.add(contact);
                    updateContactDisplay();
                    nameField.setText("");
                    phoneNumberField.setText("");
                }
            }
        });

        contactDisplayArea = new JTextArea();
        contactDisplayArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(contactDisplayArea);

        Container contentPane = getContentPane();
        contentPane.add(inputPanel, BorderLayout.NORTH);
        contentPane.add(addButton, BorderLayout.CENTER);
        contentPane.add(scrollPane, BorderLayout.SOUTH);
    }

    private void updateContactDisplay() {
        contactDisplayArea.setText("");
        for (Contact contact : contacts) {
            contactDisplayArea.append(contact.toString() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ContactBookApp().setVisible(true);
            }
        });
    }
          }import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phoneNumber;
    }
}

public class ContactBookApp extends JFrame {

    private List<Contact> contacts;
    private JTextArea contactDisplayArea;
    private JTextField nameField;
    private JTextField phoneNumberField;

    public ContactBookApp() {
        contacts = new ArrayList<>();

        setTitle("Contact Book");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel inputPanel = new JPanel(new GridLayout(3, 2));

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        JLabel phoneNumberLabel = new JLabel("Phone Number:");
        phoneNumberField = new JTextField();

        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(phoneNumberLabel);
        inputPanel.add(phoneNumberField);

        JButton addButton = new JButton("Add Contact");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String phoneNumber = phoneNumberField.getText();

                if (!name.isEmpty() && !phoneNumber.isEmpty()) {
                    Contact contact = new Contact(name, phoneNumber);
                    contacts.add(contact);
                    updateContactDisplay();
                    nameField.setText("");
                    phoneNumberField.setText("");
                }
            }
        });

        contactDisplayArea = new JTextArea();
        contactDisplayArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(contactDisplayArea);

        Container contentPane = getContentPane();
        contentPane.add(inputPanel, BorderLayout.NORTH);
        contentPane.add(addButton, BorderLayout.CENTER);
        contentPane.add(scrollPane, BorderLayout.SOUTH);
    }

    private void updateContactDisplay() {
        contactDisplayArea.setText("");
        for (Contact contact : contacts) {
            contactDisplayArea.append(contact.toString() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ContactBookApp().setVisible(true);
            }
        });
    }
          }import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phoneNumber;
    }
}

public class ContactBookApp extends JFrame {

    private List<Contact> contacts;
    private JTextArea contactDisplayArea;
    private JTextField nameField;
    private JTextField phoneNumberField;

    public ContactBookApp() {
        contacts = new ArrayList<>();

        setTitle("Contact Book");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel inputPanel = new JPanel(new GridLayout(3, 2));

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        JLabel phoneNumberLabel = new JLabel("Phone Number:");
        phoneNumberField = new JTextField();

        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(phoneNumberLabel);
        inputPanel.add(phoneNumberField);

        JButton addButton = new JButton("Add Contact");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String phoneNumber = phoneNumberField.getText();

                if (!name.isEmpty() && !phoneNumber.isEmpty()) {
                    Contact contact = new Contact(name, phoneNumber);
                    contacts.add(contact);
                    updateContactDisplay();
                    nameField.setText("");
                    phoneNumberField.setText("");
                }
            }
        });

        contactDisplayArea = new JTextArea();
        contactDisplayArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(contactDisplayArea);

        Container contentPane = getContentPane();
        contentPane.add(inputPanel, BorderLayout.NORTH);
        contentPane.add(addButton, BorderLayout.CENTER);
        contentPane.add(scrollPane, BorderLayout.SOUTH);
    }

    private void updateContactDisplay() {
        contactDisplayArea.setText("");
        for (Contact contact : contacts) {
            contactDisplayArea.append(contact.toString() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ContactBookApp().setVisible(true);
            }
        });
    }
      }
