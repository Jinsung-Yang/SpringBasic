import org.omg.PortableInterceptor.TRANSPORT_RETRY;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx= new GenericXmlApplicationContext("classpath:applicationContext.xml");
		TRANSPORT_RETRY 
		ctx.getBean("tWalk", TranspotationWalk.class);
		
	}
}
