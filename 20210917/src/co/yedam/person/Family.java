package co.yedam.person;

public class Family {

	private Person person;
	private Person[] persons;
	private String family;
	public Family() {
		persons = new Person[3];
	}
	
	public void setPerson(Person person) {
		this.person = person;
		
	}
	public void setFamily(String family) {
		this.family = family;
		
	}
	public void addPerson(Person person) {
		for (int i=0; i<persons.length; i++){
			if(persons[i] == null) {
				persons[1] = person;
				break;
			}
		}
	
	System.out.println("�̸�: " + persons[1].getPersonName() + "���� : " + persons[1].getPersonAge() +"������ : " + persons[1].getPersonBlood());
	}
	

}

