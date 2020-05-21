package Utility.Utility;

import java.text.SimpleDateFormat;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("05/12/2020");
        String patternToUse = sdf.toPattern();
        System.out.println( patternToUse );

	}

}
