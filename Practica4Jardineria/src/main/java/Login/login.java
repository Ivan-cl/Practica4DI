package Login;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField textUsername;
	private JTextField textViewPassword;
	private JPasswordField passwordField;
	private JButton btnVer;
	private boolean viewPassword = false;
	private String text = "He olvidado mi contraseña";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);

		passwordField = new JPasswordField();
		passwordField.setBounds(154, 176, 158, 35);
		contentPane.add(passwordField);

		JLabel lblUsername = new JLabel("Usuario");
		lblUsername.setBounds(47, 116, 74, 21);
		contentPane.add(lblUsername);

		textUsername = new JTextField();
		textUsername.setBounds(154, 116, 158, 29);
		contentPane.add(textUsername);
		textUsername.setColumns(10);

		JLabel lblPassword = new JLabel("Contraseña");
		lblPassword.setBounds(47, 176, 74, 32);
		contentPane.add(lblPassword);

		textViewPassword = new JTextField();
		textViewPassword.setVisible(false);
		textViewPassword.setBounds(154, 176, 158, 35);
		contentPane.add(textViewPassword);
		textViewPassword.setColumns(10);

		JButton btnLogin = new JButton("Entrar");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hola " + textUsername.getText());
			}
		});
		btnLogin.setBounds(180, 238, 97, 45);
		contentPane.add(btnLogin);

		btnVer = new JButton("Mostrar contraseña");
		btnVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (viewPassword == false) {
					textViewPassword.setText(passwordField.getText());
					textViewPassword.setVisible(true);
					passwordField.setVisible(false);
					login.this.revalidate();
					login.this.repaint();
					btnVer.setText("Ocultar");
					viewPassword = true;
				} else {
					passwordField.getText();
					textViewPassword.setVisible(false);
					passwordField.setVisible(true);
					btnVer.setText("Mostrar contraseña");
					viewPassword = false;
				}
			}
		});
		btnVer.setBounds(392, 176, 149, 35);
		contentPane.add(btnVer);

		final JLabel lblHeOlvidadoMi = new JLabel(text);
		lblHeOlvidadoMi.setBounds(392, 244, 193, 32);
		contentPane.add(lblHeOlvidadoMi);
		lblHeOlvidadoMi.setForeground(Color.BLUE.darker());
		lblHeOlvidadoMi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblHeOlvidadoMi.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URI("https://support.google.com/fiber/answer/2676662?hl=es-419"));
				} catch (IOException | URISyntaxException e1) {
					e1.printStackTrace();
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblHeOlvidadoMi.setText(text);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				lblHeOlvidadoMi.setText("<html><a href=''>" + text + "</a></html>");
			}

		});
		getContentPane().add(lblHeOlvidadoMi);

		setSize(646, 414);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
