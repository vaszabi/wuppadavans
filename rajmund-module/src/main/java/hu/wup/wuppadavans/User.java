package hu.wup.wuppadavans;

public class User {
		public String lastName;
		public String firstName;
		public String gender;
		public int age;
		public long ID;
		
		 @Override
		    public String toString() {
		        return "Felhaszn�l�: " +
		                "ID= " + ID+1 +
		                ", Keresztn�v= " + firstName + '\'' +
		                ", Vezet�kn�v= " + lastName + '\'' +
		                ", �letkor= " + age +
		                ", Nemed= " + gender + '\'' +
		                "";
		}
		
		
		
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public long getID() {
			return ID;
		}
		public void setID(long iD) {
			ID = iD;
		}
		
		
		 
}