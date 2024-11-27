/*
 *   변경
 *   1. toUpperCase(): 대문자 변환
 *   2. toLowerCase(): 소문자 변환
 *   3. replace(): 지정된 데이터 변경
 *   4. replaceAll(): 전체 변경 ==> 정규식
 *     맛있+ => '맛있' 글자가 있는 단어 모두 변경
 *      [가-힣] => 한글 전체
 *      [0-9] => 숫자 전체
 *      [A-Za-z] => 알파벳 전체
 *      +: 한 글자 이상
 *      *: 0글자 이상
 *      |: 선택
 *      .: 임의이 문자 한 개
 *      ?; 존재여부 확인
 *   5. valueOf(): 모든 데이터형 => 문자열로 변환
 *      valueOf(10)=> "10"
 *      => 브라우저 웹창
 */
import javax.swing.JFrame;
import javax.swing.JTextField;
public class 문자열_7 extends JFrame{
	public 문자열_7()
	{
		JTextField tf=new JTextField();
		tf.setText(String.valueOf(100));//숫자는 입력되지 않기 때문에 valueOf()를 통해 문자열로 변환하여 넣음
		//String. / Math. / scan. ...=> static 메소드
		add("North",tf);
		setSize(600, 480);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 문자열_7();

	}

}
