import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.JPanel;
public class MyFrame extends JFrame implements ActionListener{
    JButton clear;
    //JButton period; 
    JButton zero; 
    JButton one; 
    JButton two; 
    JButton three; 
    JButton four; 
    JButton five; 
    JButton six; 
    JButton seven; 
    JButton eight; 
    JButton nine; 
    JButton delete; 
    JButton divide; 
    JButton multiply; 
    JButton subtract; 
    JButton add; 
    JButton equal; 

    JLabel label; 
    JLabel userQuestion; 

    
//question to go into the orange section 
    String theQuestion =""; 

        
    
    MyFrame() {
        
        //border
        
        // Border border = BorderFactory.createLineBorder(new Color(r,g,b), borderWith (int) );
 
        //label 
        label = new JLabel();
        label.setText("Calculator"); 
        label.setForeground(new Color(255,255,255));
        label.setBounds(0,0,400,50);
        label.setOpaque(false);
        label.setHorizontalAlignment(JLabel.CENTER);

        userQuestion = new JLabel(); 
        userQuestion.setText(theQuestion); 
        userQuestion.setBounds(0,50,400,100);
        userQuestion.setOpaque(false);
        userQuestion.setFont(new Font("Comic Sans", Font.BOLD,20));
        userQuestion.setHorizontalAlignment(JLabel.RIGHT);


        /*to set the lablel image label.setIcon(image); 
         *  label.setHorizontalTextPosition(JLabel.CENTER); //set text Left, center, right of image icon 
         *  label.setVerticalTextPosition(JLabel.TOP); // set TOP, CENTER, BOTTOM of imageicon
         *  label.setForeground(new Color(r,g,b)); // set font color
         *  label.setFont(new Font("FontName", Font.PLAIN,20)) // set font
         *  label.setIconTextGap(-/+int); // set gap of text to image 
         *  label.setBackground(Color.black); // set background color of the label 
         *  label.setOpaque(true); //display background color
         *  label.setBorder(border); //set border 
         * label.setVerticalAlignment(JLabel.TOP); //set vertical postion of icon+text TOP,CENTER,BOTTOM within label 
         * label.setHorizantalAlignment(Jlabel.CENTER); // set horizantal position of icon+text LEFT,RIGHT,CENTER within label
         * label.setBounds(0,0,250,250); //puts the label in positions x,y and sets the width and height 
        */
        
        //JButton = a button that performs an action when clicked on 
        //ImageIcon icon = new ImageIcon("filename");
        //button.setIcon(icon); 
        //button.setHorizontalTextPosition(JButton.LEFT);
        //button.setVerticalTextPosition(JButton.BOTTOM);         
        //button.setIconTextGap(-15);
        //button.setEnabled(false); 

        //Clear all button 
        clear = new JButton(); 
        clear.setBounds(0,150,100,50); 
        clear.addActionListener((ActionListener) this);
        clear.setText("C"); 
        clear.setFocusable(false); 
        clear.setForeground(Color.white); 
        clear.setFont(new Font("Comic Sans", Font.BOLD, 25));
        clear.setBackground(new Color(200, 0, 90)); 
        clear.setBorder(BorderFactory.createEtchedBorder()); 

        //Num Buttons 
        
        //1
        one = new JButton(); 
        one.setBounds(0,300,100,50); 
        one.addActionListener((ActionListener) this);
        one.setText("1"); 
        one.setFocusable(false); 
        one.setForeground(Color.white); 
        one.setFont(new Font("Comic Sans", Font.BOLD, 25));
        one.setBackground(new Color(200, 0, 90)); 
        one.setBorder(BorderFactory.createEtchedBorder()); 
        
        //2
        two = new JButton(); 
        two.setBounds(100,300,100,50); 
        two.addActionListener((ActionListener) this);
        two.setText("2"); 
        two.setFocusable(false); 
        two.setForeground(Color.white); 
        two.setFont(new Font("Comic Sans", Font.BOLD, 25));
        two.setBackground(new Color(200, 0, 90)); 
        two.setBorder(BorderFactory.createEtchedBorder()); 
        
        //3
        three = new JButton(); 
        three.setBounds(200,300,100,50); 
        three.addActionListener((ActionListener) this);
        three.setText("3"); 
        three.setFocusable(false); 
        three.setForeground(Color.white); 
        three.setFont(new Font("Comic Sans", Font.BOLD, 25));
        three.setBackground(new Color(200, 0, 90)); 
        three.setBorder(BorderFactory.createEtchedBorder()); 

        //4
        four = new JButton(); 
        four.setBounds(0,250,100,50); 
        four.addActionListener((ActionListener) this);
        four.setText("4"); 
        four.setFocusable(false); 
        four.setForeground(Color.white); 
        four.setFont(new Font("Comic Sans", Font.BOLD, 25));
        four.setBackground(new Color(200, 0, 90)); 
        four.setBorder(BorderFactory.createEtchedBorder()); 
        
        //5
        five = new JButton(); 
        five.setBounds(100,250,100,50); 
        five.addActionListener((ActionListener) this);
        five.setText("5"); 
        five.setFocusable(false); 
        five.setForeground(Color.white); 
        five.setFont(new Font("Comic Sans", Font.BOLD, 25));
        five.setBackground(new Color(200, 0, 90)); 
        five.setBorder(BorderFactory.createEtchedBorder()); 
        
        //6
        six = new JButton(); 
        six.setBounds(200,250,100,50); 
        six.addActionListener((ActionListener) this);
        six.setText("6"); 
        six.setFocusable(false); 
        six.setForeground(Color.white); 
        six.setFont(new Font("Comic Sans", Font.BOLD, 25));
        six.setBackground(new Color(200, 0, 90)); 
        six.setBorder(BorderFactory.createEtchedBorder()); 

        //7
        seven = new JButton(); 
        seven.setBounds(0,200,100,50); 
        seven.addActionListener((ActionListener) this);
        seven.setText("7"); 
        seven.setFocusable(false); 
        seven.setForeground(Color.white); 
        seven.setFont(new Font("Comic Sans", Font.BOLD, 25));
        seven.setBackground(new Color(200, 0, 90)); 
        seven.setBorder(BorderFactory.createEtchedBorder()); 
        //8
        eight = new JButton(); 
        eight.setBounds(100,200,100,50); 
        eight.addActionListener((ActionListener) this);
        eight.setText("8"); 
        eight.setFocusable(false); 
        eight.setForeground(Color.white); 
        eight.setFont(new Font("Comic Sans", Font.BOLD, 25));
        eight.setBackground(new Color(200, 0, 90)); 
        eight.setBorder(BorderFactory.createEtchedBorder()); 
        
        //9
        nine = new JButton(); 
        nine.setBounds(200,200,100,50); 
        nine.addActionListener((ActionListener) this);
        nine.setText("9"); 
        nine.setFocusable(false); 
        nine.setForeground(Color.white); 
        nine.setFont(new Font("Comic Sans", Font.BOLD, 25));
        nine.setBackground(new Color(200, 0, 90)); 
        nine.setBorder(BorderFactory.createEtchedBorder()); 
        
        //0
        zero = new JButton(); 
        zero.setBounds(100,350,100,50); 
        zero.addActionListener((ActionListener) this);
        zero.setText("0"); 
        zero.setFocusable(false); 
        zero.setForeground(Color.white); 
        zero.setFont(new Font("Comic Sans", Font.BOLD, 25));
        zero.setBackground(new Color(200, 0, 90)); 
        zero.setBorder(BorderFactory.createEtchedBorder()); 

        //period
        /*
        period = new JButton(); 
        period.setBounds(200,350,100,50); 
        period.addActionListener((ActionListener) this);
        period.setText("."); 
        period.setFocusable(false); 
        period.setForeground(Color.white); 
        period.setFont(new Font("Comic Sans", Font.BOLD, 25));
        period.setBackground(new Color(200, 0, 90)); 
        period.setBorder(BorderFactory.createEtchedBorder()); 
        */

        //arithmetic buttons 
        
        //delete
        delete = new JButton(); 
        delete.setBounds(300,150,100,50); 
        delete.addActionListener((ActionListener) this);
        delete.setText("del"); 
        delete.setFocusable(false); 
        delete.setForeground(Color.white); 
        delete.setFont(new Font("Comic Sans", Font.BOLD, 25));
        delete.setBackground(new Color(200, 0, 90)); 
        delete.setBorder(BorderFactory.createEtchedBorder()); 
        
        //divide
        divide = new JButton(); 
        divide.setBounds(300,200,100,50); 
        divide.addActionListener((ActionListener) this);
        divide.setText("/"); 
        divide.setFocusable(false); 
        divide.setForeground(Color.white); 
        divide.setFont(new Font("Comic Sans", Font.BOLD, 25));
        divide.setBackground(new Color(200, 0, 90)); 
        divide.setBorder(BorderFactory.createEtchedBorder()); 
        
        //multiply
        multiply = new JButton(); 
        multiply.setBounds(300,250,100,50); 
        multiply.addActionListener((ActionListener) this);
        multiply.setText("X"); 
        multiply.setFocusable(false); 
        multiply.setForeground(Color.white); 
        multiply.setFont(new Font("Comic Sans", Font.BOLD, 25));
        multiply.setBackground(new Color(200, 0, 90)); 
        multiply.setBorder(BorderFactory.createEtchedBorder()); 


        //subtract
        subtract = new JButton(); 
        subtract.setBounds(300,300,100,50); 
        subtract.addActionListener((ActionListener) this);
        subtract.setText("-"); 
        subtract.setFocusable(false); 
        subtract.setForeground(Color.white); 
        subtract.setFont(new Font("Comic Sans", Font.BOLD, 25));
        subtract.setBackground(new Color(200, 0, 90)); 
        subtract.setBorder(BorderFactory.createEtchedBorder()); 
        
        //add
        add = new JButton(); 
        add.setBounds(300,350,100,50); 
        add.addActionListener((ActionListener) this);
        add.setText("+"); 
        add.setFocusable(false); 
        add.setForeground(Color.white); 
        add.setFont(new Font("Comic Sans", Font.BOLD, 25));
        add.setBackground(new Color(200, 0, 90)); 
        add.setBorder(BorderFactory.createEtchedBorder()); 
        //equal
        equal = new JButton(); 
        equal.setBounds(300,400,100,50); 
        equal.addActionListener((ActionListener) this);
        equal.setText("="); 
        equal.setFocusable(false); 
        equal.setForeground(Color.white); 
        equal.setFont(new Font("Comic Sans", Font.BOLD, 25));
        equal.setBackground(new Color(200, 0, 90)); 
        equal.setBorder(BorderFactory.createEtchedBorder()); 


        JPanel redPanel = new JPanel(); 
        redPanel.setBackground(Color.red); 
        redPanel.setBounds(0,0,400,50); 

        JPanel orangePanel = new JPanel(); 
        orangePanel.setBackground(Color.orange); 
        orangePanel.setBounds(0,50,400,100); 
        
        JPanel grayPanel = new JPanel(); 
        grayPanel.setBackground(Color.gray); 
        grayPanel.setBounds(0,150,400,550); 
        

        this.setResizable(false); //preventthis from being resizable
        //set the title of the window 
        this.setTitle("Calculator"); 
        //sets the size of the window x,y
        this.setSize(400,500); 
        //frame visibility
        this.setVisible(true); 

        /*
         to add images (which may be useful for the buttons)
         paste the image file you want to add into the cd
         ImageIcon image = new ImageIcon("filename.fileextension"); 
         to change thethis Icon 
        this.setIconImage(image.getImage());
         */

         //background of thethis set to black 
        this.getContentPane().setBackground(new Color(0,0,0));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null); //sets it so that you have to place the image in the frame instead of it automatically taking up the whole frame 
        this.add(clear); 
        //this.add(period); 
        this.add(zero); 
        this.add(one);
        this.add(two); 
        this.add(three); 
        this.add(four);
        this.add(five); 
        this.add(six); 
        this.add(seven);
        this.add(eight); 
        this.add(nine); 
        this.add(delete); 
        this.add(divide); 
        this.add(multiply); 
        this.add(subtract); 
        this.add(add); 
        this.add(equal); 
        redPanel.add(label); 
        orangePanel.add(userQuestion); 
        this.add(redPanel); 
        this.add(orangePanel); 
        this.add(grayPanel); 
        
    }

    public void updateQuestion(char act) {
        if (act=='c') {
            theQuestion = ""; 
        }
        if (act=='0') {
            theQuestion = theQuestion + "0"; 
        }
        if (act=='1') {
            theQuestion = theQuestion + "1"; 
        }
        if (act=='2') {
            theQuestion = theQuestion + "2"; 
        }
        if (act=='3') {
            theQuestion = theQuestion + "3"; 
        }
        if (act=='4') {
            theQuestion = theQuestion + "4"; 
        }
        if (act=='5') {
            theQuestion = theQuestion + "5"; 
        }
        if (act=='6') {
            theQuestion = theQuestion + "6"; 
        }
        if (act=='7') {
            theQuestion = theQuestion + "7"; 
        }
        if (act=='8') {
            theQuestion = theQuestion + "8"; 
        }
        if (act=='9') {
            theQuestion = theQuestion + "9"; 
        }
        if (act=='d') {
            theQuestion = theQuestion.substring(0,theQuestion.length()-1); 
        }
        if (act=='/') {
            theQuestion = theQuestion + "/"; 
        }
        if (act=='x') {
            theQuestion = theQuestion + "X"; 
        }
        if (act=='-') {
            theQuestion = theQuestion + "-"; 
        }
        if (act=='+') {
            theQuestion = theQuestion + "+"; 
        }
        if (act=='=') {
            theQuestion = calculate(theQuestion);  
        }
        if (act=='.') {
            theQuestion = theQuestion + "."; 
        }

        userQuestion.setText(theQuestion); 

    }
//work on this method tomorrow
    
    public String calculate(String question) {        
        String answer = ""; 
        int firstNum  = 0 ; 
        int secondNum = 1; 
        char operation = '.';
        
        try {
            answer = Integer.toString(Integer.parseInt(question)); 
            return answer;
        }
        catch(NumberFormatException e) {

            
            for (int i = 0; i < question.length() ; i++) {
                if(!(Character.isDigit(question.charAt(i)))) {
                    operation = question.charAt(i); 
                    firstNum = Integer.parseInt(question.substring(0, i)); 
                    secondNum = Integer.parseInt(question.substring(i+1)); 
                }
            }

            switch(operation) {

                case 'X' -> answer = Integer.toString(firstNum*secondNum) ; 

                case '/' -> { 
                    try {
                        answer = Integer.toString(firstNum/secondNum);
                    } catch (ArithmeticException eTwo) {
                        answer = "divideBy0error Press Clear to try again"; 
                    }
                }
                    

                case '+' -> answer = Integer.toString(firstNum+secondNum) ; 

                case '-' -> answer = Integer.toString(firstNum-secondNum) ;
                default -> {
                }  

            }
            return answer; 
        }

    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
         
        if (e.getSource()==clear) {
            updateQuestion('c');
            multiply.setEnabled(true); 
            subtract.setEnabled(true);
            add.setEnabled(true);
            divide.setEnabled(true);
        }
        if (e.getSource()==zero) {
            updateQuestion('0'); 
        }
        if (e.getSource()==one) {
            updateQuestion('1'); 
        }
        if (e.getSource()==two) {
            updateQuestion('2'); 
        }
        if (e.getSource()==three) {
            updateQuestion('3'); 
        }
        if (e.getSource()==four) {
            updateQuestion('4'); 
        }
        if (e.getSource()==five) {
            updateQuestion('5'); 
        }
        if (e.getSource()==six) {
            updateQuestion('6'); 
        }
        if (e.getSource()==seven) {
            updateQuestion('7');  
        }
        if (e.getSource()==eight) {
            updateQuestion('8'); 
        }
        if (e.getSource()==nine) {
            updateQuestion('9'); 
        }
        if (e.getSource()==delete) {
            updateQuestion('d'); 
        }
        if (e.getSource()==divide) {
            updateQuestion('/'); 
            multiply.setEnabled(false); 
            subtract.setEnabled(false);
            add.setEnabled(false);
            divide.setEnabled(false);
        }
        if (e.getSource()==multiply) {
            updateQuestion('x');  
            multiply.setEnabled(false); 
            subtract.setEnabled(false);
            add.setEnabled(false);
            divide.setEnabled(false);
        }
        if (e.getSource()==subtract) {
            updateQuestion('-');  
            multiply.setEnabled(false); 
            subtract.setEnabled(false);
            add.setEnabled(false);
            divide.setEnabled(false);
        }
        if (e.getSource()==add) {
            updateQuestion('+');  
            multiply.setEnabled(false); 
            subtract.setEnabled(false);
            add.setEnabled(false);
            divide.setEnabled(false);
        }
        if (e.getSource()==equal) {
            updateQuestion('='); 
            multiply.setEnabled(true); 
            subtract.setEnabled(true);
            add.setEnabled(true);
            divide.setEnabled(true);
        }
        /*
        if (e.getSource()==period) {
            updateQuestion('.'); 
        }
        */
     }
}
