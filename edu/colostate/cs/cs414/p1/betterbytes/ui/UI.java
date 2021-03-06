package edu.colostate.cs.cs414.p1.betterbytes.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;

import edu.colostate.cs.cs414.p1.betterbytes.utilities.Tools;

/**
 *
 * @author Daniel McClure, created in NetBeans.
 */
public class UI extends javax.swing.JFrame implements ActionListener {

	private javax.swing.JButton ACCEPTBUTTON;
	private javax.swing.JList<String> CURRENTGAMESLIST;
	private javax.swing.JButton DECLINEBUTTON;
	private javax.swing.JList<String> INVITESLIST;
	private javax.swing.JButton LOGINBUTTON;
	private javax.swing.JPasswordField PASSWORD;
	private javax.swing.JButton PROFILESTATSBUTTON;
	private javax.swing.JButton QUITGAMEBUTTON;
	private javax.swing.JButton REFRESHBUTTON;
	private javax.swing.JButton RESUMEGAMEBUTTON;
	private javax.swing.JTextField USERNAME;
	private javax.swing.JButton VIEWGAMEMANUALBUTTON;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private DefaultListModel gamesListModel = new DefaultListModel();
	private DefaultListModel invitesListModel = new DefaultListModel();
	private ArrayList<String> loadedGames = new ArrayList<String>();

	/**
	 * Creates new form UI
	 */
	public UI() {
		initComponents();
		this.setTitle("Tafl Control Panel    |    Profile: ");
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		LOGINBUTTON = new javax.swing.JButton();
		PASSWORD = new javax.swing.JPasswordField();
		USERNAME = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		CURRENTGAMESLIST = new javax.swing.JList<>();
		jScrollPane2 = new javax.swing.JScrollPane();
		INVITESLIST = new javax.swing.JList<>();
		jLabel2 = new javax.swing.JLabel();
		REFRESHBUTTON = new javax.swing.JButton();
		ACCEPTBUTTON = new javax.swing.JButton();
		DECLINEBUTTON = new javax.swing.JButton();
		RESUMEGAMEBUTTON = new javax.swing.JButton();
		QUITGAMEBUTTON = new javax.swing.JButton();
		VIEWGAMEMANUALBUTTON = new javax.swing.JButton();
		PROFILESTATSBUTTON = new javax.swing.JButton();

		LOGINBUTTON.addActionListener(this);
		REFRESHBUTTON.addActionListener(this);
		ACCEPTBUTTON.addActionListener(this);
		DECLINEBUTTON.addActionListener(this);
		RESUMEGAMEBUTTON.addActionListener(this);
		QUITGAMEBUTTON.addActionListener(this);
		VIEWGAMEMANUALBUTTON.addActionListener(this);
		PROFILESTATSBUTTON.addActionListener(this);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));
		jPanel1.setName("Login"); // NOI18N

		LOGINBUTTON.setText("Login");

		PASSWORD.setText("jPasswordField1");

		USERNAME.setText("Username");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(PASSWORD).addComponent(USERNAME).addComponent(LOGINBUTTON,
										javax.swing.GroupLayout.PREFERRED_SIZE, 111,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addComponent(USERNAME, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(PASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(LOGINBUTTON)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jLabel1.setText("Current Games:");

		jScrollPane1.setViewportView(CURRENTGAMESLIST);

		jScrollPane2.setViewportView(INVITESLIST);

		jLabel2.setText("Invites:");

		REFRESHBUTTON.setText("Refresh");

		ACCEPTBUTTON.setText("Accept");

		DECLINEBUTTON.setText("Decline");

		RESUMEGAMEBUTTON.setText("Resume");

		// QUITGAMEBUTTON.setBackground(new java.awt.Color(153, 0, 0));
		QUITGAMEBUTTON.setForeground(new java.awt.Color(255, 0, 0));
		QUITGAMEBUTTON.setText("Forfeit Game");

		VIEWGAMEMANUALBUTTON.setText("View Game Manual");

		PROFILESTATSBUTTON.setText("Profile Stats");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(
						javax.swing.GroupLayout.Alignment.LEADING, false)
						.addGroup(layout
								.createSequentialGroup().addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
										.addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout
												.createSequentialGroup()
												.addComponent(RESUMEGAMEBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE,
														101, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(QUITGAMEBUTTON, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addComponent(jScrollPane1))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
												jLabel2)
										.addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addGroup(layout.createSequentialGroup()
														.addComponent(ACCEPTBUTTON,
																javax.swing.GroupLayout.PREFERRED_SIZE, 95,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(DECLINEBUTTON,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addComponent(REFRESHBUTTON, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(VIEWGAMEMANUALBUTTON, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(PROFILESTATSBUTTON, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addComponent(REFRESHBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel1).addComponent(jLabel2))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233,
												Short.MAX_VALUE)
										.addComponent(jScrollPane2)))
						.addGroup(layout.createSequentialGroup()
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(VIEWGAMEMANUALBUTTON)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(PROFILESTATSBUTTON)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(RESUMEGAMEBUTTON).addComponent(QUITGAMEBUTTON).addComponent(ACCEPTBUTTON)
								.addComponent(DECLINEBUTTON))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting
		// code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
		 * html
		 */
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
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new UI().setVisible(true);
			}
		});
	}

	private boolean checkLogin(String user, String pass) {
		return true;
	}

	public void refreshData() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Tools.log(e.getActionCommand());
		switch (e.getActionCommand()) {
		case "Login":
			if (this.checkLogin(USERNAME.getText(), PASSWORD.getPassword().toString()))
				this.refreshData();
			break;
		case "Refresh":
			this.refreshData();
			break;
		case "Resume":
			if (CURRENTGAMESLIST.getSelectedValue() != null) {
				// resume game
				new Game(this.loadedGames.get(CURRENTGAMESLIST.getSelectedIndex()));
			}
			break;
		}
	}

}
