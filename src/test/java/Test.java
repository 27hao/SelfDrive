import com.clouddrive.DriveApplication;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

/**
 * Created by bpj on 19-4-28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DriveApplication.class)
public class Test {
    @Autowired
    private DataSource dataSource;
    @org.junit.Test
    public void test(){
        System.out.println(dataSource);
    }
}
