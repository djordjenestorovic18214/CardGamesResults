package result.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import results.view.models.ResultTableModel;

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
import java.awt.Dimension;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;

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
	private JLabel lblIgrac1;
	private JTextField txtIgrac1;
	private JLabel lblIgrac2;
	private JTextField txtIgrac2;
	private JLabel lblIgrac3;
	private JTextField txtIgrac3;
	private JLabel lblIgrac4;
	private JTextField txtIgrac4;
	private JLabel lblIgrac5;
	private JTextField txtIgrac5;
	private JLabel lblIgrac6;
	private JTextField txtIgrac6;
	private JLabel lblPobeda;
	private JTextField txtPobeda;

	
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
			panel.setLayout(new MigLayout("", "[grow]", "[][][][][][][][][][][][][]"));
			panel.add(getBtnNovaIgra(), "cell 0 0,growx");
			panel.add(getBtnDodajRezultat(), "flowy,cell 0 1,growx");
			panel.add(getBtnDodajIgraca(), "cell 0 1,growx");
			panel.add(getBtnPocniIspocetka(), "cell 0 2");
			panel.add(getBtnKrajIgre(), "cell 0 3,growx");
			panel.add(getLblRundaBroj(), "cell 0 5");
			panel.add(getTxtRundaBroj(), "cell 0 6");
			panel.add(getLblDeliIgrac(), "cell 0 7");
			panel.add(getTxtDeliIgrac(), "cell 0 8");
			panel.add(getLblPrviIgra(), "cell 0 9");
			panel.add(getTxtPrviIgra(), "cell 0 10");
			panel.add(getLblPobeda(), "cell 0 11");
			panel.add(getTxtPobeda(), "cell 0 12,alignx left");
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "UKUPNO", TitledBorder.LEFT, TitledBorder.TOP, null, Color.BLACK));
			panel_1.setEnabled(false);
			panel_1.setLayout(new MigLayout("", "[][grow][][grow][][grow][][grow][][grow][][grow]", "[]"));
			panel_1.add(getLblIgrac1(), "cell 0 0,alignx trailing");
			panel_1.add(getTxtIgrac1(), "cell 1 0,alignx trailing");
			panel_1.add(getLblIgrac2(), "flowx,cell 2 0,alignx trailing");
			panel_1.add(getTxtIgrac2(), "cell 3 0,alignx trailing,aligny top");
			panel_1.add(getLblIgrac3(), "cell 4 0,growx");
			panel_1.add(getTxtIgrac3(), "flowx,cell 5 0,alignx trailing");
			panel_1.add(getLblIgrac4(), "cell 5 0,alignx trailing");
			panel_1.add(getTxtIgrac4(), "cell 7 0,alignx trailing");
			panel_1.add(getLblIgrac5(), "cell 8 0,alignx trailing");
			panel_1.add(getTxtIgrac5(), "cell 9 0,alignx trailing");
			panel_1.add(getLblIgrac6(), "cell 10 0,alignx trailing");
			panel_1.add(getTxtIgrac6(), "cell 11 0,alignx trailing");
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
			table.setModel(new ResultTableModel(GUIKontroler.vratiRezultate()));
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
	private JLabel getLblIgrac1() {
		if (lblIgrac1 == null) {
			lblIgrac1 = new JLabel("");
		}
		return lblIgrac1;
	}
	private JTextField getTxtIgrac1() {
		if (txtIgrac1 == null) {
			txtIgrac1 = new JTextField();
			txtIgrac1.setEditable(false);
			txtIgrac1.setMaximumSize(new Dimension(50, 2147483647));
			txtIgrac1.setMinimumSize(new Dimension(4, 20));
			txtIgrac1.setPreferredSize(new Dimension(4, 20));
			txtIgrac1.setColumns(10);
		}
		return txtIgrac1;
	}
	private JLabel getLblIgrac2() {
		if (lblIgrac2 == null) {
			lblIgrac2 = new JLabel("");
		}
		return lblIgrac2;
	}
	private JTextField getTxtIgrac2() {
		if (txtIgrac2 == null) {
			txtIgrac2 = new JTextField();
			txtIgrac2.setEditable(false);
			txtIgrac2.setMaximumSize(new Dimension(50, 2147483647));
			txtIgrac2.setColumns(10);
		}
		return txtIgrac2;
	}
	private JLabel getLblIgrac3() {
		if (lblIgrac3 == null) {
			lblIgrac3 = new JLabel("");
		}
		return lblIgrac3;
	}
	private JTextField getTxtIgrac3() {
		if (txtIgrac3 == null) {
			txtIgrac3 = new JTextField();
			txtIgrac3.setEditable(false);
			txtIgrac3.setMaximumSize(new Dimension(50, 2147483647));
			txtIgrac3.setColumns(10);
		}
		return txtIgrac3;
	}
	private JLabel getLblIgrac4() {
		if (lblIgrac4 == null) {
			lblIgrac4 = new JLabel("");
		}
		return lblIgrac4;
	}
	private JTextField getTxtIgrac4() {
		if (txtIgrac4 == null) {
			txtIgrac4 = new JTextField();
			txtIgrac4.setEditable(false);
			txtIgrac4.setMaximumSize(new Dimension(50, 2147483647));
			txtIgrac4.setColumns(10);
		}
		return txtIgrac4;
	}
	private JLabel getLblIgrac5() {
		if (lblIgrac5 == null) {
			lblIgrac5 = new JLabel("");
		}
		return lblIgrac5;
	}
	private JTextField getTxtIgrac5() {
		if (txtIgrac5 == null) {
			txtIgrac5 = new JTextField();
			txtIgrac5.setEditable(false);
			txtIgrac5.setMaximumSize(new Dimension(50, 2147483647));
			txtIgrac5.setColumns(10);
		}
		return txtIgrac5;
	}
	private JLabel getLblIgrac6() {
		if (lblIgrac6 == null) {
			lblIgrac6 = new JLabel("");
		}
		return lblIgrac6;
	}
	private JTextField getTxtIgrac6() {
		if (txtIgrac6 == null) {
			txtIgrac6 = new JTextField();
			txtIgrac6.setEditable(false);
			txtIgrac6.setMaximumSize(new Dimension(50, 2147483647));
			txtIgrac6.setColumns(10);
		}
		return txtIgrac6;
	}
	private JLabel getLblPobeda() {
		if (lblPobeda == null) {
			lblPobeda = new JLabel("Игра се до:");
		}
		return lblPobeda;
	}
	private JTextField getTxtPobeda() {
		if (txtPobeda == null) {
			txtPobeda = new JTextField();
			txtPobeda.setColumns(10);
		}
		return txtPobeda;
	}
	
	
}
