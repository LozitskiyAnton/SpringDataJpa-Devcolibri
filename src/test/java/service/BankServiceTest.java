package service;

import com.devcolibri.dataexam.service.BankService;
import config.TestDataBaseConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import util.BankUtil;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@DirtiesContext
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDataBaseConfig.class)
@WebAppConfiguration
public class BankServiceTest {

    @Resource
    private EntityManagerFactory emf;
    protected EntityManager em;

    @Resource
    private BankService bankService;

    @Before
    public void setUp() throws Exception {
        Class.forName("org.postgresql.Driver");
        em = emf.createEntityManager();

    }

    @Test
    public void testSaveBank() throws Exception {
        bankService.add(BankUtil.createBank());
    }
}

