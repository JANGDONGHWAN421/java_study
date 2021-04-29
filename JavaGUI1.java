import javax.swing.JButton;
import javax.swing.JFrame;

class  JavaGUI
{
	// java를 모르면 안될 것 같아서 자바 공부만 하면 재미없으니까 GUI에 넣어서 해보려고 합니다. ㅋㅋ
	public static void main(String[] args) 
	{
		
		JFrame javaGUI = new JFrame("This is First JFrame Test");
		javaGUI.setVisible(true);
		javaGUI.setSize(800, 600);
		javaGUI.setLocationRelativeTo(null); // 이건 프레임을 화면 중간에 배치하기 위해서에요!
		javaGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        javaGUI.getContentPane().setLayout(null); // 레이아웃 설정.

		JButton btn1 = new JButton("버튼 1");
		JButton btn2 = new JButton("버튼 2");

		btn1.setBounds(30, 170, 122, 30); //항상 버튼 사이즈랑 위치 설정하는게 힘들다 쌩코딩은 ㅋㅋ
        btn2.setBounds(182, 170, 122, 30);
		
        javaGUI.getContentPane().add(btn1); // ★ 프레임에다가 버튼 추가
        javaGUI.getContentPane().add(btn2);
 
        
        javaGUI.setVisible(true); // 프레임이 보이도록 설정

		// 다음에는 이 코드에 버튼 동작 하기

	}
}
