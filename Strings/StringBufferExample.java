
public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" World");//Hello World
		System.out.println(sb);
		sb.insert(6, " Java");//Hello Java World
		System.out.println(sb);
		sb.replace(6, 11, " C++");//Hello C++ World
		System.out.println(sb);
		sb.reverse();//dlroW olleH
		System.out.println(sb);
		sb.delete(6, 11);//Hello
		System.out.println(sb);
		sb.deleteCharAt(0);//ello
		System.out.println(sb);
		sb.setCharAt(0, 'H');//Hello
		System.out.println(sb);
		sb.setLength(5);//
		System.out.println(sb);
		sb.trimToSize();//
		System.out.println(sb);//

	}

}
