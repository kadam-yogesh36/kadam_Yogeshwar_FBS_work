package polyMorphism_13_11;

public class Artist {
	    
	        String name;
	        int age;
	        int experienceYears;
	        
	        
	        
	        
			public Artist() {
				super();
				this.name = "Default Name";
				this.age = 0;
				this.experienceYears = 0;
			}
			public Artist(String name, int age, int experienceYears) {
				super();
				this.name = name;
				this.age = age;
				this.experienceYears = experienceYears;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public int getExperienceYears() {
				return experienceYears;
			}
			public void setExperienceYears(int experienceYears) {
				this.experienceYears = experienceYears;
			}
			
			// Display function
			void display(){
			    System.out.println("Name: " + name);
			    System.out.println("Age: " + age);
			    System.out.println("Experience Years: " + experienceYears);
			}
			// Perform Function
			void perform(){
			    System.out.println("Artist is performing on stage!");
			}


        
}// class Artist ends here

class Singer extends Artist {
	                 String voiceType;
	                 int songsCount;
	                 String genre;
	                 
	                 
					 public Singer() {
						super();
						this.voiceType = "Default type";
						this.songsCount = 0;
						this.genre = "Default genre";
					}
					 public Singer(String name, int age, int experienceYears,String voiceType, int songsCount, String genre) {
						super(name,age,experienceYears);
						this.voiceType = voiceType;
						this.songsCount = songsCount;
						this.genre = genre;
					}
					 public String getVoiceType() {
						 return voiceType;
					 }
					 public void setVoiceType(String voiceType) {
						 this.voiceType = voiceType;
					 }
					 public int getSongsCount() {
						 return songsCount;
					 }
					 public void setSongsCount(int songsCount) {
						 this.songsCount = songsCount;
					 }
					 public String getGenre() {
						 return genre;
					 }
					 public void setGenre(String genre) {
						 this.genre = genre;
					 }
					 
	                 // Display function 
					 
					 void display(){
						 super.display();
						    System.out.println("Voice Type: " + voiceType);
						    System.out.println("Songs Count: " + songsCount);
						    System.out.println("Genre: " + genre);
						}
					 
					 // Perform Function
					 void perform(){
						    System.out.println("Singer is singing a melodious song!");
						}


}// Singer class ends here

class Dancer extends Artist{
	           String danceFrom;
	           String instituteName;
	           
	           
	           
	           
			   public Dancer(String name, int age, int experienceYears,String danceFrom, String instituteName) {
				super(name,age,experienceYears);
				this.danceFrom = danceFrom;
				this.instituteName = instituteName;
			}
			   public Dancer() {
				super();
				this.danceFrom = "Default Form";
				this.instituteName = "xyz";
			}
			   public String getDanceFrom() {
				   return danceFrom;
			   }
			   public void setDanceFrom(String danceFrom) {
				   this.danceFrom = danceFrom;
			   }
			   public String getInstituteName() {
				   return instituteName;
			   }
			   public void setInstituteName(String instituteName) {
				   this.instituteName = instituteName;
			   }
	           // Display Function
			   
			   void display(){
				   super.display();
				    System.out.println("Dance Form: " + danceFrom);
				    System.out.println("Institute Name: " + instituteName);
				}
               // perform Function
			   void perform(){
				    System.out.println("Dancer is performing a graceful dance!");
				}

}// class Dancer Function

class Actor extends Artist{
	                int filmCount;
	                String actingSchool;
	                String roleType;
	                
	                
					public Actor() {
						super();
						this.filmCount = 0;
						this.actingSchool = "ABC";
						this.roleType = "LMN";
					}
					public Actor(String name, int age, int experienceYears,int filmCount, String actingSchool, String roleType) {
						super(name,age,experienceYears);
						this.filmCount = filmCount;
						this.actingSchool = actingSchool;
						this.roleType = roleType;
					}
					public int getFilmCount() {
						return filmCount;
					}
					public void setFilmCount(int filmCount) {
						this.filmCount = filmCount;
					}
					public String getActingSchool() {
						return actingSchool;
					}
					public void setActingSchool(String actingSchool) {
						this.actingSchool = actingSchool;
					}
					public String getRoleType() {
						return roleType;
					}
					public void setRoleType(String roleType) {
						this.roleType = roleType;
					}
	                
					void display(){
						super.display();
					    System.out.println("Film Count: " + filmCount);
					    System.out.println("Acting School: " + actingSchool);
					    System.out.println("Role Type: " + roleType);
					}
					// Perform function
					void perform(){
					    System.out.println("Actor is performing an emotional scene!");
					}


}// class Actor ends here

class RegisterArtist{
	public static void main(String[] args) {
		
		Artist s1=new Artist();
		s1.display();
		s1.perform();
		System.out.println("\n");
        s1 = new Singer("Arijit Singh", 36, 15, "Tenor", 250, "Bollywood");
		s1.display();
		s1.perform();
    System.out.println("\n");
     s1 = new Dancer("Remo D'Souza", 45, 20, "Hip-Hop", "Terence Lewis Academy");
        s1.display();
        s1.perform();
        System.out.println("\n");
      s1= new Actor("Ranbir Kapoor", 41, 18, 25, "Lee Strasberg Institute", "Lead");
       s1.display();
       s1.perform();

        
	}
}

