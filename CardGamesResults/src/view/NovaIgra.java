package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javafx.scene.control.ComboBox;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class NovaIgra extends JFrame {

	private JPanel contentPane;
	private JLabel lblIzaberiIgru;
	private JLabel lblBrojIgraca;
	private static JLabel lblIgracBr_1;
	private static JLabel lblIgracBr_2;
	private static JLabel lblIgracBr_4;
	private static JLabel lblIgracBr_5;
	private static JLabel lblIgracBr_6;
	private static JTextField txtIgracBr_1;
	private static JTextField txtIgracBr_2;
	private static JTextField txtIgracBr_4;
	private static JTextField txtIgracBr_5;
	private static JTextField txtIgracBr_6;
	private static JLabel lblIgracBr_3;
	private static JTextField txtIgracBr_3;
	private JSlider slider;
	private JComboBox comboBox;
	private JButton btnZapocniIgru;
	private JButton btnPonisti;

	/**
	 * Create the frame.
	 */
	public NovaIgra() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 248, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow]", "[][][][][][][][][]"));
		contentPane.add(getLblIzaberiIgru(), "cell 0 0,alignx left");
		contentPane.add(getComboBox(), "cell 1 0,growx");
		contentPane.add(getLblBrojIgraca(), "cell 0 1,alignx left,aligny center");
		contentPane.add(getSlider(), "cell 1 1");
		contentPane.add(getLblIgracBr_1(), "cell 0 2,alignx left");
		contentPane.add(getTxtIgracBr_1(), "cell 1 2,growx");
		contentPane.add(getLblIgracBr_2(), "cell 0 3,alignx left");
		contentPane.add(getTxtIgracBr_2(), "cell 1 3,growx");
		contentPane.add(getLblIgracBr_3(), "cell 0 4,alignx left");
		contentPane.add(getTxtIgracBr_3(), "cell 1 4,growx");
		contentPane.add(getLblIgracBr_4(), "cell 0 5,alignx left");
		contentPane.add(getTxtIgracBr_4(), "cell 1 5,growx");
		contentPane.add(getLblIgracBr_5(), "cell 0 6,alignx left");
		contentPane.add(getTxtIgracBr_5(), "cell 1 6,growx");
		contentPane.add(getLblIgracBr_6(), "cell 0 7,alignx left");
		contentPane.add(getTxtIgracBr_6(), "cell 1 7,growx");
		contentPane.add(getBtnZapocniIgru(), "cell 0 8,growx");
		contentPane.add(getBtnPonisti(), "cell 1 8,grow");
	}

	private JLabel getLblIzaberiIgru() {
		if (lblIzaberiIgru == null) {
			lblIzaberiIgru = new JLabel("Изабери игру:");
		}
		return lblIzaberiIgru;
	}
	private JLabel getLblBrojIgraca() {
		if (lblBrojIgraca == null) {
			lblBrojIgraca = new JLabel("Број играча:");
		}
		return lblBrojIgraca;
	}
	private JLabel getLblIgracBr_1() {
		if (lblIgracBr_1 == null) {
			lblIgracBr_1 = new JLabel("Играч бр. 1:");
			lblIgracBr_1.setVisible(false);
		}
		return lblIgracBr_1;
	}
	private JLabel getLblIgracBr_2() {
		if (lblIgracBr_2 == null) {
			lblIgracBr_2 = new JLabel("Играч бр. 2:");
			lblIgracBr_2.setVisible(false);
		}
		return lblIgracBr_2;
	}
	private JLabel getLblIgracBr_4() {
		if (lblIgracBr_4 == null) {
			lblIgracBr_4 = new JLabel("Играч бр. 4:");
			lblIgracBr_4.setVisible(false);
		}
		return lblIgracBr_4;
	}
	private JLabel getLblIgracBr_5() {
		if (lblIgracBr_5 == null) {
			lblIgracBr_5 = new JLabel("Играч бр. 5:");
			lblIgracBr_5.setVisible(false);
		}
		return lblIgracBr_5;
	}
	private JLabel getLblIgracBr_6() {
		if (lblIgracBr_6 == null) {
			lblIgracBr_6 = new JLabel("Играч бр. 6:");
			lblIgracBr_6.setVisible(false);
		}
		return lblIgracBr_6;
	}
	private JTextField getTxtIgracBr_1() {
		if (txtIgracBr_1 == null) {
			txtIgracBr_1 = new JTextField();
			txtIgracBr_1.setVisible(false);
			txtIgracBr_1.setColumns(10);
		}
		return txtIgracBr_1;
	}
	private JTextField getTxtIgracBr_2() {
		if (txtIgracBr_2 == null) {
			txtIgracBr_2 = new JTextField();
			txtIgracBr_2.setVisible(false);
			txtIgracBr_2.setColumns(10);
		}
		return txtIgracBr_2;
	}
	private JTextField getTxtIgracBr_4() {
		if (txtIgracBr_4 == null) {
			txtIgracBr_4 = new JTextField();
			txtIgracBr_4.setVisible(false);
			txtIgracBr_4.setColumns(10);
		}
		return txtIgracBr_4;
	}
	private JTextField getTxtIgracBr_5() {
		if (txtIgracBr_5 == null) {
			txtIgracBr_5 = new JTextField();
			txtIgracBr_5.setVisible(false);
			txtIgracBr_5.setColumns(10);
		}
		return txtIgracBr_5;
	}
	private JTextField getTxtIgracBr_6() {
		if (txtIgracBr_6 == null) {
			txtIgracBr_6 = new JTextField();
			txtIgracBr_6.setVisible(false);
			txtIgracBr_6.setColumns(10);
		}
		return txtIgracBr_6;
	}
	private JLabel getLblIgracBr_3() {
		if (lblIgracBr_3 == null) {
			lblIgracBr_3 = new JLabel("Играч бр. 3:");
			lblIgracBr_3.setVisible(false);
		}
		return lblIgracBr_3;
	}
	private JTextField getTxtIgracBr_3() {
		if (txtIgracBr_3 == null) {
			txtIgracBr_3 = new JTextField();
			txtIgracBr_3.setVisible(false);
			txtIgracBr_3.setColumns(10);
		}
		return txtIgracBr_3;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					int vrednost = slider.getValue();
					if(vrednost == 3)
						setVisibleCustom(true, true, true, false, false, false);
					if(vrednost == 4)
						setVisibleCustom(true, true, true, true, false, false);
					if(vrednost == 5)
						setVisibleCustom(true, true, true, true, true, false);
					if(vrednost == 6)
						setVisibleCustom(true, true, true, true, true, true);
					}
			});
			slider.setPaintLabels(true);
			slider.setPaintTicks(true);
			slider.setValue(2);
			slider.setMinorTickSpacing(0);
			slider.setMajorTickSpacing(1);
			slider.setMinimum(2);
			slider.setMaximum(6);
		}
		return slider;
	}
	public static void setVisibleCustom(boolean p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6) {
		txtIgracBr_1.setVisible(p1);
		lblIgracBr_1.setVisible(p1);
		txtIgracBr_2.setVisible(p2);
		lblIgracBr_2.setVisible(p2);
		txtIgracBr_3.setVisible(p3);
		lblIgracBr_3.setVisible(p3);
		txtIgracBr_4.setVisible(p4);
		lblIgracBr_4.setVisible(p4);
		txtIgracBr_5.setVisible(p5);
		lblIgracBr_5.setVisible(p5);
		txtIgracBr_6.setVisible(p6);
		lblIgracBr_6.setVisible(p6);
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.addItem("------------");
			comboBox.addItem("Мау Мау");
			comboBox.addItem("Канаста");
		}
		return comboBox;
	}
	private JButton getBtnZapocniIgru() {
		if (btnZapocniIgru == null) {
			btnZapocniIgru = new JButton("Започни игру");
		}
		return btnZapocniIgru;
	}
	private JButton getBtnPonisti() {
		if (btnPonisti == null) {
			btnPonisti = new JButton("Поништи");
			btnPonisti.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnPonisti.setMaximumSize(new Dimension(101, 23));
			btnPonisti.setMinimumSize(new Dimension(101, 23));
		}
		return btnPonisti;
	}
}