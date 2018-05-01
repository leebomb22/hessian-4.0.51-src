import com.caucho.hessian.client.HessianProxyFactory;

import java.net.MalformedURLException;


public class TestHessianClient {

    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException {
        String url = "http://localhost:8080/HessianServer/helloworld";
        HessianProxyFactory pf = new HessianProxyFactory();
        DemoApi da = (DemoApi) pf.create(DemoApi.class, url);
        da.sayHello();
    }

}
