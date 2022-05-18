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
	
	Label lbTitle = new Label("���� ���α׷�", Label.CENTER);
	Label lbSu1 = new Label("ù��°�� : ", Label.CENTER);
	Label lbSu2 = new Label("�ι�°�� : ", Label.CENTER);
	Label lbYon = new Label("������    : ", Label.CENTER);
	Label lbResult = new Label("��� : ", Label.CENTER);
	Label lbResult2 = new Label("20", Label.CENTER);
	TextField tfSu1  = new TextField(20);
	TextField tfSu2  = new TextField(20);
	TextField tfYon  = new TextField(20);
	Button btnRun = new Button("�� �� ");
	Button btnCancel = new Button("��  ��");
	
	public Calc1() {
		super("ģ���������α׷�");
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
		// �ۼַ�Ʈ���  : ���� ��ǥ �Է¹��.
		this.setLayout(null);

		//Ÿ��Ʋ
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
			System.out.println("ù��°���� �Է����ּ���");
			lbResult2.setText("��1�� �Է���!");
			return;
		}
		else if(tfSu2.getText().equals(""))
		{
			System.out.println("ù��°���� �Է����ּ���");
			lbResult2.setText("��2�� �Է���!");
			return;
		}
		else if(tfYon.getText().equals(""))
		{
			System.out.println("ù��°���� �Է����ּ���");
			lbResult2.setText("+-*/�Է���!");
			return;
		}
		
		//���� ��������.
		int su1 = Integer.parseInt(tfSu1.getText());
		int su2 = Integer.parseInt(tfSu2.getText());		
		int result=0;
		//�����..
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
			
		//���Է��ϰ� �������ڸ� ����ó��
		tfSu1.setText("");
		tfSu2.setText("");
		tfYon.setText("");
		//������� ���
		lbResult2.setText(result+"");
		
	}
	
}


