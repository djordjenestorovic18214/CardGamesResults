package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GlavniProzor extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JButton btnNovaIgra;
	private JButton btnDodajIgraca;
	private JButton btnPocniIspocetka;
	private JButton btnKrajIgre;
	private JButton btnDodajRezultat;
	private JLabel lblRundaBroj;
	private JTextField txtRundaBroj;
	private JLabel lblDeliIgrac;
	private JTextField txtDeliIgrac;
	private JLabel lblPrviIgra;
	private JTextField txtPrviIgra;
	private JScrollPane scrollPane;
	private JTable table;
	private JMenuBar menuBar;
	private JMenu mnOptions;
	private JMenu mnAbout;
	private JMenuItem mniNovaIgra;
	private JMenuItem mniDodajIgraca;
	private JMenuItem mniIzlaz;
	private JMenuItem mniIzvorniKod;
	private JMenuItem mniAutori;
	private JMenuItem mniSacuvajRezultat;

	
	/**
	 * Create the frame.
	 */
	public GlavniProzor() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				GUIKontroler.ugasiAplikaciju();
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 635, 478);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.EAST);
		contentPane.add(getPanel_1(), BorderLayout.SOUTH);
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(new MigLayout("", "[]", "[][][][][]"));
			panel.add(getBtnNovaIgra(), "cell 0 0,growx");
			panel.add(getBtnDodajRezultat(), "flowy,cell 0 1,growx");
			panel.add(getBtnDodajIgraca(), "cell 0 1,growx");
			panel.add(getBtnPocniIspocetka(), "cell 0 2");
			panel.add(getBtnKrajIgre(), "cell 0 3,growx");
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setEnabled(false);
			panel_1.setLayout(new MigLayout("", "[][grow][][grow][][grow]", "[]"));
			panel_1.add(getLblRundaBroj(), "cell 0 0,alignx trailing");
			panel_1.add(getTxtRundaBroj(), "cell 1 0,growx");
			panel_1.add(getLblDeliIgrac(), "cell 2 0,alignx trailing");
			panel_1.add(getTxtDeliIgrac(), "cell 3 0,growx,aligny top");
			panel_1.add(getLblPrviIgra(), "cell 4 0,alignx trailing");
			panel_1.add(getTxtPrviIgra(), "cell 5 0,growx");
		}
		return panel_1;
	}
	private JButton getBtnNovaIgra() {
		if (btnNovaIgra == null) {
			btnNovaIgra = new JButton("Нова игра");
			btnNovaIgra.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.pokreniNovaIgraProzor();
				}
			});
		}
		return btnNovaIgra;
	}
	private JButton getBtnDodajIgraca() {
		if (btnDodajIgraca == null) {
			btnDodajIgraca = new JButton("Додај играча");
		}
		return btnDodajIgraca;
	}
	private JButton getBtnPocniIspocetka() {
		if (btnPocniIspocetka == null) {
			btnPocniIspocetka = new JButton("Почни испочетка");
		}
		return btnPocniIspocetka;
	}
	private JButton getBtnKrajIgre() {
		if (btnKrajIgre == null) {
			btnKrajIgre = new JButton("Крај игре");
		}
		return btnKrajIgre;
	}
	private JButton getBtnDodajRezultat() {
		if (btnDodajRezultat == null) {
			btnDodajRezultat = new JButton("Додај резултат");
		}
		return btnDodajRezultat;
	}
	private JLabel getLblRundaBroj() {
		if (lblRundaBroj == null) {
			lblRundaBroj = new JLabel("Рунда број:");
		}
		return lblRundaBroj;
	}
	private JTextField getTxtRundaBroj() {
		if (txtRundaBroj == null) {
			txtRundaBroj = new JTextField();
			txtRundaBroj.setEditable(false);
			txtRundaBroj.setColumns(10);
		}
		return txtRundaBroj;
	}
	private JLabel getLblDeliIgrac() {
		if (lblDeliIgrac == null) {
			lblDeliIgrac = new JLabel("Дели играч:");
		}
		return lblDeliIgrac;
	}
	private JTextField getTxtDeliIgrac() {
		if (txtDeliIgrac == null) {
			txtDeliIgrac = new JTextField();
			txtDeliIgrac.setEditable(false);
			txtDeliIgrac.setColumns(10);
		}
		return txtDeliIgrac;
	}
	private JLabel getLblPrviIgra() {
		if (lblPrviIgra == null) {
			lblPrviIgra = new JLabel("Први игра:");
		}
		return lblPrviIgra;
	}
	private JTextField getTxtPrviIgra() {
		if (txtPrviIgra == null) {
			txtPrviIgra = new JTextField();
			txtPrviIgra.setEditable(false);
			txtPrviIgra.setColumns(10);
		}
		return txtPrviIgra;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
		}
		return table;
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnOptions());
			menuBar.add(getMnAbout());
		}
		return menuBar;
	}
	private JMenu getMnOptions() {
		if (mnOptions == null) {
			mnOptions = new JMenu("Опције");
			mnOptions.add(getMniNovaIgra());
			mnOptions.add(getMniSacuvajRezultat());
			mnOptions.add(getMniDodajIgraca());
			mnOptions.add(getMniIzlaz());
		}
		return mnOptions;
	}
	private JMenu getMnAbout() {
		if (mnAbout == null) {
			mnAbout = new JMenu("О нама");
			mnAbout.add(getMniIzvorniKod());
			mnAbout.add(getMniAutori());
		}
		return mnAbout;
	}
	private JMenuItem getMniNovaIgra() {
		if (mniNovaIgra == null) {
			mniNovaIgra = new JMenuItem("Нова игра");
			mniNovaIgra.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.pokreniNovaIgraProzor();
				}
			});
		}
		return mniNovaIgra;
	}
	private JMenuItem getMniDodajIgraca() {
		if (mniDodajIgraca == null) {
			mniDodajIgraca = new JMenuItem("Додај играча");
		}
		return mniDodajIgraca;
	}
	private JMenuItem getMniIzlaz() {
		if (mniIzlaz == null) {
			mniIzlaz = new JMenuItem("Излаз");
			mniIzlaz.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKontroler.ugasiAplikaciju();
				}
			});
		}
		return mniIzlaz;
	}
	private JMenuItem getMniIzvorniKod() {
		if (mniIzvorniKod == null) {
			mniIzvorniKod = new JMenuItem("Изворни код");
		}
		return mniIzvorniKod;
	}
	private JMenuItem getMniAutori() {
		if (mniAutori == null) {
			mniAutori = new JMenuItem("О ауторима");
			mniAutori.setActionCommand("Аутори");
		}
		return mniAutori;
	}
	private JMenuItem getMniSacuvajRezultat() {
		if (mniSacuvajRezultat == null) {
			mniSacuvajRezultat = new JMenuItem("Сачувај резултат");
		}
		return mniSacuvajRezultat;
	}
}
