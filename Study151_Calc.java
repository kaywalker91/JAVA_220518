package study0518;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Study151_Calc {

	public static void main(String[] args) {
		Calc1 f = new Calc1();
	}
}

class Calc1 extends Frame implements ActionListener {
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Label lbTitle = new Label("계산기 프로그램", Label.CENTER);
	Label lbSu1 = new Label("첫번째수 : ", Label.CENTER);
	Label lbSu2 = new Label("두번째수 : ", Label.CENTER);
	Label lbYon = new Label("연산자    : ", Label.CENTER);
	Label lbResult = new Label("결과 : ", Label.CENTER);
	Label lbResult2 = new Label("20", Label.CENTER);
	TextField tfSu1  = new TextField(20);
	TextField tfSu2  = new TextField(20);
	TextField tfYon  = new TextField(20);
	Button btnRun = new Button("계 산 ");
	Button btnCancel = new Button("취  소");
	
	public Calc1() {
		super("친구관리프로그램");
		this.init();
		this.start();
		this.setSize(400, 400);	
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
		lbTitle.setBounds(50, 50, 300, 30);
		Font font = new Font("SansSerif", Font.BOLD, 20);
		lbTitle.setFont(font);
		
		
		this.add(lbSu1);
		lbSu1.setBounds(50, 100, 70, 30);		
		this.add(tfSu1);
		tfSu1.setBounds(120, 100, 200, 30);
		
		this.add(lbSu2);
		lbSu2.setBounds(50, 150, 70, 30);		
		this.add(tfSu2);
		tfSu2.setBounds(120, 150, 200, 30);
		
		this.add(lbYon);
		lbYon.setBounds(50, 200, 70, 30);		
		this.add(tfYon);
		tfYon.setBounds(120, 200, 50, 30);	
		
		
		this.add(lbResult);
		lbResult.setBounds(50, 250, 70, 30); lbResult.setFont(font);		
		this.add(lbResult2);
		lbResult2.setBounds(120, 250, 150, 30); lbResult2.setFont(font);
		
			
		this.add(btnRun);
		btnRun.setBounds(110, 300, 100, 30);
		this.add(btnCancel);
		btnCancel.setBounds(220, 300, 100, 30);
	}

	public void start() {
		
		btnRun.addActionListener(this);
		btnCancel.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnCancel)
		{
			System.exit(0);
		}
		
		if(tfSu1.getText().equals(""))
		{
			System.out.println("첫번째수를 입력해주세요");
			lbResult2.setText("수1을 입력해!");
			return;
		}
		else if(tfSu2.getText().equals(""))
		{
			System.out.println("첫번째수를 입력해주세요");
			lbResult2.setText("수2을 입력해!");
			return;
		}
		else if(tfYon.getText().equals(""))
		{
			System.out.println("첫번째수를 입력해주세요");
			lbResult2.setText("+-*/입력해!");
			return;
		}
		
		//값을 가져왔음.
		int su1 = Integer.parseInt(tfSu1.getText());
		int su2 = Integer.parseInt(tfSu2.getText());		
		int result=0;
		//제어구간..
		if(tfYon.getText().equals("+")) {
			result = su1 +su2;
		}
		else if(tfYon.getText().equals("-")) {
			result = su1 -su2;
		}
		else if(tfYon.getText().equals("*")) {
			result = su1 *su2;
		}
		else if(tfYon.getText().equals("/")) {
			result = su1 /su2;
		}
			
		//수입력하고 연산자자리 공백처리
		tfSu1.setText("");
		tfSu2.setText("");
		tfYon.setText("");
		//결과값을 출력
		lbResult2.setText(result+"");
		
	}
	
}


