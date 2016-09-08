package logic;
import java.util.ArrayList;
import java.util.List;

public class count {

	public static void main(String[] args) {
	    java.lang.String start = "THIS_IS_A_TEST";
	    StringBuffer sb = new StringBuffer();
	    for (java.lang.String s : start.split("_")) {
	        sb.append(Character.toUpperCase(s.charAt(0)));
	        if (s.length() > 1) {
	            sb.append(s.substring(1, s.length()).toLowerCase());
	        }
	    }
	    System.out.println(sb);
	}
}