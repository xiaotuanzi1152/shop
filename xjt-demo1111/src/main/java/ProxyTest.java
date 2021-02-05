import com.xjt.service.IService;
import com.xjt.service.impl.IServiceImpl1;
import com.xjt.service.impl.IServiceImpl2;
import com.xjt.service.impl.PTProxy;
import org.junit.Test;

public class ProxyTest {

    @Test
    public void mm1(){
        /*IService s11 = new IServiceImpl1();
        IService s22 = new IServiceImpl2();*/
        IService s11 = new PTProxy(new IServiceImpl1());
        IService s22 = new PTProxy(new IServiceImpl2());
        s11.m1();
        s11.m2();
        s11.m3();
        s22.m1();
        s22.m2();
        s22.m3();

    }
}
