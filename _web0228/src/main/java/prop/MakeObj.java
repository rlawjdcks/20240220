package prop;


public class MakeObj {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		  Class<?> handlerClass = Class.forName("prop.Aaa");
          Aaa handlerInstance = 
                  (Aaa) handlerClass.newInstance();

          handlerInstance.aaaprint();
	}

}
