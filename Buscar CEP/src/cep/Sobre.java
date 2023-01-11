package cep;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sobre extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setModal(true);
		setResizable(false);
		setTitle("Sobre");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/home.png")));
		setBounds(150, 150, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscar CEP - Ver 1.0");
		lblNewLabel.setBounds(10, 62, 124, 13);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("WEB Service: ");
		lblNewLabel_1.setBounds(10, 110, 89, 13);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblWebService = new JLabel("republicavirtual.com.br");
		lblWebService.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link("https://www.republicavirtual.com.br/");
			}
		});
		
		
		lblWebService.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblWebService.setForeground(SystemColor.textHighlight);
		lblWebService.setBounds(109, 110, 185, 13);
		getContentPane().add(lblWebService);
		
		JButton btnGit = new JButton("");
		btnGit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://github.com/ViniGomes1");
			}
		});
		btnGit.setMinimumSize(new Dimension(48, 48));
		btnGit.setMaximumSize(new Dimension(48, 48));
		btnGit.setBorder(null);
		btnGit.setBackground(SystemColor.control);
		btnGit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGit.setToolTipText("GitHub");
		btnGit.setIcon(new ImageIcon(Sobre.class.getResource("/img/github.png")));
		btnGit.setBounds(10, 156, 48, 48);
		getContentPane().add(btnGit);
		
		JButton btnLinkedin = new JButton("");
		btnLinkedin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://www.linkedin.com/in/vinicius-gomes-97705a191/");
			}
		});
		btnLinkedin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLinkedin.setIcon(new ImageIcon(Sobre.class.getResource("/img/linkedin.png")));
		btnLinkedin.setToolTipText("LinkedIN");
		btnLinkedin.setBorder(null);
		btnLinkedin.setBackground(SystemColor.control);
		btnLinkedin.setBounds(68, 156, 48, 48);
		getContentPane().add(btnLinkedin);

	}// fim do contrutor
	
	
	private void link(String site) {
		Desktop desktop = Desktop.getDesktop();
		
		try {
			URI uri = new URI(site);
			desktop.browse(uri);
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
