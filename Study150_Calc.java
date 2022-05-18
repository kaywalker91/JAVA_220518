package study0518;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Study150_Calc {

	public static void main(String[] args) {
		Calc f = new Calc();
	}
}

class Calc extends Frame implements ActionListener {
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Label lbTitle = new Label("계산기 프로그램", Label.CENTER);
	Label lbNum1 = new Label("첫번째수: ", Label.CENTER);
	Label lbNum2 = new Label("두번째수: ", Label.CENTER);
	Label lboperator = new Label("연산자: ", Label.CENTER);
	Label lbFin = new Label("결과: ", Label.CENTER);
	Label lb = new Label("20", Label.CENTER);
	
	TextField tfNum1  = new TextField(20);
	TextField tfNum2  = new TextField(20);
	TextField tfcalc  = new TextField(20);
	
	Button btncalc = new Button("계  산");
	Button btnCancel = new Button("취  소");
	
	public Calc() 
	{
		super("계산기 프로그램");
		
		this.init();
		this.start();
		this.setSize(500, 400);	
		
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
		
		this.setVisible(true);
	}

	public void init() {
		// 앱솔루트방식  : 직접 좌표 입력방식.
		this.setLayout(null);

		//타이틀
		this.add(lbTitle);
		lbTitle.setBounds(100, 50, 300, 30);
		Font font = new Font("SansSerif", Font.BOLD, 20);
		lbTitle.setFont(font);
		
		this.add(lbNum1);
		lbNum1.setBounds(100, 100, 50, 30);		
		this.add(tfNum1);
		tfNum1.setBounds(160, 100, 200, 30);
		
		this.add(lbNum2);
		lbNum2.setBounds(100, 150, 50, 30);		
		this.add(tfNum2);
		tfNum2.setBounds(160, 150, 200, 30);
		
		this.add(lboperator);
		lboperator.setBounds(100, 200, 50, 30);		
		this.add(tfcalc);
		tfcalc.setBounds(160, 200, 50, 30);
		
		this.add(lbFin);
		lbFin.setBounds(110, 250, 100, 30);
		this.add(lb);
		lb.setBounds(180, 250, 100, 30);
		lb.setFont(font);
		
		this.add(btncalc);
		btncalc.setBounds(140, 300, 100, 30);
		this.add(btnCancel);
		btnCancel.setBounds(250, 300, 100, 30);
		
	}
	
	public void start()
	{
		btncalc.addActionListener(this);
		btnCancel.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e) 
			{
				System.exit(0);
			}
		});
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		int num1 = Integer.parseInt(tfNum1.getText());
		int num2 = Integer.parseInt(tfNum2.getText());
		int result=0;
		
		if(lboperator.getText().equals("+"))
		{
			result = (num1+num2);
			lb.setText(result+"");
		}
		else if(lboperator.getText().equals("-"))
		{
			result = num1-num2;
		}
		else if(lboperator.getText().equals("*"))
		{
			result = num1*num2;
		}
		else if(lboperator.getText().equals("/"))
		{
			result = num1/num2;
		}
		
		//결과값을 출력
		lb.setText(result+"");
	}
}

	

