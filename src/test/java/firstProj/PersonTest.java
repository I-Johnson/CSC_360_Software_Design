package firstProj;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {
	
	Person R;
	Person J;
	Person M;
	Person Y;
	

	@BeforeEach
	void setUp() throws Exception {
		R = new Person("Romeo", "Mon", 15);
		J = new Person("Juliet", "Cap", 13);
		M = new Person("Count", "Dukoo", 55);
		Y = new Person("Donut", "Card", 33);
	}

	@Test
	void testPerson() 
	{
		assertThrows(UnderAgeException.class, ()->{ 
			R.makePerson(J);
		});
		assertThrows(UnderAgeException.class, ()->{ 
			M.makePerson(J);
		});
		Person child;
		try {
			child = M.makePerson(Y);	
			
			assertEquals(M.getFirstName(), child.getFirstName());
			assertEquals(Y.getLastName(), child.getLastName());
			assertEquals(0, child.getAge());
			
		} catch (UnderAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("threw exception");
		}
		
	//		Person child = R.makePerson(J);

		
	}

}
 