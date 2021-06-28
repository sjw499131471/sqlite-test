import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sjw.dao.PersonMapper;
import com.sjw.model.Person;

/**
 * 
 */

/**
 * @author sjw
 * 2021年3月26日
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mvc.xml"}) 
public class Test {
	@Autowired
	PersonMapper personDao;
	
	@org.junit.Test
	public void test() throws Exception {
		try {
//			Person person = new Person();
//			person.setId(3);
//			person.setName("test");
//			person.setAge(11);
//			int count = personDao.insert(person);
//			System.out.println(count);
			
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("rowCount", 10);
			map.put("startRowNum", 0);
			List<Person> list = personDao.selectList(map);
			System.out.println(list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
