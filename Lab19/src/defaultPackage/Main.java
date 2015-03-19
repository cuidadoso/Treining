package defaultPackage;

import ru.pere.lab19.*;

public class Main {

	public static void main(String[] args) {
	
		MyTest test = new MyTest();
		test.show();
		
		MyTest.MyNested nested = new MyTest.MyNested();
		nested.nestedShow();
		
		MyTest.MyInner inner = test.new MyInner();
		inner.innerShow();
		
	}
	
	
}
