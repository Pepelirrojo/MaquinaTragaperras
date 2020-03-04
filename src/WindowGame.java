import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;

public class WindowGame extends MaquinaTragaperras {

	private JFrame frmMaquinatragaperras;
	private JButton btnTirar;
	private JLabel lblRosco1;
	private JLabel lblRosco2;
	private JLabel lblRosco3;
	private JSpinner spinDin;
	private JLabel lblMensaje;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowGame window = new WindowGame();
					window.frmMaquinatragaperras.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public WindowGame() {
		frmMaquinatragaperras = new JFrame();
		MaquinaTragaperras miMaqu = new MaquinaTragaperras();
		frmMaquinatragaperras.setTitle("Maquina Tragaperras");
		frmMaquinatragaperras.getContentPane().setBackground(new Color(220, 20, 60));
		frmMaquinatragaperras.setBounds(100, 100, 1040, 524);
		frmMaquinatragaperras.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMaquinatragaperras.getContentPane().setLayout(null);
		btnTirar = new JButton("Tirar");
		btnTirar.setBackground(Color.GREEN);
		btnTirar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((int) spinDin.getValue() == 0) {
					lblMensaje.setText("PRIMERO DEBES INTRODUCIR DINERO");
				} else {
					miMaqu.Tirar((int) spinDin.getValue());
					lblRosco1.setText(miMaqu.getSimb1());
					lblRosco2.setText(miMaqu.getSimb2());
					lblRosco3.setText(miMaqu.getSimb3());
					lblMensaje.setText(miMaqu.getMensaje());
					spinDin.setValue(0);
				}
			}
		});
		btnTirar.setForeground(new Color(255, 0, 0));
		btnTirar.setFont(new Font("Tahoma", Font.PLAIN, 38));
		btnTirar.setBounds(495, 422, 123, 55);
		frmMaquinatragaperras.getContentPane().add(btnTirar);

		lblRosco1 = new JLabel("");
		lblRosco1.setForeground(Color.MAGENTA);
		lblRosco1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRosco1.setBackground(Color.CYAN);
		lblRosco1.setFont(new Font("Tahoma", Font.PLAIN, 39));
		lblRosco1.setBounds(278, 226, 170, 55);
		frmMaquinatragaperras.getContentPane().add(lblRosco1);

		lblRosco2 = new JLabel("");
		lblRosco2.setForeground(Color.CYAN);
		lblRosco2.setHorizontalAlignment(SwingConstants.CENTER);
		lblRosco2.setBackground(Color.MAGENTA);
		lblRosco2.setFont(new Font("Tahoma", Font.PLAIN, 39));
		lblRosco2.setBounds(454, 226, 170, 55);
		frmMaquinatragaperras.getContentPane().add(lblRosco2);

		lblRosco3 = new JLabel("");
		lblRosco3.setForeground(Color.MAGENTA);
		lblRosco3.setHorizontalAlignment(SwingConstants.CENTER);
		lblRosco3.setBackground(Color.GREEN);
		lblRosco3.setFont(new Font("Tahoma", Font.PLAIN, 39));
		lblRosco3.setBounds(627, 226, 170, 55);
		frmMaquinatragaperras.getContentPane().add(lblRosco3);

		spinDin = new JSpinner();
		spinDin.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		spinDin.setFont(new Font("Tahoma", Font.PLAIN, 40));
		spinDin.setBounds(708, 81, 82, 72);
		frmMaquinatragaperras.getContentPane().add(spinDin);

		JLabel lblIntro = new JLabel("Dinero que vas a introducir:         \u20AC");
		lblIntro.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblIntro.setBounds(202, 80, 643, 72);
		frmMaquinatragaperras.getContentPane().add(lblIntro);

		lblMensaje = new JLabel("");
		lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblMensaje.setBounds(202, 340, 643, 53);
		frmMaquinatragaperras.getContentPane().add(lblMensaje);
		
		JLabel lblWelcomeToMaquina = new JLabel("Welcome to Maquina Tragaperras by Pepelirrojo ");
		lblWelcomeToMaquina.setForeground(Color.ORANGE);
		lblWelcomeToMaquina.setFont(new Font("MV Boli", Font.PLAIN, 40));
		lblWelcomeToMaquina.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToMaquina.setBounds(43, 10, 940, 72);
		frmMaquinatragaperras.getContentPane().add(lblWelcomeToMaquina);
	}
}
