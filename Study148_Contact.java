package study0518;

import java.awt.*;
import java.awt.event.*;

public class Study148_Contact 
{
	public static void main(String[] ar) 
	{
		Friends round = new Friends();
	}
}

class Friends extends Frame
{
	private Dimension dimen, dimen1;

	private int xpos, ypos;

	private Label lbTitle = new Label("ģ���߰� ���α׷�", Label.CENTER);
	private Label lbName = new Label("�̸�: ", Label.CENTER);
	private Label lbHp = new Label("����: ", Label.CENTER);
	TextField tfName = new TextField(20);
	TextField tfHp = new TextField(20);

	private Button bt = new Button("���");
	private Button bt1 = new Button("���");

	public Friends() 
	{
		super("ģ������ ���α׷�");
		
		this.init();
		this.setSize(500, 300);
		// this.pack();
		
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
		
		this.setVisible(true);
	}

	public void init() 
	{
		// ȭ�� ���� ���� �κ�
		this.setLayout(null);
//		absolute����� ���̾ƿ�

		this.add(lbTitle);
		lbTitle.setBounds(100, 50, 300, 30);
		Font font1 = new Font("SansSerif", Font.BOLD, 20);
		lbTitle.setFont(font1);
		
		this.add(lbName);
		this.add(lbHp);
		this.add(tfName);
		this.add(tfHp);
		this.add(bt);
		this.add(bt1);
	}

}
