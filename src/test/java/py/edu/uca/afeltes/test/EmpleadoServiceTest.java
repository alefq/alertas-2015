package py.edu.uca.afeltes.test;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import junit.framework.Assert;
import py.edu.uca.afeltes.service.EmpleadoService;
import py.edu.uca.afeltes.web.dto.EmpleadoDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/spring-web-context.xml",
		"file:src/main/webapp/WEB-INF/spring/spring-business-context.xml" })
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class EmpleadoServiceTest {

	private static final Logger logger = LoggerFactory.getLogger(EmpleadoServiceTest.class);

	@Autowired
	private EmpleadoService empleadoService;

	// Guarda una composición ficticia y comprueba que los valores asignados por
	// defecto sean válidos
	@Test
	public void testselectEmpleado() {
		Long cantidad = empleadoService.count();
		Assert.assertNotNull(cantidad);
		logger.info(String.format("Cantidad de empleados: %s", cantidad));
	}
}
