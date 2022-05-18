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

	private Label lbTitle = new Label("친구추가 프로그램", Label.CENTER);
	private Label lbName = new Label("이름: ", Label.CENTER);
	private Label lbHp = new Label("전번: ", Label.CENTER);
	TextField tfName = new TextField(20);
	TextField tfHp = new TextField(20);

	private Button bt = new Button("등록");
	private Button bt1 = new Button("취소");

	public Friends() 
	{
		super("친구관리 프로그램");
		
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
		// 화면 구성 넣을 부분
		this.setLayout(null);
//		absolute방식의 레이아웃

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
