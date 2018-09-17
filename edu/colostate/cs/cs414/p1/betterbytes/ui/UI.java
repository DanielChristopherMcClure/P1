package edu.colostate.cs.cs414.p1.betterbytes.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;

/**
 *
 * @author Daniel McClure CS414
 */
public class UI extends javax.swing.JFrame implements ActionListener {

	private DefaultListModel gamesModel = new DefaultListModel();
	private DefaultListModel invitesModel = new DefaultListModel();

	/**
	 * Creates new form UI
	 */
	public UI() {
		this.setTitle("Tafl Control Panel");
		initComponents();
		this.setResizable(false);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		GAMELIST = new javax.swing.JList<>();
		STARTGAMEBUTTON = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		INVITELIST = new javax.swing.JList<>();
		ACCEPTGAMEBUTTON = new javax.swing.JButton();
		DECLINEGAMEBUTTON = new javax.swing.JButton();
		USERNAMEFIELD = new javax.swing.JTextField();
		PASSWORDFIELD = new javax.swing.JPasswordField();
		jSeparator1 = new javax.swing.JSeparator();
		LOGINBUTTON = new javax.swing.JButton();
		jSeparator2 = new javax.swing.JSeparator();
		jLabel2 = new javax.swing.JLabel();
		STATSBUTTON = new javax.swing.JButton();
		GAMERULESBUTTON = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();

		STARTGAMEBUTTON.addActionListener(this);
		ACCEPTGAMEBUTTON.addActionListener(this);
		DECLINEGAMEBUTTON.addActionListener(this);
		GAMERULESBUTTON.addActionListener(this);
		LOGINBUTTON.addActionListener(this);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		jScrollPane1.setViewportView(GAMELIST);
		STARTGAMEBUTTON.setText("Play Game");
		jLabel1.setText("Current Games:");
		jScrollPane2.setViewportView(INVITELIST);
		ACCEPTGAMEBUTTON.setText("Accept Game");
		DECLINEGAMEBUTTON.setText("Decline Game");
		USERNAMEFIELD.setText("Username");
		PASSWORDFIELD.setText("jPasswordField1");
		LOGINBUTTON.setText("Login");
		jLabel2.setText("Login:");
		STATSBUTTON.setText("Profile Stats");
		GAMERULESBUTTON.setText("Game Rules & Info");
		jLabel3.setText("Game Invites:");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addContainerGap()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jScrollPane1)
										.addComponent(STARTGAMEBUTTON, javax.swing.GroupLayout.DEFAULT_SIZE, 196,
												Short.MAX_VALUE)
										.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jSeparator2).addComponent(jSeparator1)
										.addGroup(layout.createSequentialGroup().addComponent(jLabel2).addGap(0, 0,
												Short.MAX_VALUE))
										.addGroup(layout.createSequentialGroup().addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(USERNAMEFIELD).addComponent(PASSWORDFIELD)
												.addComponent(LOGINBUTTON, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(STATSBUTTON, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(GAMERULESBUTTON, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGroup(layout.createSequentialGroup().addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING,
																		false)
																.addComponent(jScrollPane2)
																.addGroup(layout.createSequentialGroup()
																		.addComponent(ACCEPTGAMEBUTTON)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(DECLINEGAMEBUTTON,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				109, Short.MAX_VALUE)))
														.addComponent(jLabel3)).addGap(0, 0, Short.MAX_VALUE)))
												.addContainerGap()))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel1)
						.addComponent(jLabel3))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createSequentialGroup()
								.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(ACCEPTGAMEBUTTON).addComponent(DECLINEGAMEBUTTON))
								.addGap(12, 12, 12)
								.addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel2)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(USERNAMEFIELD, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(PASSWORDFIELD, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(LOGINBUTTON).addGap(18, 18, 18)
								.addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(STATSBUTTON)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(GAMERULESBUTTON)))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(STARTGAMEBUTTON, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
				.addContainerGap()));

		pack();
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new UI().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton ACCEPTGAMEBUTTON;
	private javax.swing.JButton DECLINEGAMEBUTTON;
	private javax.swing.JList<String> GAMELIST;
	private javax.swing.JButton GAMERULESBUTTON;
	private javax.swing.JList<String> INVITELIST;
	private javax.swing.JButton LOGINBUTTON;
	private javax.swing.JPasswordField PASSWORDFIELD;
	private javax.swing.JButton STARTGAMEBUTTON;
	private javax.swing.JButton STATSBUTTON;
	private javax.swing.JTextField USERNAMEFIELD;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JSeparator jSeparator2;
	// End of variables declaration

	public void addInvite(String invite) {
		this.invitesModel.addElement(invite);
		this.INVITELIST.setModel(invitesModel);
	}

	public void addGame(String game) {
		this.gamesModel.addElement(game);
		this.GAMELIST.setModel(gamesModel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}
}
