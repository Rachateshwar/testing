@Autowired 
UserRepository repo1;
@Test
public void  ReadAll() {
	List<User> list=repo1.findAll();
		assertThat(list).size().isGreaterThan(0);
	}


@Autowired
UserRepository repo2;commit
@Test
public void testCreate() {
	User u =new User();
	u.setHostle("shiva");
	u.setPlase("shree");
	u.setId(21);
	repo2.save(u);
	
}
@Autowired 
UserRepository repo3;
@Test
public void  testUpdata() {
	User u= repo3.findById(3).get();
	u.setHostle("cpc");
	repo3.save(u);
	assertNotEquals("shree",repo3.findById(3).get().getHostle());
}
@Autowired
UserRepository repo4;
@Test
public void testDelete() {
repo4.deleteById(4);
assertThat(repo4.existsById(4)).isFalse();
}


]