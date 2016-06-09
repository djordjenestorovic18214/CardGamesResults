package result.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.awt.event.ActionEvent;

public class DodajRezultat extends JFrame {

	private JPanel contentPane;
	private JLabel lblIgrac1;
	private JTextField textField;
	private JLabel lblIgrac2;
	private JTextField textField_1;
	private JLabel lblIgrac3;
	private JTextField textField_2;
	private JLabel lblIgrac4;
	private JTextField textField_3;
	private JLabel lblIgrac5;
	private JTextField textField_4;
	private JLabel lblIgrac6;
	private JTextField textField_5;
	private JButton btnDodajRez;
	/**
	 * Create the frame.
	 */
	public DodajRezultat() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(DodajRezultat.class.getResource("/icons/ultimate_77-512.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 150, 215);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow]", "[][][][][][][]"));
		contentPane.add(getLblIgrac1(), "cell 0 0,alignx trailing");
		contentPane.add(getTextField(), "cell 1 0,alignx right");
		contentPane.add(getLblIgrac2(), "cell 0 1,alignx trailing");
		contentPane.add(getTextField_1(), "cell 1 1,alignx right");
		contentPane.add(getLblIgrac3(), "cell 0 2,alignx trailing");
		contentPane.add(getTextField_2(), "cell 1 2,alignx right");
		contentPane.add(getLblIgrac4(), "cell 0 3,alignx trailing");
		contentPane.add(getTextField_3(), "cell 1 3,alignx right");
		contentPane.add(getLblIgrac5(), "cell 0 4,alignx trailing");
		contentPane.add(getTextField_4(), "cell 1 4,alignx right");
		contentPane.add(getLblIgrac6(), "cell 0 5,alignx trailing");
		contentPane.add(getTextField_5(), "cell 1 5,alignx right");
		contentPane.add(getBtnDodajRez(), "cell 0 6 2 1");
	}

	private JLabel getLblIgrac1() {
		if (lblIgrac1 == null) {
			lblIgrac1 = new JLabel("");
			lblIgrac1.setMinimumSize(new Dimension(55, 0));
		}
		return lblIgrac1;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setMaximumSize(new Dimension(80, 2147483647));
			textField.setMinimumSize(new Dimension(20, 20));
			textField.setVisible(false);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblIgrac2() {
		if (lblIgrac2 == null) {
			lblIgrac2 = new JLabel("");
			lblIgrac2.setMinimumSize(new Dimension(55, 0));
		}
		return lblIgrac2;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setMaximumSize(new Dimension(80, 2147483647));
			textField_1.setVisible(false);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JLabel getLblIgrac3() {
		if (lblIgrac3 == null) {
			lblIgrac3 = new JLabel("");
			lblIgrac3.setMinimumSize(new Dimension(55, 0));
		}
		return lblIgrac3;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setMaximumSize(new Dimension(80, 2147483647));
			textField_2.setVisible(false);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JLabel getLblIgrac4() {
		if (lblIgrac4 == null) {
			lblIgrac4 = new JLabel("");
			lblIgrac4.setMinimumSize(new Dimension(55, 0));
		}
		return lblIgrac4;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setMaximumSize(new Dimension(80, 2147483647));
			textField_3.setVisible(false);
			textField_3.setColumns(10);
		}
		return textField_3;
	}
	private JLabel getLblIgrac5() {
		if (lblIgrac5 == null) {
			lblIgrac5 = new JLabel("");
			lblIgrac5.setMinimumSize(new Dimension(55, 0));
		}
		return lblIgrac5;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setMaximumSize(new Dimension(80, 2147483647));
			textField_4.setVisible(false);
			textField_4.setColumns(10);
		}
		return textField_4;
	}
	private JLabel getLblIgrac6() {
		if (lblIgrac6 == null) {
			lblIgrac6 = new JLabel("");
			lblIgrac6.setMinimumSize(new Dimension(55, 0));
		}
		return lblIgrac6;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setMaximumSize(new Dimension(80, 2147483647));
			textField_5.setVisible(false);
			textField_5.setColumns(10);
		}
		return textField_5;
	}
	private JButton getBtnDodajRez() {
		if (btnDodajRez == null) {
			btnDodajRez = new JButton("Додај резултат");
			btnDodajRez.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String igrac1 = textField.getText();
					String igrac2 = textField_1.getText();
					String igrac3 = textField_2.getText();
					String igrac4 = textField_3.getText();
					String igrac5 = textField_4.getText();
					String igrac6 = textField_5.getText();

					LinkedList<Integer> rezultatiRunde = new LinkedList<Integer>();
					try{
						if(igrac1.isEmpty() || igrac2.isEmpty()) {
							throw new NumberFormatException("Унесите резултат за прва два играча!");
						} else {
							rezultatiRunde.add(Integer.parseInt(igrac1));
							rezultatiRunde.add(Integer.parseInt(igrac2));
						}
					} catch (NumberFormatException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage(), "Грешка", JOptionPane.ERROR_MESSAGE);
					}
					try{
						if(igrac3.isEmpty() && textField_2.isVisible()) {
							throw new NumberFormatException("Унесите резултат за трећег играча!");
						} else {
							rezultatiRunde.add(Integer.parseInt(igrac3));
						}
					} catch (NumberFormatException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage(), "Грешка", JOptionPane.ERROR_MESSAGE);
					}
					try{
						if(igrac4.isEmpty() && textField_3.isEnabled()) {
							throw new NumberFormatException("Унесите резултат за четвртог играча!");
						} else {
							rezultatiRunde.add(Integer.parseInt(igrac4));
						}
					} catch (NumberFormatException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage(), "Грешка", JOptionPane.ERROR_MESSAGE);
					}
					try{
						if(igrac5.isEmpty() && textField_4.isEnabled()) {
							throw new NumberFormatException("Унесите резултат за петог играча!");
						} else {
							rezultatiRunde.add(Integer.parseInt(igrac5));
						}
					} catch (NumberFormatException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage(), "Грешка", JOptionPane.ERROR_MESSAGE);
					}
					try{
						if(igrac6.isEmpty() && textField_5.isEnabled()) {
							throw new NumberFormatException("Унесите резултат за шестог играча!");
						} else {
							rezultatiRunde.add(Integer.parseInt(igrac6));
						}
					} catch (NumberFormatException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage(), "Грешка", JOptionPane.ERROR_MESSAGE);
						
					}
					
					
					
					GUIKontroler.dodajRezUTabelu(rezultatiRunde);
					dispose();
				}
			});
			btnDodajRez.setMinimumSize(new Dimension(125, 23));
			btnDodajRez.setMaximumSize(new Dimension(150, 23));
		}
		return btnDodajRez;
	}

	public void ispisiIgrace(String[] igraci) {
		if(!igraci[0].isEmpty() && igraci[0] != null) {
			lblIgrac1.setText(igraci[0]);
			textField.setVisible(true);
		} if(!igraci[1].isEmpty() && igraci[1] != null) {
			lblIgrac2.setText(igraci[1]);
			textField_1.setVisible(true);
			textField.setEnabled(true);
		} if(!igraci[2].isEmpty() && igraci[2] != null) {
			lblIgrac3.setText(igraci[2]);
			textField_2.setVisible(true);
		} if(!igraci[3].isEmpty() && igraci[3] != null) {
			lblIgrac4.setText(igraci[3]);
			textField_3.setVisible(true);
		} if(!igraci[4].isEmpty() && igraci[4] != null) {
			lblIgrac5.setText(igraci[4]);
			textField_4.setVisible(true);
		} if(!igraci[5].isEmpty() && igraci[5] != null) {
			lblIgrac6.setText(igraci[5]);
			textField_5.setVisible(true);
		}
	}
}
