import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.text.NumberFormatter;
import java.awt.Dimension;
import java.sql.*;
import java.io.IOException;

public class Final extends JFrame implements ActionListener {

  String data69, data70, data1, data2, data3, data4;
  String st1 = new String(), st2 = new String(), st3 = new String();
  ResultSet rs, rs1, rs2;
  String mam, pass,
      alpha[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
          "t", "u", "v", "w", "x", "y", "z" };

  int delay = 2000;

  JFrame f0 = new JFrame(); // Login
  JFrame f = new JFrame(); // Register
  JFrame f1 = new JFrame(); // vehicle details
  JFrame f3 = new JFrame(); // welcome
  JFrame f4 = new JFrame(); // Select Parking
  JFrame f5 = new JFrame(); // Map1
  JFrame f8 = new JFrame(); // Map2
  JFrame f9 = new JFrame(); // Map3
  JFrame f10 = new JFrame();// Map4
  JFrame f6 = new JFrame(); // Change driver
  JFrame f2 = new JFrame(); // payment details
  JFrame fgg = new JFrame(); // The GG
  JFrame fog = new JFrame(); // The Map1 Admin
  JFrame fog1 = new JFrame(); // The Map2 Admin
  JFrame fog2 = new JFrame(); // The Map3 Admin
  JFrame fog3 = new JFrame(); // The Map4 Admin
  JFrame f7 = new JFrame(); // receipt

  JComboBox cb, cbj;

  JLabel j1, j2, j3, j4, j5, j6, js1, js2,
      j01, j02,
      j11, j12, j13, j14,
      j21, j22, j23, j24, j25, j26, j27, j28, j29, j210, j211, j212, jpay, jpay1, jpay2, cj,
      j41, j42, j43, j44, jn41, s1, s2, s3, s4,
      j51,
      j61, j62, j63, j64, j65, j66, j67,
      j71, j72,
      j81,
      j91,
      j101,
      jg1, jg2, jg3, jg4, jng1,
      jf11, jf1a, sf11, jnf11,
      jf1, jnf1, sf1, jfa,
      jf21, jf2a, sf21, jnf21,
      jf31, jf3a, sf31, jnf31,
      i0, i, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, ig,
      jn0, jn, jn1, jn21, jn22, jn23, jn24, jn51, jn31, jn61, jn8, jn9, jn10,
      jw;

  JTextField t1, t2, t3,
      t01,
      t11, t12, t13, t14,
      t21, t22, t23, t24, t25, t26, t27, t28, t29, t210,
      t61, t62, t63, t64, t65;

  JTextArea ta;

  JPasswordField p1, p2, p3, p4, p5;

  JButton next, nxt, reg, prd,
      fnh1, fnh2, fnh3, bpay,
      bk, sbk, lgt,
      bi1, bi2, bi3, bi4, bn21,
      b51, b52, b53, b54, b55, b56, b57, b58, b59, b510, b511, b512, b61,
      b71, b72, b73,
      b81, b82, b83, b84, b85, b86, b87, b88, b89, b810, b811, b812, b813, b814, b815, b816, b817, b818,
      b91, b92, b93, b94, b95, b96, b97, b98, b99, b910, b911, b912, b913, b914, b915, b916,
      b101, b102, b103, b104, b105, b106, b107, b108, b109, b1010, b1011, b1012, b1013,
      bg1, bg2, bg3, bg4, abg,
      bf1, bf2, bf3, bf4, bf5, bf6, bf7, bf8, bf9, bf10, bf11, bf12,
      bfo11, bfo12, bfo13, bfo14, bfo15, bfo16, bfo17, bfo18, bfo19, bfo110, bfo111, bfo112, bfo113, bfo114,
      bfo115, bfo116, bfo117, bfo118, bfo1lgt,
      bf21, bf22, bf23, bf24, bf25, bf26, bf27, bf28, bf29, bf210, bf211, bf212, bf213, bf214, bf215, bf216,
      bf2lgt,
      bf31, bf32, bf33, bf34, bf35, bf36, bf37, bf38, bf39, bf310, bf311, bf312, bf313, bf3lgt;

  BasicArrowButton ab, ab1, ab2, ab3, ab4, ab5, ab6, ab8, ab9, ab10, abf, abf1, abf2, abf3;

  JCheckBox r61, r62, spg;

  JMenuBar mb;
  JMenu m1, m2;

  String s[] = { "--SELECT--", "Credit Card", "Debit Card", "Net Banking" };
  String bj[] = { "-SELECT-", "Two Wheeler", "Four Wheeler" };

  Container a = f0.getContentPane();
  Container b = f.getContentPane();
  Container c = f1.getContentPane();
  Container d = f2.getContentPane();
  Container e = f3.getContentPane();
  Container g = f4.getContentPane();
  Container h = f5.getContentPane();
  Container j = f6.getContentPane();
  Container l = f7.getContentPane();
  Container m = f8.getContentPane();
  Container n = f9.getContentPane();
  Container o = f10.getContentPane();
  Container p = fgg.getContentPane();

  String redb = "java.awt.Color[r=255,g=0,b=0]";
  String greenb = "java.awt.Color[r=0,g=255,b=0]";

  Color COLOR1 = Color.GREEN;
  Color COLOR2 = Color.RED;

  Final() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/parking_ms", "root",
          "Shashank@7");
      Statement stmt = con.createStatement();
      rs = stmt.executeQuery("select * from Login");
      while (rs.next()) {
        data1 = rs.getString(1);
        data2 = rs.getString(2);
        System.out.println(data1);
        System.out.println(data2);
      }
      con.close();
    } catch (Exception w) {
      System.out.println(w);
    }

    // ::::::::::::::::::::::LOGIN PAGE::::::::::::::::::::::::

    f0.setTitle("Login");
    f0.setSize(800, 800);
    Image icon0 = Toolkit.getDefaultToolkit().getImage("hg.png");
    f0.setIconImage(icon0);

    spg = new JCheckBox("SHOW");
    spg.setFont(new Font("ARIAL", Font.PLAIN, 9));
    spg.setBackground(Color.LIGHT_GRAY);

    t01 = new JTextField();
    p3 = new JPasswordField();

    j01 = new JLabel("Username");
    j02 = new JLabel("Password");

    nxt = new JButton("Login");
    reg = new JButton("Not a user?\tSign up!");
    jn0 = new JLabel(" ");

    j01.setBounds(300, 200, 100, 30);
    j02.setBounds(300, 270, 100, 30);
    jn0.setBounds(1, 1, 1, 1);

    // j01.setForeground(Color.white);
    // j02.setForeground(Color.white);
    // aj.setForeground(Color.WHITE);
    // aj1.setForeground(Color.WHITE);

    t01.setBounds(450, 200, 150, 30);
    p3.setBounds(450, 270, 150, 30);

    spg.setBounds(450, 300, 70, 20);
    nxt.setBounds(325, 350, 80, 30);
    reg.setBounds(425, 350, 150, 30);

    f0.add(j01);
    f0.add(j02);
    f0.add(t01);
    f0.add(p3);
    f0.add(spg);
    f0.add(nxt);
    f0.add(reg);
    f0.add(jn0);

    i0 = new JLabel();
    i0.setIcon(new ImageIcon("fo.jpg"));
    Dimension size = getPreferredSize();
    i0.setBounds(400, 400, size.width, size.height);
    a.add(i0);

    f0.setVisible(true);

    spg.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent a) {
        if (spg.isSelected()) {
          p3.setEchoChar((char) 0);
        } else {
          p3.setEchoChar('•');
        }
      }
    });

    reg.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent a) {
        f0.setVisible(false);
        t01.setText("");
        p3.setText("");
        f.setVisible(true);
      }
    });
    nxt.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent d) {
        String asb = String.valueOf(p3.getPassword());
        if (t01.getText().isEmpty() || p3.getPassword().length == 0) {
          JOptionPane.showMessageDialog(null, "The above field(s) cannot be empty");
        } else if (data1.equals(t01.getText()) && (data2.equals(asb))) {
          f0.setVisible(false);
          fgg.setVisible(true);
        } else {
          f0.setVisible(false);
          f3.setVisible(true);
        }
      }

    });

    // ::::::::::::::::::::::REGISTER PAGE::::::::::::::

	// try {
	// 	String a1 = t1.getText();
	// 	String a2 = t2.getText();
	// 	String a3 = t3.getText();
	// 	String a4 = p1.getText();
	// 	String str = "insert into signup values('" + a1 + "','" + a2 + "','" + a3 + "','" + a4 + "')";
	// 	Class.forName("com.mysql.jdbc.Driver");
	// 	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/saps_parking",
	// 		"root",
	// 		"Root@1234");
	// 	Statement stmt1;
	// 	stmt1 = con.createStatement();
	
		
	// 	while(rs.next()){
	// 	String g = rs1.getString(1);
	// 	String h = rs1.getString(2);
	// 	String ii = rs1.getString(3);
	// 	String jj = rs1.getString(4);
	// 		System.out.println(g);
	// 	}
	// 	con.close();
	//   } catch (Exception w) {
	// 	System.out.println(w);
	//   }

    f.setTitle("Signup ");
    f.setSize(800, 800);
    Image icon = Toolkit.getDefaultToolkit().getImage("rg.png");
    f.setIconImage(icon);

    j1 = new JLabel("Name");
    j2 = new JLabel("Email ID");
    j3 = new JLabel("Mobile No.");
    j4 = new JLabel("Passsword");
    j5 = new JLabel("Confirm Password");
    js1 = new JLabel("*Enter Valid Mobile number(10 digits only)");
    js2 = new JLabel("*Passwords not matching");

    // j1.setForeground(Color.white);
    // j2.setForeground(Color.white);
    // j3.setForeground(Color.white);
    // j4.setForeground(Color.white);
    // j5.setForeground(Color.white);
    js1.setForeground(Color.yellow);
    js2.setForeground(Color.yellow);
    js1.setVisible(false);
    js2.setVisible(false);

    p1 = new JPasswordField();
    p2 = new JPasswordField();

    t1 = new JTextField();
    t2 = new JTextField();
    t3 = new JTextField();
    t3.addKeyListener(new KeyAdapter() {
      public void keyPressed(KeyEvent p) {
        char c = p.getKeyChar();
        char s = (char) p.getKeyCode();
        if (((c >= '0') && (c <= '9')) /* && (s == KeyEvent.VK_BACK_SPACE) */) {
          p.consume();
          t3.setEditable(true);
        } else if ((s == KeyEvent.VK_BACK_SPACE)) {
          t3.setEditable(true);
        } else {
          JOptionPane.showMessageDialog(null, "Please enter a number");
          t3.setEditable(true);
        }
      }
    });

    ab = new BasicArrowButton(BasicArrowButton.WEST);

    next = new JButton("Next");
    jn = new JLabel("");

    j1.setBounds(300, 200, 80, 30);
    j2.setBounds(300, 250, 80, 30);
    j3.setBounds(300, 300, 80, 30);
    j4.setBounds(300, 350, 80, 30);
    j5.setBounds(300, 400, 120, 30);
    js1.setBounds(450, 325, 300, 30);
    js2.setBounds(450, 425, 200, 30);
    t1.setBounds(450, 200, 100, 30);
    t2.setBounds(450, 250, 100, 30);
    t3.setBounds(450, 300, 100, 30);
    p1.setBounds(450, 350, 100, 30);
    p2.setBounds(450, 400, 100, 30);
    next.setBounds(375, 450, 80, 30);
    ab.setBounds(20, 50, 30, 30);
    jn.setBounds(1, 1, 1, 1);

    f.add(j1);
    f.add(j2);
    f.add(j3);
    f.add(j4);
    f.add(j5);
    f.add(js1);
    f.add(js2);
    f.add(t1);
    f.add(t2);
    f.add(t3);
    f.add(ab);
    f.add(p1);
    f.add(p2);
    f.add(next);
    f.add(jn);

    i = new JLabel();
    i.setIcon(new ImageIcon("fp.jpg"));
    i.setBounds(400, 400, size.width, size.height);
    b.add(i);
    next.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (p1.getPassword().length == p2.getPassword().length) {
          js2.setVisible(false);
          if (t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty()
              || p1.getPassword().length == 0 || p2.getPassword().length == 0) {
            JOptionPane.showMessageDialog(null, "The above field(s) cannot be empty");

          } else {
            f.setVisible(false);
            st1 = t1.getText();
            st2 = t2.getText();
            st3 = t3.getText();

            p1.setText("");
            p2.setText("");
            f1.setVisible(true);
          }
        } else {
          js2.setVisible(true);
          f.setVisible(true);
          f1.setVisible(false);
        }
      }
    });

    ab.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        f.setVisible(false);
        f0.setVisible(true);
      }
    });

    // :::::::::::::::::::::::::::VEHICLE DETAIL PAGE::::::::::::::::::::
    String abc = t1.getText(), abcd = t2.getText(), abcde = t3.getText();
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/parking_ms", "root",
          "Shashank@7");
      Statement stmt = con.createStatement();
      rs2 = stmt.executeQuery(
          "INSERT INTO Signup(Full_Name,email_id,contact_no)" + "VALUES(" + abc + "','" + abcd + "','" + abcde
              + ")");
      while (rs2.next()) {
        data1 = rs2.getString(1);
        data2 = rs2.getString(2);
      }
      con.close();
    } catch (Exception w) {
      System.out.println(w);
    }

    f1.setTitle("Enter Vehicle details");
    f1.setSize(800, 800);
    Image icon1 = Toolkit.getDefaultToolkit().getImage("dg.jpg");
    f1.setIconImage(icon1);

    j11 = new JLabel("License Id");
    j12 = new JLabel("Vehicle No.");
    j13 = new JLabel("Vehicle Type");
    j14 = new JLabel("Vehicle Model");
    cbj = new JComboBox<>(bj);

    // j11.setForeground(Color.white);
    // j12.setForeground(Color.white);
    // j13.setForeground(Color.white);
    // j14.setForeground(Color.white);

    t11 = new JTextField();
    t12 = new JTextField();

    t14 = new JTextField();

    ab1 = new BasicArrowButton(BasicArrowButton.WEST);

    prd = new JButton("Proceed");
    jn1 = new JLabel(" ");

    j11.setBounds(300, 200, 120, 30);
    j12.setBounds(300, 250, 120, 30);
    j13.setBounds(300, 300, 120, 30);
    j14.setBounds(300, 350, 120, 30);

    t11.setBounds(450, 200, 100, 30);
    t12.setBounds(450, 250, 100, 30);
    cbj.setBounds(450, 300, 100, 30);
    t14.setBounds(450, 350, 100, 30);

    prd.setBounds(375, 400, 100, 30);
    ab1.setBounds(20, 50, 30, 30);

    jn1.setBounds(1, 1, 1, 1);

    f1.add(j11);
    f1.add(j12);
    f1.add(j13);
    f1.add(j14);
    f1.add(t11);
    f1.add(t12);
    f1.add(cbj);
    f1.add(t14);
    f1.add(prd);
    f1.add(ab1);
    f1.add(jn1);

    i1 = new JLabel();
    i1.setIcon(new ImageIcon("fp.jpg"));
    i1.setBounds(400, 400, size.width, size.height);
    c.add(i1);

    prd.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (t11.getText().isEmpty() || t12.getText().isEmpty()
            || t14.getText().isEmpty()) {
          JOptionPane.showMessageDialog(null, "The above field(s) cannot be empty");

        } else {
          f1.setVisible(false);
          System.out.println(rs2);
          f3.setVisible(true);
        }
      }
    });

    ab1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        f1.setVisible(false);
        f.setVisible(true);
      }
    });

    // :::::::::::::::::WELCOME PAGE::::::::::::::::::::::

    Image icon2 = Toolkit.getDefaultToolkit().getImage("jp.jpg");
    f3.setIconImage(icon2);

    f3.setTitle("WELCOME to SAPS PARKING");
    f3.setSize(800, 800);

    mb = new JMenuBar();
    m1 = new JMenu();

    bk = new JButton("Book a Slot");
    bk.setFont(new Font("ARIAL", Font.PLAIN, 20));
    lgt = new JButton("Logout");
    ab3 = new BasicArrowButton(BasicArrowButton.WEST);
    jw = new JLabel("WELCOME TO APS PARKING");
    i3 = new JLabel();
    jn31 = new JLabel("");
    jw.setFont(new Font("ARIAL", Font.PLAIN, 30));
    bn21 = new JButton();

    bk.setBounds(300, 400, 150, 30);
    ab3.setBounds(20, 50, 30, 30);
    lgt.setBounds(55, 50, 80, 30);
    bn21.setBounds(1, 1, 1, 1);

    jw.setBounds(200, 150, 500, 50);
    jw.setForeground(Color.white);
    jn31.setBounds(1, 1, 1, 1);

    f3.add(bk);
    f3.add(ab3);
    f3.add(lgt);
    f3.add(bn21);
    f3.add(jw);
    f3.add(jn31);

    bn21.setVisible(false);

    bk.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent d) {
        f3.setVisible(false);
        f4.setVisible(true);
      }
    });

    ab3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        f3.setVisible(false);
        f1.setVisible(true);
      }
    });

    lgt.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        f3.setVisible(false);
        f0.setVisible(true);
      }
    });

    i3.setIcon(new ImageIcon("fd.jpg"));
    i3.setBounds(1, 1, size.width, size.height);
    e.add(i3);

    // ::::::::::::::::::::Select Parking::::::::::::::::::::::::::

    Image icon3 = Toolkit.getDefaultToolkit().getImage("pp.jpg");
    f4.setIconImage(icon3);

    f4.setTitle("Select a parking facility");
    f4.setSize(800, 800);

    ImageIcon pf1 = new ImageIcon("pf11.jpg");
    ImageIcon pf2 = new ImageIcon("pf22.jpg");
    ImageIcon pf3 = new ImageIcon("pf33.jpg");
    ImageIcon pf4 = new ImageIcon("pf44.jpg");

    j41 = new JLabel("Mumbai Parking Facility");
    j41.setForeground(Color.white);
    j42 = new JLabel("Kolkata Parking Facility");
    j42.setForeground(Color.white);
    j43 = new JLabel("Chennai Parking Facility");
    j43.setForeground(Color.white);
    j44 = new JLabel("Delhi Parking Facility");
    j44.setForeground(Color.white);

    bi1 = new JButton(pf1);
    bi2 = new JButton(pf2);
    bi3 = new JButton(pf3);
    bi4 = new JButton(pf4);
    ab4 = new BasicArrowButton(BasicArrowButton.WEST);
    jn41 = new JLabel("");

    j41.setBounds(150, 300, 200, 80);
    j42.setBounds(500, 300, 200, 80);
    j43.setBounds(150, 600, 200, 80);
    j44.setBounds(500, 600, 200, 80);

    bi1.setBounds(75, 90, 300, 200);
    bi2.setBounds(425, 90, 300, 200);
    bi3.setBounds(75, 400, 300, 200);
    bi4.setBounds(425, 400, 300, 200);
    ab4.setBounds(20, 50, 30, 30);
    jn41.setBounds(1, 1, 1, 1);

    f4.add(j41);
    f4.add(j42);
    f4.add(j43);
    f4.add(j44);
    f4.add(bi1);
    f4.add(bi2);
    f4.add(bi3);
    f4.add(bi4);
    f4.add(ab4);
    f4.add(jn41);

    jn41.setVisible(false);

    bi1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        f4.setVisible(false);
        f5.setVisible(true);

        if (ae.getSource() == bi1) {
          data69 = "Mumbai Parking Facility";

        }

      }
    });
    bi2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent be) {
        f4.setVisible(false);
        f8.setVisible(true);

        if (be.getSource() == bi2) {
          data69 = "Kolkata Parking Facility";
        }
      }
    });
    bi3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ce) {
        f4.setVisible(false);
        f9.setVisible(true);

        if (ce.getSource() == bi3) {
          data69 = "Chennai Parking Facility";
        }
      }
    });
    bi4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent de) {
        f4.setVisible(false);
        f10.setVisible(true);

        if (de.getSource() == bi4) {
          data69 = "Delhi Parking Facility";
        }
      }
    });

    ab4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        f4.setVisible(false);
        f3.setVisible(true);
      }
    });

    i4 = new JLabel();
    i4.setIcon(new ImageIcon("fd.jpg"));
    i4.setBounds(200, 200, size.width, size.height);
    g.add(i4);

    // :::::::::::::::::::Maps of Parking Facilities::::::::::::::::::::::::

    // ::::::::::::::::::::Map1 ::::::::::::

    f5.setTitle("Map of Parking Facilities");
    f5.setSize(800, 800);

    b51 = new JButton("slot 1");
    // b51.setForeground(Color.white);
    b52 = new JButton("slot 2");
    // b52.setForeground(Color.white);
    b53 = new JButton("slot 3");
    // b53.setForeground(Color.white);
    b54 = new JButton("slot 4");
    // b54.setForeground(Color.white);
    b55 = new JButton("slot 5");
    // b55.setForeground(Color.white);
    b56 = new JButton("slot 6");
    // b56.setForeground(Color.white);
    b57 = new JButton("slot 7");
    // b57.setForeground(Color.white);
    b58 = new JButton("slot 8");
    // b58.setForeground(Color.white);
    b59 = new JButton("slot 9");
    // b59.setForeground(Color.white);
    b510 = new JButton("slot 10");
    // b510.setForeground(Color.white);
    b511 = new JButton("slot 11");
    // b511.setForeground(Color.white);
    b512 = new JButton("slot 12");
    // b512.setForeground(Color.white);
    j51 = new JLabel("Book your slot!!");
    j51.setFont(new Font("ARIAL", Font.PLAIN, 30));
    s1 = new JLabel("Mumbai Parking Facility");
    s1.setFont(new Font("ARIAL", Font.PLAIN, 30));
    ab5 = new BasicArrowButton(BasicArrowButton.WEST);
    jn51 = new JLabel("");

    b51.setBounds(50, 100, 80, 50);
    b52.setBounds(350, 100, 80, 50);
    b53.setBounds(650, 100, 80, 50);
    b54.setBounds(50, 250, 80, 50);
    b55.setBounds(350, 250, 80, 50);
    b56.setBounds(650, 250, 80, 50);
    b57.setBounds(50, 400, 80, 50);
    b58.setBounds(350, 400, 80, 50);
    b59.setBounds(650, 400, 80, 50);
    b510.setBounds(50, 550, 80, 50);
    b511.setBounds(350, 550, 80, 50);
    b512.setBounds(650, 550, 80, 50);
    s1.setBounds(250, 625, 400, 80);
    j51.setBounds(275, 25, 300, 30);
    ab5.setBounds(20, 50, 30, 30);
    jn51.setBounds(1, 1, 1, 1);
    b51.setBackground(Color.GREEN);
    b52.setBackground(Color.GREEN);
    b53.setBackground(Color.GREEN);
    b54.setBackground(Color.GREEN);
    b55.setBackground(Color.RED);
    b56.setBackground(Color.GREEN);
    b57.setBackground(Color.RED);
    b58.setBackground(Color.GREEN);
    b59.setBackground(Color.GREEN);
    b510.setBackground(Color.RED);
    b511.setBackground(Color.GREEN);
    b512.setBackground(Color.RED);
    b51.setVisible(true);
    b52.setVisible(true);
    b53.setVisible(true);
    b54.setVisible(true);
    b55.setVisible(true);
    b56.setVisible(true);
    b57.setVisible(true);
    b58.setVisible(true);
    b59.setVisible(true);
    b510.setVisible(true);
    b511.setVisible(true);
    b512.setVisible(true);
    j51.setVisible(true);
    jn51.setVisible(true);

    f5.add(b51);
    f5.add(b52);
    f5.add(b53);
    f5.add(b54);
    f5.add(b55);
    f5.add(b56);
    f5.add(b57);
    f5.add(b58);
    f5.add(b59);
    f5.add(b510);
    f5.add(b511);
    f5.add(b512);
    f5.add(s1);
    f5.add(ab5);
    f5.add(j51);
    f5.add(jn51);

    b51.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ee) {
        Color co = bf1.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f5.setVisible(false);
          f6.setVisible(true);
          if (ee.getSource() == b51) {
            data70 = "Slot 1";
          }
        }

      }
    });

    b52.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent fe) {
        Color co = bf2.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f5.setVisible(false);
          f6.setVisible(true);
          if (fe.getSource() == b52) {
            data70 = "Slot 2";
          }
        }
      }
    });
    b53.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ge) {
        Color co = bf3.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f5.setVisible(false);
          f6.setVisible(true);
          if (ge.getSource() == b53) {
            data70 = "Slot 3";
          }
        }
      }
    });
    b54.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent he) {
        Color co = bf4.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f5.setVisible(false);
          f6.setVisible(true);
          if (he.getSource() == b54) {
            data70 = "Slot 4";
          }
        }
      }
    });
    b55.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ie) {
        Color co = bf5.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f5.setVisible(false);
          f6.setVisible(true);
          if (ie.getSource() == b55) {
            data70 = "Slot 5";
          }
        }
      }
    });
    b56.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent je) {
        Color co = bf6.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f5.setVisible(false);
          f6.setVisible(true);
          if (je.getSource() == b56) {
            data70 = "Slot 6";
          }
        }

      }
    });
    b57.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ke) {
        Color co = bf7.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f5.setVisible(false);
          f6.setVisible(true);
          if (ke.getSource() == b57) {
            data70 = "Slot 7";
          }
        }
      }
    });
    b58.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent le) {
        Color co = bf8.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f5.setVisible(false);
          f6.setVisible(true);
          if (le.getSource() == b58) {
            data70 = "Slot 8";
          }
        }
      }
    });
    b59.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent me) {
        Color co = bf9.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f5.setVisible(false);
          f6.setVisible(true);
          if (me.getSource() == b59) {
            data70 = "Slot 9";
          }
        }
      }
    });
    b510.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ne) {
        Color co = bf10.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f5.setVisible(false);
          f6.setVisible(true);
          if (ne.getSource() == b510) {
            data70 = "Slot 10";
          }
        }
      }
    });
    b511.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent oe) {
        Color co = bf11.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f5.setVisible(false);
          f6.setVisible(true);
          if (oe.getSource() == b511) {
            data70 = "Slot 11";
          }
        }
      }
    });
    b512.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent pe) {
        Color co = bf12.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f5.setVisible(false);
          f6.setVisible(true);
          if (pe.getSource() == b512) {
            data70 = "Slot 12";
          }
        }
      }
    });

    String b51s = b51.getBackground().toString(), b52s = b52.getBackground().toString(),
        b53s = b53.getBackground().toString(),
        b54s = b54.getBackground().toString(), b55s = b55.getBackground().toString(),
        b56s = b56.getBackground().toString(),
        b57s = b57.getBackground().toString(), b58s = b58.getBackground().toString(),
        b59s = b59.getBackground().toString(),
        b510s = b510.getBackground().toString(), b511s = b511.getBackground().toString(),
        b512s = b512.getBackground().toString();

    ab5.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent b) {
        f5.setVisible(false);
        f4.setVisible(true);
      }
    });

    i5 = new JLabel();
    i5.setIcon(new ImageIcon("fz.png"));
    i5.setBounds(200, 200, size.width, size.height);
    h.add(i5);

    // ::::::::::::::::::::::Map2::::::::::::::::::::::::::
    f8.setSize(800, 800);

    b81 = new JButton("slot 1");
    b82 = new JButton("slot 2");
    b83 = new JButton("slot 3");
    b84 = new JButton("slot 4");
    b85 = new JButton("slot 5");
    b86 = new JButton("slot 6");
    b87 = new JButton("slot 7");
    b88 = new JButton("slot 8");
    b89 = new JButton("slot 9");
    b810 = new JButton("slot 10");
    b811 = new JButton("slot 11");
    b812 = new JButton("slot 12");
    b813 = new JButton("slot 13");
    b814 = new JButton("slot 14");
    b815 = new JButton("slot 15");
    b816 = new JButton("slot 16");
    b817 = new JButton("slot 17");
    b818 = new JButton("slot 18");
    ab8 = new BasicArrowButton(BasicArrowButton.WEST);
    j81 = new JLabel("Book your slot!!");
    j81.setFont(new Font("ARIAL", Font.PLAIN, 30));
    jn8 = new JLabel();
    s2 = new JLabel("Kolkata Parking Facility");
    s2.setFont(new Font("ARIAL", Font.PLAIN, 30));

    b81.setBounds(50, 100, 80, 50);
    b82.setBounds(150, 100, 80, 50);
    b83.setBounds(250, 100, 80, 50);
    b84.setBounds(450, 200, 80, 50);
    b85.setBounds(550, 200, 80, 50);
    b86.setBounds(650, 200, 80, 50);
    b87.setBounds(50, 300, 80, 50);
    b88.setBounds(150, 300, 80, 50);
    b89.setBounds(250, 300, 80, 50);
    b810.setBounds(450, 400, 80, 50);
    b811.setBounds(550, 400, 80, 50);
    b812.setBounds(650, 400, 80, 50);
    b813.setBounds(50, 500, 80, 50);
    b814.setBounds(150, 500, 80, 50);
    b815.setBounds(250, 500, 80, 50);
    b816.setBounds(450, 600, 80, 50);
    b817.setBounds(550, 600, 80, 50);
    b818.setBounds(650, 600, 80, 50);
    ab8.setBounds(20, 50, 30, 30);
    s2.setBounds(250, 650, 400, 80);
    j81.setBounds(275, 25, 300, 30);
    jn8.setBounds(1, 1, 1, 1);

    b81.setBackground(Color.GREEN);
    b82.setBackground(Color.GREEN);
    b83.setBackground(Color.RED);
    b84.setBackground(Color.GREEN);
    b85.setBackground(Color.RED);
    b86.setBackground(Color.GREEN);
    b87.setBackground(Color.RED);
    b88.setBackground(Color.GREEN);
    b89.setBackground(Color.GREEN);
    b810.setBackground(Color.RED);
    b811.setBackground(Color.GREEN);
    b812.setBackground(Color.RED);
    b813.setBackground(Color.RED);
    b814.setBackground(Color.GREEN);
    b815.setBackground(Color.GREEN);
    b816.setBackground(Color.RED);
    b817.setBackground(Color.GREEN);
    b818.setBackground(Color.RED);

    f8.add(b81);
    f8.add(b82);
    f8.add(b83);
    f8.add(b84);
    f8.add(b85);
    f8.add(b86);
    f8.add(b87);
    f8.add(b88);
    f8.add(b89);
    f8.add(b810);
    f8.add(b811);
    f8.add(b812);
    f8.add(b813);
    f8.add(b814);
    f8.add(b815);
    f8.add(b816);
    f8.add(b817);
    f8.add(b818);
    f8.add(ab8);
    f8.add(s2);
    f8.add(j81);
    f8.add(jn8);

    jn8.setVisible(false);

    i8 = new JLabel();
    i8.setIcon(new ImageIcon("fz.png"));
    i8.setBounds(200, 200, size.width, size.height);
    m.add(i8);

    b81.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo11.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f8.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b81) {
            data70 = "Slot 1";
          }
        }
      }
    });

    b82.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo12.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f8.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b82) {
            data70 = "Slot 2";
          }
        }
      }
    });

    b83.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo13.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f8.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b83) {
            data70 = "Slot 3";
          }
        }
      }
    });

    b84.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo14.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f8.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b84) {
            data70 = "Slot 4";
          }
        }
      }
    });

    b85.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo15.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f8.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b85) {
            data70 = "Slot 5";
          }
        }
      }
    });

    b86.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo16.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f8.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b86) {
            data70 = "Slot 6";
          }
        }
      }
    });

    b87.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo17.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f8.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b87) {
            data70 = "Slot 7";
          }
        }
      }
    });

    b88.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo18.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f8.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b88) {
            data70 = "Slot 8";
          }
        }
      }
    });

    b89.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo19.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f8.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b89) {
            data70 = "Slot 9";
          }
        }
      }
    });

    b810.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo110.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f8.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b810) {
            data70 = "Slot 10";
          }
        }
      }
    });

    b811.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo111.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f8.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b811) {
            data70 = "Slot 11";
          }
        }
      }
    });

    b812.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo112.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f8.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b812) {
            data70 = "Slot 12";
          }
        }
      }
    });

    b813.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo113.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f8.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b813) {
            data70 = "Slot 13";
          }
        }
      }
    });
    b814.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo114.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f8.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b814) {
            data70 = "Slot 14";
          }
        }
      }
    });
    b815.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo115.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f8.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b815) {
            data70 = "Slot 15";
          }
        }
      }
    });
    b816.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo116.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f8.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b816) {
            data70 = "Slot 16";
          }
        }
      }
    });
    b817.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo117.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f8.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b817) {
            data70 = "Slot 17";
          }
        }
      }
    });
    b818.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo118.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f8.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b818) {
            data70 = "Slot 18";
          }
        }
      }
    });

    String b81s = b81.getBackground().toString(), b82s = b82.getBackground().toString(),
        b83s = b83.getBackground().toString(),
        b84s = b84.getBackground().toString(), b85s = b85.getBackground().toString(),
        b86s = b86.getBackground().toString(),
        b87s = b87.getBackground().toString(), b88s = b88.getBackground().toString(),
        b89s = b89.getBackground().toString(),
        b810s = b810.getBackground().toString(), b811s = b811.getBackground().toString(),
        b812s = b812.getBackground().toString(), b813s = b813.getBackground().toString(),
        b814s = b814.getBackground().toString(), b815s = b815.getBackground().toString(),
        b816s = b816.getBackground().toString(), b817s = b817.getBackground().toString(),
        b818s = b818.getBackground().toString();

    ab8.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent b) {
        f8.setVisible(false);
        f4.setVisible(true);
      }
    });

    // ::::::::::::::::::::::Map3::::::::::::::::::::::::::

    f9.setSize(800, 800);

    b91 = new JButton("slot 1");
    b92 = new JButton("slot 2");
    b93 = new JButton("slot 3");
    b94 = new JButton("slot 4");
    b95 = new JButton("slot 5");
    b96 = new JButton("slot 6");
    b97 = new JButton("slot 7");
    b98 = new JButton("slot 8");
    b99 = new JButton("slot 9");
    b910 = new JButton("slot 10");
    b911 = new JButton("slot 11");
    b912 = new JButton("slot 12");
    b913 = new JButton("slot 13");
    b914 = new JButton("slot 14");
    b915 = new JButton("slot 15");
    b916 = new JButton("slot 16");
    ab9 = new BasicArrowButton(BasicArrowButton.WEST);
    j91 = new JLabel("Book your slot!!");
    j91.setFont(new Font("ARIAL", Font.PLAIN, 30));
    jn9 = new JLabel();
    s3 = new JLabel("Chennai Parking Facility");
    s3.setFont(new Font("ARIAL", Font.PLAIN, 30));

    b91.setBounds(50, 100, 80, 50);
    b92.setBounds(200, 100, 80, 50);
    b93.setBounds(50, 250, 80, 50);
    b94.setBounds(200, 250, 80, 50);
    b95.setBounds(50, 400, 80, 50);
    b96.setBounds(200, 400, 80, 50);
    b97.setBounds(50, 550, 80, 50);
    b98.setBounds(200, 550, 80, 50);
    b99.setBounds(500, 100, 80, 50);
    b910.setBounds(650, 100, 80, 50);
    b911.setBounds(500, 250, 80, 50);
    b912.setBounds(650, 250, 80, 50);
    b913.setBounds(500, 400, 80, 50);
    b914.setBounds(650, 400, 80, 50);
    b915.setBounds(500, 550, 80, 50);
    b916.setBounds(650, 550, 80, 50);
    ab9.setBounds(20, 50, 30, 30);
    s3.setBounds(250, 650, 400, 80);
    j91.setBounds(275, 25, 300, 30);
    jn9.setBounds(1, 1, 1, 1);

    b91.setBackground(Color.RED);
    b92.setBackground(Color.GREEN);
    b93.setBackground(Color.GREEN);
    b94.setBackground(Color.GREEN);
    b95.setBackground(Color.RED);
    b96.setBackground(Color.GREEN);
    b97.setBackground(Color.RED);
    b98.setBackground(Color.GREEN);
    b99.setBackground(Color.GREEN);
    b910.setBackground(Color.RED);
    b911.setBackground(Color.GREEN);
    b912.setBackground(Color.RED);
    b913.setBackground(Color.RED);
    b914.setBackground(Color.GREEN);
    b915.setBackground(Color.GREEN);
    b916.setBackground(Color.RED);

    f9.add(b91);
    f9.add(b92);
    f9.add(b93);
    f9.add(b94);
    f9.add(b95);
    f9.add(b96);
    f9.add(b97);
    f9.add(b98);
    f9.add(b99);
    f9.add(b910);
    f9.add(b911);
    f9.add(b912);
    f9.add(b913);
    f9.add(b914);
    f9.add(b915);
    f9.add(b916);
    f9.add(ab9);
    f9.add(s3);
    f9.add(j91);
    f9.add(jn9);

    i9 = new JLabel();
    i9.setIcon(new ImageIcon("fz.png"));
    i9.setBounds(200, 200, size.width, size.height);
    n.add(i9);

    b91.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf21.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f9.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b91) {
            data70 = "Slot 1";
          }
        }
      }
    });

    b92.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf22.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f9.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b92) {
            data70 = "Slot 2";
          }
        }
      }
    });

    b93.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf23.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f9.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b93) {
            data70 = "Slot 3";
          }
        }
      }
    });

    b94.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf24.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f9.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b94) {
            data70 = "Slot 4";
          }
        }
      }
    });

    b95.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf25.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f9.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b95) {
            data70 = "Slot 5";
          }
        }
      }
    });

    b96.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf26.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f9.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b96) {
            data70 = "Slot 6";
          }
        }
      }
    });

    b97.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf27.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f9.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b97) {
            data70 = "Slot 7";
          }
        }
      }
    });

    b98.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf28.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f9.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b98) {
            data70 = "Slot 8";
          }
        }
      }
    });

    b99.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf29.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f9.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b99) {
            data70 = "Slot 9";
          }
        }
      }
    });

    b910.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf210.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f9.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b910) {
            data70 = "Slot 10";
          }
        }
      }
    });

    b911.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf211.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f9.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b911) {
            data70 = "Slot 11";
          }
        }
      }
    });

    b912.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf212.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f9.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b912) {
            data70 = "Slot 12";
          }
        }
      }
    });

    b913.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf213.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f9.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b913) {
            data70 = "Slot 13";
          }
        }
      }
    });

    b914.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf214.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f9.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b914) {
            data70 = "Slot 14";
          }
        }
      }
    });

    b915.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf215.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f9.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b915) {
            data70 = "Slot 15";
          }
        }
      }
    });

    b916.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf216.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f9.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b916) {
            data70 = "Slot 16";
          }
        }
      }
    });

    ab9.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent b) {
        f9.setVisible(false);
        f4.setVisible(true);
      }
    });

    // ::::::::::::::::::::::Map4::::::::::::::::::::::::::

    f10.setSize(800, 800);

    b101 = new JButton("slot 1");
    b102 = new JButton("slot 2");
    b103 = new JButton("slot 3");
    b104 = new JButton("slot 4");
    b105 = new JButton("slot 5");
    b106 = new JButton("slot 6");
    b107 = new JButton("slot 7");
    b108 = new JButton("slot 8");
    b109 = new JButton("slot 9");
    b1010 = new JButton("slot 10");
    b1011 = new JButton("slot 11");
    b1012 = new JButton("slot 12");
    b1013 = new JButton("slot 13");
    j101 = new JLabel("Book your Slot!");
    j101.setFont(new Font("ARIAL", Font.PLAIN, 30));
    jn10 = new JLabel();
    s4 = new JLabel("Delhi Parking Facility");
    s4.setFont(new Font("ARIAL", Font.PLAIN, 30));
    ab10 = new BasicArrowButton(BasicArrowButton.WEST);

    b101.setBounds(50, 150, 80, 50);
    b102.setBounds(350, 150, 80, 50);
    b103.setBounds(650, 150, 80, 50);
    b104.setBounds(200, 250, 80, 50);
    b105.setBounds(500, 250, 80, 50);
    b106.setBounds(50, 350, 80, 50);
    b107.setBounds(350, 350, 80, 50);
    b108.setBounds(650, 350, 80, 50);
    b109.setBounds(200, 450, 80, 50);
    b1010.setBounds(500, 450, 80, 50);
    b1011.setBounds(50, 550, 80, 50);
    b1012.setBounds(350, 550, 80, 50);
    b1013.setBounds(650, 550, 80, 50);
    ab10.setBounds(20, 50, 30, 30);
    s4.setBounds(250, 650, 400, 80);
    j101.setBounds(275, 25, 300, 30);
    jn10.setBounds(1, 1, 1, 1);

    b101.setBackground(Color.RED);
    b102.setBackground(Color.GREEN);
    b103.setBackground(Color.GREEN);
    b104.setBackground(Color.GREEN);
    b105.setBackground(Color.RED);
    b106.setBackground(Color.GREEN);
    b107.setBackground(Color.RED);
    b108.setBackground(Color.GREEN);
    b109.setBackground(Color.GREEN);
    b1010.setBackground(Color.RED);
    b1011.setBackground(Color.GREEN);
    b1012.setBackground(Color.RED);
    b1013.setBackground(Color.RED);

    f10.add(b101);
    f10.add(b102);
    f10.add(b103);
    f10.add(b104);
    f10.add(b105);
    f10.add(b106);
    f10.add(b107);
    f10.add(b108);
    f10.add(b109);
    f10.add(b1010);
    f10.add(b1011);
    f10.add(b1012);
    f10.add(b1013);
    f10.add(ab10);
    f10.add(s4);
    f10.add(j101);
    f10.add(jn10);

    i10 = new JLabel();
    i10.setIcon(new ImageIcon("fz.png"));
    i10.setBounds(200, 200, size.width, size.height);
    o.add(i10);

    b101.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf31.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f10.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b101) {
            data70 = "Slot 1";
          }
        }
      }
    });

    b102.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf32.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f10.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b102) {
            data70 = "Slot 2";
          }
        }
      }
    });

    b103.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf33.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f10.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b103) {
            data70 = "Slot 3";
          }
        }
      }
    });

    b104.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf34.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f10.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b104) {
            data70 = "Slot 4";
          }
        }
      }
    });

    b105.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf35.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f10.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b105) {
            data70 = "Slot 5";
          }
        }
      }
    });

    b106.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf36.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f10.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b106) {
            data70 = "Slot 6";
          }
        }
      }
    });

    b107.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf37.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f10.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b107) {
            data70 = "Slot 7";
          }
        }
      }
    });

    b108.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf38.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f10.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b108) {
            data70 = "Slot 8";
          }
        }
      }
    });

    b109.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf39.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f10.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b109) {
            data70 = "Slot 9";
          }
        }
      }
    });

    b1010.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf310.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f10.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b1010) {
            data70 = "Slot 10";
          }
        }
      }
    });

    b1011.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf311.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f10.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b1011) {
            data70 = "Slot 11";
          }
        }
      }
    });

    b1012.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf312.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f10.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b1012) {
            data70 = "Slot 12";
          }
        }
      }
    });

    b1013.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf313.getBackground();
        if (co == COLOR2) {
          JOptionPane optionPane = new JOptionPane("Slot Already Booked",
              JOptionPane.WARNING_MESSAGE);
          JDialog dialog = optionPane.createDialog("Warning!");
          dialog.setBounds(250, 300, 300, 130);
          optionPane.setBackground(Color.YELLOW);
          dialog.setAlwaysOnTop(true);
          dialog.setVisible(true);
        } else if (co == COLOR1) {
          f10.setVisible(false);
          f6.setVisible(true);
          if (ae.getSource() == b1013) {
            data70 = "Slot 13";
          }
        }
      }
    });

    ab10.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent b) {
        f10.setVisible(false);
        f4.setVisible(true);
      }
    });

    // :::::::::::::::::::Change Driver:::::::::::::::::::

    f6.setTitle("Change Driver");
    f6.setSize(800, 800);

    Image icon6 = Toolkit.getDefaultToolkit().getImage("pr.jpg");
    f4.setIconImage(icon6);

    j61 = new JLabel("Name");
    j62 = new JLabel("Contact no.");
    j63 = new JLabel("email id");
    j64 = new JLabel("license id of driver");
    j66 = new JLabel("Details");
    j66.setFont(new Font("ARIAL", Font.PLAIN, 30));
    j67 = new JLabel("Click for payment of  your booking now");

    t61 = new JTextField();
    t62 = new JTextField();
    t63 = new JTextField();
    t64 = new JTextField();

    b61 = new JButton("Proceed to Pay");
    ab6 = new BasicArrowButton(BasicArrowButton.WEST);

    r61 = new JCheckBox("Same registered user?");
    r62 = new JCheckBox("New driver");

    jn61 = new JLabel("");

    j61.setBounds(150, 200, 120, 30);
    j62.setBounds(150, 250, 120, 30);
    j63.setBounds(150, 300, 120, 30);
    j64.setBounds(150, 350, 120, 30);
    j66.setBounds(225, 25, 200, 30);
    j67.setBounds(175, 200, 400, 30);

    t61.setBounds(300, 200, 120, 30);
    t62.setBounds(300, 250, 120, 30);
    t63.setBounds(300, 300, 120, 30);
    t64.setBounds(300, 350, 120, 30);

    b61.setBounds(225, 400, 150, 30);
    ab6.setBounds(20, 50, 30, 30);

    r61.setBounds(200, 75, 200, 30);
    r62.setBounds(200, 120, 200, 30);

    jn61.setBounds(1, 1, 1, 1);

    f6.add(j61);
    f6.add(j62);
    f6.add(j63);
    f6.add(j64);
    f6.add(j66);
    f6.add(j67);
    f6.add(t61);
    f6.add(t62);
    f6.add(t63);
    f6.add(t64);
    f6.add(b61);
    f6.add(ab6);
    f6.add(r61);
    f6.add(r62);
    f6.add(jn61);

    j61.setVisible(false);
    j62.setVisible(false);
    j63.setVisible(false);
    j64.setVisible(false);
    j67.setVisible(false);
    t61.setVisible(false);
    t62.setVisible(false);
    t63.setVisible(false);
    t64.setVisible(false);

    r61.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (r61.isSelected()) {
          j67.setVisible(true);
          r62.setEnabled(false);
          b61.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
              f6.setVisible(false);
              r61.setSelected(false);
              r61.setEnabled(true);
              r62.setSelected(false);
              r62.setEnabled(true);
              t61.setText("");
              t62.setText("");
              t63.setText("");
              j61.setVisible(false);
              j62.setVisible(false);
              j63.setVisible(false);
              j64.setVisible(false);
              j67.setVisible(false);
              t61.setVisible(false);
              t62.setVisible(false);
              t63.setVisible(false);
              t64.setVisible(false);
              f2.setVisible(true);
            }
          });

        } else {
          j67.setVisible(false);
          r62.setEnabled(true);
        }

      }
    });

    r62.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent a) {
        if (r62.isSelected()) {
          j61.setVisible(true);
          j62.setVisible(true);
          j63.setVisible(true);
          j64.setVisible(true);
          t61.setVisible(true);
          t62.setVisible(true);
          t63.setVisible(true);
          t64.setVisible(true);
          j67.setVisible(false);
          r61.setEnabled(false);
          b61.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
              if (t61.getText().isEmpty() && t62.getText().isEmpty() && t63.getText().isEmpty()
                  && t64.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "The above field cannot be empty");
              } else {
                f6.setVisible(false);
                f2.setVisible(true);
                r61.setSelected(false);
                r61.setEnabled(true);
                r62.setSelected(false);
                t61.setText("");
                t62.setText("");
                t63.setText("");
                j61.setVisible(false);
                j62.setVisible(false);
                j63.setVisible(false);
                j64.setVisible(false);
                j67.setVisible(false);
                t61.setVisible(false);
                t62.setVisible(false);
                t63.setVisible(false);
                t64.setVisible(false);
                r62.setEnabled(true);
              }
            }
          });

        } else {
          j61.setVisible(false);
          j62.setVisible(false);
          j63.setVisible(false);
          j64.setVisible(false);
          t61.setVisible(false);
          t62.setVisible(false);
          t63.setVisible(false);
          t64.setVisible(false);
          r61.setEnabled(true);
        }

      }
    });
    ab6.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        f6.setVisible(false);
        r61.setSelected(false);
        r61.setEnabled(true);
        r62.setSelected(false);
        r62.setEnabled(true);
        j61.setVisible(false);
        j62.setVisible(false);
        j63.setVisible(false);
        j64.setVisible(false);
        j67.setVisible(false);
        t61.setVisible(false);
        t62.setVisible(false);
        t63.setVisible(false);
        t64.setVisible(false);
        f4.setVisible(true);
      }
    });
    i6 = new JLabel();
    i6.setIcon(new ImageIcon("nice.png"));
    i6.setBounds(200, 200, size.width, size.height);
    j.add(i6);

    // ::::::::::::::::::::::PAYMENT PAGE:::::::::::::::::::::::::

    cb = new JComboBox(s);

    f2.setTitle("Payment Details");
    f2.setSize(800, 800);

    Image icon7 = Toolkit.getDefaultToolkit().getImage("47.png");
    f2.setIconImage(icon7);

    cj = new JLabel("Select Mode of Payment");
    cj.setFont(new Font("ARIAL", Font.PLAIN, 20));

    i2 = new JLabel();

    bpay = new JButton("Confirm");
    ab2 = new BasicArrowButton(BasicArrowButton.WEST);

    jn21 = new JLabel();
    jn21.setBounds(10, 10, 30, 30);
    ab2.setBounds(20, 50, 30, 30);

    jn21.setVisible(false);

    // --------------------CREDIT CARD DETAILS---------------------------------

    j21 = new JLabel("Credit Card no.");
    j22 = new JLabel("Expiry Date(MM-YY)");
    j23 = new JLabel("CVV");
    j24 = new JLabel("Postal code");

    t21 = new JTextField();
    t22 = new JTextField();
    t23 = new JTextField();
    p4 = new JPasswordField();

    fnh1 = new JButton("Finish");
    jn22 = new JLabel("");

    cb.setBounds(325, 125, 100, 30);
    cj.setBounds(275, 75, 400, 30);
    j21.setBounds(200, 200, 175, 30);
    j22.setBounds(200, 250, 175, 30);
    j23.setBounds(200, 300, 175, 30);
    j24.setBounds(200, 350, 175, 30);
    bpay.setBounds(325, 400, 100, 50);
    jn22.setBounds(1, 1, 1, 1);

    t21.setBounds(400, 200, 100, 30);
    t22.setBounds(400, 250, 100, 30);
    t23.setBounds(400, 350, 100, 30);
    p4.setBounds(400, 300, 100, 30);

    // --------------------DEBIT CARD DETAILS---------------------------------

    j25 = new JLabel("Name as on card");
    j26 = new JLabel("Debit Card no.");
    j27 = new JLabel("Expiry Date(MM-YY)");
    j28 = new JLabel("CVV");

    t24 = new JTextField();
    t25 = new JTextField();
    t26 = new JTextField();
    p5 = new JPasswordField();

    fnh2 = new JButton("Finish");
    jn23 = new JLabel("");

    j25.setBounds(200, 200, 175, 30);
    j26.setBounds(200, 250, 175, 30);
    j27.setBounds(200, 300, 175, 30);
    j28.setBounds(200, 350, 175, 30);

    t24.setBounds(400, 200, 100, 30);
    t25.setBounds(400, 250, 100, 30);
    t26.setBounds(400, 300, 100, 30);
    p5.setBounds(400, 350, 100, 30);
    jn23.setBounds(1, 1, 1, 1);

    /*
     * d24 = t24.getText();
     * d25 = t25.getText();
     * d26 = t26.getText();
     * dp5 = p5.getPassword();
     */

    // --------------------NET BANKING---------------------------------

    j29 = new JLabel("Bank Name");
    j210 = new JLabel("Account Holders name");
    j211 = new JLabel("Account Number");
    j212 = new JLabel("IFSC Code");
    jpay2 = new JLabel("'Payment Gateway'");
    jpay2.setFont(new Font("Serif", Font.PLAIN, 30));
    jpay2.setForeground(Color.BLUE);
    jpay = new JLabel("Processing payment.........");
    jpay.setFont(new Font("ARIAL", Font.PLAIN, 30));
    jpay1 = new JLabel("Payment Complete");
    jpay1.setFont(new Font("ARIAL", Font.PLAIN, 30));

    t27 = new JTextField();
    t28 = new JTextField();
    t29 = new JTextField();
    t210 = new JTextField();

    fnh3 = new JButton("Finish");
    jn24 = new JLabel("");

    j29.setBounds(200, 200, 175, 30);
    j210.setBounds(200, 250, 175, 30);
    j211.setBounds(200, 300, 175, 30);
    j212.setBounds(200, 350, 175, 30);
    jpay2.setBounds(275, 100, 400, 40);
    jpay.setBounds(250, 200, 400, 100);
    jpay1.setBounds(250, 300, 300, 100);

    t27.setBounds(400, 200, 100, 30);
    t28.setBounds(400, 250, 100, 30);
    t29.setBounds(400, 300, 100, 30);
    t210.setBounds(400, 350, 100, 30);

    jn24.setBounds(1, 1, 1, 1);

    f2.add(cb);
    f2.add(cj);
    f2.add(ab2);

    f2.add(j21);
    f2.add(j22);
    f2.add(j23);
    f2.add(j24);
    f2.add(jpay);
    f2.add(jpay1);
    f2.add(jpay2);
    f2.add(t21);
    f2.add(t22);
    f2.add(t23);
    f2.add(p4);
    f2.add(fnh1);
    f2.add(bpay);
    f2.add(fnh2);
    f2.add(fnh3);
    f2.add(jn22);

    f2.add(j25);
    f2.add(j26);
    f2.add(j27);
    f2.add(j28);
    f2.add(t24);
    f2.add(t25);
    f2.add(t26);
    f2.add(p5);
    f2.add(jn23);
    f2.add(jn21);

    f2.add(j29);
    f2.add(j210);
    f2.add(j211);
    f2.add(j212);
    f2.add(t27);
    f2.add(t28);
    f2.add(t29);
    f2.add(t210);
    f2.add(jn24);

    j21.setVisible(false);
    j22.setVisible(false);
    j23.setVisible(false);
    j24.setVisible(false);
    j25.setVisible(false);
    j26.setVisible(false);
    j27.setVisible(false);
    j28.setVisible(false);
    j29.setVisible(false);
    j210.setVisible(false);
    j211.setVisible(false);
    j212.setVisible(false);
    jpay.setVisible(false);
    jpay1.setVisible(false);
    jpay2.setVisible(false);

    t21.setVisible(false);
    t22.setVisible(false);
    t23.setVisible(false);
    p4.setVisible(false);
    t24.setVisible(false);
    t25.setVisible(false);
    t26.setVisible(false);
    p5.setVisible(false);
    t27.setVisible(false);
    t28.setVisible(false);
    t29.setVisible(false);
    t210.setVisible(false);
    fnh1.setVisible(false);
    bpay.setVisible(false);
    fnh2.setVisible(false);
    fnh3.setVisible(false);

    i2.setIcon(new ImageIcon("fz.png"));
    i2.setBounds(200, 200, size.width, size.height);
    d.add(i2);

    fnh1.setBounds(300, 400, 100, 30);
    fnh2.setBounds(300, 400, 100, 30);
    fnh3.setBounds(300, 400, 100, 30);

    cb.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int z = cb.getSelectedIndex();
        do {
          switch (z) {
            case 0: {
              j21.setVisible(false);
              j22.setVisible(false);
              j23.setVisible(false);
              j24.setVisible(false);
              j25.setVisible(false);
              j26.setVisible(false);
              j27.setVisible(false);
              j28.setVisible(false);
              j29.setVisible(false);
              j210.setVisible(false);
              j211.setVisible(false);
              j212.setVisible(false);

              t21.setVisible(false);
              t22.setVisible(false);
              t23.setVisible(false);
              p4.setVisible(false);
              t24.setVisible(false);
              t25.setVisible(false);
              t26.setVisible(false);
              p5.setVisible(false);
              t27.setVisible(false);
              t28.setVisible(false);
              t29.setVisible(false);
              t210.setVisible(false);

              fnh1.setVisible(false);
              fnh2.setVisible(false);
              fnh3.setVisible(false);

              jpay.setVisible(false);
              jpay1.setVisible(false);
              jpay2.setVisible(false);
              bpay.setVisible(false);

              break;
            }
            case 1: {
              j25.setVisible(false);
              j26.setVisible(false);
              j27.setVisible(false);
              j28.setVisible(false);
              j29.setVisible(false);
              j210.setVisible(false);
              j211.setVisible(false);
              j212.setVisible(false);

              t24.setVisible(false);
              t25.setVisible(false);
              t26.setVisible(false);
              p5.setVisible(false);
              t27.setVisible(false);
              t28.setVisible(false);
              t29.setVisible(false);
              t210.setVisible(false);

              fnh2.setVisible(false);
              fnh3.setVisible(false);

              j21.setVisible(true);
              j22.setVisible(true);
              j23.setVisible(true);
              j24.setVisible(true);

              t21.setVisible(true);
              t22.setVisible(true);
              t23.setVisible(true);
              p4.setVisible(true);

              jpay.setVisible(false);
              jpay1.setVisible(false);
              jpay2.setVisible(false);
              bpay.setVisible(false);

              fnh1.setVisible(true);
              fnh1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                  if (t21.getText().isEmpty() || t22.getText().isEmpty() || t23.getText().isEmpty()
                      || p4.getPassword().length == 0) {
                    JOptionPane.showMessageDialog(null, "The above field cannot be empty");
                  } else {
                    j21.setVisible(false);
                    j22.setVisible(false);
                    j23.setVisible(false);
                    j24.setVisible(false);
                    j25.setVisible(false);
                    j26.setVisible(false);
                    j27.setVisible(false);
                    j28.setVisible(false);
                    j29.setVisible(false);
                    j210.setVisible(false);
                    j211.setVisible(false);
                    j212.setVisible(false);

                    fnh1.setVisible(false);
                    t21.setVisible(false);
                    t22.setVisible(false);
                    t23.setVisible(false);
                    p4.setVisible(false);
                    t24.setVisible(false);
                    t25.setVisible(false);
                    t26.setVisible(false);
                    p5.setVisible(false);
                    t27.setVisible(false);
                    t28.setVisible(false);
                    t29.setVisible(false);
                    t210.setVisible(false);

                    t21.setText("");
                    t22.setText("");
                    t23.setText("");
                    p4.setText("");

                    int delay = 3000;
                    jpay2.setVisible(true);
                    jpay.setVisible(true);

                    Timer timer = new Timer(delay, c -> {
                      jpay1.setVisible(true);
                    });
                    timer.setRepeats(false);// make sure the timer only runs once
                    timer.start();
                    bpay.setVisible(true);
                    cb.setVisible(false);
                    cj.setVisible(false);
                  }
                }
              });

              break;
            }
            case 2: {
              j21.setVisible(false);
              j22.setVisible(false);
              j23.setVisible(false);
              j24.setVisible(false);
              j29.setVisible(false);
              j210.setVisible(false);
              j211.setVisible(false);
              j212.setVisible(false);

              t21.setVisible(false);
              t22.setVisible(false);
              t23.setVisible(false);
              t24.setVisible(false);
              p4.setVisible(false);
              t27.setVisible(false);
              t28.setVisible(false);
              t29.setVisible(false);
              t210.setVisible(false);

              fnh1.setVisible(false);
              fnh3.setVisible(false);

              j25.setVisible(true);
              j26.setVisible(true);
              j27.setVisible(true);
              j28.setVisible(true);

              t24.setVisible(true);
              t25.setVisible(true);
              t26.setVisible(true);
              p5.setVisible(true);

              jpay.setVisible(false);
              jpay1.setVisible(false);
              jpay2.setVisible(false);
              bpay.setVisible(false);

              fnh2.setVisible(true);
              fnh2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent c) {
                  if (t24.getText().isEmpty() || t25.getText().isEmpty() || t26.getText().isEmpty()
                      || p5.getPassword().length == 0) {
                    JOptionPane.showMessageDialog(null, "The above field cannot be empty");
                  } else {
                    j21.setVisible(false);
                    j22.setVisible(false);
                    j23.setVisible(false);
                    j24.setVisible(false);
                    j25.setVisible(false);
                    j26.setVisible(false);
                    j27.setVisible(false);
                    j28.setVisible(false);
                    j29.setVisible(false);
                    j210.setVisible(false);
                    j211.setVisible(false);
                    j212.setVisible(false);

                    fnh2.setVisible(false);
                    t21.setVisible(false);
                    t22.setVisible(false);
                    t23.setVisible(false);
                    p4.setVisible(false);
                    t24.setVisible(false);
                    t25.setVisible(false);
                    t26.setVisible(false);
                    p5.setVisible(false);
                    t27.setVisible(false);
                    t28.setVisible(false);
                    t29.setVisible(false);
                    t210.setVisible(false);

                    t24.setText("");
                    t25.setText("");
                    t26.setText("");
                    p5.setText("");

                    int delay = 3000;
                    jpay2.setVisible(true);
                    jpay.setVisible(true);
                    Timer timerr = new Timer(delay, y -> {
                      jpay1.setVisible(true);
                    });
                    timerr.setRepeats(false);// make sure the timer only runs once
                    timerr.start();
                    bpay.setVisible(true);
                    cb.setVisible(false);
                    cj.setVisible(false);
                  }
                }
              });

              break;
            }
            case 3: {
              j21.setVisible(false);
              j22.setVisible(false);
              j23.setVisible(false);
              j24.setVisible(false);
              j25.setVisible(false);
              j26.setVisible(false);
              j27.setVisible(false);
              j28.setVisible(false);

              t21.setVisible(false);
              t22.setVisible(false);
              t23.setVisible(false);
              p4.setVisible(false);
              t24.setVisible(false);
              t25.setVisible(false);
              t26.setVisible(false);
              p5.setVisible(false);

              fnh1.setVisible(false);
              fnh2.setVisible(false);

              j29.setVisible(true);
              j210.setVisible(true);
              j211.setVisible(true);
              j212.setVisible(true);

              t27.setVisible(true);
              t28.setVisible(true);
              t29.setVisible(true);
              t210.setVisible(true);

              jpay.setVisible(false);
              jpay1.setVisible(false);
              jpay2.setVisible(false);
              bpay.setVisible(false);

              fnh3.setVisible(true);
              fnh3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent q) {
                  if (t27.getText().isEmpty() || t28.getText().isEmpty() || t29.getText().isEmpty()
                      || t210.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "The above field cannot be empty");
                  } else {
                    j21.setVisible(false);
                    j22.setVisible(false);
                    j23.setVisible(false);
                    j24.setVisible(false);
                    j25.setVisible(false);
                    j26.setVisible(false);
                    j27.setVisible(false);
                    j28.setVisible(false);
                    j29.setVisible(false);
                    j210.setVisible(false);
                    j211.setVisible(false);
                    j212.setVisible(false);

                    fnh3.setVisible(false);
                    t21.setVisible(false);
                    t22.setVisible(false);
                    t23.setVisible(false);
                    p4.setVisible(false);
                    t24.setVisible(false);
                    t25.setVisible(false);
                    t26.setVisible(false);
                    p5.setVisible(false);
                    t27.setVisible(false);
                    t28.setVisible(false);
                    t29.setVisible(false);
                    t210.setVisible(false);

                    t27.setText("");
                    t28.setText("");
                    t29.setText("");
                    t210.setText("");

                    int delay = 3000;
                    jpay2.setVisible(true);
                    jpay.setVisible(true);
                    Timer timerrr = new Timer(delay, x -> {
                      jpay1.setVisible(true);
                    });
                    timerrr.setRepeats(false);// make sure the timer only runs once
                    timerrr.start();
                    bpay.setVisible(true);
                    cb.setVisible(false);
                    cj.setVisible(false);
                  }
                }
              });

              break;
            }
          }
        } while (z == 4);
      }
    });

    bpay.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        f2.setVisible(false);
        jpay.setVisible(false);
        jpay1.setVisible(false);
        jpay2.setVisible(false);
        bpay.setVisible(false);
        cb.setVisible(true);
        cj.setVisible(true);
        f7.setVisible(true);
      }
    });

    ab2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        f2.setVisible(false);
        jpay.setVisible(false);
        jpay1.setVisible(false);
        jpay2.setVisible(false);
        bpay.setVisible(false);
        f6.setVisible(true);
      }
    });
    // ::::::GG FRAME::::::::::

    fgg.setSize(800, 800);
    fgg.setTitle("Select a parking facility(ADMIN)");
    Image icong = Toolkit.getDefaultToolkit().getImage("pp.jpg");
    fgg.setIconImage(icong);

    jg1 = new JLabel("Mumbai Parking Facility");
    jg1.setForeground(Color.white);
    jg2 = new JLabel("Kolkata Parking Facility");
    jg2.setForeground(Color.white);
    jg3 = new JLabel("Chennai Parking Facility");
    jg3.setForeground(Color.white);
    jg4 = new JLabel("Delhi Parking Facility");
    jg4.setForeground(Color.white);

    bg1 = new JButton(pf1);
    bg2 = new JButton(pf2);
    bg3 = new JButton(pf3);
    bg4 = new JButton(pf4);
    abg = new BasicArrowButton(BasicArrowButton.WEST);
    jng1 = new JLabel("");

    jg1.setBounds(150, 300, 200, 80);
    jg2.setBounds(500, 300, 200, 80);
    jg3.setBounds(150, 600, 200, 80);
    jg4.setBounds(500, 600, 200, 80);

    bg1.setBounds(75, 90, 300, 200);
    bg2.setBounds(425, 90, 300, 200);
    bg3.setBounds(75, 400, 300, 200);
    bg4.setBounds(425, 400, 300, 200);
    abg.setBounds(20, 50, 30, 30);
    jng1.setBounds(1, 1, 1, 1);

    fgg.add(jg1);
    fgg.add(jg2);
    fgg.add(jg3);
    fgg.add(jg4);
    fgg.add(bg1);
    fgg.add(bg2);
    fgg.add(bg3);
    fgg.add(bg4);
    fgg.add(abg);
    fgg.add(jng1);

    jng1.setVisible(false);

    bg1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        fgg.setVisible(false);
        fog.setVisible(true);

      }
    });
    bg2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent be) {
        fgg.setVisible(false);
        fog1.setVisible(true);

      }
    });
    bg3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ce) {
        fgg.setVisible(false);
        fog2.setVisible(true);
      }
    });
    bg4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent de) {
        fgg.setVisible(false);
        fog3.setVisible(true);
      }
    });

    abg.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        fgg.setVisible(false);
        f0.setVisible(true);
      }
    });

    ig = new JLabel();
    ig.setIcon(new ImageIcon("aj.jpg"));
    ig.setBounds(200, 200, size.width, size.height);
    p.add(ig);

    // :::::::::::::Mod Frame::::::::::::::

    fog.setSize(800, 800);
    fog.getContentPane().setBackground(Color.BLACK);

    JButton bflgt = new JButton("Logout");
    bf1 = new JButton("slot 1");
    bf2 = new JButton("slot 2");
    bf3 = new JButton("slot 3");
    bf4 = new JButton("slot 4");
    bf5 = new JButton("slot 5");
    bf6 = new JButton("slot 6");
    bf7 = new JButton("slot 7");
    bf8 = new JButton("slot 8");
    bf9 = new JButton("slot 9");
    bf10 = new JButton("slot 10");
    bf11 = new JButton("slot 11");
    bf12 = new JButton("slot 12");
    jf1 = new JLabel("Book your slot!!");
    jf1.setFont(new Font("ARIAL", Font.PLAIN, 30));
	jf1.setForeground(Color.WHITE);
    jfa = new JLabel("--:Admin Access:--");
    jfa.setFont(new Font("ARIAL", Font.PLAIN, 20));
    jfa.setForeground(Color.CYAN);
    sf1 = new JLabel("Mumbai Parking Facility");
    sf1.setFont(new Font("ARIAL", Font.PLAIN, 30));
	sf1.setForeground(Color.WHITE);

    abf = new BasicArrowButton(BasicArrowButton.WEST);
    jnf1 = new JLabel("");

    bflgt.setBounds(60, 50, 100, 30);
    bf1.setBounds(50, 100, 80, 50);
    bf2.setBounds(350, 100, 80, 50);
    bf3.setBounds(650, 100, 80, 50);
    bf4.setBounds(50, 250, 80, 50);
    bf5.setBounds(350, 250, 80, 50);
    bf6.setBounds(650, 250, 80, 50);
    bf7.setBounds(50, 400, 80, 50);
    bf8.setBounds(350, 400, 80, 50);
    bf9.setBounds(650, 400, 80, 50);
    bf10.setBounds(50, 550, 80, 50);
    bf11.setBounds(350, 550, 80, 50);
    bf12.setBounds(650, 550, 80, 50);
    abf.setBounds(20, 50, 80, 30);
    sf1.setBounds(225, 625, 400, 80);
    jf1.setBounds(275, 700, 300, 30);
    jfa.setBounds(315, 25, 200, 60);
    abf.setBounds(20, 50, 30, 30);
    jnf1.setBounds(1, 1, 1, 1);

    if (b51s.equals(redb)) {
      bf1.setBackground(Color.red);
    } else if (b51s.equals(greenb)) {
      bf1.setBackground(Color.GREEN);
    }
    if (b52s.equals(redb)) {
      bf3.setBackground(Color.red);
    } else if (b52s.equals(greenb)) {
      bf2.setBackground(Color.GREEN);
    }
    if (b53s.equals(redb)) {
      bf3.setBackground(Color.red);
    } else if (b53s.equals(greenb)) {
      bf3.setBackground(Color.GREEN);
    }
    if (b54s.equals(redb)) {
      bf4.setBackground(Color.red);
    } else if (b54s.equals(greenb)) {
      bf4.setBackground(Color.GREEN);
    }
    if (b55s.equals(redb)) {
      bf5.setBackground(Color.red);
    } else if (b55s.equals(greenb)) {
      bf5.setBackground(Color.GREEN);
    }
    if (b56s.equals(redb)) {
      bf6.setBackground(Color.red);
    } else if (b56s.equals(greenb)) {
      bf6.setBackground(Color.GREEN);
    }
    if (b57s.equals(redb)) {
      bf7.setBackground(Color.red);
    } else if (b57s.equals(greenb)) {
      bf7.setBackground(Color.GREEN);
    }
    if (b58s.equals(redb)) {
      bf8.setBackground(Color.red);
    } else if (b58s.equals(greenb)) {
      bf8.setBackground(Color.GREEN);
    }
    if (b59s.equals(redb)) {
      bf9.setBackground(Color.red);
    } else if (b59s.equals(greenb)) {
      bf9.setBackground(Color.GREEN);
    }
    if (b510s.equals(redb)) {
      bf10.setBackground(Color.red);
    } else if (b510s.equals(greenb)) {
      bf10.setBackground(Color.GREEN);
    }
    if (b511s.equals(redb)) {
      bf11.setBackground(Color.red);
    } else if (b511s.equals(greenb)) {
      bf11.setBackground(Color.GREEN);
    }
    if (b512s.equals(redb)) {
      bf12.setBackground(Color.red);
    } else if (b512s.equals(greenb)) {
      bf12.setBackground(Color.GREEN);
    }

    fog.add(bf1);
    fog.add(bf2);
    fog.add(bf3);
    fog.add(bf4);
    fog.add(bf5);
    fog.add(bf6);
    fog.add(bf7);
    fog.add(bf8);
    fog.add(bf9);
    fog.add(bf10);
    fog.add(bf11);
    fog.add(bf12);
    fog.add(bflgt);
    fog.add(abf);
    fog.add(jfa);
    fog.add(jf1);
    fog.add(sf1);
    fog.add(jnf1);

    jnf1.setVisible(false);

    abf.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        fog.setVisible(false);
        fgg.setVisible(true);
      }
    });

    bflgt.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent a) {
        fog.setVisible(false);
        f0.setVisible(true);
      }
    });

    bf1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ee) {
        Color co = bf1.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf1.setBackground(co);
        b51.setBackground(co);

      }
    });
    bf2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent fe) {
        Color co = bf2.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf2.setBackground(co);
        b52.setBackground(co);
      }
    });
    bf3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ge) {
        Color co = bf3.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf3.setBackground(co);
        b53.setBackground(co);
      }
    });
    bf4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent he) {
        Color co = bf4.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf4.setBackground(co);
        b54.setBackground(co);
      }
    });
    bf5.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ie) {
        Color co = bf5.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf5.setBackground(co);
        b55.setBackground(co);
      }
    });
    bf6.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent je) {
        Color co = bf6.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf6.setBackground(co);
        b56.setBackground(co);
      }
    });
    bf7.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ke) {
        Color co = bf7.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf7.setBackground(co);
        b57.setBackground(co);
      }
    });
    bf8.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent le) {
        Color co = bf8.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf8.setBackground(co);
        b58.setBackground(co);
      }
    });
    bf9.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent me) {
        Color co = bf9.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf9.setBackground(co);
        b59.setBackground(co);
      }
    });
    bf10.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ne) {
        Color co = bf10.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf10.setBackground(co);
        b510.setBackground(co);
      }
    });
    bf11.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent oe) {
        Color co = bf11.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf11.setBackground(co);
        b511.setBackground(co);
      }
    });
    bf12.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent pe) {
        Color co = bf12.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf12.setBackground(co);
        b512.setBackground(co);
      }
    });

    // :::::::::::::::::::Map2 ADMIN::::::::::::::::::::::
    fog1.setSize(800, 800);
    fog1.getContentPane().setBackground(Color.BLACK);

    JButton bfo1lgt = new JButton("Logout");
    bfo11 = new JButton("slot 1");
    bfo12 = new JButton("slot 2");
    bfo13 = new JButton("slot 3");
    bfo14 = new JButton("slot 4");
    bfo15 = new JButton("slot 5");
    bfo16 = new JButton("slot 6");
    bfo17 = new JButton("slot 7");
    bfo18 = new JButton("slot 8");
    bfo19 = new JButton("slot 9");
    bfo110 = new JButton("slot 10");
    bfo111 = new JButton("slot 11");
    bfo112 = new JButton("slot 12");
    bfo113 = new JButton("slot 13");
    bfo114 = new JButton("slot 14");
    bfo115 = new JButton("slot 15");
    bfo116 = new JButton("slot 16");
    bfo117 = new JButton("slot 17");
    bfo118 = new JButton("slot 18");
    abf1 = new BasicArrowButton(BasicArrowButton.WEST);

    jf11 = new JLabel("Book your slot!!");
    jf11.setFont(new Font("ARIAL", Font.PLAIN, 30));
	jf11.setForeground(Color.WHITE);
    jf1a = new JLabel("--:Admin Access:--");
    jf1a.setFont(new Font("ARIAL", Font.PLAIN, 20));
    jf1a.setForeground(Color.CYAN);
    sf11 = new JLabel("Kolkata Parking Facility");
    sf11.setFont(new Font("ARIAL", Font.PLAIN, 30));
	sf11.setForeground(Color.WHITE);
    jnf11 = new JLabel("");

    bfo11.setBounds(50, 100, 80, 50);
    bfo12.setBounds(150, 100, 80, 50);
    bfo13.setBounds(250, 100, 80, 50);
    bfo14.setBounds(450, 200, 80, 50);
    bfo15.setBounds(550, 200, 80, 50);
    bfo16.setBounds(650, 200, 80, 50);
    bfo17.setBounds(50, 300, 80, 50);
    bfo18.setBounds(150, 300, 80, 50);
    bfo19.setBounds(250, 300, 80, 50);
    bfo110.setBounds(450, 400, 80, 50);
    bfo111.setBounds(550, 400, 80, 50);
    bfo112.setBounds(650, 400, 80, 50);
    bfo113.setBounds(50, 500, 80, 50);
    bfo114.setBounds(150, 500, 80, 50);
    bfo115.setBounds(250, 500, 80, 50);
    bfo116.setBounds(450, 600, 80, 50);
    bfo117.setBounds(550, 600, 80, 50);
    bfo118.setBounds(650, 600, 80, 50);
    bfo1lgt.setBounds(60, 50, 100, 30);
    abf1.setBounds(20, 50, 30, 30);
    jf1a.setBounds(315, 25, 200, 60);
    sf11.setBounds(250, 650, 400, 80);
    jf11.setBounds(275, 725, 300, 30);
    jnf11.setBounds(1, 1, 1, 1);

    if (b81s.equals(redb)) {
      bfo11.setBackground(Color.red);
    } else if (b81s.equals(greenb)) {
      bfo11.setBackground(Color.GREEN);
    }
    if (b82s.equals(redb)) {
      bfo13.setBackground(Color.red);
    } else if (b82s.equals(greenb)) {
      bfo12.setBackground(Color.GREEN);
    }
    if (b83s.equals(redb)) {
      bfo13.setBackground(Color.red);
    } else if (b83s.equals(greenb)) {
      bfo13.setBackground(Color.GREEN);
    }
    if (b84s.equals(redb)) {
      bfo14.setBackground(Color.red);
    } else if (b84s.equals(greenb)) {
      bfo14.setBackground(Color.GREEN);
    }
    if (b85s.equals(redb)) {
      bfo15.setBackground(Color.red);
    } else if (b85s.equals(greenb)) {
      bfo15.setBackground(Color.GREEN);
    }
    if (b86s.equals(redb)) {
      bfo16.setBackground(Color.red);
    } else if (b86s.equals(greenb)) {
      bfo16.setBackground(Color.GREEN);
    }
    if (b87s.equals(redb)) {
      bfo17.setBackground(Color.red);
    } else if (b87s.equals(greenb)) {
      bfo17.setBackground(Color.GREEN);
    }
    if (b88s.equals(redb)) {
      bfo18.setBackground(Color.red);
    } else if (b88s.equals(greenb)) {
      bfo18.setBackground(Color.GREEN);
    }
    if (b89s.equals(redb)) {
      bfo19.setBackground(Color.red);
    } else if (b89s.equals(greenb)) {
      bfo19.setBackground(Color.GREEN);
    }
    if (b810s.equals(redb)) {
      bfo110.setBackground(Color.red);
    } else if (b810s.equals(greenb)) {
      bfo110.setBackground(Color.GREEN);
    }
    if (b811s.equals(redb)) {
      bfo111.setBackground(Color.red);
    } else if (b811s.equals(greenb)) {
      bfo111.setBackground(Color.GREEN);
    }
    if (b812s.equals(redb)) {
      bfo112.setBackground(Color.red);
    } else if (b812s.equals(greenb)) {
      bfo112.setBackground(Color.GREEN);
    }
    if (b813s.equals(redb)) {
      bfo113.setBackground(Color.red);
    } else if (b813s.equals(greenb)) {
      bfo113.setBackground(Color.GREEN);
    }
    if (b814s.equals(redb)) {
      bfo114.setBackground(Color.red);
    } else if (b814s.equals(greenb)) {
      bfo114.setBackground(Color.GREEN);
    }
    if (b815s.equals(redb)) {
      bfo115.setBackground(Color.red);
    } else if (b815s.equals(greenb)) {
      bfo115.setBackground(Color.GREEN);
    }
    if (b816s.equals(redb)) {
      bfo116.setBackground(Color.red);
    } else if (b816s.equals(greenb)) {
      bfo116.setBackground(Color.GREEN);
    }
    if (b817s.equals(redb)) {
      bfo117.setBackground(Color.red);
    } else if (b817s.equals(greenb)) {
      bfo117.setBackground(Color.GREEN);
    }
    if (b818s.equals(redb)) {
      bfo118.setBackground(Color.red);
    } else if (b818s.equals(greenb)) {
      bfo118.setBackground(Color.GREEN);
    }

    fog1.add(bfo11);
    fog1.add(bfo12);
    fog1.add(bfo13);
    fog1.add(bfo14);
    fog1.add(bfo15);
    fog1.add(bfo16);
    fog1.add(bfo17);
    fog1.add(bfo18);
    fog1.add(bfo19);
    fog1.add(bfo110);
    fog1.add(bfo111);
    fog1.add(bfo112);
    fog1.add(bfo113);
    fog1.add(bfo114);
    fog1.add(bfo115);
    fog1.add(bfo116);
    fog1.add(bfo117);
    fog1.add(bfo118);
    fog1.add(bfo1lgt);
    fog1.add(abf1);
    fog1.add(sf11);
    fog1.add(jf11);
    fog1.add(jf1a);
    fog1.add(jnf11);

    jnf11.setVisible(false);

    // if1 = new JLabel();
    // if1.setIcon(new ImageIcon("fz.png"));
    // if1.setBounds(200, 200, size.width, size.height);
    // m.add(if1);

    bfo1lgt.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent a) {
        fog1.setVisible(false);
        f0.setVisible(true);
      }
    });

    abf1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent b) {
        fog1.setVisible(false);
        fgg.setVisible(true);
      }
    });

    bfo11.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo11.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bfo11.setBackground(co);
        b81.setBackground(co);
      }
    });

    bfo12.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo12.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bfo12.setBackground(co);
        b82.setBackground(co);
      }
    });

    bfo13.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo13.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bfo13.setBackground(co);
        b83.setBackground(co);
      }
    });

    bfo14.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo14.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bfo14.setBackground(co);
        b84.setBackground(co);
      }
    });

    bfo15.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo15.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bfo15.setBackground(co);
        b85.setBackground(co);
      }
    });

    bfo16.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo16.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bfo16.setBackground(co);
        b86.setBackground(co);
      }
    });

    bfo17.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo17.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bfo17.setBackground(co);
        b87.setBackground(co);
      }
    });

    bfo18.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo18.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bfo18.setBackground(co);
        b88.setBackground(co);
      }
    });

    bfo19.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo19.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bfo19.setBackground(co);
        b89.setBackground(co);
      }
    });

    bfo110.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo110.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bfo110.setBackground(co);
        b810.setBackground(co);
      }
    });

    bfo111.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo111.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bfo111.setBackground(co);
        b811.setBackground(co);
      }
    });

    bfo112.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo112.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bfo112.setBackground(co);
        b812.setBackground(co);
      }
    });

    bfo113.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo113.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bfo113.setBackground(co);
        b813.setBackground(co);
      }
    });
    bfo114.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo114.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bfo114.setBackground(co);
        b814.setBackground(co);
      }
    });
    bfo115.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo115.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bfo115.setBackground(co);
        b815.setBackground(co);
      }
    });
    bfo116.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo116.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bfo116.setBackground(co);
        b816.setBackground(co);
      }
    });
    bfo117.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo117.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bfo117.setBackground(co);
        b817.setBackground(co);
      }
    });
    bfo118.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bfo118.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bfo118.setBackground(co);
        b818.setBackground(co);
      }
    });

    // ::::::::::::::::::Map3 Admin:::::::::::::::::::::::::

    fog2.setSize(800, 800);
    fog2.getContentPane().setBackground(Color.BLACK);

    bf21 = new JButton("slot 1");
    bf22 = new JButton("slot 2");
    bf23 = new JButton("slot 3");
    bf24 = new JButton("slot 4");
    bf25 = new JButton("slot 5");
    bf26 = new JButton("slot 6");
    bf27 = new JButton("slot 7");
    bf28 = new JButton("slot 8");
    bf29 = new JButton("slot 9");
    bf210 = new JButton("slot 10");
    bf211 = new JButton("slot 11");
    bf212 = new JButton("slot 12");
    bf213 = new JButton("slot 13");
    bf214 = new JButton("slot 14");
    bf215 = new JButton("slot 15");
    bf216 = new JButton("slot 16");
    bf2lgt = new JButton("Logout");
    abf2 = new BasicArrowButton(BasicArrowButton.WEST);
    jf21 = new JLabel("Book your slot!!");
    jf21.setFont(new Font("ARIAL", Font.PLAIN, 30));
	jf21.setForeground(Color.WHITE);
    jf2a = new JLabel("--:Admin Access:--");
    jf2a.setFont(new Font("ARIAL", Font.PLAIN, 20));
    jf2a.setForeground(Color.CYAN);
    sf21 = new JLabel("Chennai Parking Facility");
    sf21.setFont(new Font("ARIAL", Font.PLAIN, 30));
	sf21.setForeground(Color.WHITE);
    jnf21 = new JLabel("");

    String b91s = b91.getBackground().toString(), b92s = b92.getBackground().toString(),
        b93s = b93.getBackground().toString(),
        b94s = b94.getBackground().toString(), b95s = b95.getBackground().toString(),
        b96s = b96.getBackground().toString(),
        b97s = b97.getBackground().toString(), b98s = b98.getBackground().toString(),
        b99s = b99.getBackground().toString(),
        b910s = b910.getBackground().toString(), b911s = b911.getBackground().toString(),
        b912s = b912.getBackground().toString(), b913s = b913.getBackground().toString(),
        b914s = b914.getBackground().toString(), b915s = b915.getBackground().toString(),
        b916s = b916.getBackground().toString();

    if (b91s.equals(redb)) {
      bf21.setBackground(Color.red);
    } else if (b91s.equals(greenb)) {
      bf21.setBackground(Color.GREEN);
    }
    if (b92s.equals(redb)) {
      bf23.setBackground(Color.red);
    } else if (b92s.equals(greenb)) {
      bf22.setBackground(Color.GREEN);
    }
    if (b93s.equals(redb)) {
      bf23.setBackground(Color.red);
    } else if (b93s.equals(greenb)) {
      bf23.setBackground(Color.GREEN);
    }
    if (b94s.equals(redb)) {
      bf24.setBackground(Color.red);
    } else if (b94s.equals(greenb)) {
      bf24.setBackground(Color.GREEN);
    }
    if (b95s.equals(redb)) {
      bf25.setBackground(Color.red);
    } else if (b95s.equals(greenb)) {
      bf25.setBackground(Color.GREEN);
    }
    if (b96s.equals(redb)) {
      bf26.setBackground(Color.red);
    } else if (b96s.equals(greenb)) {
      bf26.setBackground(Color.GREEN);
    }
    if (b97s.equals(redb)) {
      bf27.setBackground(Color.red);
    } else if (b97s.equals(greenb)) {
      bf27.setBackground(Color.GREEN);
    }
    if (b98s.equals(redb)) {
      bf28.setBackground(Color.red);
    } else if (b98s.equals(greenb)) {
      bf28.setBackground(Color.GREEN);
    }
    if (b99s.equals(redb)) {
      bf29.setBackground(Color.red);
    } else if (b99s.equals(greenb)) {
      bf29.setBackground(Color.GREEN);
    }
    if (b910s.equals(redb)) {
      bf210.setBackground(Color.red);
    } else if (b910s.equals(greenb)) {
      bf210.setBackground(Color.GREEN);
    }
    if (b911s.equals(redb)) {
      bf211.setBackground(Color.red);
    } else if (b911s.equals(greenb)) {
      bf211.setBackground(Color.GREEN);
    }
    if (b912s.equals(redb)) {
      bf212.setBackground(Color.red);
    } else if (b912s.equals(greenb)) {
      bf212.setBackground(Color.GREEN);
    }
    if (b913s.equals(redb)) {
      bf213.setBackground(Color.red);
    } else if (b913s.equals(greenb)) {
      bf213.setBackground(Color.GREEN);
    }
    if (b914s.equals(redb)) {
      bf214.setBackground(Color.red);
    } else if (b914s.equals(greenb)) {
      bf214.setBackground(Color.GREEN);
    }
    if (b915s.equals(redb)) {
      bf215.setBackground(Color.red);
    } else if (b915s.equals(greenb)) {
      bf215.setBackground(Color.GREEN);
    }
    if (b916s.equals(redb)) {
      bf216.setBackground(Color.red);
    } else if (b916s.equals(greenb)) {
      bf216.setBackground(Color.GREEN);
    }

    bf21.setBounds(50, 100, 80, 50);
    bf22.setBounds(200, 100, 80, 50);
    bf23.setBounds(50, 250, 80, 50);
    bf24.setBounds(200, 250, 80, 50);
    bf25.setBounds(50, 400, 80, 50);
    bf26.setBounds(200, 400, 80, 50);
    bf27.setBounds(50, 550, 80, 50);
    bf28.setBounds(200, 550, 80, 50);
    bf29.setBounds(500, 100, 80, 50);
    bf210.setBounds(650, 100, 80, 50);
    bf211.setBounds(500, 250, 80, 50);
    bf212.setBounds(650, 250, 80, 50);
    bf213.setBounds(500, 400, 80, 50);
    bf214.setBounds(650, 400, 80, 50);
    bf215.setBounds(500, 550, 80, 50);
    bf216.setBounds(650, 550, 80, 50);
    bf2lgt.setBounds(60, 50, 100, 30);
    abf2.setBounds(20, 50, 30, 30);
    sf21.setBounds(250, 650, 400, 80);
    jf2a.setBounds(315, 25, 200, 60);
    jf21.setBounds(290, 725, 300, 30);
    jnf21.setBounds(1, 1, 1, 1);

    fog2.add(bf21);
    fog2.add(bf22);
    fog2.add(bf23);
    fog2.add(bf24);
    fog2.add(bf25);
    fog2.add(bf26);
    fog2.add(bf27);
    fog2.add(bf28);
    fog2.add(bf29);
    fog2.add(bf210);
    fog2.add(bf211);
    fog2.add(bf212);
    fog2.add(bf213);
    fog2.add(bf214);
    fog2.add(bf215);
    fog2.add(bf216);
    fog2.add(bf2lgt);
    fog2.add(abf2);
    fog2.add(sf21);
    fog2.add(jf2a);
    fog2.add(jf21);
    fog2.add(jnf21);

    jnf21.setVisible(false);

    // if2 = new JLabel();
    // if2.setIcon(new ImageIcon("fz.png"));
    // if2.setBounds(200, 200, size.width, size.height);
    // n.add(if2);

    abf2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent b) {
        fog2.setVisible(false);
        fgg.setVisible(true);
      }
    });

    bf2lgt.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent a) {
        fog2.setVisible(false);
        f0.setVisible(true);
      }
    });

    bf21.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf21.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf21.setBackground(co);
        b91.setBackground(co);
      }
    });

    bf22.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf22.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf22.setBackground(co);
        b92.setBackground(co);
      }
    });

    bf23.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf23.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf23.setBackground(co);
        b93.setBackground(co);
      }
    });

    bf24.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf24.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf24.setBackground(co);
        b94.setBackground(co);
      }
    });

    bf25.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf25.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf25.setBackground(co);
        b95.setBackground(co);
      }
    });

    bf26.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf26.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf26.setBackground(co);
        b96.setBackground(co);
      }
    });

    bf27.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf27.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf27.setBackground(co);
        b97.setBackground(co);
      }
    });

    bf28.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf28.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf28.setBackground(co);
        b98.setBackground(co);
      }
    });

    bf29.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf29.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf29.setBackground(co);
        b99.setBackground(co);
      }

    });

    bf210.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf210.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf210.setBackground(co);
        b910.setBackground(co);
      }
    });

    bf211.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf211.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf211.setBackground(co);
        b911.setBackground(co);
      }
    });

    bf212.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf212.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf212.setBackground(co);
        b912.setBackground(co);
      }
    });

    bf213.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf213.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf213.setBackground(co);
        b913.setBackground(co);
      }
    });

    bf214.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf214.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf214.setBackground(co);
        b914.setBackground(co);
      }
    });

    bf215.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf215.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf215.setBackground(co);
        b915.setBackground(co);
      }
    });

    bf216.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf216.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf216.setBackground(co);
        b916.setBackground(co);
      }
    });

    // ::::::::::::::::::Map4 ADMIN::::::::::::::::::::
    fog3.setSize(800, 800);
    fog3.getContentPane().setBackground(Color.BLACK);

    bf31 = new JButton("slot 1");
    bf32 = new JButton("slot 2");
    bf33 = new JButton("slot 3");
    bf34 = new JButton("slot 4");
    bf35 = new JButton("slot 5");
    bf36 = new JButton("slot 6");
    bf37 = new JButton("slot 7");
    bf38 = new JButton("slot 8");
    bf39 = new JButton("slot 9");
    bf310 = new JButton("slot 10");
    bf311 = new JButton("slot 11");
    bf312 = new JButton("slot 12");
    bf313 = new JButton("slot 13");
    bf3lgt = new JButton("Logout");
    abf3 = new BasicArrowButton(BasicArrowButton.WEST);
    jf31 = new JLabel("Book your Slot!");
    jf31.setFont(new Font("ARIAL", Font.PLAIN, 30));
	jf31.setForeground(Color.WHITE);
    jf3a = new JLabel("--:Admin Access:--");
    jf3a.setFont(new Font("ARIAL", Font.PLAIN, 20));
    jf3a.setForeground(Color.CYAN);
    sf31 = new JLabel("Delhi Parking Facility");
    sf31.setFont(new Font("ARIAL", Font.PLAIN, 30));
	sf1.setForeground(Color.WHITE);
    jnf31 = new JLabel();

    String b101s = b101.getBackground().toString(), b102s = b102.getBackground().toString(),
        b103s = b103.getBackground().toString(),
        b104s = b104.getBackground().toString(), b105s = b105.getBackground().toString(),
        b106s = b106.getBackground().toString(),
        b107s = b107.getBackground().toString(), b108s = b108.getBackground().toString(),
        b109s = b109.getBackground().toString(),
        b1010s = b1010.getBackground().toString(), b1011s = b1011.getBackground().toString(),
        b1012s = b1012.getBackground().toString(), b1013s = b1013.getBackground().toString();

    if (b101s.equals(redb)) {
      bf31.setBackground(Color.red);
    } else if (b101s.equals(greenb)) {
      bf31.setBackground(Color.GREEN);
    }
    if (b102s.equals(redb)) {
      bf33.setBackground(Color.red);
    } else if (b102s.equals(greenb)) {
      bf32.setBackground(Color.GREEN);
    }
    if (b103s.equals(redb)) {
      bf33.setBackground(Color.red);
    } else if (b103s.equals(greenb)) {
      bf33.setBackground(Color.GREEN);
    }
    if (b104s.equals(redb)) {
      bf34.setBackground(Color.red);
    } else if (b104s.equals(greenb)) {
      bf34.setBackground(Color.GREEN);
    }
    if (b105s.equals(redb)) {
      bf35.setBackground(Color.red);
    } else if (b105s.equals(greenb)) {
      bf35.setBackground(Color.GREEN);
    }
    if (b106s.equals(redb)) {
      bf36.setBackground(Color.red);
    } else if (b106s.equals(greenb)) {
      bf36.setBackground(Color.GREEN);
    }
    if (b107s.equals(redb)) {
      bf37.setBackground(Color.red);
    } else if (b107s.equals(greenb)) {
      bf37.setBackground(Color.GREEN);
    }
    if (b108s.equals(redb)) {
      bf38.setBackground(Color.red);
    } else if (b108s.equals(greenb)) {
      bf38.setBackground(Color.GREEN);
    }
    if (b109s.equals(redb)) {
      bf39.setBackground(Color.red);
    } else if (b109s.equals(greenb)) {
      bf39.setBackground(Color.GREEN);
    }
    if (b1010s.equals(redb)) {
      bf310.setBackground(Color.red);
    } else if (b1010s.equals(greenb)) {
      bf310.setBackground(Color.GREEN);
    }
    if (b1011s.equals(redb)) {
      bf311.setBackground(Color.red);
    } else if (b1011s.equals(greenb)) {
      bf311.setBackground(Color.GREEN);
    }
    if (b1012s.equals(redb)) {
      bf312.setBackground(Color.red);
    } else if (b1012s.equals(greenb)) {
      bf312.setBackground(Color.GREEN);
    }
    if (b1013s.equals(redb)) {
      bf313.setBackground(Color.red);
    } else if (b1013s.equals(greenb)) {
      bf313.setBackground(Color.GREEN);
    }

    bf31.setBounds(50, 150, 80, 50);
    bf32.setBounds(350, 150, 80, 50);
    bf33.setBounds(650, 150, 80, 50);
    bf34.setBounds(200, 250, 80, 50);
    bf35.setBounds(500, 250, 80, 50);
    bf36.setBounds(50, 350, 80, 50);
    bf37.setBounds(350, 350, 80, 50);
    bf38.setBounds(650, 350, 80, 50);
    bf39.setBounds(200, 450, 80, 50);
    bf310.setBounds(500, 450, 80, 50);
    bf311.setBounds(50, 550, 80, 50);
    bf312.setBounds(350, 550, 80, 50);
    bf313.setBounds(650, 550, 80, 50);
    bf3lgt.setBounds(60, 50, 100, 30);
    abf3.setBounds(20, 50, 30, 30);
    sf31.setBounds(250, 650, 400, 80);
    jf3a.setBounds(315, 25, 200, 60);
    jf31.setBounds(275, 725, 300, 30);
    jnf31.setBounds(1, 1, 1, 1);

    fog3.add(bf31);
    fog3.add(bf32);
    fog3.add(bf33);
    fog3.add(bf34);
    fog3.add(bf35);
    fog3.add(bf36);
    fog3.add(bf37);
    fog3.add(bf38);
    fog3.add(bf39);
    fog3.add(bf310);
    fog3.add(bf311);
    fog3.add(bf312);
    fog3.add(bf313);
    fog3.add(bf3lgt);
    fog3.add(abf3);
    fog3.add(sf31);
    fog3.add(jf3a);
    fog3.add(jf31);
    fog3.add(jnf31);

    i10 = new JLabel();
    i10.setIcon(new ImageIcon("fz.png"));
    i10.setBounds(200, 200, size.width, size.height);
    o.add(i10);

    abf3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent b) {
        fog3.setVisible(false);
        fgg.setVisible(true);
      }
    });

    bf3lgt.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent a) {
        fog2.setVisible(false);
        f0.setVisible(true);
      }
    });

    bf31.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf31.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf31.setBackground(co);
        b101.setBackground(co);
      }
    });

    bf32.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf32.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf32.setBackground(co);
        b102.setBackground(co);
      }
    });

    bf33.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf33.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf33.setBackground(co);
        b103.setBackground(co);
      }
    });

    bf34.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf34.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf34.setBackground(co);
        b104.setBackground(co);
      }
    });

    bf35.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf35.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf35.setBackground(co);
        b105.setBackground(co);
      }
    });

    bf36.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf36.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf36.setBackground(co);
        b106.setBackground(co);
      }
    });

    bf37.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf37.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf37.setBackground(co);
        b107.setBackground(co);
      }
    });

    bf38.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf38.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf38.setBackground(co);
        b108.setBackground(co);
      }
    });

    bf39.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf39.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf39.setBackground(co);
        b109.setBackground(co);
      }
    });

    bf310.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf310.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf310.setBackground(co);
        b1010.setBackground(co);
      }
    });

    bf311.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf311.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf311.setBackground(co);
        b1011.setBackground(co);
      }
    });

    bf312.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf312.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf312.setBackground(co);
        b1012.setBackground(co);
      }
    });

    bf313.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color co = bf313.getBackground();
        co = co == COLOR1 ? COLOR2 : COLOR1;
        bf313.setBackground(co);
        b1013.setBackground(co);
      }
    });

    // ::::::::::::::::::::::::Receipt::::::::::::::::

    f7.setSize(800, 800);

    Image icon8 = Toolkit.getDefaultToolkit().getImage("op.jpg");
    f4.setIconImage(icon8);

    j71 = new JLabel("Receipt of the booking");
    j71.setFont(new Font("ARIAL", Font.PLAIN, 30));
    j71.setForeground(Color.white);
    b71 = new JButton("Go Back to Home");
    b72 = new JButton("Finish");
    b73 = new JButton("Generate Receipt");
    j72 = new JLabel("");

    ta = new JTextArea();

    j71.setBounds(250, 75, 400, 50);
    ta.setBounds(200, 200, 400, 300);
    b71.setBounds(310, 550, 250, 30);
    b72.setBounds(210, 550, 80, 30);
    b73.setBounds(310, 150, 150, 30);
    j72.setBounds(1, 1, 1, 1);

    f7.add(j71);
    f7.add(ta);
    f7.add(b71);
    f7.add(b72);
    f7.add(b73);
    f7.add(j72);

    ta.setText(t1.getText());
    ta.setEditable(false);
    i7 = new JLabel();
    i7.setIcon(new ImageIcon("fd.jpg"));
    i7.setBounds(200, 200, size.width, size.height);
    l.add(i7);

    b71.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        f7.setVisible(false);
        ta.setText("");

        f3.setVisible(true);
      }
    });

    b72.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        f7.dispose();
      }
    });

    b73.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent j) {

        String adds = new String();
        if (cb.getSelectedIndex() == 1) {
          adds = "Credit Card";
        } else if (cb.getSelectedIndex() == 2) {
          adds = "Debit Card";
        } else if (cb.getSelectedIndex() == 3) {
          adds = "Net Banking";
        }

        String veh = new String();
        if (cbj.getSelectedIndex() == 1) {
          veh = "Two Wheeler";
        } else if (cbj.getSelectedIndex() == 2) {
          veh = "Four Wheeler";
        }

        ta.setFont(new Font("Serif", Font.PLAIN, 20));
        ta.setText(
            "Name: " + String.valueOf(st1) + "\nEmail id: " + String.valueOf(st2) + "\nContact no: "
                + String.valueOf(st3) + "\nVehicle Type: " + String.valueOf(veh) + "\nMode of Payment: "
                + String.valueOf(adds)
                + "\nParking facility name: " + data69 + "\nSlot number: " + data70 + "\n");

        if (data70 == "Slot 1" && data69 == "Mumbai Parking Facility") {
          b51.setBackground(COLOR2);
          bf1.setBackground(COLOR2);
        }
        if (data70 == "Slot 2" && data69 == "Mumbai Parking Facility") {
          b52.setBackground(COLOR2);
          bf2.setBackground(COLOR2);
        }
        if (data70 == "Slot 3" && data69 == "Mumbai Parking Facility") {
          b53.setBackground(COLOR2);
          bf3.setBackground(COLOR2);
        }
        if (data70 == "Slot 4" && data69 == "Mumbai Parking Facility") {
          b54.setBackground(COLOR2);
          bf4.setBackground(COLOR2);
        }
        if (data70 == "Slot 5" && data69 == "Mumbai Parking Facility") {
          b55.setBackground(COLOR2);
          bf5.setBackground(COLOR2);
        }
        if (data70 == "Slot 6" && data69 == "Mumbai Parking Facility") {
          b56.setBackground(COLOR2);
          bf6.setBackground(COLOR2);
        }
        if (data70 == "Slot 7" && data69 == "Mumbai Parking Facility") {
          b57.setBackground(COLOR2);
          bf7.setBackground(COLOR2);
        }
        if (data70 == "Slot 8" && data69 == "Mumbai Parking Facility") {
          b58.setBackground(COLOR2);
          bf8.setBackground(COLOR2);
        }
        if (data70 == "Slot 9" && data69 == "Mumbai Parking Facility") {
          b59.setBackground(COLOR2);
          bf9.setBackground(COLOR2);
        }
        if (data70 == "Slot 10" && data69 == "Mumbai Parking Facility") {
          b510.setBackground(COLOR2);
          bf10.setBackground(COLOR2);
        }
        if (data70 == "Slot 11" && data69 == "Mumbai Parking Facility") {
          b511.setBackground(COLOR2);
          bf11.setBackground(COLOR2);
        }
        if (data70 == "Slot 12" && data69 == "Mumbai Parking Facility") {
          b512.setBackground(COLOR2);
          bf12.setBackground(COLOR2);
        }
        if (data70 == "Slot 1" && data69 == "Kolkata Parking Facility") {
          b81.setBackground(COLOR2);
          bfo11.setBackground(COLOR2);
        }
        if (data70 == "Slot 2" && data69 == "Kolkata Parking Facility") {
          b82.setBackground(COLOR2);
          bfo12.setBackground(COLOR2);
        }
        if (data70 == "Slot 3" && data69 == "Kolkata Parking Facility") {
          b83.setBackground(COLOR2);
          bfo13.setBackground(COLOR2);
        }
        if (data70 == "Slot 4" && data69 == "Kolkata Parking Facility") {
          b84.setBackground(COLOR2);
          bfo14.setBackground(COLOR2);
        }
        if (data70 == "Slot 5" && data69 == "Kolkata Parking Facility") {
          b85.setBackground(COLOR2);
          bfo15.setBackground(COLOR2);
        }
        if (data70 == "Slot 6" && data69 == "Kolkata Parking Facility") {
          b86.setBackground(COLOR2);
          bfo16.setBackground(COLOR2);
        }
        if (data70 == "Slot 7" && data69 == "Kolkata Parking Facility") {
          b87.setBackground(COLOR2);
          bfo17.setBackground(COLOR2);
        }
        if (data70 == "Slot 8" && data69 == "Kolkata Parking Facility") {
          b88.setBackground(COLOR2);
          bfo18.setBackground(COLOR2);
        }
        if (data70 == "Slot 9" && data69 == "Kolkata Parking Facility") {
          b89.setBackground(COLOR2);
          bfo19.setBackground(COLOR2);
        }
        if (data70 == "Slot 10" && data69 == "Kolkata Parking Facility") {
          b810.setBackground(COLOR2);
          bfo110.setBackground(COLOR2);
        }
        if (data70 == "Slot 11" && data69 == "Kolkata Parking Facility") {
          b811.setBackground(COLOR2);
          bfo111.setBackground(COLOR2);
        }
        if (data70 == "Slot 12" && data69 == "Kolkata Parking Facility") {
          b812.setBackground(COLOR2);
          bfo112.setBackground(COLOR2);
        }
        if (data70 == "Slot 13" && data69 == "Kolkata Parking Facility") {
          b813.setBackground(COLOR2);
          bfo113.setBackground(COLOR2);
        }
        if (data70 == "Slot 14" && data69 == "Kolkata Parking Facility") {
          b814.setBackground(COLOR2);
          bfo114.setBackground(COLOR2);
        }
        if (data70 == "Slot 15" && data69 == "Kolkata Parking Facility") {
          b815.setBackground(COLOR2);
          bfo115.setBackground(COLOR2);
        }
        if (data70 == "Slot 16" && data69 == "Kolkata Parking Facility") {
          b816.setBackground(COLOR2);
          bfo116.setBackground(COLOR2);
        }
        if (data70 == "Slot 17" && data69 == "Kolkata Parking Facility") {
          b817.setBackground(COLOR2);
          bfo117.setBackground(COLOR2);
        }
        if (data70 == "Slot 18" && data69 == "Kolkata Parking Facility") {
          b818.setBackground(COLOR2);
          bfo118.setBackground(COLOR2);
        }
        if (data70 == "Slot 1" && data69 == "Chennai Parking Facility") {
          b91.setBackground(COLOR2);
          bf21.setBackground(COLOR2);
        }
        if (data70 == "Slot 2" && data69 == "Chennai Parking Facility") {
          b92.setBackground(COLOR2);
          bf22.setBackground(COLOR2);
        }
        if (data70 == "Slot 3" && data69 == "Chennai Parking Facility") {
          b93.setBackground(COLOR2);
          bf23.setBackground(COLOR2);
        }
        if (data70 == "Slot 4" && data69 == "Chennai Parking Facility") {
          b94.setBackground(COLOR2);
          bf24.setBackground(COLOR2);
        }
        if (data70 == "Slot 5" && data69 == "Chennai Parking Facility") {
          b95.setBackground(COLOR2);
          bf25.setBackground(COLOR2);
        }
        if (data70 == "Slot 6" && data69 == "Chennai Parking Facility") {
          b96.setBackground(COLOR2);
          bf26.setBackground(COLOR2);
        }
        if (data70 == "Slot 7" && data69 == "Chennai Parking Facility") {
          b97.setBackground(COLOR2);
          bf27.setBackground(COLOR2);
        }
        if (data70 == "Slot 8" && data69 == "Chennai Parking Facility") {
          b98.setBackground(COLOR2);
          bf28.setBackground(COLOR2);
        }
        if (data70 == "Slot 9" && data69 == "Chennai Parking Facility") {
          b99.setBackground(COLOR2);
          bf29.setBackground(COLOR2);
        }
        if (data70 == "Slot 10" && data69 == "Chennai Parking Facility") {
          b910.setBackground(COLOR2);
          bf210.setBackground(COLOR2);
        }
        if (data70 == "Slot 11" && data69 == "Chennai Parking Facility") {
          b911.setBackground(COLOR2);
          bf211.setBackground(COLOR2);
        }
        if (data70 == "Slot 12" && data69 == "Chennai Parking Facility") {
          b912.setBackground(COLOR2);
          bf212.setBackground(COLOR2);
        }
        if (data70 == "Slot 13" && data69 == "Chennai Parking Facility") {
          b913.setBackground(COLOR2);
          bf213.setBackground(COLOR2);
        }
        if (data70 == "Slot 14" && data69 == "Chennai Parking Facility") {
          b914.setBackground(COLOR2);
          bf214.setBackground(COLOR2);
        }
        if (data70 == "Slot 15" && data69 == "Chennai Parking Facility") {
          b915.setBackground(COLOR2);
          bf215.setBackground(COLOR2);
        }
        if (data70 == "Slot 16" && data69 == "Chennai Parking Facility") {
          b916.setBackground(COLOR2);
          bf216.setBackground(COLOR2);
        }
        if (data70 == "Slot 1" && data69 == "Delhi Parking Facility") {
          b101.setBackground(COLOR2);
          bf31.setBackground(COLOR2);
        }
        if (data70 == "Slot 2" && data69 == "Delhi Parking Facility") {
          b102.setBackground(COLOR2);
          bf32.setBackground(COLOR2);
        }
        if (data70 == "Slot 3" && data69 == "Delhi Parking Facility") {
          b103.setBackground(COLOR2);
          bf33.setBackground(COLOR2);
        }
        if (data70 == "Slot 4" && data69 == "Delhi Parking Facility") {
          b104.setBackground(COLOR2);
          bf34.setBackground(COLOR2);
        }
        if (data70 == "Slot 5" && data69 == "Delhi Parking Facility") {
          b105.setBackground(COLOR2);
          bf35.setBackground(COLOR2);
        }
        if (data70 == "Slot 6" && data69 == "Delhi Parking Facility") {
          b106.setBackground(COLOR2);
          bf36.setBackground(COLOR2);
        }
        if (data70 == "Slot 7" && data69 == "Delhi Parking Facility") {
          b107.setBackground(COLOR2);
          bf37.setBackground(COLOR2);
        }
        if (data70 == "Slot 8" && data69 == "Delhi Parking Facility") {
          b108.setBackground(COLOR2);
          bf38.setBackground(COLOR2);
        }
        if (data70 == "Slot 9" && data69 == "Delhi Parking Facility") {
          b109.setBackground(COLOR2);
          bf39.setBackground(COLOR2);
        }
        if (data70 == "Slot 10" && data69 == "Delhi Parking Facility") {
          b1010.setBackground(COLOR2);
          bf310.setBackground(COLOR2);
        }
        if (data70 == "Slot 11" && data69 == "Delhi Parking Facility") {
          b1011.setBackground(COLOR2);
          bf311.setBackground(COLOR2);
        }
        if (data70 == "Slot 12" && data69 == "Delhi Parking Facility") {
          b1012.setBackground(COLOR2);
          bf312.setBackground(COLOR2);
        }
        if (data70 == "Slot 13" && data69 == "Delhi Parking Facility") {
          b1013.setBackground(COLOR2);
          bf313.setBackground(COLOR2);
        }

      }
    });

  }

  public static void main(String[] args) throws Exception {
    new Final();

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub

  }

}